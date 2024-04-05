package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoCliente;

@Repository
public interface TipoClienteRepository extends CrudRepository<TipoCliente, Long>{
    
}
