package com.chinook.musicstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class TrackDto {
    private int trackId;
    private String trackName;
    private int albumId;
    private String albumTitle;
    private int mediaTypeId;
    private int genreId;
    private String composer;
    private BigDecimal unitPrice;

    @Override
    public String toString() {
        return "TrackDto{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", album=" + albumId +
                ", mediaType=" + mediaTypeId +
                ", genre=" + genreId +
                ", composer='" + composer + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
