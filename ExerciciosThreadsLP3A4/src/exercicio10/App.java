/*
 * 10.	Crie um programa na linguagem Java para ler dois n�meros e qual 
 * opera��o matem�tica deve ser utilizada. Em seguida o programa dever� 
 * apresentar o resultado do c�lculo. Toda a opera��o matem�tica dever� 
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

		
		System.out.print("Digite o primeiro n�mero: ");
		numA = Integer.valueOf( in.nextLine() );
		
		System.out.print("\n\nDigite o segundo n�mero: ");
		numB = Integer.valueOf( in.nextLine() );
		
		System.out.print("\n\nDigite uma das 4 operacoes basicas [+-/*]: ");
		operacao = in.nextLine();
		
		OperacaoMatematica o = new OperacaoMatematica(numA, numB, operacao);
		
		in.close();
	}

}
