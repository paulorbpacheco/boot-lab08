package br.com.aula;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
class Disciplina {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nome;
    Integer cargaHoraria;
    Date dataInicio;

}
