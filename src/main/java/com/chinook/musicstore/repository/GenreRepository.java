package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
