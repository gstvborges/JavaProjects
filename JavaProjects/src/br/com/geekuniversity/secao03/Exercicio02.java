package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// vari�veis
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
        //entradas
		System.out.println ("Informe a quantidade m�nima: ");
		quantidade_minima = teclado.nextInt();
		
		System.out.println("Informe a quantidade m�xima: "); // CRTL + Barra de espa�o
		quantidade_maxima = teclado.nextInt();
		
		//processamento
		estoque_medio = (quantidade_maxima + quantidade_minima) /2;
		
		//sa�da
		System.out.println("O estoque m�dio �" + estoque_medio);
		
		teclado.close();
		
	}

}
