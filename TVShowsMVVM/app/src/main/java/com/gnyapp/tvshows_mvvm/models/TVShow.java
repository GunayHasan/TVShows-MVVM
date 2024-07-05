package com.gnyapp.tvshows_mvvm.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Entity(tableName = "tvShows")
public class TVShow implements Serializable {

    @PrimaryKey
    @SerializedName("id")
    public int id;

    @SerializedName("name")
    public String name;

    @SerializedName("start_date")
    public String start_date;

    @SerializedName("country")
    public String country;

    @SerializedName("network")
    public String network;

    @SerializedName("status")
    public String status;

    @SerializedName("image_thumbnail_path")
    public String image_thumbnail_path;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getCountry() {
        return country;
    }

    public String getNetwork() {
        return network;
    }

    public String getStatus() {
        return status;
    }

    public String getImage_thumbnail_path() {
        return image_thumbnail_path;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setImage_thumbnail_path(String image_thumbnail_path) {
        this.image_thumbnail_path = image_thumbnail_path;
    }
}
