# Assessment - Orientação objeto com Java

Neste Assessment, você desenvolverá o protótipo de um Sistema de Gerenciamento de Bibliotecas.

Antes de iniciar o Assessment, leia toda a especificação e detalhes de entrega. Enquanto estiver programando, teste bastante. Não adicione muitos métodos antes de testar o que já estiver pronto. Em caso de dúvidas sobre o estado dos objetos durante a execução, lembre-se de usar o depurador. Depure bastante. Depuração é uma das mais poderosas e benéficas práticas em programação.

Seu cliente é o Departamento de Biblioteconomia local, que apresentou as seguintes demandas:

* Quero poder cadastrar novos livros e inseri-los na biblioteca, para que fiquem disponíveis no catálogo;
* Quero poder cadastrar novos autores e inseri-los na biblioteca, para que fiquem disponíveis no catálogo;

A partir destas duas demandas, você concluiu que seu protótipo terá as classes:

* Livro
* Autor

A seguir, você levantou, com o cliente, um detalhamento mais aprofundado das características e de cada uma das funcionalidades das classes, e chegou à seguinte conclusão sobre o que deve haver em cada uma delas.

* Classe Livro:
	* Deve possuir os seguintes atributos:
		* titulo, que é uma String;
		* editora, que é uma String;
		* ano, que é um int;
		* autores, que é uma coleção de autores;
		
	* Deve possuir os seguintes construtores:

		* Com o parâmetro titulo, do tipo String, que deve ser atribuído ao campo titulo.
		* Com os parâmetros:
			* titulo, do tipo String, que deve ser atribuído ao atributo titulo
			* editora, do tipo String, que deve ser atribuído ao atributo editora
			* ano, do tipo int, que deve ser atribuído ao atributo ano

	* Deve possuir os seguintes métodos:

		* getTitulo - Retorna o título do livro
		* setTitulo - Recebe um parâmetro titulo, do tipo String, que será atribuído ao atributo titulo.
		* getEditora - Retorna a editora do livro.
		* setEditora - Recebe um parâmetro editora, do tipo String, que será atribuído ao atributo editora
		* getAutores - Retorna a coleção de autores do livro
		* adicionarAutor - Recebe um parâmetro autor, do tipo Autor, que será adicionado ao atributo autores.
		* imprimirFichaCatalografica - Imprime em tela a ficha catalográfica do livro.

			Por exemplo, suponha o objeto do tipo Livro abaixo:
				titulo: Objects First with Java - A Practical Introduction Using BlueJ
				editora: Pearson Education
				ano: 2017
				autores: David Barnes
						 Michael Kölling
			
			A impressão deve ser:
			
				BARNES, D. KÖLLING, M. (2017) Objects First with Java - A Practical Introduction Using BlueJ. Pearson Education, 2017.
			
			Ou seja:
			
			* Para cada autor: sobrenome do autor, em maiúsculas, seguido de vírgula, seguido pela inicial do primeiro nome do autor.
			* Ano do livro entre parênteses
			* Nome do livro, seguido de ponto.
			* Editora, seguida de vírgula
			* Ano do livro, seguido de ponto.

	* Deve utilizar métodos da classe Autor para imprimir o nome dos autores.

		* listarAutores - Percorre a lista de autores do livro e, um a um, imprime o nome completo do autor.
		* buscarAutor - Recebe um parâmetro nomeCompleto, do tipo String, e procura, na lista de autores do livro, por um autor com nome completo igual ao parâmetro.
		Caso encontre o autor, imprime o nome completo do autor em tela.
		Caso contrário, informa que o autor não foi encontrado, imprimindo: Autor não encontrado.
		* removerAutor - Recebe um parâmetro nomeCompleto, do tipo String, e procura, na lista de autores do livro, por um autor com nome completo igual ao parâmetro.
		Caso encontre o autor, remove o autor da lista de autores do livro e informa sucesso, imprimindo: Autor removido com sucesso.
		Caso contrário, informa que o autor não foi encontrado, imprimindo: Autor não encontrado.

* Classe Autor:
	* Deve possuir os seguintes atributos:
		* nome, do tipo String
		* sobrenome, do tipo String
	* Deve possuir os seguintes construtores:
		* Com os parâmetros:
			* nome, do tipo String, que deve ser atribuído ao atributo nome
			* sobrenome, do tipo String, que deve ser atribuído ao atributo sobrenome
	* Deve possuir os seguintes métodos:
		* getNome - Retorna o primeiro nome do autor
		* setNome - Recebe um parâmetro nome, do tipo String, que será atribuído ao atributo nome.
		* getSobrenome - Retorna o sobrenome do autor
		* setSobrenome - Recebe um parâmetro sobrenome, do tipo String, que será atribuído ao atributo sobrenome.
		* getNomeCompleto - Retorna o nome completo (nome e sobrenome) do autor.
		* getCitacaoBibliografica - Retorna a citação bibliográfica do autor

			Por exemplo, suponha o objeto do tipo Autor abaixo:
				nome: Albert
				sobrenome: Einstein
			Para este objeto, o método deve retornar:
			
				EINSTEIN, A.

			Dica:
			Para recuperar a inicial do primeiro nome, use: getNome().substring(0).
			Para imprimir o sobrenome em maiúsculas, use: getSobrenome().toUpperCase();

Você deve executar seu programa no BlueJ, NetBeans ou Eclipse e:

	1. Criar pelo menos 2 objetos do tipo Livro
	1. Criar pelo menos 3 objetos do tipo Autor
	1. Adicionar pelo menos 2 objetos Autor a cada Livro
	1. Inspecionar pelo menos um objeto do tipo Autor, e realizar uma captura da tela de inspeção.
	1. Inspecionar pelo menos um objeto do tipo Livro, inspecionando também sua coleção de autores e, dentro da coleção de autores, inspecionar pelo menos um Autor, e realizar uma captura de tela para exibir todas essas inspeções.