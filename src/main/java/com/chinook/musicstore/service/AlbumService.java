package com.chinook.musicstore.service;

import com.chinook.musicstore.dto.AlbumDto;
import com.chinook.musicstore.entities.Album;
import com.chinook.musicstore.entities.Artist;
import com.chinook.musicstore.repository.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlbumService {
    private final AlbumRepository albumRepository;
    private final ArtistService artistService;

    public AlbumDto findAlbumByAlbumId(int albumId) {
        Album album = this.albumRepository.findByAlbumId(albumId);
        return getAlbumDto(album);
    }

    public AlbumDto findAlbumByAlbumTitle(String albumTitle) {
        Album album = this.albumRepository.findByAlbumTitle(albumTitle);
        return getAlbumDto(album);
    }

    public List<Album> findAllAlbums() {
        return this.albumRepository.findAll();
    }

    public List<AlbumDto> findAlbumsByArtistId(int artistId) {
        List<Album> albums = this.albumRepository.findAllByArtistId(artistId);
        List<AlbumDto> albumDtos = new ArrayList<>();
        albums.forEach(album -> albumDtos.add(getAlbumDto(album)));
        return albumDtos;
    }


    public List<AlbumDto> findAllByArtistIdOrderByAlbumId(int artistId) {
        List<Album> albums = this.albumRepository.findAllByArtistIdOrderByAlbumId(artistId);
        List<AlbumDto> albumDtos = new ArrayList<>();
        albums.forEach(album -> albumDtos.add(getAlbumDto(album)));
        return albumDtos;
    }

    private AlbumDto getAlbumDto(Album album) {
        Artist artist = artistService.findArtistByArtistId(album.getArtistId());
        return new AlbumDto(album.getAlbumId(), album.getAlbumTitle(), artist.getArtistId(), artist.getArtistName());
    }

}
