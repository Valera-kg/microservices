package com.example.film;

import javax.persistence.*;

@Entity
@Table(name = "filmdb")
public class Film {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "filmtitle", nullable = false)
    private String filmTitle;

    @Column(name = "filmdirectedby", nullable = false)
    private String filmDirectedBy;

    public Film() {
    }

    public Film(int id, String filmTitle, String filmDirectedBy) {
        this.id = id;
        this.filmTitle = filmTitle;
        this.filmDirectedBy = filmDirectedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
