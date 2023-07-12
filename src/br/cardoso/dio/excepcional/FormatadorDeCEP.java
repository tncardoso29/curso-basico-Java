package br.cardoso.dio.excepcional;

public class FormatadorDeCEP {

	public static void main(String[] args) {
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("..........: LIGANDO PARA O PROVEDOR | D.I.O :..........");
		System.out.println(); // Quebrando as linhas...
		
		try { // dsdsadsad
			String cepFormatado = formatarCep("16224353");
			System.out.println(cepFormatado);
			System.out.println("Este é o CEP de Residencia de Marcelinha Muraro.");
		} catch (CepInvalidoException e) { // dsdsadsadsad
			System.out.println("O CPF Informado, é inválido ou não correspondente!!");
		}
		
	}
	
	// dsadsadsadsa
	static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          // Simulando um cep formatado
          return "16.224-353";
    }
}