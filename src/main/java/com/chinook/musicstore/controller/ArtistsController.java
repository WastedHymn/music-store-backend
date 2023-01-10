package com.chinook.musicstore.controller;

import com.chinook.musicstore.entities.Artist;
import com.chinook.musicstore.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/musicapi/artists")
public class ArtistsController {
    private final ArtistService artistService;

    @GetMapping("/findAllArtists")
    public List<Artist> findAllArtists() {
        return this.artistService.findAllArtists();
    }

    @GetMapping("/findArtistById")
    public Artist findArtistById(@RequestParam(name = "artistId") int artistId) {
        return this.artistService.findArtistByArtistId(artistId);
    }

    @GetMapping("/findArtistByName")
    public Artist findArtistByArtistName(@RequestParam(name = "artistName") String artistName) {
        return this.artistService.findArtistByArtistName(artistName);
    }

    @GetMapping("/findAllByOrderByArtistName")
    public List<Artist> findAllByOrderByArtistName() {
        return this.artistService.findAllByOrderByArtistName();
    }

}
