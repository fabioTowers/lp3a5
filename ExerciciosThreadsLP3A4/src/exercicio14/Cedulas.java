package exercicio14;

public class Cedulas implements Runnable{
	
	public void abastecer(Thread t) {
		
		t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			for(int auxB=0; auxB< 4; auxB++) {
				System.out.println("Alimentando com mais cedulas...");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
