package Valores;

public class Condicional {

	public static void main(String[] args) {
		// main + ctrl + espa�o
		System.out.println("Testando condicionais");
		// sysout + ctrl + espa�o
		int idade = 17;
		int quantidadePessoas = 3;
		if(idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja muito bem vindo");
		}
		
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� est� acompanhado, liberado");
			} else {
			System.out.println("Voc� n�o pode entrar");
			}
		}
	}
}
