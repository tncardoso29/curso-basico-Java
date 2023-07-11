package br.cardoso.dio.operadores;

public class MeConteVerdades {

	public static void main(String[] args) {
		
		boolean spret = true;
		boolean range = true;
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("...... TABELINHA VERADDE ......");
		System.out.println(); // Quebrando as linhas...
		
		if(spret && range) { // As duas condições batem!!
			System.out.println("Ambas as condições batem!!");
		}
		
		if(spret || range) { // Condição "OU", é uma coisa ou outra!!
			System.out.println("Uma das condições faz sentido!!");
		}
		
		System.out.println("Ambas as condições são falsas. "
				+ "Ou seja.. Terminamos por aqui!!");
		
	}
}