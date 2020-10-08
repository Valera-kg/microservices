package com.example.clipmaker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClipmakerController {
    
    private MusicFeign musicFeign;
    private FilmFeign filmFeign;
    private Clip clip;// объект с @Value'ми
    public ClipmakerController(MusicFeign musicFeign, FilmFeign filmFeign, Clip clip) {
        this.musicFeign = musicFeign;
        this.filmFeign = filmFeign;
        this.clip = clip;
    }

    @GetMapping("/clipmaker")
    public Clip getClip(){
        //код вывести в класс Service
        List<Clip> clipFeignMusic = musicFeign.retrieveMusic();
        List<Clip> clipFeignFilm = filmFeign.retrieveFilm();

        Clip sourceMusic = clipFeignMusic.get(0);
        Clip sourceFilm = clipFeignFilm.get(0);

        return new Clip(clip.getClipDuration(),clip.getClipUrl(),
                sourceMusic.getSinger(),sourceMusic.getSongTitle(),
                sourceFilm.getFilmTitle(),sourceFilm.getFilmDirectedBy());
    }

}
