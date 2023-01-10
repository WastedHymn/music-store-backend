package com.chinook.musicstore.controller;

import com.chinook.musicstore.dto.TrackDto;
import com.chinook.musicstore.service.PlaylistTrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/musicapi/playlistTrack")
public class PlaylistTracksController {
    private final PlaylistTrackService playlistTrackService;

    @GetMapping("/findAllPlaylistTracks")
    public List<TrackDto> findAllPlaylistTracks() {
        return this.playlistTrackService.findAllPlaylistTracks();
    }

    @GetMapping("/findPlaylistTracksByPlaylistId")
    public List<TrackDto> findPlaylistTracksByPlaylistId(@RequestParam("playlistId") int playlistId) {

        return this.playlistTrackService.findPlaylistTracksByPlaylistId(playlistId);
    }

    @GetMapping("/findAllPlaylistTracksOrderByTrackId")
    public List<TrackDto> findAllPlaylistTracksOrderByTrackId() {
        return this.playlistTrackService.findAllPlaylistTracksOrderByTrackId();
    }

}
