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

    @GetMapping("/getAllMediaTypes")
    public List<MediaType> getAllMediaTypes(){
        return this.mediaTypeService.getAllMediaTypes();
    }
}
