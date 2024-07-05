package com.gnyapp.tvshows_mvvm.viewmodels;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.gnyapp.tvshows_mvvm.database.TVShowsDatabase;
import com.gnyapp.tvshows_mvvm.models.TVShow;

import java.util.List;

import io.reactivex.Flowable;

public class WatchlistViewModel extends AndroidViewModel {

    private TVShowsDatabase tvShowsDatabase;

    public WatchlistViewModel(Application application) {
        super(application);
        tvShowsDatabase = TVShowsDatabase.getTvShowsDatabase(application);
    }

    public Flowable<List<TVShow>> loadWatchlist() {
        return tvShowsDatabase.tvShowDao().getWatchlist();
    }

}
