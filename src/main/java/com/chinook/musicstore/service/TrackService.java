package com.chinook.musicstore.service;

import com.chinook.musicstore.dto.TrackDto;
import com.chinook.musicstore.entities.Track;
import com.chinook.musicstore.repository.TrackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TrackService {
    private final TrackRepository trackRepository;
    private final AlbumService albumService;

    public Track findTrackByTrackId(int trackId) {
        return this.trackRepository.findByTrackId(trackId);
    }

    public List<TrackDto> findAllTracks() {
        List<Track> tracks = this.trackRepository.findAll();
        return getTrackDtos(tracks);
    }

    public List<TrackDto> findTracksByAlbumId(int albumId) {
        List<Track> tracks = this.trackRepository.findTracksByAlbumId(albumId);
        return getTrackDtos(tracks);
    }

    public List<TrackDto> findTracksByGenreId(int genreId) {
        List<Track> tracks = this.trackRepository.findTracksByGenreId(genreId);
        return getTrackDtos(tracks);
    }

    private List<TrackDto> getTrackDtos(List<Track> tracks){
        List<TrackDto> trackDtos = new ArrayList<>();
        for (Track track : tracks) {
            String albumTitle = albumService.findAlbumByAlbumId(track.getAlbumId()).getAlbumTitle();
            trackDtos.add(getTrackDto(track, albumTitle));
        }
        return trackDtos;
    }
    private TrackDto getTrackDto(Track track, String albumTitle) {
        return new TrackDto(
                track.getTrackId(),
                track.getTrackName(),
                track.getAlbumId(),
                albumTitle,
                track.getMediaTypeId(),
                track.getGenreId(),
                track.getComposer(),
                track.getUnitPrice());
    }
}
