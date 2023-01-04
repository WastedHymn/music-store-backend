package com.chinook.musicstore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class PlaylistTrackId implements Serializable {
    @Column(name = "playlist_id")
    private int playlistId;
    @Column(name = "track_id")
    private int trackId;
}
