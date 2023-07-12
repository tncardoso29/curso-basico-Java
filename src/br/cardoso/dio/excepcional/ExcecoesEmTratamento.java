package br.cardoso.dio.excepcional;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExcecoesEmTratamento {

	public static void main(String[] args) {
		
		// Criando o objeto 'Scanner', para capturar as informações digitadas;
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("..........: TRATANDO EXCESSÕES :..........");
		System.out.println(); // Quebrando as linhas...
		
		try { // Rodar essa estrutura enquanto tudo estiver OK;
		
			System.out.println("Digite seu nome: ");
			String nome = scanner.next();
			
			System.out.println(); // Quebrando as linhas...
			System.out.println("Digite seu sobrenome: ");
			String sobrenome = scanner.next();
			
			System.out.println(); // Quebrando as linhas...
			System.out.println("Digite sua idade");
			int idade = scanner.nextInt();
			
			System.out.println(); // Quebrando as linhas...
			System.out.println("Digite sua altura: ");
			double altura = scanner.nextDouble();
			
			// Imprimindo os dados obtidos pelo(a) usuário(a);
			System.out.println(); // Quebrando as linhas...
			
			System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
			System.out.println("Tenho " + idade + " anos.");
			System.out.println("Minha altura é " + altura + " cm. ");
			scanner.close();
		}
		catch (InputMismatchException e) { // Capture o erro e retorne um aviso, caso ele ocorra!!
			System.out.println(); // Quebrando as linhas...
			System.out.println("Os Campos Idade e Altura precisam ser númericos!!");
		}
	}
}