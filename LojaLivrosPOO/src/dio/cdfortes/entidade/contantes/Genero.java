package dio.cdfortes.entidade.contantes;

public enum Genero {
    DRAMA(15),

    SUSPENSE(10),

    ROMANCE(5);

    private double fator;

    /**
     * Construtor.
     * 
     * @param fator Valor por tipo que influencia no cálculo do frete.
     */
    Genero(double fator) {
        this.fator = fator / 100;
    }

    public double getFator() {
        return fator;
    }

}
