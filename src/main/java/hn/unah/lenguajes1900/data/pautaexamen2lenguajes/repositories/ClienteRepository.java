package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
