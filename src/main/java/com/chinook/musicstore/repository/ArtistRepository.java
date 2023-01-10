package com.chinook.musicstore.repository;


import com.chinook.musicstore.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    List<Artist> findAllByOrderByArtistName();

    Artist findByArtistId(int artistId);

    Artist findByArtistName(String artistName);
}
