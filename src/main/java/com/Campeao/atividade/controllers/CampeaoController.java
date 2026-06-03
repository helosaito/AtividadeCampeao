package com.Campeao.atividade.controllers;

import com.Campeao.atividade.models.CampeaoModel;
import com.Campeao.atividade.services.CampeaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/campeoes")
public class CampeaoController {

    @Autowired
    private CampeaoService campeaoService;


    @GetMapping
    public List<CampeaoModel> findall(){
        return campeaoService.findall();
    }

    @PostMapping
    public CampeaoModel criarCampeao(@RequestBody CampeaoModel campeaoModel){
        return campeaoService.criarCampeao(campeaoModel);
    }
}
