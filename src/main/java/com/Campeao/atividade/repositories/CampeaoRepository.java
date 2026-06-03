package com.Campeao.atividade.repositories;

import com.Campeao.atividade.models.CampeaoModel;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampeaoRepository extends JpaRepository<CampeaoModel, Long> {

  CampeaoModel  findbyname(String login);

}
