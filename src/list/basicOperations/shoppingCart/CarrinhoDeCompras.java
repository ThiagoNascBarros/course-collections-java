package list.basicOperations.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void addItem(String name, double value, int qntd){
        itens.add(new Item(name, value, qntd));
    }

    public void removeItem(String name){
        List<Item> removeForItens = new ArrayList<>();

        itens.forEach(item -> {
            if(item.getName().trim().equalsIgnoreCase(name)){
                removeForItens.add(item);
            }
        });

        itens.removeAll(removeForItens);
    }

    public void viewCartItens(){
        if(!itens.isEmpty()){
            itens.forEach(item -> System.out.printf(item.getName() + " " + item.getValue() + " " + item.getQntd() + "\n"));
        } else {
            throw new RuntimeException("A lista está vázia");
        }
    }

    public double valueTotal(){
        double valueTutu = 0d;

        if(!itens.isEmpty()){
            for (Item item : itens){
                double valueItens = item.getValue() * item.getQntd();
                valueTutu += valueItens;
            }
            return valueTutu;
        }
        else {
            throw new RuntimeException("A lista está vázia");
        }

    }

    public void getItens(){
        itens.forEach(item -> System.out.println(item));
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cart = new CarrinhoDeCompras();

        cart.addItem("Leite", 12.99, 2);
        cart.addItem("Maça", 12.99, 2);
        cart.addItem("Ovo", 12.99, 2);

        cart.removeItem("Ovo");

        cart.viewCartItens();


        System.out.println(cart.valueTotal());

        cart.getItens();

    }

}
