package Wildcards;

public class Maca extends Fruta{


    public Maca(String sabor, String tipo) {
        super(sabor, tipo);
    }

    @Override
    void sensacao() {
        System.out.println("crocante e doce levemente azeda");
    }
}
