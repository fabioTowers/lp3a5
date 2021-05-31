/*
 * 13. Uma ag�ncia banc�ria possui v�rios clientes, todavia a ag�ncia possui apenas um caixa
eletr�nico em funcionamento, para a realiza��o de saques e transfer�ncias. Para realizar a
opera��o de saque o cliente gasta 8 segundos para finalizar seu saque e para a transfer�ncia o
cliente do banco gasta 5 segundos. Implemente um sistema em que o caixa eletr�nico ser� o
nosso objeto e os clientes ser�o threads que tentaram realizar as opera��es de saque e
transfer�ncia no caixa eletr�nico.

 * */

package exercicio13;

public class App {

	public static void main(String[] args) {

		Cliente ana = new Cliente("Ana");
		Cliente bob = new Cliente("Bob");
		
		//					saque  transferencia
		ana.realizarOperacao(true, true);
		bob.realizarOperacao(true, true);
	}

}
