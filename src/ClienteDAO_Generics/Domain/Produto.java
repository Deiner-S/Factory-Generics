package ClienteDAO_Generics.Domain;

public class Produto implements Cadastravel{
    private String nome;
    private String descricao;
    private Double preco;
    private Long categoria_id;

    public Produto(String nome, String descricao, Double preco, Long categoria_id) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria_id = categoria_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Long categoria_id) {
        this.categoria_id = categoria_id;
    }

    @Override
    public Long getCodigo() {
        return this.categoria_id;
    }
}
