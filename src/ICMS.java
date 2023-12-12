public class ICMS extends Imposto{
    public static final double porcentagemAliquota = 17;
    public ICMS(double valor_item) {
        super(valor_item, porcentagemAliquota);
    }

}
