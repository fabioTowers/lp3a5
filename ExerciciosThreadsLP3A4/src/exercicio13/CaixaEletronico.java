package exercicio13;

public class CaixaEletronico {
	
	public synchronized void operacao(String cliente, Boolean saque, Boolean transferencia) {
		
		if( saque ) {
			System.out.println("Cliente " + cliente + " iniciou operacao de saque!");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if( transferencia ) {
			System.out.println("Cliente " + cliente + " iniciou operacao de transferencia!");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
