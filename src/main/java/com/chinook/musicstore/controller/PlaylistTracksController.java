package com.chinook.musicstore.controller;

import com.chinook.musicstore.dto.TrackDto;
import com.chinook.musicstore.entities.PlaylistTrack;
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

    @GetMapping("/getAllPlaylistTracks")
    public List<PlaylistTrack> getAllPlaylistTracks() {
        return this.playlistTrackService.getAllPlaylistTracks();
    }

    @GetMapping("/getPlaylistTracksByPlaylistId")
    public List<TrackDto> getPlaylistTracksByPlaylistId(@RequestParam("playlistId") int playlistId) {

        return this.playlistTrackService.getPlaylistTracksByPlaylistId(playlistId);
    }

    @GetMapping("/getAllPlaylistTracksOrderByTrackId")
    public List<TrackDto> getAllPlaylistTracksOrderByTrackId() {
        return this.playlistTrackService.getAllPlaylistTracksOrderByTrackId();
    }

}
