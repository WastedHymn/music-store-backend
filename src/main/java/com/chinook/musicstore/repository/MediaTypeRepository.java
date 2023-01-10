package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaTypeRepository extends JpaRepository<MediaType, Integer> {
    MediaType findByMediaTypeId(int mediaTypeId);

    List<MediaType> findByOrderByMediaTypeName();
}
