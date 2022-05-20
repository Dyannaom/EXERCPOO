package EX1;

/**
 * @author Dyanna Mousinho
 * @version 1.0.0
 */
public class Veiculo {
    protected String Marca, Modelo, Placa, Cor;
    protected Float Km;
    protected Boolean isLigado = true;
    protected int litrosCombustivel, Velocidade;
    protected Double Preco;

    public Veiculo() {

    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public Float getKm() {
        return Km;
    }

    public void setKm(Float Km) {
        this.Km = Km;
    }

    public Boolean getIsLigado() {
        return isLigado;
    }

    public void setIsLigado(Boolean isLigado) {
        this.isLigado = isLigado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int Velocidade) {
        this.Velocidade = Velocidade;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }

    public void acelerar() {
        this.Velocidade += 20;
        System.out.println("\n Acelerar! Velocidade atual: " + getVelocidade() + " KM/H");
    }

    public void abastecer(int Combustivel) {
        int soma = Combustivel + this.litrosCombustivel;
        if (soma > 60) {
            System.out.println("Abastecer: Atencao, o tanque ja esta cheio!");
        } else {
            this.litrosCombustivel += Combustivel;
            System.out.println("\n Combustivel adicionado! " + getLitrosCombustivel() + " litros");
        }
    }

    public void frear() {
        if (Velocidade == 0) {
            System.out.println("O Veículo ja esta parado!");
        } else {
            this.Velocidade -= 20;
            System.out.println("\n Freiar! Velocidade atual: " + getVelocidade() + " KM/H");
        }
    }

    public void pintar(String Cor) {
        this.Cor = Cor;
        System.out.println("\n O veiculo foi pintado com uma nova cor: " + Cor);
    }

    public void ligar() {
        if (this.isLigado) {
            System.out.println("\n Veiculo ligado!");
        }
    }

    public void desligar() {
        if (this.Velocidade > 0) {
            System.out.println("\n Para desligar o veiculo, diminua a velocidade!");
        } else {
            this.isLigado = false;
            System.out.println("\n Veiculo desligado!");
        }
    }
}

