/*
 * 13. Uma agência bancária possui vários clientes, todavia a agência possui apenas um caixa
eletrônico em funcionamento, para a realização de saques e transferências. Para realizar a
operação de saque o cliente gasta 8 segundos para finalizar seu saque e para a transferência o
cliente do banco gasta 5 segundos. Implemente um sistema em que o caixa eletrônico será o
nosso objeto e os clientes serão threads que tentaram realizar as operações de saque e
transferência no caixa eletrônico.

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
