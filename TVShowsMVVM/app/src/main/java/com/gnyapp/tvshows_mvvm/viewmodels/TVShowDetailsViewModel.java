package com.gnyapp.tvshows_mvvm.viewmodels;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.gnyapp.tvshows_mvvm.dao.TVShowDao;
import com.gnyapp.tvshows_mvvm.database.TVShowsDatabase;
import com.gnyapp.tvshows_mvvm.models.TVShow;
import com.gnyapp.tvshows_mvvm.repositories.TVShowDetailsRepository;
import com.gnyapp.tvshows_mvvm.responses.TVShowDetailsResponse;

import io.reactivex.Completable;

public class TVShowDetailsViewModel extends AndroidViewModel {

    private TVShowDetailsRepository tvShowDetailsRepository;
    private TVShowsDatabase tvShowsDatabase;

    public TVShowDetailsViewModel(Application application) {
        super(application);
        tvShowDetailsRepository = new TVShowDetailsRepository();
        tvShowsDatabase = TVShowsDatabase.getTvShowsDatabase(application);
    }

    public LiveData<TVShowDetailsResponse> getTvShowDetails(String tvShowId){
        return tvShowDetailsRepository.getTvShowDetails(tvShowId);
    }

    public Completable addToWatchlist(TVShow tvShow) {
        return tvShowsDatabase.tvShowDao().addToWatchlist(tvShow);
    }
}
