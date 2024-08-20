package Factory.Factorys;

import ClienteDAO_Generics.Domain.Cadastravel;
import ClienteDAO_Generics.Domain.Cliente;
import ClienteDAO_Generics.Domain.DTO.ClienteDTO;
import Factory.AbstractFactory;

public class FactoryClientes extends AbstractFactory<ClienteDTO> {
    @Override
    public Cadastravel lineFactory(ClienteDTO cadastroDTO) {
        return new Cliente(cadastroDTO.getNome(),cadastroDTO.getCpf(),cadastroDTO.getTelefone(),cadastroDTO.getEmail(),cadastroDTO.getEndereco());
    }
}
