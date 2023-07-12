package br.cardoso.dio.repetidor;

public class ArraysComFor {

	public static void main(String[] args) {
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("..........: GRUPO DE FUNCIONÁRIOS :..........");
		System.out.println(); // Quebrando as linhas...
		
		// Alguns Arrays que serão alocados em memória quando a aplicação estiver em "operação";
		String alunos [] = { "GABRIELA", "PETER", "MARCELA", "BETTY", "GUSTAVO", "MIKE" };
		String materias [] = { "ARQUIOLOGIA DA ADM", "COMPILADORES", "SEGURANÇA DIGITAL",
				"MARKETING DIGITAL", "MERCADO AGROPECUÁRIO", "NOÇÕES COMPUTAÇÃO ESPACIAL"};
		
		// Repetindo a quantidade de informações contidas nos arrays já definidos e declarados;
		for(int x=0; x < alunos.length; x++) {
			System.out.println("O(A) ALUNO NO INDICE X = " + x + " É " + alunos[x]);
			// System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
		}
		
		System.out.println(); // Quebrando as linhas...
		
		// dsdsadsadsad
		for(int h=0; h < materias.length; h++) {
			System.out.println("A MATÉRIA NO INDICE X = " + h + " É " + materias[h]);
		}
		
		System.out.println(); // Quebrando as linhas...
		
		
		
	}
}