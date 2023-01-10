package com.chinook.musicstore.controller;

import com.chinook.musicstore.dto.TrackDto;
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

    @GetMapping("/findAllTracks")
    public List<TrackDto> findAllTracks() {
        return this.trackService.findAllTracks();
    }

    @GetMapping("/findTracksByAlbumId")
    public List<TrackDto> findTracksByAlbumId(@RequestParam("albumId") int albumId) {
        return this.trackService.findTracksByAlbumId(albumId);
    }

    @GetMapping("/findTracksByGenreId")
    public List<TrackDto> findTracksByGenreId(@RequestParam("genreId") int genreId) {
        return this.trackService.findTracksByGenreId(genreId);
    }
}
