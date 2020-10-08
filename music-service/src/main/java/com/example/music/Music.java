package com.example.music;

import javax.persistence.*;

@Entity
@Table(name = "musicdb")
public class Music {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "singer", nullable = false)
    private String singer;

    @Column(name = "songtitle", nullable = false)
    private String songTitle;

    public Music() {
    }
    public Music(int id, String singer, String songTitle) {
        this.id = id;
        this.singer = singer;
        this.songTitle = songTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}
