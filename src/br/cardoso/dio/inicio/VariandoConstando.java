package br.cardoso.dio.inicio;

public class VariandoConstando {

	public static void main(String[] args) throws Exception {
		
		double salarioMinimo = 1300.00;
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("O Salário Minimo no Brasil é: R$ " + salarioMinimo);
		
		float pi = 3.14f;
		byte idade = 34;
		final double MR_PI = 3.20;
		
		/* Variáveis que comecem com '0', devem ser string, pois ele não interpreta
		 * como um inteiro; Variáveis tipo Long, devem ser finalizados com 'L'. */
		
		System.out.println(); // Quebrando as linhas...
		
		System.out.println("Qual a sua idade? " + idade);
		System.out.println(); // Quebrando as linhas...
		
		System.out.println("Eis que o Sr. PI, chega na festa... " + pi);
		System.out.println(); // Quebrando as linhas...
		
				
		System.out.println("Mudanças no planejamento Sr. PI? " + MR_PI);
		System.out.println(); // Quebrando as linhas...
		
		/* MR_PI = 2.16; -> Variáveis do tipo 'final' não conseguem ser alteradas!!
		 * final double MR_PI = 3.20; */
		
		System.out.println("Prazer, me chamo Thiago Cardoso!!");
		System.out.println(); // Quebrando as linhas...
		
	}
}