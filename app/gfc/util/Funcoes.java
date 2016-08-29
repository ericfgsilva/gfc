package gfc.util;

public class Funcoes {

	public static String removeCaracteresEspeciais(String texto){
		return texto.replaceAll("[^0-9a-zA-Z]+", "");
	}
}
