package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String name, int idade, double altura){
        pessoaList.add(new Pessoa(name, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        if(!pessoaList.isEmpty()){
            List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista está vázia");
        }
    }

    public List<Pessoa> ordernarPorAltura(){
        if(!pessoaList.isEmpty()){
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            Collections.sort(pessoaList, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vázia");
        }

    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

        // Adicionando pessoas à lista
        ordenacaoPessoas.addPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.addPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.addPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.addPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.pessoaList);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenadoPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordernarPorAltura());
    }

}
