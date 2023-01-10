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

    public MediaType findByMediaTypeId(int mediaTypeId){
        return this.mediaTypeRepository.findByMediaTypeId(mediaTypeId);
    }

    public List<MediaType> findAllMediaTypes(){
        return this.mediaTypeRepository.findAll();
    }

    public List<MediaType> findByOrderByMediaTypeName(){
        return this.mediaTypeRepository.findByOrderByMediaTypeName();
    }

}
