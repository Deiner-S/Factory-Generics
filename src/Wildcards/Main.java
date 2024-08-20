package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Uva fruta = new Uva("Azeda","Uva");
        Fruta fruta2 = new Maca("Levemente azeda","macã");
        Fruta fruta3 = new Banana("Doce","banana");

        List<Fruta> frutas = new ArrayList<Fruta>();

        frutas.add(fruta);
        frutas.add(fruta2);
        frutas.add(fruta3);

        imprimir(frutas);
    }

    public static void imprimir(List<Fruta> fruta ){
        fruta.forEach(System.out::println);
    }
}
