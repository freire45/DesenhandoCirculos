package br.com.erickfreire.desenhandocirculos;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha 12 circulos
 * @author Erick Freire
 * @version 1 - Criado em 18-04-2021 as 14:29
 */

public class DesenhandoCirculos extends JPanel {
	
	int numero = 10;
	
	public void paintComponent(Graphics g ) {
		
		for(int i = 1; i <= 12; i++) {
			
				g.drawOval(120 - i * 10, 120 - i * 10, 20 * i, 20 * i);
			
		}
		
	}

}
