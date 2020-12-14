package dominio;

public class Professor extends Pessoa {
	
	private int turma;
	
	public Professor() {
		super();
		this.turma = 0;
	}
	
	public String obterDisp() {
		return (this.turma < 3) ? "(Disponível)" : "(Indisponível)";
	}

	@Override
	public String obterSituacao() {
		return String.format("%s | Turmas: %d %s",
				super.obterSituacao(), this.turma, obterDisp());
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}

}
