package Valores;

public class Escopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		// boolean acompanhado = quantidadePessoas >= 2;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}	
}
