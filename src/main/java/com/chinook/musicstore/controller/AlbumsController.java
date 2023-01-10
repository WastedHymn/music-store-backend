package com.chinook.musicstore.controller;

import com.chinook.musicstore.dto.AlbumDto;
import com.chinook.musicstore.entities.Album;
import com.chinook.musicstore.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/musicapi/albums")
public class AlbumsController {
    private final AlbumService albumService;

    @GetMapping("/findAlbumByAlbumId")
    public AlbumDto findAlbumByAlbumId(@RequestParam("albumId") int albumId) {
        return this.albumService.findAlbumByAlbumId(albumId);
    }

    @GetMapping("/findAlbumByAlbumTitle")
    public AlbumDto findAlbumByAlbumTitle(String albumTitle) {
        return this.albumService.findAlbumByAlbumTitle(albumTitle);
    }

    @GetMapping("/findAllAlbums")
    public List<Album> findAllAlbums() {
        return this.albumService.findAllAlbums();
    }

    @GetMapping("/findAlbumsByArtistId")
    public List<AlbumDto> findAlbumsByArtistId(int artistId){
        return this.albumService.findAlbumsByArtistId(artistId);
    }

    @GetMapping("/findAllByArtistIdOrderByAlbumId")
    List<AlbumDto> findAllByArtistIdOrderByAlbumId(int artistId){
        return this.albumService.findAllByArtistIdOrderByAlbumId(artistId);
    }
}
