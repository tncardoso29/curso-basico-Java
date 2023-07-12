package br.cardoso.dio.metodos;

public class classePai {

	public static void main(String[] args) throws Exception {
		
		/* UMA PEQUENA E SIMPÁTICA INTRODUÇÃO AS CLASSES ORIENTADAS COM MÉTODOS */
		ClasseFilha classeFilha = new ClasseFilha(); // Criando uma classe e iniciando a interação dos atributos e atributos contidos nela;
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("..... CLASSE ORIENTADA V1 ...... \t");
		System.out.println(); // Quebrando as linhas...
		
		// Alguns estados da TV como: Ligada? Canal? Volume??
		System.out.println("TV Ligada? " + classeFilha.ligada);
		System.out.println("Canal Atual: " + classeFilha.canal);
		System.out.println("Volume Atual: " + classeFilha.volume);
		
		System.out.println(); // Quebrando as linhas...
		
		classeFilha.aumentarVolume(); // Aumentou o volume da TV;
		classeFilha.diminuirVolume(); // Diminuiu o volume da TV;
		classeFilha.diminuirVolume();
		classeFilha.diminuirVolume();
		classeFilha.diminuirVolume();
		classeFilha.diminuirVolume();
		classeFilha.diminuirVolume();
		classeFilha.diminuirVolume();
		classeFilha.aumentarVolume();
		System.out.println("TESTANDO O CONTROLE DE VOLUME");
		System.out.println("Volume Atual: " + classeFilha.volume);
		System.out.println(); // Quebrando as linhas...
		
		System.out.println("TESTANDO OS CANAIS DA TV");
		System.out.println("Canal Atual: " + classeFilha.canal);
		classeFilha.mudarCanal(22); // Mudou de canal;
		System.out.println("Canal Atual: " + classeFilha.canal);
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("TESTANDO O CONTROLE DE LIGAR E DESLIGAR");		
		classeFilha.ligar(); // TV Ligada;
		System.out.println("Novo Status | TV Ligada? " + classeFilha.ligada);
		classeFilha.desligar();
		System.out.println("Novo Status | TV Ligada? " + classeFilha.ligada);
	}
}