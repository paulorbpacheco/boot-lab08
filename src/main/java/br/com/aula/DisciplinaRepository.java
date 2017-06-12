package br.com.aula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{

    @RestResource(path="dataInicioMaior")
    List<Disciplina> findByDataInicioAfter(Date dataAtual);
}

