package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.PlaylistTrack;
import com.chinook.musicstore.entities.PlaylistTrackId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaylistTrackRepository extends JpaRepository<PlaylistTrack, PlaylistTrackId> {
    List<PlaylistTrack> findByPlaylistTrackIdPlaylistId(int playlistId);

    List<PlaylistTrack> findAllByOrderByPlaylistTrackIdTrackId();
}
