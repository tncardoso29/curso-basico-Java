package br.cardoso.dio.excepcional;

import java.text.NumberFormat;
import java.text.ParseException;

public class TratandoCPFsExcepcionais {

	public static void main(String[] args) {
		
		System.out.println(); // Quebrando as linhas...
		System.out.println("..........: TRATANDO EXCESSÕES COM CPFS :..........");
		System.out.println(); // Quebrando as linhas...
		
		// Number valor = Double.valueOf("b15.16");
		Number valor;
		
		try {
			valor = NumberFormat.getInstance().parse("b1.16");
			System.out.println(valor);
		}
		
		catch (ParseException e) {
			e.printStackTrace();
		}	
		
	}
}