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

    @GetMapping("/getAllArtists")
    public List<Artist> getAllArtists() {
        System.out.println("GETTING ALL ARTISTS FROM ARTIST SERVICE...");
        return this.artistService.getAllArtists();
    }

    @GetMapping("/getArtistById")
    public List<Artist> getArtistById(@RequestParam(name = "artistId") int artistId) {
        System.out.println("GETTING ARTIST " + artistId + " FROM ARTIST SERVICE...");
        return this.artistService.getArtistByArtistId(artistId);
    }

    @GetMapping("/getArtistByName")
    public List<Artist> getArtistByArtistName(@RequestParam(name = "artistName") String artistName) {
        System.out.println("GETTING ARTIST " + artistName + " FROM ARTIST SERVICE...");
        return this.artistService.getArtistByArtistName(artistName);
    }

}
