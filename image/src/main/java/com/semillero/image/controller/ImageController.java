package com.semillero.image.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.semillero.image.dto.ResponseData;

@Controller
public class ImageController {
    @GetMapping("/image")
    public ResponseEntity<ResponseData> getMessage(){
        return ResponseEntity.ok(ResponseData.builder().code(200).mensaje("Hola aquí la imagen!").build());
    }
}
