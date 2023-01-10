package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

    Album findByAlbumId(int albumId);

    Album findByAlbumTitle(String albumTitle);

    List<Album> findAllByArtistId(int artistId);

    List<Album> findAllByArtistIdOrderByAlbumId(int artistId);


}
