package EX1;

public class Main1 {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();


        veiculo.pintar("Preto");
        veiculo.ligar();
        veiculo.acelerar();
        veiculo.acelerar();
        veiculo.desligar();
        veiculo.frear();
        veiculo.frear();
        veiculo.desligar();
        veiculo.abastecer(60);
        veiculo.abastecer(61);

    }
}