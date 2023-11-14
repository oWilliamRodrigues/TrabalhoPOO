package pacote;

public class SistemaFilmes {
    public static void main(String[] args) {
        Sala sala1 = new Sala(1, 100, "3D", "Centro");
        Sessao sessao1 = new Sessao(true, "15:00");
        Filme filme1 = new Filme(1, "O Senhor dos Anéis", 180, "Fantasia");
        Ator ator1 = new Ator(1, "Ian McKellen", "Gandalf");

        // Manipulação dos objetos conforme necessário
        sala1.adicionarSessao(sessao1);
        sessao1.iniciarSessao();
        System.out.println(filme1.exibirInformacoes());
        System.out.println(ator1.exibirInformacoes());
        ator1.alterarPapel("Magneto");
    }
}
