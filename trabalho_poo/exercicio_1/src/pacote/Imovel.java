package pacote;

// Definição da classe Imovel
class Imovel {
    private String nome;
    private double imposto;
    private int mesesAtraso;

    // Construtor para inicializar os atributos da classe Imovel
    public Imovel(String nome, double imposto, int mesesAtraso) {
        this.nome = nome;
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
    }

    // Métodos getters para obter os valores dos atributos
    public String getNome() {
        return nome;
    }

    public double getImposto() {
        return imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }
}