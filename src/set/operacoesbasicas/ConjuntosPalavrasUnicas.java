package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntosPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    @Override
    public String toString() {
        return "palavrasUnicas={ " + palavrasUnicas +
                " }";
    }

    public void addPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removePalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("A lista está vázia");
        }
    }

    public String verificarPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                return "Existe a palavra: " + palavra;
            } else{
                return "A lista não contém a palavra: " + palavra;
            }
        } else{
            return "A lista está vázia";
        }
    }

    public String exibirPalavrasUnicas(){
        return palavrasUnicas.toString();
    }

    public static void main(String[] args) {
        ConjuntosPalavrasUnicas palavrasUnicas = new ConjuntosPalavrasUnicas();

//        Adiciona palavras na lista
        palavrasUnicas.addPalavra("A");
        palavrasUnicas.addPalavra("B");
        palavrasUnicas.addPalavra("C");

//        Remove uma palavra da lista
        palavrasUnicas.removePalavra("C");

//        Verifica uma palavra na lista
        System.out.println(palavrasUnicas.verificarPalavra("E"));

//        Exibe todas as palavras da lista
        System.out.println(palavrasUnicas.exibirPalavrasUnicas());

    }

}
