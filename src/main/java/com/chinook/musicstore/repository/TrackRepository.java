package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Integer> {
    Track findByTrackId(int trackId);
    List<Track> findTracksByAlbumId(int albumId);
    List<Track> findTracksByGenreId(int genreId);
}
