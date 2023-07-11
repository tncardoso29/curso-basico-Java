package br.cardoso.dio.operadores;

public class OperadorTernario {

	public static void main(String[] args) {
		
		int s, g;
		
		s = 22;
		g = 22;
		
		// Expressão Booleana de Verdadeiro ou Falso;
		String reslt = s == g ? "verdade" : "mentira";
		
		System.out.println(); // Quebrando as linhas...
		System.out.println(" ..... TESTE BOOLEANO 1 ..... ");
		System.out.println(); // Quebrando as linhas...
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("S e G são iguais? (22 por 22) ");
		System.out.println(reslt);
		System.out.println(); // Quebrando as linhas...
		
		
		System.out.println(); // Quebrando as linhas...
		System.out.println(" ..... BOOLEANO RELACIONADO ..... ");
		System.out.println(); // Quebrando as linhas...
		
		int peg1 = 28;
		int peg2 = 32;
		
		boolean ehOuNao = peg1 == peg2; // 
		System.out.println(); // Quebrando as linhas...
		System.out.println("peg1 é igual ao peg2? " + ehOuNao);
				
		ehOuNao = peg1 != peg2;
		System.out.println(); // Quebrando as linhas...
		System.out.println("peg1 é diferente de peg2? " + ehOuNao);
		
		ehOuNao = peg1 > peg2;
		System.out.println(); // Quebrando as linhas...
		System.out.println("peg1 é maior que peg2? " + ehOuNao);
		System.out.println(); // Quebrando as linhas...
		
		System.out.println(); // Quebrando as linhas...
		System.out.println(" ..... COMPARANDO TEXTOS ..... ");
		System.out.println(); // Quebrando as linhas...
		
		String nome1 = "THIAGO";
		String nome2 = "THIAGO";
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("Nome 1 e Nome 2 são verdadeiros? ");
		System.out.print(nome1 == nome2);
		
		String nome3 = new String ("THIAGO");
		System.out.println(); // Quebrando as linhas...
		System.out.println("\nOs conteúdos são iguais? ");
		System.out.print(nome1.equals(nome3));
		
		System.out.println(); // Quebrando as linhas...
		
		
	}
}