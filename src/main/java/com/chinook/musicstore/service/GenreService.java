package com.chinook.musicstore.service;

import com.chinook.musicstore.entities.Genre;
import com.chinook.musicstore.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreService {
    private final GenreRepository genreRepository;

    public List<Genre> getAllGenres(){
        return this.genreRepository.findAll();
    }
}
