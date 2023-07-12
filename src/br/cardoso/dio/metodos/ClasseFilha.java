package br.cardoso.dio.metodos;

public class ClasseFilha {
	
	// Alguns atributos;
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	/* Alguns Metodos de manipulação dos estados de cada atributo; */
	
	// Ligar a TV;
	public void ligar() {
		ligada = true;
	}
	
	// Desligar a TV;
	public void desligar() {
		ligada = false;
	}
	
	// Aumentar o Volume da TV;
	public void aumentarVolume() {
		volume++;
	}
	
	// Diminuir o Volume da TV;
	public void diminuirVolume() {
		volume--;
	}
	
	// Mudar de Canal;
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
}