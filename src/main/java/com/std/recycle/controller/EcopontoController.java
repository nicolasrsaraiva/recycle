package com.std.recycle.controller;

import com.std.recycle.controller.dtos.EcopontoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/ecopontos")
public class EcopontoController {

    @PostMapping
    public void cadastrar(){
    }

    @GetMapping
    public ArrayList<EcopontoDTO> listarEcopontos(){
        ArrayList<EcopontoDTO> ecopontoDTOS = new ArrayList<>();
        return ecopontoDTOS;
    }
}
