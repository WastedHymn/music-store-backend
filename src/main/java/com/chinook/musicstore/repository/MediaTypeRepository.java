package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaTypeRepository extends JpaRepository<MediaType, Integer> {
}
