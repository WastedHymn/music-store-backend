package com.chinook.musicstore.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "playlists")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "playlistId")
public class Playlist {
    @Id
    @Column(name = "playlist_id")
    private int playlistId;

    @Column(name = "name")
    private String playlistName;

    @OneToMany(mappedBy = "trackId")
    List<Track> tracks;

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistId=" + playlistId +
                ", playlistName='" + playlistName + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
