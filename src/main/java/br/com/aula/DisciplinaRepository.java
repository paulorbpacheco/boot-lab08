package br.com.aula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
}
