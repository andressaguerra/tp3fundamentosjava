package dominio;

import java.util.Scanner;
import auxiliar.Constante;

public class TP1 {
	
	private static String[] nomes;
	private static float[] notas1;
	private static float[] notas2;
	
	private static float calcularMedia(int cod) {
		return (notas1[cod] + notas2[cod]) / 2;
	}
	
	private static String obterSituacao(float media) {
		if (media >= 7) {
			return "Aprovado";
		} else if (media < 4) {
			return "Reprovado";
		} else {
			return "Prova Final";
		}
	}
	
	private static void imprimir(int cod, float media, String situacao) {
		System.out.println("Nome: " + nomes[cod]);
		System.out.println("AV1: " + notas1[cod]);
		System.out.println("AV2: " + notas2[cod]);
		System.out.println("Média: " + media);
		System.out.println("Situação: " + situacao);
		System.out.printf("\n");

//		Não faço ideia por que isso não funcionaaa
//		System.out.printf("Nome: %s | AV1: %.2f | AV2: %.2f | Média: %2.f | Situação: %s\n",
//				nomes[cod], notas1[cod], notas2[cod], media, situacao);		
	}

	public static void main(String[] args) {
		
		nomes = new String[Constante.QTDE];
		notas1 = new float[Constante.QTDE];
		notas2 = new float[Constante.QTDE];
		
		float[] medias = new float[Constante.QTDE];
		String[] situacoes = new String[Constante.QTDE];
		
		int opcao;
		int codigo = 0;
		
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Selecione a opção desejada:");
			System.out.println("[1] Registrar as notas de um novo aluno.");
			System.out.println("[2] Consultar boletim de um aluno.");
			System.out.println("[3] Consultar notas da turma.");
			System.out.println("[4] Sair.");
			
			opcao = in.nextInt();
			
			switch (opcao) {
			case 1:
				if (codigo < Constante.QTDE) {
					
					System.out.println("Insira o nome do aluno:");
					nomes[codigo] = in.next();
					
					System.out.println("Insira a nota da AV1:");
					notas1[codigo] = in.nextFloat();
					
					System.out.println("Insira a nota da AV2:");
					notas2[codigo] = in.nextFloat();
					
					medias[codigo] = calcularMedia(codigo);
					situacoes[codigo] = obterSituacao(medias[codigo]);
					
					System.out.println("Registrado! Código do aluno: " + codigo);
					
					codigo++;
					
				} else {
					System.out.println("Limite de alunos alcançado. Não é possível inserir um novo registro.");
				}
				
				break;
				
			case 2:
				System.out.println("Insira o código do aluno:");
				int codigoAluno = in.nextInt();
				
				imprimir(codigoAluno, medias[codigoAluno], situacoes[codigoAluno]);
				
				break;
				
			case 3:
				for (int i = 0; i < codigo; i++) {
					imprimir(i, medias[i], situacoes[i]);
				}
				break;
				
			case 4:
				System.out.println("Tchau!");
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}
			
		} while(opcao != 4);
		
		in.close();
	}
}
