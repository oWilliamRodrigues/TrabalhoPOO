package pacote;

// Classe que representa o Guerreiro
class Guerreiro {
    private String nome;
    private int qtdVidas;

    public Guerreiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQtdVidas() {
        return this.qtdVidas;
    }

    public void setQtdVidas(int vidas) {
        this.qtdVidas = vidas;
    }

    public String vidaExtra() {
        return "Você ganhou mais uma vida! Agora tem " + (this.qtdVidas + 1) + " vidas.";
    }
    
}
