package com.Campeao.atividade.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "TBL_CAMPEAO")
@Data
public class CampeaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String funcao;
    private String elo;

}
