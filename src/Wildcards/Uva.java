package Wildcards;

public class Uva extends Fruta {


    public Uva(String sabor, String tipo) {
        super(sabor, tipo);
    }

    @Override
    void sensacao() {
        System.out.println("leve dor nos cantos posteriores da boca devido ao gosto azedo");
    }
}
