package exercicio10;

public class OperacaoMatematica implements Runnable {

	private Integer numA;
	private Integer numB;
	private String operacao;
	
	public OperacaoMatematica(Integer numA, Integer numB, String operacao) {
		this.numA = numA;
		this.numB = numB;
		this.operacao = operacao;
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		switch(operacao) {
			case "+":
				System.out.println( numA + " + " + numB + " = " + (numA + numB) );
				break;
			case "-":
				System.out.println( numA + " - " + numB + " = " + (numA - numB) );
				break;
			case "/":
				System.out.println( numA + " / " + numB + " = " + (numA / numB) );
				break;
			case "*":
				System.out.println( numA + " * " + numB + " = " + (numA * numB) );
				break;
			default:
				System.out.println( "Operacao nao efetuada, verifique as entradas." );
				break;
		}
	}

}
