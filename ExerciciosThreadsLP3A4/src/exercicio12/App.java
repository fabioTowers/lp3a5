/*
 * 12.	Escreva um programa para ler um valor X e um valor Z (se Z for menor que X deve ser 
 * lido um novo valor para Z). Crie uma thread para contar quantos números inteiros devemos 
 * somar em sequência (a partir do X inclusive) para que a soma ultrapasse o valor de Z o 
 * mínimo possível. Escrever o valor ﬁnal da contagem.
 * 
 * Exemplo:
 * 
 * 		X		Y		Resposta
 * 		3		20		5 (3+4+5+6+7=25)
 * 		2		10		4 (2+3+4+5=14)
 * 		30		40		2 (30+31=61)
 * */

package exercicio12;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Integer x;
		Integer z;
		
		System.out.print("Digite um numero: ");
		x = Integer.parseInt( in.nextLine() );
		
		System.out.print("Digite um numero maior que o anterior: ");
		z = Integer.parseInt( in.nextLine() );
		
		while( z < x ) {
			System.out.print("\n\nO valor digitado nao e maior que " + x + ", digite um novo valor: ");
			z = Integer.parseInt( in.nextLine() );
		}
		
		SomaDeNumeros soma = new SomaDeNumeros(x, z);
		
		soma.calcularSequencia();
		
		in.close();
		
	}

}
