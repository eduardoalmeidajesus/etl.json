package br.edu.utfpr.td.tsi.raspador.atividade3;

import br.edu.utfpr.td.tsi.raspador.atividade3.carregadores.CarregadorMongoDb;
import br.edu.utfpr.td.tsi.raspador.atividade3.extratores.ExtratorOrientacoesJson;
import br.edu.utfpr.td.tsi.raspador.atividade3.transformadores.TransformadorOrientacoes;
import br.edu.utfpr.td.tsi.simples.etl.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Main {

    @Autowired
    private CarregadorMongoDb carregador;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostConstruct
    public void executarETL() {
        ExtratorOrientacoesJson extrator = new ExtratorOrientacoesJson();
        extrator.setInput("orientacoes.json");

        Job<br.edu.utfpr.td.tsi.raspador.atividade3.modelos.OrientacaoTCC, br.edu.utfpr.td.tsi.raspador.atividade3.modelos.OrientacaoTCC> job = new Job<>();
        job.setExtrator(extrator);
        job.setTransformador(new TransformadorOrientacoes());
        job.setCarregador(carregador);

        job.executar();
        System.out.println("ETL de orientações de TCC concluído!");
    }
}