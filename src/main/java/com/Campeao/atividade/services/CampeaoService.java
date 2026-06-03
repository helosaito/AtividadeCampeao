package com.Campeao.atividade.services;

import com.Campeao.atividade.models.CampeaoModel;
import com.Campeao.atividade.repositories.CampeaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampeaoService {

    @Autowired
    CampeaoRepository campeaoRepository;

    public List<CampeaoModel> findall(){
        return campeaoRepository.findAll();
    }

    public CampeaoModel criarCampeao(CampeaoModel campeaoModel){
        return campeaoRepository.save(campeaoModel);
    }

    public Optional<CampeaoModel> buscarCampeao(CampeaoModel nome){
        return campeaoRepository.findById(id);
    }
}
