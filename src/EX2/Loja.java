package EX2;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro>livros;
    private List<VideoGame>videoGames;    
    

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    
    public void listaLivros() {
    	
    	System.out.println("-------------------------------------------------------------------");
        System.out.println("A loja " + getNome() + " possui estes livros para venda:");

        for (Livro livro : getLivros()) {
            System.out.println("Título: " + livro.getNome() +
                    ", preço: " + livro.getPreco() + " quantidade: " + livro.getQtd() + " em estoque");
        }

        
    }
    
    public void listaVideoGames() {
    	System.out.println("-------------------------------------------------------------------");
    	System.out.println("A loja " + getNome() + " possui estes vídeo-games para venda:");

        for (VideoGame game : getVideoGames()) {
            System.out.println("Vídeo-game: " + game.getNome() + ", preço: " + game.getPreco() + " quantidade: " + game.getQtd() + " em estoque");
        }

        }     
   
    
    public double calculaPatrimonio(){
    	
    	 double patrimonio = 0;
    	 double patrimonioGame = 0;
    	 double patrimonioLivro = 0;
    	 
    	for (VideoGame game : getVideoGames()) {    		
    		   		
    		patrimonioGame = patrimonioGame + (game.getPreco() * game.getQtd());
    		
    	}
    	 
    	 for (Livro livro : getLivros()) {
    		 
    		 patrimonioLivro = patrimonioLivro + (livro.getPreco() * livro.getQtd());
    		 
    		   		  		 
    	 }  
    	 
    	 	patrimonio = patrimonioLivro + patrimonioGame;
    	 	
    		System.out.println("O patrimonio da loja " + getNome() + " é de:" + patrimonio);
    		
			return patrimonio;
    	    	
     	
    }

		
 
    

    
}


