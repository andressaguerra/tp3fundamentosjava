package dominio;

import java.util.Arrays;
import java.util.Scanner;

import auxiliar.Constante;

public class TP2 {
	
	private static Pessoa[] pessoas;
	
	public static void main(String[] args) {
		
		pessoas = new Pessoa[Constante.QTDE];
		
		Scanner in = new Scanner(System.in);
		
		int opcao;
		int i = 0;
		
		do {
			System.out.println("Selecione a opção desejada:");
			System.out.println("[1] Cadastrar professor.");
			System.out.println("[2] Cadastrar aluno.");
			System.out.println("[3] Consultar situação de um docente/discente.");
			System.out.println("[4] Sair.");
			
			opcao = in.nextInt();
			
			if(Arrays.asList(Constante.OPCOES).contains(opcao)) {
				
				switch(opcao) {
				case 1:
					if (i < Constante.QTDE) {
						
						Professor prof = new Professor();
						
						System.out.println("Insira o nome do professor:");
						prof.setNome(in.next());
						
						System.out.println("Insira a idade do professor:");
						prof.setIdade(in.nextInt());
						
						System.out.println("Insira o número de turmas lecionadas pelo professor:");
						prof.setTurma(in.nextInt());
						
						pessoas[i] = prof;
						
						System.out.println("Registrado! Código do professor: " + i);
						
						i++;
						
					} else {
						System.out.println("Limite de cadastros alcançado. Não é possível inserir um novo registro.");
					}
					
					break;
				
				case 2:
					if (i < Constante.QTDE) {
						
						Aluno al = new Aluno();
						
						System.out.println("Insira o nome do aluno:");
						al.setNome(in.next());
						
						System.out.println("Insira a idade do aluno:");
						al.setIdade(in.nextInt());
						
						System.out.println("Insira a nota da AV1:");
						al.setNota1(in.nextFloat());
						
						System.out.println("Insira a nota da AV2:");
						al.setNota2(in.nextFloat());
						
						pessoas[i] = al;
						
						System.out.println("Registrado! Código do aluno: " + i);
						
						i++;
						
					} else {
						System.out.println("Limite de cadastros alcançado. Não é possível inserir um novo registro.");
					}
					
					break;
					
				case 3:
					System.out.println("Insira o código de registro:");
					int codigo = in.nextInt();
					
					if (codigo >= 0 && codigo < i) {
						System.out.println(pessoas[codigo].obterSituacao());
					} else {
						System.out.println("Código inválido.");
					}
					
					break;
				}
			}
			else {
				System.out.println("Opção inválida.");
			}
			
		} while (opcao != 4);
	
		
		in.close();
	}
}
