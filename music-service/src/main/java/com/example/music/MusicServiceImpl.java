package com.example.music;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    private MusicRepository musicRepository;
    public MusicServiceImpl(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public List<Music> readAll() {
        return musicRepository.findAll();
    }
}
