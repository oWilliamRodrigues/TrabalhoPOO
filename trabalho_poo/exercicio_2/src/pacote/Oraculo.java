package pacote;

import java.util.Random;
import java.util.Scanner;

class Oraculo {
    private String nome;
    private Guerreiro guerreiro;

    public Oraculo(String nome, Guerreiro guerreiro) {
        this.nome = nome;
        this.guerreiro = guerreiro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVidas() {
        Random rand = new Random();
        guerreiro.setQtdVidas(rand.nextInt(4) + 9); // Sorteia entre [9, 12]
    }

    public String prologoIntroducao() {
        return "Bem-vindo ao " + this.nome + "! Você tem " + this.guerreiro.getQtdVidas() + " vidas.";
    }

    public int loadLevel01() {
        Random rand = new Random();
        int segredo = rand.nextInt(100) + 1;
        int vida = guerreiro.getQtdVidas();
        Scanner scanner = new Scanner(System.in);
        int palpite, tentativas = 0;

        do {
            System.out.print("Digite seu palpite (1 a 100): ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < segredo) {
                System.out.println("O segredo é MAIOR que o palpite!");
            } else if (palpite > segredo) {
                System.out.println("O segredo é MENOR que o palpite!");
            }
        } while (palpite != segredo && tentativas < this.guerreiro.getQtdVidas());

        return tentativas;
    }

    // Método para o segundo nível do jogo
    public int loadLevel02(int opcao) {
        Random rand = new Random();
        int numOraculo = rand.nextInt(6);
        int numGuerreiro = rand.nextInt(6);
        int soma = numOraculo + numGuerreiro;

        boolean par = soma % 2 == 0;
        boolean vitoriaGuerreiro = (opcao == 0 && par) || (opcao == 1 && !par);

        if (vitoriaGuerreiro) {
            System.out.println("Guerreiro " + guerreiro.getNome() + " venceu! A soma foi " + soma + " (" + numOraculo + " + " + numGuerreiro + ")");
            return 1;
        } else {
            System.out.println("Guerreiro " + guerreiro.getNome() + " perdeu! A soma foi " + soma + " (" + numOraculo + " + " + numGuerreiro + ")");
            return 0;
        }
    }


    // Método para o guerreiro pedir uma vida extra
    public String vidaExtra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você pede misericórdia por mais uma vida. Diga algo convincente: ");
        String misericordia = scanner.nextLine();
        scanner.close();
        return misericordia;
    }

    // Método para o Oráculo decidir se concede ou não uma vida extra
    public boolean decidirVidaExtra(String misericordia) {
        return misericordia.split(" ").length > 5;
    }

    // Mensagem exibida caso o guerreiro vença o jogo
    public String prologoVencedor() {
        return "Parabéns, " + this.nome + "! Você é o VENCEDOR!";
    }

    // Mensagem exibida caso o guerreiro perca o jogo
    public String prologoPerdedor() {
        return "Você foi derrotado, " + this.nome + ". Melhor sorte na próxima vez!";
    }
    
}
