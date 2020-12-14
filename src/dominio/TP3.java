package dominio;

import exceptions.NomeIncompletoException;

public class TP3 {
	
	public static void main(String[] args) {
		
		Instituicao i1 = new Instituicao();
		Instituicao i2 = new Instituicao();
		Instituicao i3 = new Instituicao();
		Instituicao i4 = new Instituicao();
		
		//Testando exceção (mensagem 1)
		try {
			i1.setNome("Aaaa");
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			i2.setNome("Aaaa Bbbb");
			i3.setNome("Aaaa Bbbb Cccc");
			i4.setNome("Aaaa Bbbb Cccc Dddd");
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("***");
		
		//Testando exceção (mensagem 2)
		try {
			System.out.println(i1.getNome());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(i2.getNome());
			System.out.println(i3.getNome());
			System.out.println(i4.getNome());
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}
	}

}
