package com.chinook.musicstore.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tracks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "trackId")
public class Track {
    @Id
    @Column(name = "track_id")
    private int trackId;

    @Column(name = "name")
    private String trackName;

    /*
    @ManyToOne
    @JoinColumn(name = "album_id")
    @ToString.Exclude
    private Album album;
    */
    @Column(name ="album_id")
    private int albumId;

    /*
    @ManyToOne
    @JoinColumn(name = "media_type_id")
    private MediaType mediaType;
    */
    @Column(name = "media_type_id")
    private int mediaTypeId;

    /*
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
    */
    @Column(name = "genre_id")
    private int genreId;

    @Column(name = "composer")
    private String composer;

    @Column(name = "milliseconds")
    private int milliseconds;

    @Column(name = "bytes")
    private int bytes;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @OneToMany(mappedBy = "playlistId")
    //@ToString.Exclude
    List<Playlist> playlists;

    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", album=" + albumId +
                ", mediaType=" + mediaTypeId +
                ", genre=" + genreId +
                ", composer='" + composer + '\'' +
                ", milliseconds=" + milliseconds +
                ", bytes=" + bytes +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
