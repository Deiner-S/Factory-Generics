package Wildcards;

public class Banana extends Fruta{


    public Banana(String sabor, String tipo) {
        super(sabor, tipo);
    }

    @Override
    void sensacao() {
        System.out.println("Macissa e pastosa e doce");
    }
}
