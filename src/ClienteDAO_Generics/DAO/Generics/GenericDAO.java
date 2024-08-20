package ClienteDAO_Generics.DAO.Generics;

import ClienteDAO_Generics.Domain.Cadastravel;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esse método ele recebe um objeto que extends de Persistente(Cliente ou produto) e implementa nossa interface de acesso ao
 * banco de dados IGenericDAO que por sua vez aceitasomente objetos que implementão Persistene.
 *
 * @param <T>
 */
public abstract class GenericDAO<T extends Cadastravel> implements IGenericDAO<T> {

    private Map<Class, Map<Long,T>> map;

    public abstract Class<T> getTipoClass();

    public GenericDAO() {
        this.map = new HashMap<>();
    }


    @Override
    public boolean cadastrarCliente(T entity) {
        Map<Long,T> mapInterno  = this.map.get(getTipoClass());
        if (!mapInterno.containsKey(entity.getCodigo())) {
            mapInterno.put(entity.getCodigo(),entity);
            return true;
        }
        return false;
    }

    @Override
    public boolean alterarCliente(T entity) {
        return false;
    }

    @Override
    public boolean excluirCliente(Long codigo) {
        return false;
    }

    @Override
    public Collection<T> listarCliente() {
        return List.of();
    }

    @Override
    public T buscarCliente(Long codigo) {
        return null;
    }




}
