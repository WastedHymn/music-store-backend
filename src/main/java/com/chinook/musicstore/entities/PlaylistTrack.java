package com.chinook.musicstore.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "playlisttracks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "playlistTrackId")
public class PlaylistTrack {
    @EmbeddedId
    PlaylistTrackId playlistTrackId;

    /*
    @ManyToOne
    @MapsId("playlistId")
    @JoinColumn(name = "playlist_id")
    Playlist playlist;

    //@Column(name = "playlist_id")
    //private int playlistId;


    @ManyToOne
    @MapsId("trackId")
    @JoinColumn(name = "track_id")
    Track track;


    //@Column(name = "track_id")
    //private int trackId;
    */

}
