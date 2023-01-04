package com.chinook.musicstore.service;


import com.chinook.musicstore.dto.TrackDto;
import com.chinook.musicstore.entities.PlaylistTrack;
import com.chinook.musicstore.entities.Track;
import com.chinook.musicstore.repository.PlaylistTrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistTrackService {
    private final PlaylistTrackRepository playlistTrackRepository;

    public List<PlaylistTrack> getAllPlaylistTracks() {
        return this.playlistTrackRepository.findAll();
    }

    public List<TrackDto> getPlaylistTracksByPlaylistId(int playlistId) {
        List<PlaylistTrack> playlistTracks = this.playlistTrackRepository.getByPlaylistPlaylistId(playlistId);

        return getTracksFromPlaylistTrackList(playlistTracks);
    }

    public List<TrackDto> getAllPlaylistTracksOrderByTrackId() {
        List<PlaylistTrack> playlistTracks = this.playlistTrackRepository.findAllByOrderByTrackTrackId();

        return getTracksFromPlaylistTrackList(playlistTracks);
    }

    private List<TrackDto> getTracksFromPlaylistTrackList(List<PlaylistTrack> playlistTracks){
        List<TrackDto> tracks = new ArrayList<>();
        playlistTracks.forEach(playlistTrack -> {
            Track track = playlistTrack.getTrack();
            TrackDto trackDto = new TrackDto(
                    track.getTrackId(),
                    track.getTrackName(),
                    track.getAlbum(),
                    track.getMediaType(),
                    track.getGenre(),
                    track.getComposer(),
                    track.getUnitPrice());
            if (!tracks.contains(trackDto))
                tracks.add(trackDto);
        });
        System.out.println("tracks size: " + tracks.size());
        return tracks;
    }
}
