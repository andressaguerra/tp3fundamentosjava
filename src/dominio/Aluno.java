package dominio;

public class Aluno extends Pessoa {
	
	private float nota1;
	private float nota2;
	
	public Aluno() {
		super();
		this.nota1 = 0;
		this.nota2 = 0;
	}
	
	public String obterMedia() {
		float media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			return String.format("Média: %.1f (Aprovado)", media);
		}
		else if (media < 4) {
			return String.format("Média: %.1f (Reprovado)", media);
		} else {
			return String.format("Média: %.1f (Prova Final)", media);
		}
	}

	@Override
	public String obterSituacao() {
		return String.format("%s | AV1: %.1f | AV2: %.1f | %s",
				super.obterSituacao(), this.nota1, this.nota2, obterMedia());
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

}
