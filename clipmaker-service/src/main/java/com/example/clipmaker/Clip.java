package com.example.clipmaker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Тут должна быть своя база данных (@Entity), но код и так слишком вырос, так что пусть вот так инициализируются поля через @Value.
@Component
public class Clip {
    @Value("5.23")
    private double clipDuration;
    @Value("https://www.youtube.com/watch?v=_Yhyp-_hX2s")
    private String clipUrl;
    //название полей у Music/Film и полей Clip, должны совпадать
    private String singer;
    private String songTitle;

    private String filmTitle;
    private String filmDirectedBy;

    public Clip() {
    }

    public Clip(double clipDuration, String clipUrl, String singer, String songTitle, String filmTitle, String filmDirectedBy) {
        this.clipDuration = clipDuration;
        this.clipUrl = clipUrl;
        this.singer = singer;
        this.songTitle = songTitle;
        this.filmTitle = filmTitle;
        this.filmDirectedBy = filmDirectedBy;
    }

    public double getClipDuration() {
        return clipDuration;
    }

    public void setClipDuration(double clipDuration) {
        this.clipDuration = clipDuration;
    }

    public String getClipUrl() {
        return clipUrl;
    }

    public void setClipUrl(String clipUrl) {
        this.clipUrl = clipUrl;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmDirectedBy() {
        return filmDirectedBy;
    }

    public void setFilmDirectedBy(String filmDirectedBy) {
        this.filmDirectedBy = filmDirectedBy;
    }
}
