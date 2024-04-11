package dio.cdfortes.entidade.contantes;

public enum Materias {

    M2(2),

    M5(5),

    M10(10);

    private double fator;

    /**
     * Construtor.
     * 
     * @param fator Valor por tipo que influencia no cálculo do frete.
     */
    Materias(double fator) {
        this.fator = fator / 10;
    }

    public double getFator() {
        return fator;
    }
}