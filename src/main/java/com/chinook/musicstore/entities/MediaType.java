package com.chinook.musicstore.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mediatypes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediaType {
    @Id
    @Column(name = "media_type_id")
    private int mediaTypeId;

    @Column(name = "name")
    private String mediaTypeName;

    @Override
    public String toString() {
        return "MediaType{" +
                "mediaTypeId=" + mediaTypeId +
                ", mediaTypeName='" + mediaTypeName + '\'' +
                '}';
    }
}
