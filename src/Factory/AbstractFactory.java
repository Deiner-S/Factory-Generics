package Factory;

import ClienteDAO_Generics.Domain.Cadastravel;
import ClienteDAO_Generics.Domain.DTO.DTO;

public abstract class AbstractFactory<T extends DTO> {

    public Cadastravel criar(T cadastroDTO){
        Cadastravel cadastravel = lineFactory(cadastroDTO);
        return cadastravel;
    }


    public abstract Cadastravel lineFactory(T cadastroDTO);

}
