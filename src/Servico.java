public class Servico extends Item {
    public Servico(double valor_item) {
        super(valor_item, new Imposto[] {new ICMS(valor_item), new ISS(valor_item)});
    }
}
