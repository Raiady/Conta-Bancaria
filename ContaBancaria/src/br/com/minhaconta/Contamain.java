package br.com.minhaconta;

public class Contamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.cliente = "Danieela";
		conta.saldo = 4_000.00;
		conta.exibesaldo();
		
		//conta.Saque(2000);
		//conta.exibesaldo();
		
		//conta.Deposito(6000);
		//conta.exibesaldo();
		
		Conta destino = new Conta();
		destino.cliente ="Maria";
		destino.saldo = 7_000.00;
		destino.exibesaldo();
				
		
	}

}
