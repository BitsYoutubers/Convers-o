package Valores;

public class Condicional {

	public static void main(String[] args) {
		// main + ctrl + espaço
		System.out.println("Testando condicionais");
		// sysout + ctrl + espaço
		int idade = 17;
		int quantidadePessoas = 3;
		if(idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja muito bem vindo");
		}
		
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você está acompanhado, liberado");
			} else {
			System.out.println("Você não pode entrar");
			}
		}
	}
}
