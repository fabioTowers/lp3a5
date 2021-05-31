package exercicio11;

public class ConsoantesVogais implements Runnable {

	private boolean vogal = false;
	private String palavra;
	private Integer qtdVogais = 0;
	private Integer qtdConsoantes = 0;
	private char c;
	private Integer resultado = 0;
	
	public ConsoantesVogais(boolean vogal, String palavra) {
		this.vogal = vogal;
		this.palavra = palavra.toLowerCase();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=0; x < palavra.length(); x++) {
			c = palavra.charAt(x);
			if( c == 97 || c == 101 || c == 105 || c == 111 || c == 117 ) {
				qtdVogais++;
			} else if ( (c >= 98) && (c <=122) ){
				qtdConsoantes++;
			}
		} //fim do for
		resultado = (vogal ? qtdVogais : qtdConsoantes);
		if(vogal)
			System.out.println("\nHa " + resultado + " vogais na palavra '" + palavra + "'.");
		else
			System.out.println("\nHa " + resultado + " consoantes na palavra '" + palavra + "'.");
	} //fim de run
	
	public void quantidade() {
		Thread t = new Thread(this);
		t.start();
	}

}
