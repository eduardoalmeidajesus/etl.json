package br.edu.utfpr.td.tsi.raspador.atividade3.carregadores;

import br.edu.utfpr.td.tsi.raspador.atividade3.modelos.OrientacaoTCC;
import br.edu.utfpr.td.tsi.raspador.atividade3.repository.OrientacaoTCCRepository;
import br.edu.utfpr.td.tsi.simples.etl.Carregador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarregadorMongoDb extends Carregador<OrientacaoTCC> {

    @Autowired
    private OrientacaoTCCRepository repository;

    @Override
    public void carregar(List<OrientacaoTCC> itens) {
        repository.saveAll(itens);
        System.out.println("Dados carregados no MongoDB com sucesso! Total: " + itens.size() + " orientações.");
    }
}