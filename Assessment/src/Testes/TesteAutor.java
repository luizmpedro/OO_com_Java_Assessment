package Testes;
import Bussiness.Autor;

public class TesteAutor {

	public static void main(String[] args) {
		Autor novoAutor = new Autor ("nome", "sobrenome");
		System.out.println(novoAutor.getCitacaoBibliografica());
		System.out.println(novoAutor.getNomeCompleto());
		System.out.println(novoAutor.getNome());
		System.out.println(novoAutor.getSobrenome());
		
		novoAutor.setNome("Doutor");
		novoAutor.setSobrenome("Estranho");
		

		System.out.println(novoAutor.getCitacaoBibliografica());
		System.out.println(novoAutor.getNomeCompleto());
		System.out.println(novoAutor.getNome());
		System.out.println(novoAutor.getSobrenome());
	}

}
