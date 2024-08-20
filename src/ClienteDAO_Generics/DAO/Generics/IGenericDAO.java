package ClienteDAO_Generics.DAO.Generics;

import ClienteDAO_Generics.Domain.Cadastravel;

import java.util.Collection;

public interface IGenericDAO<T extends Cadastravel> {
    public boolean cadastrarCliente(T entity);

    public boolean alterarCliente(T entity);

    public boolean excluirCliente(Long codigo);

    public Collection<T> listarCliente();

    public T buscarCliente(Long codigo);
}
