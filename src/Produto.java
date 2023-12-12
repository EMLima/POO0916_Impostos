public class Produto extends Item {
    public Produto(double valor_item) {
        super(valor_item, new Imposto[] {new ICMS(valor_item), new IPI(valor_item)} );
    }
}
