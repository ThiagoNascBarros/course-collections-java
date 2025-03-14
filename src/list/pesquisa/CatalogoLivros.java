package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> livrosList;

	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}
	
	public void addLivro(String titulo, String autor, int anoPublicacao) {
		livrosList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livrosList.isEmpty()) {
			livrosList.forEach(livro -> {
				if(livro.getAutor().equalsIgnoreCase(autor)){
					livrosPorAutor.add(livro);
				}
			});
		}

		return livrosPorAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livrosList.isEmpty()){
			livrosList.forEach(livro -> {
				if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
					livrosPorIntervaloAnos.add(livro);
				}
			});
		}

		return livrosPorIntervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo){
		Livro livroPorTitulo = null;
		if(!livrosList.isEmpty()){
			for(Livro l : livrosList){
				if(l.getTitulo().equalsIgnoreCase(titulo)){
					livroPorTitulo = l;
				}
			}
		}
		return livroPorTitulo;
	}

	public static void main(String[] args) {

		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.addLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
		catalogoLivros.addLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
		catalogoLivros.addLivro("Código Limpo", "Robert C. Martin", 2009);
		catalogoLivros.addLivro("O Codificador Limpo", "Robert C. Martin", 2012);

		System.out.println(catalogoLivros.pesquisarAutor("Robert C. Martin"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2018));

		System.out.println(catalogoLivros.pesquisarPorTitulo("O Codificador Limpo"));


	}

}
