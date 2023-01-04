package com.chinook.musicstore.service;

import com.chinook.musicstore.entities.Track;
import com.chinook.musicstore.repository.TrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrackService {
    private final TrackRepository trackRepository;

    public List<Track> getAllTracks() {
        return this.trackRepository.findAll();
    }

    public List<Track> getTracksByAlbumId(int albumId) {
        return this.trackRepository.getTracksByAlbumAlbumId(albumId);
    }

    public List<Track> getTracksByGenreId(int genreId) {
        return this.trackRepository.getTracksByGenreGenreId(genreId);
    }
}
