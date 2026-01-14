package br.edu.utfpr.td.tsi.raspador.atividade3.repository;

import br.edu.utfpr.td.tsi.raspador.atividade3.modelos.OrientacaoTCC;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrientacaoTCCRepository extends MongoRepository<OrientacaoTCC, String> {
}