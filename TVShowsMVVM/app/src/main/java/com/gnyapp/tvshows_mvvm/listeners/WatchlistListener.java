package com.gnyapp.tvshows_mvvm.listeners;

import com.gnyapp.tvshows_mvvm.models.TVShow;

public interface WatchlistListener {

    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist(TVShow tvShow, int position);

}
