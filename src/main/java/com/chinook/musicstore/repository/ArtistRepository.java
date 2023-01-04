package com.chinook.musicstore.repository;


import com.chinook.musicstore.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    List<Artist> getArtistByArtistId(int artistId);

    List<Artist> getArtistByArtistName(String artistName);
}
