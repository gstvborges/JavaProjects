package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variaveis
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		//processamento
		centimetros = (metros * 100);
		
		//sa�da
		System.out.println(metros + " metros em centimetros � " + centimetros);
		
		teclado.close();

	}

}
