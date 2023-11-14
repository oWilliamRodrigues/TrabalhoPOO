package pacote;

public class SistemaMulta {
    public static void main(String[] args) {
        // Criando instâncias de imóveis
        Imovel imovel1 = new Imovel("João", 1000, 7);
        Imovel imovel2 = new Imovel("Maria", 1500, 11);

        // Criando uma instância de Municipio
        Municipio municipio = new Municipio();

        // Adicionando imóveis ao município
        municipio.adicionarImovel(imovel1);
        municipio.adicionarImovel(imovel2);

        // Iterando sobre os imóveis
        for (Imovel imovel : municipio.getImoveis()) {
            // Calculando a multa para cada imóvel
            double multa = CalculadoraMulta.calcularMulta(imovel.getMesesAtraso(), imovel.getImposto());

            // Exibindo o resultado
            System.out.println("Proprietário: " + imovel.getNome() + ", Multa a ser paga: R$" + multa);
        }
    }
}
