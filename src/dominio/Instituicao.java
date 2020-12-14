package dominio;

import exceptions.NomeIncompletoException;

public class Instituicao {
	
	private String nome;
	private String nomeMeio;
	private String ultimoNome;

	public String getNome() throws NomeIncompletoException {
		
		if (this.nome == null || this.nomeMeio == null || this.ultimoNome == null) {
			throw new NomeIncompletoException("Nome inválido! Inserir nome completo.");
		}
		
		StringBuilder nomeCompleto = new StringBuilder();
		
		nomeCompleto.append(this.nome.toUpperCase());
		nomeCompleto.append(" ");
		
		if (!this.nomeMeio.equals("")) {
			nomeCompleto.append(this.nomeMeio.toUpperCase());
			nomeCompleto.append(" ");	
		}
		
		nomeCompleto.append(this.ultimoNome.toUpperCase());
		
		return nomeCompleto.toString();
	}

	public void setNome(String nome) throws NomeIncompletoException {
		
		if (nome.split(" ").length <= 1) {
			throw new NomeIncompletoException("Nome inválido. Inserir nome completo.");
		}
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
		
		this.nome = nome.substring(0, posInicial);
		this.nomeMeio = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
		
	}

}
