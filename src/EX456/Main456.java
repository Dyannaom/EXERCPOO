package EX456;

import java.util.ArrayList;
import java.util.List;

public class Main456 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa joao = new Pessoa("Joao", 15);
        Pessoa leandro = new Pessoa("Leandro", 21);
        Pessoa paulo = new Pessoa("Paulo", 17);
        Pessoa jessica = new Pessoa("Jessica", 18);

        pessoas.add(joao);
        pessoas.add(leandro);
        pessoas.add(paulo);
        pessoas.add(jessica);

        String nomeMaisVelho = "";
        int idadeMaisVelho = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > idadeMaisVelho) {
                nomeMaisVelho = pessoa.getNome();
                idadeMaisVelho = pessoa.getIdade();
            }
        }

        System.out.println("A pessoa mais velha da lista é : " + nomeMaisVelho);

        // EXERCICIO 5
        // printa as pessoas da lista antes da remover
        for (Pessoa pessoa : pessoas) {

            System.out.println("nome: " + pessoa.getNome() + " idade: " + pessoa.getIdade());
        }

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getIdade() < 18) {
                pessoas.remove(i);
            }
        }

        // printa as pessoas da lista depois da remoo
        System.out.println();
        for (Pessoa pessoa : pessoas) {
            System.out.println("nome: " + pessoa.getNome() + " idade: " + pessoa.getIdade());
        }

        // EXERCICIO 6
        System.out.println();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals("Jessica")) {
                System.out.println("A idade da Jessica  " + pessoa.getIdade());
            }
        }

    }

}
