/*
 * 10.	Crie um programa na linguagem Java para ler dois números e qual 
 * operação matemática deve ser utilizada. Em seguida o programa deverá 
 * apresentar o resultado do cálculo. Toda a operação matemática deverá 
 * ser executada via thread.
 * */

package exercicio10;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numA;
		Integer numB;
		String operacao;
		
		Scanner in = new Scanner(System.in);

		
		System.out.print("Digite o primeiro número: ");
		numA = Integer.valueOf( in.nextLine() );
		
		System.out.print("\n\nDigite o segundo número: ");
		numB = Integer.valueOf( in.nextLine() );
		
		System.out.print("\n\nDigite uma das 4 operacoes basicas [+-/*]: ");
		operacao = in.nextLine();
		
		OperacaoMatematica o = new OperacaoMatematica(numA, numB, operacao);
		
		in.close();
	}

}
