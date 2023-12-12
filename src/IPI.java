public class IPI extends Imposto {
    public static final double porcentagemAliquota = 25;

    public IPI(double valor_item) {
        super(valor_item, porcentagemAliquota);
    }

}
