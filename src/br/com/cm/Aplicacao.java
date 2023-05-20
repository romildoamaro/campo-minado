package br.com.cm;

import br.com.campo_minado.model.Tabuleiro;
import br.com.campo_minado.view.TabuleiroTerminal;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 4);
		new TabuleiroTerminal(tabuleiro);
	}
}
