package br.com.minhaconta;

public class Conta {
 String cliente;
 Double saldo;
 		
 	void exibesaldo(){
 		
 		System.out.println(cliente+ " " +  "Seu Saldo Atual é :" + saldo);
 		
 	}
 	
 	void Saque (double valor) {
 		
 		saldo = valor;
 		
 	}
 	
 	void Deposito(double valor) {
 		saldo += valor;
 	}
 	
 	void Transferencia (Conta destino, double valor ) {//dentro das chaves fica as variaveis/objetos
 		this.Saque(valor);//o this serve para referenciar o objeto
 		destino.Deposito(valor);
}
}