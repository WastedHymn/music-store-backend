package com.chinook.musicstore.controller;

import com.chinook.musicstore.entities.Playlist;
import com.chinook.musicstore.service.PlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/musicapi/playlists")
public class PlaylistsController {
    private final PlaylistService playlistService;

    @GetMapping("/findAllPlaylists")
    public List<Playlist> findAllPlaylists(){
        return this.playlistService.findAllPlaylists();
    }
}
