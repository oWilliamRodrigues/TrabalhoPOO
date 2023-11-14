package pacote;

import java.util.ArrayList;
import java.util.List;

// Definição da classe Municipio
class Municipio {
    private List<Imovel> imoveis;

    // Construtor para inicializar a lista de imóveis
    public Municipio() {
        this.imoveis = new ArrayList<>();
    }

    // Método para adicionar um imóvel à lista
    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    // Método para obter a lista de imóveis
    public List<Imovel> getImoveis() {
        return imoveis;
    }
}