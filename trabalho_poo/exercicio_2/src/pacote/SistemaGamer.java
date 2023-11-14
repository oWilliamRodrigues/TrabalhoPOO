package pacote;

import java.util.Scanner;

// Classe Principal
public class SistemaGamer {
    public static void main(String[] args) {
        // Criando um Guerreiro com o nome "Pops"
        Guerreiro guerreiro = new Guerreiro("Pops");

        // Criando um Oráculo chamado "Minecraft2" associado ao Guerreiro criado
        // acima
        Oraculo master = new Oraculo("Minecraft2", guerreiro);

        // Inicializando o número de vidas do Guerreiro de forma aleatória
        master.setVidas();

        // Exibindo uma introdução com o nome do Oráculo e a quantidade de vidas do
        // Guerreiro
        System.out.println(master.prologoIntroducao());

        // Jogando o primeiro nível e guardando o número de tentativas
        int tentativas = master.loadLevel01();

        if (tentativas < guerreiro.getQtdVidas()) {
            System.out.println("Você venceu o nível 1!");
            System.out.println("Agora, vamos para o nível 2...");
            
            // Solicitando ao guerreiro escolher entre PAR (0) ou ÍMPAR (1)
            System.out.println("Escolha PAR (0) ou ÍMPAR (1): ");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            
            // Jogando o segundo nível e verificando se o Guerreiro venceu
            
            if (master.loadLevel02(escolha) == 1) {
                System.out.println("Você venceu o nível 2!");
                System.out.println(master.prologoVencedor());
            } else {
                String pedidoMisericordia = master.vidaExtra();
                boolean concedida = master.decidirVidaExtra(pedidoMisericordia);
            
                if (concedida) {
                    guerreiro.setQtdVidas(guerreiro.getQtdVidas() + 1);
                    System.out.println(guerreiro.vidaExtra());
                    System.out.println(master.prologoVencedor());
                } else {
                    System.out.println(master.prologoPerdedor());
                }
            }
            
            scanner.close(); // Feche o Scanner apenas uma vez no final
        } else {
            String pedidoMisericordia = master.vidaExtra();
            boolean concedida = master.decidirVidaExtra(pedidoMisericordia);
        
            if (concedida) {
                guerreiro.setQtdVidas(guerreiro.getQtdVidas() + 1);
                System.out.println(guerreiro.vidaExtra());
                System.out.println(master.prologoVencedor());
            } else {
                System.out.println(master.prologoPerdedor());
            }
        }
    }
}