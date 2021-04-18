package br.com.erickfreire.desenhandocirculos;

import javax.swing.JFrame;

public class DesenhandoCirculosTeste {
	public static void main(String[] args) {
		
		DesenhandoCirculos painel = new DesenhandoCirculos();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(300,300);
		aplicacao.setVisible(true);
		
	}

}
