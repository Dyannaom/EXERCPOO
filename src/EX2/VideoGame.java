package EX2;

public class VideoGame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private boolean isUsado;


   
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

	public void calculaImposto() {
		if (isUsado == true) {
			double impostoUsado = getPreco() * 25 / 100;				
			System.out.println("Imposto PS4 Slim usado: " + "R$ " + impostoUsado);
			
		} else {
			double impostoNovo = getPreco() * 25 / 100;			
			System.out.println("Imposto PS4 Slim: " + "R$ " + impostoNovo);
			
			}
		
		
		
	}

   
}