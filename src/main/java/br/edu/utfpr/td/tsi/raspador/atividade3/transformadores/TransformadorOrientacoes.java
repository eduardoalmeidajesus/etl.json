package br.edu.utfpr.td.tsi.raspador.atividade3.transformadores;

import br.edu.utfpr.td.tsi.raspador.atividade3.modelos.OrientacaoTCC;
import br.edu.utfpr.td.tsi.simples.etl.Transformador;

public class TransformadorOrientacoes extends Transformador<OrientacaoTCC, OrientacaoTCC> {

    @Override
    public OrientacaoTCC transformar(OrientacaoTCC item) {
        String dataDefesa = item.getDataDefesa();
        
        if (dataDefesa == null || dataDefesa.equals("-")) {
            item.setDataDefesa("Defesa não definida");
        } else {
            item.getTrabalho().setNivel("TCC2");
        }
        
        return item;
    }
}