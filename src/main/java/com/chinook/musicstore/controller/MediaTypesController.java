package com.chinook.musicstore.controller;

import com.chinook.musicstore.entities.MediaType;
import com.chinook.musicstore.service.MediaTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/musicapi/mediatypes")
public class MediaTypesController {
    private final MediaTypeService mediaTypeService;

    @GetMapping("/findByMediaTypeId")
    public MediaType findByMediaTypeId(int mediaTypeId){
        return this.mediaTypeService.findByMediaTypeId(mediaTypeId);
    }

    @GetMapping("/findByOrderByMediaTypeName")
    public List<MediaType> findByOrderByMediaTypeName(){
        return this.mediaTypeService.findByOrderByMediaTypeName();
    }

    @GetMapping("/findAllMediaTypes")
    public List<MediaType> findAllMediaTypes(){
        return this.mediaTypeService.findAllMediaTypes();
    }
}
