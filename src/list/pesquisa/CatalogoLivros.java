package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livrosList;

	public CatalogoLivros(List<Livro> livrosList) {
		super();
		this.livrosList = new ArrayList<>();
	}
	
	public void addLivro(String titulo, String autor, int anoPublicacao) {
		livrosList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livrosList.isEmpty()) {
			
		}

	}
	
}
