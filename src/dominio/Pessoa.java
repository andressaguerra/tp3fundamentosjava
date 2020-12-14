package dominio;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		this.nome = "Unnamed";
		this.idade = 18;
	}
	
	public Pessoa(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String obterSituacao() {
		return String.format("Nome: %s | Idade: %d",
				this.nome, this.idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
