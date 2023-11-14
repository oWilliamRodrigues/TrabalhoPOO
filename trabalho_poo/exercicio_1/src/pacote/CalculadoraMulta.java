package pacote;

// Definição da classe CalculadoraMulta
class CalculadoraMulta {
    
    //Analisa qual a multa a ser paga
    public static double calcularMulta(int mesesAtraso, double imposto) {
        double multa;

        if (mesesAtraso <= 5) {
            multa = imposto * 0.01;
        } else if (mesesAtraso <= 8) {
            multa = imposto * 0.023;
        } else if (mesesAtraso <= 10) {
            multa = imposto * 0.03;
        } else if (mesesAtraso <= 12) {
            multa = imposto * 0.054;
        } else {
            multa = imposto * 0.10;
        }

        return multa;
    }
}
