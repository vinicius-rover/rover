public class Produto {

    private double precoUnitario;
    private int quantidade;
    private String nomeProduto;

    public Produto(double precoUnitario, int quantidade, String nomeProduto) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
