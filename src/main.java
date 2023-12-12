public class main {
    public static void main(String[] args) {
        Item produto = new Produto(12.23);
        Item servico = new Servico(23.34);

        System.out.println(produto.toString());
        System.out.println();
        System.out.println(servico.toString());
    }
}
