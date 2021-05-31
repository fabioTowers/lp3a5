package exercicio12;

public class SomaDeNumeros implements Runnable {
	
	private Integer x;
	private Integer z;
	private Integer soma = 0;
	
	public SomaDeNumeros(Integer x, Integer z) {
		this.x = x;
		this.z = z;
	}

	public void calcularSequencia() {
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Integer qtd=1;
		Integer vlInicial = x;
		soma = vlInicial;
		while(soma < z) {
			vlInicial++;
			soma = soma + vlInicial;
			qtd++;
		}
		System.out.print("\n\nX\tZ\tResposta\n" + x + "\t" + z + "\t" + qtd + " (" + x);
		for(int aux=(x+1); aux <=vlInicial; aux++) {
			System.out.print("+");
			System.out.print(aux);
		}
		System.out.print("=" + soma + ")\n");
	}

}
