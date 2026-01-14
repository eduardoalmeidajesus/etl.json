package br.edu.utfpr.td.tsi.raspador.atividade3.extratores;

import br.edu.utfpr.td.tsi.raspador.atividade3.modelos.OrientacaoTCC;
import br.edu.utfpr.td.tsi.simples.etl.ExtratorListaItemsArquivosJson;

public class ExtratorOrientacoesJson extends ExtratorListaItemsArquivosJson<OrientacaoTCC> {

    public ExtratorOrientacoesJson() {
        this.setListType(OrientacaoTCC.class);
    }
}