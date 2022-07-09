package Caracteres;

public class Caracteres {

	public static void main(String[] args) {
		char letra = 'a';
		// guarda apenas uma letra em aspas simples
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Relics Network um servidor de minecraft";
		// na string pode usar nada. ""
		System.out.println(palavra);
		
		palavra = palavra + 2022;
		System.out.println(palavra);
	}
}
