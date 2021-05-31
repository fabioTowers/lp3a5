/*
 * 11.	Implemente uma thread para contar a quantidade de consoantes e vogais de uma frase.*/

package exercicio11;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in );
		
		String palavra;
		
		System.out.print("Digite uma palavra: ");
		palavra = in.nextLine();
		
		ConsoantesVogais consoantes = new ConsoantesVogais(false, palavra);
		ConsoantesVogais vogais = new ConsoantesVogais(true, palavra);
		
		consoantes.quantidade();
		vogais.quantidade();
		
		in.close();
	}

}
