package com.gnyapp.tvshows_mvvm.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.gnyapp.tvshows_mvvm.network.ApiClient;
import com.gnyapp.tvshows_mvvm.network.ApiService;
import com.gnyapp.tvshows_mvvm.responses.TVShowDetailsResponse;
import com.gnyapp.tvshows_mvvm.responses.TVShowsResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchTVShowRepository {

    private ApiService apiService;

    public SearchTVShowRepository() {
        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<TVShowsResponse> searchTVShow(String querty, int page) {
        MutableLiveData<TVShowsResponse> data = new MutableLiveData<>();
        apiService.searchTVShow(querty, page).enqueue(new Callback<TVShowsResponse>() {
            @Override
            public void onResponse(Call<TVShowsResponse> call, Response<TVShowsResponse> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<TVShowsResponse> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }


}
