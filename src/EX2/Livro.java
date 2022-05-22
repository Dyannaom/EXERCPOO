package EX2;

public class Livro {
	
	public String autor;
	public String tema;
	public int qtdPag;
	
	public Livro (String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public String getTema() {
		return tema;
	}
	
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
	public int getQtdPag() {
		return qtdPag;
	}
	
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	
	@Override
	public void calculaImposto( ) {
		if (getTema(.equals("educativo")) {
			System.out.println("Livro educativo não tem imposto: " + getNome());
			
		} else {
			double imposto = getPreco() * 10 / 100;			
			System.out.println("R$ " + imposto + "de impostos sobre o livro: " getNome());
			}
	}


	

}
