package com.chinook.musicstore.controller;

import com.chinook.musicstore.entities.Genre;
import com.chinook.musicstore.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/musicapi/genres")
public class GenresController {
    private final GenreService genreService;

    @GetMapping("/findByGenreId")
    public Genre findByGenreId(int genreId) {
        return this.genreService.findByGenreId(genreId);
    }

    @GetMapping("/findAllByOrderByGenreName")
    public List<Genre> findAllByOrderByGenreName() {
        return this.genreService.findAllByOrderByGenreName();
    }

    @GetMapping("/findAllGenres")
    public List<Genre> findAllGenres(){
        return this.genreService.findAllGenres();
    }
}
