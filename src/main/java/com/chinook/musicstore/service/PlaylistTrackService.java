package com.chinook.musicstore.service;


import com.chinook.musicstore.dto.PlaylistTrackDto;
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
    private final TrackService trackService;
    private final AlbumService albumService;

    public List<TrackDto> findAllPlaylistTracks() {
        List<PlaylistTrack> playlistTracks = this.playlistTrackRepository.findAll();
        return getPlaylistTrackDtos(playlistTracks);
    }

    public List<TrackDto> findPlaylistTracksByPlaylistId(int playlistId) {
        List<PlaylistTrack> playlistTracks = this.playlistTrackRepository.findByPlaylistTrackIdPlaylistId(playlistId);
        return getPlaylistTrackDtos(playlistTracks);
    }

    public List<TrackDto> findAllPlaylistTracksOrderByTrackId() {
        List<PlaylistTrack> playlistTracks = this.playlistTrackRepository.findAllByOrderByPlaylistTrackIdTrackId();
        System.out.println("playlistTracks size: " + playlistTracks.size());
        return getPlaylistTrackDtos(playlistTracks);
    }

    private List<TrackDto> getPlaylistTrackDtos(List<PlaylistTrack> playlistTracks) {
        List<TrackDto> tracks = new ArrayList<>();
        for (PlaylistTrack playlistTrack : playlistTracks) {
            Track track = trackService.findTrackByTrackId(
                    playlistTrack.getPlaylistTrackId().getTrackId()
            );
            String albumTitle = albumService.findAlbumByAlbumId(track.getAlbumId()).getAlbumTitle();
            PlaylistTrackDto playlistTrackDto = getPlaylistTrackDto(
                    track,
                    albumTitle,
                    playlistTrack.getPlaylistTrackId().getPlaylistId()
            );
            tracks.add(playlistTrackDto);
        }
        System.out.println("Tracks size: " + tracks.size());
        return tracks;
    }

    private PlaylistTrackDto getPlaylistTrackDto(Track track, String albumTitle, int playlistID) {

        return PlaylistTrackDto.builder()
                .trackId(track.getTrackId())
                .trackName(track.getTrackName())
                .albumId(track.getAlbumId())
                .albumTitle(albumTitle)
                .mediaTypeId(track.getMediaTypeId())
                .genreId(track.getGenreId())
                .composer(track.getComposer())
                .unitPrice(track.getUnitPrice())
                .playlistId(playlistID)
                .build();
    }


}
