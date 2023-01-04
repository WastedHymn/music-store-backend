package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    List<Album> getByArtistArtistName(String artistName);

    List<Album> getByArtistArtistId(int artistId);

    List<Album> findAllByOrderByArtistArtistName();
    Album getByAlbumId(int albumId);
}
