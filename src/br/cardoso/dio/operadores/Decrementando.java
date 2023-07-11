package br.cardoso.dio.operadores;

public class Decrementando {

	public static void main(String[] args) {
		
		// Declarando variáveis;
		boolean eu = true;
		int dado = 22;
		
		System.out.println(); // Quebrando as linhas...
		System.out.println(".... VARIÁVEIS BOOLEANAS REAIS OU FALSAS ....");
		System.out.println(); // Quebrando as linhas...
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("Sou Verdadeiro?");
		System.out.println(!eu);
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("Sou Verdadeiro?");
		System.out.println(eu);
		System.out.println(); // Quebrando as linhas...
		
		/* Intervendo a relevancia de uma variável booleana:
		 * eu = !eu;
		 * !eu = eu; */
		
		System.out.println(); // Quebrando as linhas...
		System.out.println(".... INCREMENTANDO NÚMEROS ....");
		System.out.println(); // Quebrando as linhas...
		
		dado++; // Incrementando números;
		System.out.println(dado);
		
		System.out.println(); // Quebrando as linhas...
		
		dado--; // Decrementando números;
		System.out.println(dado);
		
	}
}