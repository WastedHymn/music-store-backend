package com.chinook.musicstore.service;

import com.chinook.musicstore.entities.Playlist;
import com.chinook.musicstore.repository.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistService {
    private final PlaylistRepository playlistRepository;

    public List<Playlist> findAllPlaylists() {
        return this.playlistRepository.findAll();
    }
}
