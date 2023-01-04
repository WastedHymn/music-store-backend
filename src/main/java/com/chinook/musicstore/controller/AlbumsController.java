package com.chinook.musicstore.controller;

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

    @GetMapping("/getAllAlbums")
    public List<Album> getAllAlbums() {
        System.out.println("GETTING ALL ALBUMS FROM ALBUM SERVICE...");
        return this.albumService.getAllAlbums();
    }

    @GetMapping("/getAllAlbumsOrderByArtistName")
    public List<Album> getAllAlbumsOrderByArtistName() {
        return this.albumService.getAllAlbumsOrderByArtistName();
    }

    @GetMapping("/getAllAlbumsByArtistName")
    public List<Album> getAllAlbumsByArtistName(@RequestParam(name = "artistName") String artistName) {
        System.out.println("GETTING ALL ALBUMS BY ARTIST NAME FROM ALBUM SERVICE...");
        return this.albumService.getAlbumsByArtistName(artistName);
    }

    @GetMapping("/getAllAlbumsByArtistId")
    public List<Album> getAllAlbumsByArtistId(@RequestParam(name = "artistId") int artistId) {
        System.out.println("GETTING ALL ALBUMS BY ARTIST ID " + artistId + " FROM ALBUM SERVICE...");
        return this.albumService.getAlbumByArtistId(artistId);
    }

    @GetMapping("/getAlbumByAlbumId")
    public Album getAlbumByAlbumId(@RequestParam(name = "albumId") int albumId) {
        System.out.println("GETTING ALBUM BY ALBUM ID " + albumId + " FROM ALBUM SERVICE...");
        return this.albumService.getAlbumByAlbumId(albumId);
    }


}
