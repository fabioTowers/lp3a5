/*
 * 14. Implemente um mecanismo que verifica se o caixa eletr�nico do exerc�cio anterior (13) est�
sem c�dulas para saque, em caso afirmativo, dever� ser inicializada uma thread com o objetivo de 
alimentar novas c�dulas no caixa eletr�nico. Durante esse processo o caixa eletr�nico ficar� 
indispon�vel, esperando o terminando de alimenta��o das c�dulas, apenas ao final do processo os 
clientes podem voltar a utilizar o caixa eletr�nico

 * */

package exercicio14;

public class App {

	public static void main(String[] args) {

		Cliente ana = new Cliente("Ana");
		Cliente bob = new Cliente("Bob");
		
		//					saque  transferencia
		ana.realizarOperacao(true, true);
		bob.realizarOperacao(true, true);
	}

}
