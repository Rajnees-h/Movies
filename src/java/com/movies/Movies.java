/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies;

/**
 *
 * @author rowdy
 */
public class Movies {
    
    int movie_id;
    
    String movie_name;
    String releasing_date;
    String movie_time;

    String rating;
    
    String cast;
    String director;
    String language;
    String genres;
    
    String thumbnail;
    String url;
    
    String screen_shorts;

    public Movies() {
    }

    public Movies(int movie_id, String movie_name, String releasing_date, String movie_time, String rating, String cast, String director, String language, String genres, String thumbnail, String url, String screen_shorts) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.releasing_date = releasing_date;
        this.movie_time = movie_time;
        this.rating = rating;
        this.cast = cast;
        this.director = director;
        this.language = language;
        this.genres = genres;
        this.thumbnail = thumbnail;
        this.url = url;
        this.screen_shorts = screen_shorts;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getReleasing_date() {
        return releasing_date;
    }

    public void setReleasing_date(String releasing_date) {
        this.releasing_date = releasing_date;
    }

    public String getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(String movie_time) {
        this.movie_time = movie_time;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getScreen_shorts() {
        return screen_shorts;
    }

    public void setScreen_shorts(String screen_shorts) {
        this.screen_shorts = screen_shorts;
    }
    
    

    
}
