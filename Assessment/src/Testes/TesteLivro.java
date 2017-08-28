package Testes;
import java.util.ArrayList;
import Bussiness.*;

public class TesteLivro {
	public static void main(String[] args) {
		Autor autor1 = new Autor("Capitão", "Marvel");
		Autor autor2 = new Autor("Homem", "Aranha");
		
		Livro livro1 = new Livro("Revista 1");
		Livro livro2 = new Livro("Revista 2", "Marvel", 2016);
		
		System.out.println(livro2.getTitulo());
		System.out.println(livro2.getEditora());
		
		livro2.setTitulo("Guerra Civil");
		livro2.setEditora("Panninni");
		livro2.setAno(2017);
		
		System.out.println(livro2.getTitulo());
		System.out.println(livro2.getEditora());
		
		livro2.adicionarAutor(autor1);
		livro2.adicionarAutor(autor2);
		
		ArrayList<Autor> autores = livro2.getAutores();
		
		for (Autor autor : autores) {
			System.out.println(autor.getNomeCompleto());
		}
		
		livro2.imprimirFichaCatalografica();
		livro2.listarAutores();
		livro2.buscarAutor(autor2.getNomeCompleto());
		livro2.buscarAutor("Nome Inventado");
		livro2.removerAutor("nome inventado");
		livro2.removerAutor(autor2.getNomeCompleto());
		
		livro2.listarAutores();
		
	}
}
