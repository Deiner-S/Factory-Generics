package Generics;

public class ClasseGenerica<T, E> {
    private T data;
    private E cpf;
    private T nome;

    public ClasseGenerica(T nome, E cpf, T data) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
    }
}
