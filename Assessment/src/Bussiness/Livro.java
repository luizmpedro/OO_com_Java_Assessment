package Bussiness;
import java.util.ArrayList;

public class Livro {
	private String titulo;
	private String editora;
	private int ano;
	private ArrayList<Autor> autores;
	
	public Livro(String titulo) {
		this.titulo = titulo;
		this.autores = new ArrayList<Autor>();
	}
	
	public Livro (String titulo, String editora, int ano) {
		this.titulo = titulo;
		this.editora = editora;
		this.ano = ano;
		this.autores = new ArrayList<Autor>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void adicionarAutor(Autor autor) {
		this.autores.add(autor);
	}
	
	public void imprimirFichaCatalografica() {
		String texto = "";
		for (Autor autor : autores) {
			if (texto != "") {
				texto = texto + " ";
			}
			texto = texto + autor.getCitacaoBibliografica();
		}
		
		texto = texto + " (" + this.ano + ")";
		texto = texto + " " + this.titulo + ".";
		texto = texto + " " + this.editora + ",";
		texto = texto + " " + this.ano + ".";
		
		System.out.println(texto);
	}
	
	public void listarAutores() {
		for (Autor autor : autores) {
			System.out.println(autor.getNomeCompleto());
		}
	}
	
	public void buscarAutor(String nomeCompleto) {
		boolean autorEncontrado = false;
		for (Autor autor : autores) {
			if (autor.getNomeCompleto().equals(nomeCompleto)) {
				System.out.println(nomeCompleto);
				autorEncontrado = true;
			}
		}
		if (!autorEncontrado) {
			System.out.println("Autor não encontrado.");
		}
	}
	
	public void removerAutor(String nomeCompleto) {
		boolean autorEncontrado = false;
		Autor autorParaRemocao = null;
		for (Autor autor : autores) {
			if (autor.getNomeCompleto().equals(nomeCompleto)) {
				autorParaRemocao = autor;
				autorEncontrado = true;
			}
		}
		if (!autorEncontrado) {
			System.out.println("Autor não encontrado.");
		} else {
			autores.remove(autorParaRemocao);
			System.out.println("Autor removido com sucesso.");
		}
	}
}
