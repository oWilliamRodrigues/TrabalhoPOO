package pacote;

class Filme {
    private int idFilme;
    private String titulo;
    private long duracao;
    private String genero;

    public Filme(int idFilme, String titulo, long duracao, String genero) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    // Método para obter a duração do filme
    public long getDuracao() {
        return duracao;
    }

    // Método para exibir informações do filme
    public String exibirInformacoes() {
        return "Título: " + titulo + ", Gênero: " + genero + ", Duração: " + duracao + " minutos.";
    }

    // Método para alterar o título do filme
    public void alterarTitulo(String novoTitulo) {
        this.titulo = novoTitulo;
    }
}
