package EX2;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro>livros;
    private List<VideoGame>videoGames;

    public Loja(String nome, String cnpj, List<Livro>livros, List<VideoGame>videoGames){
        setNome(nome);
        setCnpj(cnpj);
        setLivros(livros);
        setVideoGames(videoGames);
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

    
    public void listaVideoGames() {
        System.out.println("-------------------------");
        System.out.println("A loja" + getNome() + "possui estes vídeo-games para venda:");

        for (VideoGame game : getVideoGames()) {
            System.out.println("Vídeo-game: " + game.getNome() +
                    ", preço: " + game.getPreco() + " quantidade: " + game.getQtd() + " em estoque");
        }
    }

    public void listaLivros() {
        System.out.println("----------------   ---------");
        System.out.println("A loja" + getNome() + "possui estes livros para venda:");

        for (Livro livro : getLivros()) {
            System.out.println("Título: " + livro.getNome() +
                    ", preço: " + livro.getPreco() + " quantidade: " + livro.getQtd() + " em estoque");
        }
    }
}


