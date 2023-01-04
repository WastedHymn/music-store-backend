package com.chinook.musicstore.service;

import com.chinook.musicstore.entities.Album;
import com.chinook.musicstore.repository.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlbumService {
    private final AlbumRepository albumRepository;

    public List<Album> getAllAlbums() {
        System.out.println("GETTING ALL ALBUMS FROM ALBUM REPOSITORY...");
        return this.albumRepository.findAll();
    }

    public List<Album> getAlbumsByArtistName(String artistName) {
        System.out.println("FINDING ALL ALBUMS BY " + artistName + " FROM ALBUM REPOSITORY...");
        return this.albumRepository.getByArtistArtistName(artistName);
    }


    public List<Album> getAlbumByArtistId(int artistId) {
        return this.albumRepository.getByArtistArtistId(artistId);
    }

    public Album getAlbumByAlbumId(int albumId) {
        System.out.println("FINDING ALBUM BY ALBUM ID " + albumId + " FROM ALBUM REPOSITORY...");
        return this.albumRepository.getByAlbumId(albumId);
    }

    public List<Album> getAllAlbumsOrderByArtistName(){
        return this.albumRepository.findAllByOrderByArtistArtistName();
    }


}
