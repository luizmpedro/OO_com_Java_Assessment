package Assessment;
import Bussiness.*;

public class Assessment {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Senhor dos Anéis", "Martins Fontes", 1954);
		Livro livro2 = new Livro("Funcação", "Aleph", 1942);
		
		Autor autor1 = new Autor("Isaac", "Asimov");
		Autor autor2 = new Autor("John", "Tolkien");
		Autor autor3 = new Autor("Elmister", "Aumar");
		
		livro1.adicionarAutor(autor2);
		livro1.adicionarAutor(autor3);
		livro2.adicionarAutor(autor1);
		livro2.adicionarAutor(autor3);
		
		System.out.println(autor1.getCitacaoBibliografica());
		
		livro2.imprimirFichaCatalografica();
	}

}
