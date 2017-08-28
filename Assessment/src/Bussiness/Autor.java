package Bussiness;

public class Autor {
	private String nome;
	private String sobrenome;
	
	public Autor(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}
	
	public String getCitacaoBibliografica() {
		return this.sobrenome.toUpperCase() + ", " + this.nome.substring(0,1).toUpperCase() + "."; 
	}
}
