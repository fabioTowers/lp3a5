/*
 * 14. Implemente um mecanismo que verifica se o caixa eletrônico do exercício anterior (13) está
sem cédulas para saque, em caso afirmativo, deverá ser inicializada uma thread com o objetivo de 
alimentar novas cédulas no caixa eletrônico. Durante esse processo o caixa eletrônico ficará 
indisponível, esperando o terminando de alimentação das cédulas, apenas ao final do processo os 
clientes podem voltar a utilizar o caixa eletrônico

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
