package br.cardoso.dio.repetidor;

import java.util.concurrent.ThreadLocalRandom;

public class WhileDoWhile {

	public static void main(String[] args) {
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("..........: MESADAS S.A :..........");
		System.out.println(); // Quebrando as linhas...
		
		double mesada = 50.0;
		
		// Enquanto o valor de mesada for maior que 0, será subtraido pelo valor do doce;
		while(mesada > 0) {
			Double valorDoce = valorAleatorio();
			
			// Se o valor do doce for maior que a mesada.. o valor do doce vai subtraindo o a quantia da mesada; 
			if(valorDoce > mesada) 
				valorDoce = mesada;
				
				System.out.println("Valor do Doce: " + valorDoce + ", Adicionado no carrinho!");
				mesada = mesada - valorDoce;
				
		}
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("Mesada: " + mesada);
		System.out.println("Marcelinha gastou sua mesada com doces!!");
		System.out.println(); // Quebrando as linhas...
		
	}
	
	// Método que retornará o valor para que 'Marcelinha' pudesse comprar seus doces;
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 15);
	}
}