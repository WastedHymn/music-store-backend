package com.chinook.musicstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlbumDto {
    private int albumId;
    private String albumTitle;
    private int artistId;
    private String artistName;
}
