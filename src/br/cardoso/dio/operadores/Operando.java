package br.cardoso.dio.operadores;

public class Operando {

	public static void main(String[] args) {
		
		int numero = 4;
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("FORMA 1 DE INFORMAR UM NÚMERO");
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("Numero negativo: ");
		System.out.print(- numero); // Número negativo, por ele ter o operador de 'menos'  -;
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("\nNumero positivo: ");
		System.out.print(numero);
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("\nFORMA 2 DE INFORMAR UM NÚMERO");
		System.out.println(); // Quebrando as linhas...
		
		numero = - numero;
		System.out.println(); // Quebrando as linhas...
		System.out.println("Negativando o número: ");
		System.out.print(numero);
		
		numero = numero * -1;
		System.out.println(); // Quebrando as linhas...
		System.out.println("\nPositivando o número, novamente: ");
		System.out.print(numero);
		
		System.out.println(); // Quebrando as linhas...
	}
}