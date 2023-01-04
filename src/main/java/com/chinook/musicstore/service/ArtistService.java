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

    public List<Artist> getAllArtists() {
        System.out.println("GETTING ALL ARTISTS FROM ARTIST REPOSITORY...");
        return this.artistRepository.findAll();
    }

    public List<Artist> getArtistByArtistId(int artistId) {
        System.out.println("GETTING ARTIST " + artistId + " FROM ARTIST REPOSITORY...");
        return this.artistRepository.getArtistByArtistId(artistId);
    }

    public List<Artist> getArtistByArtistName(String artistName){
        System.out.println("GETTING ARTIST " + artistName + " FROM ARTIST REPOSITORY...");
        System.out.println("GETTING ARTIST " + artistName + " FROM ARTIST REPOSITORY...");
        return this.artistRepository.getArtistByArtistName(artistName);
    }
}
