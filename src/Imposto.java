public abstract class Imposto {
    protected double valorImposto;

    public Imposto(double valor_item, double porcentagem_aliquota) {
        this.valorImposto = valor_item * (porcentagem_aliquota / 100);
    }

    public double getValorImposto() {
        return this.valorImposto;
    }
}
