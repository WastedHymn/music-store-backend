package com.chinook.musicstore.dto;

import com.chinook.musicstore.entities.Album;
import com.chinook.musicstore.entities.Genre;
import com.chinook.musicstore.entities.MediaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackDto {
    private int trackId;
    private String trackName;
    private Album album;
    private MediaType mediaType;
    private Genre genre;
    private String composer;
    private BigDecimal unitPrice;

    @Override
    public String toString() {
        return "TrackDto{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", album=" + album +
                ", mediaType=" + mediaType +
                ", genre=" + genre +
                ", composer='" + composer + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
