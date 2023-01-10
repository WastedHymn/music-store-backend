package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
    Genre findByGenreId(int genreId);

    List<Genre> findAllByOrderByGenreName();
}
