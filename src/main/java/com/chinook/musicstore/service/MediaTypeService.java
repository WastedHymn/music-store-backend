package com.chinook.musicstore.service;

import com.chinook.musicstore.entities.MediaType;
import com.chinook.musicstore.repository.MediaTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MediaTypeService {
    private final MediaTypeRepository mediaTypeRepository;

    public List<MediaType> getAllMediaTypes(){
        return this.mediaTypeRepository.findAll();
    }
}
