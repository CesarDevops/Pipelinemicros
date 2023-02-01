package com.semillero.boton.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.semillero.boton.dto.ResponseData;


@Controller
public class BotonController {
    @GetMapping("/boton")
    public ResponseEntity<ResponseData> getMessage(){
        return ResponseEntity.ok(ResponseData.builder().code(200).mensaje("Hola aquí el boton!").build());
    }
}
