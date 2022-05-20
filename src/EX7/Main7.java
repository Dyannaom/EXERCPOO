package EX7;

public class Main7 {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Anna", 42, 10000.0);
        Funcionario supervisor = new Supervisor("Bia", 30, 7000.0);
        Funcionario vendedor = new Vendedor("Leia", 25, 4000.0);

        System.out.println("Gerente: " + gerente + "bonificao" + gerente.bonificacao());
        System.out.println("Supervisor: " +supervisor + "bonificao" + supervisor.bonificacao());
        System.out.println("Vendedor: " +vendedor + "bonificao" + vendedor.bonificacao());
    }

}

