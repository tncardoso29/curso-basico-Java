package br.cardoso.dio.repetidor;

import java.util.Random;

public class DoWhileDialUP {
	
	public static void main(String[] args) {
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("..........: LIGANDO PARA O PROVEDOR | D.I.O :..........");
		System.out.println(); // Quebrando as linhas...
		
		System.out.println("Pegando Linha... \t");
		System.out.println("Discando...");
		
		System.out.println(); // Quebrando as linhas...
		
		// Faça a conexão...
		do {
			System.out.println("Conectando...");
		} while(tocando()); // Enquanto a conexão for verdeira, ele vai responder como 'Conectado';
			System.out.println(); // Quebrando as linhas...
			System.out.println("Conectado!!!");
			
			
			System.out.println("Muito obrigado por escolher nossos serviços. "+
			"Agora aproveite sua navegabilidade.");
		
	}
	
	// Método booleano 'tocando' que após as chamadas feitas e for atendido, ele responderá que o nosso usuário foi atendido!!
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Conectou? " + atendeu);
		return ! atendeu;
	}
}