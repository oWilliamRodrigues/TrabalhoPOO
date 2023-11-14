package pacote;

class Ator {
    private int idAtor;
    private String nome;
    private String papel;

    public Ator(int idAtor, String nome, String papel) {
        this.idAtor = idAtor;
        this.nome = nome;
        this.papel = papel;
    }

    // Método para obter o nome do ator
    public String getNome() {
        return nome;
    }

    // Método para exibir informações do ator
    public String exibirInformacoes() {
        return "Nome: " + nome + ", Papel: " + papel;
    }

    // Método para alterar o papel do ator
    public void alterarPapel(String novoPapel) {
        this.papel = novoPapel;
    }
}
