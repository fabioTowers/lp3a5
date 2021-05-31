package exercicio13;

public class Cliente implements Runnable {
	
	private String nome;
	private Boolean saque;
	private Boolean transferencia;
	
	private static CaixaEletronico cx = new CaixaEletronico();

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public void realizarOperacao(Boolean saque, Boolean transferencia) {
		this.saque = saque;
		this.transferencia = transferencia;
		
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cliente " + nome + " solicitou uso do caixa.");
		
		cx.operacao(nome, saque, transferencia);
		
		System.out.println("Cliente " + nome + " finalizou o uso do caixa.");
	}

}
