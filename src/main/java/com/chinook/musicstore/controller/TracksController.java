package com.chinook.musicstore.controller;

import com.chinook.musicstore.entities.Track;
import com.chinook.musicstore.service.TrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/musicapi/tracks")
public class TracksController {
    private final TrackService trackService;

    @GetMapping("/getAllTracks")
    public List<Track> getAllTracks() {
        return this.trackService.getAllTracks();
    }

    @GetMapping("/getTracksByAlbumId")
    public List<Track> getTracksByAlbumId(@RequestParam("albumId") int albumId) {
        return this.trackService.getTracksByAlbumId(albumId);
    }

    @GetMapping("/getTracksByGenreId")
    public List<Track> getTracksByGenreId(@RequestParam("genreId") int genreId) {
        return this.trackService.getTracksByGenreId(genreId);
    }
}
