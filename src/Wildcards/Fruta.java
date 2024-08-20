package Wildcards;

public abstract class Fruta {

    private String sabor;
    private String tipo;

    public Fruta(String sabor, String tipo) {
        this.sabor = sabor;
        this.tipo = tipo;
    }

    abstract void sensacao();

    @Override
    public String toString() {
        return "Fruta{" +
                "sabor='" + sabor + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
