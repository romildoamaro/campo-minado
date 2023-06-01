package br.com.campo_minado.model;

@FunctionalInterface
public interface CampoObservador {

	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
