package Generics;

import java.util.ArrayList;
import java.util.List;

public class ListasGenericas {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        List<Long> lista1 = new ArrayList<>();
        List<List> lista2 = new ArrayList<>();

        lista.add("Deiner");
        lista.add("Rayane");
        lista.add("Pepi");

        lista1.add(1L);
        lista1.add(2L);
        lista1.add(3L);
        lista1.add(4L);

        lista2.add(lista);
        lista2.add(lista1);

        imprimir(lista);
        imprimir1(lista1);
        imprimir(lista2);
    }

    /**
     * <h1>Generics</h1>
     * <p>Criando métodos genericos utilizando caracteres de maior e menor <> para passar um template a ser utilizado</p>
     *
     * @param lista
     * @param <T>
     */
    private static <T> void imprimir(List<T> lista) {
        lista.forEach(System.out::println);

    }

    /**
     *<h1>Wildcards</h1>
     *
     * <p>Semelhante ao Generics só que no lugar do tamplate é passado uma interrogação que indica que você pode receber qualquer coisa</p>
     * @param lista
     */
    private static void imprimir1(List<?> lista) {
        lista.forEach(System.out::println);

    }


}