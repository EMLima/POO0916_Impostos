import java.util.Arrays;

public abstract class Item {
    protected double valor_item;
    protected Imposto[] impostos;
    protected double total;
    public Item(double valor_item, Imposto[] impostos) {
        this.valor_item = valor_item;
        this.impostos = impostos;
        this.total = this.calculaTotal();
    }
    private double calculaTotal(){
        double total = valor_item;
        for (Imposto imposto : this.impostos){
            total += imposto.getValorImposto();
        }
        return total;
    }

    @Override
    public String toString() {
        String r = "Tipo do item: " + this.getClass().getName() + '\n' +
                "Valor: R$" + String.format("%.2f", valor_item) + '\n';
        for (Imposto imposto : this.impostos){
            r += imposto.getClass().getName() + ": R$" + String.format("%.2f", imposto.getValorImposto()) + "; ";
        }
            r += "\nTotal: R$" + String.format("%.2f", total);
        return r;
    }
}
