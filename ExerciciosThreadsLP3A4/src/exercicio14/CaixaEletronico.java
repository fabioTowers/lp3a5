package exercicio14;

import static java.lang.Thread.sleep;

public class CaixaEletronico {
	
	private Integer totalCedulas = 300;
	public static boolean caixaVazio = false;
	
	public synchronized void operacao(String cliente, Boolean saque, Boolean transferencia) {
		
		if( transferencia ) {
			
			if(!caixaVazio) {
				try {
		            Thread.sleep(10000);
		            totalCedulas = 500;
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			}

	        caixaVazio = false;
	        notifyAll();
			System.out.println("Cliente " + cliente + " iniciou operacao de transferencia!");
			for(int aux=0; aux < 5; aux++) {
				try {
					System.out.println("[" + cliente + "] Realizando transferencia...");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		if( saque ) {
			System.out.println("Cliente " + cliente + " iniciou operacao de saque!");
			for(int aux=0; aux < 8; aux++) {
				try {
					System.out.println("[" + cliente + "] Realizando saque...\t[total disponivel: " + totalCedulas + "]");
					totalCedulas -= 100;
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// Verificar se há cédulas disponíveis...
				if( totalCedulas <= 0 ) {
					caixaVazio = true;
					System.out.println("Acabaram as cedulas!");
					
					/*Cedulas c = new Cedulas();
					Thread t = new Thread(c);
					c.abastecer(t);
					
					try {
						t.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
					
					try {
			    		while(caixaVazio)
			    			wait();
			    		sleep(8000);
			        } catch (InterruptedException e){
			            e.printStackTrace();
			        }
					
					totalCedulas = 500;

					System.out.println("Novas cedulas inseridas!");
				}
			}
		}
	}
	
}
