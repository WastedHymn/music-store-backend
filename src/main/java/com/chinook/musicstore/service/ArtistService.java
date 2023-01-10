package com.chinook.musicstore.service;

import com.chinook.musicstore.entities.Artist;
import com.chinook.musicstore.repository.ArtistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistService {
    private final ArtistRepository artistRepository;

    public List<Artist> findAllArtists() {
        return this.artistRepository.findAll();
    }

    public Artist findArtistByArtistId(int artistId) {
        return this.artistRepository.findByArtistId(artistId);
    }

    public Artist findArtistByArtistName(String artistName) {
        return this.artistRepository.findByArtistName(artistName);
    }

    public List<Artist> findAllByOrderByArtistName() {
        return this.artistRepository.findAllByOrderByArtistName();
    }
}
