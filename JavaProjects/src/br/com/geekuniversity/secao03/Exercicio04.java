package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		//v�riaveis 
		int num1, num2, soma;
		Scanner teclado = new Scanner (System.in);
		
		//entradas
		System.out.println("Informe o primeiro n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		//processamento
		
		soma = (num1 + num2);
		
		//sa�da
		
		System.out.println("A soma � " + soma);
		
		teclado.close();
		
	}

}
