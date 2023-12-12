public class ISS extends Imposto {
    public static final double porcentagemAliquota = 4.6;

    public ISS(double valor_item) {
        super(valor_item, porcentagemAliquota);
    }
}
