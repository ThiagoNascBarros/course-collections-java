package map.pesquisa;

public class Produto {

    private String nome;
    private double preco;
    private int qntd;

    public Produto(String nome, double preco, int qntd) {
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQntd() {
        return qntd;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qntd=" + qntd +
                '}';
    }

}
