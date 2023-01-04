package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

}
