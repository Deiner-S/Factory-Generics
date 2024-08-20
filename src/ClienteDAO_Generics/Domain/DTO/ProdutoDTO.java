package ClienteDAO_Generics.Domain.DTO;

public class ProdutoDTO implements DTO {
    private String nome;
    private String descricao;
    private Double preco;
    private Long categoria_id;

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
}
