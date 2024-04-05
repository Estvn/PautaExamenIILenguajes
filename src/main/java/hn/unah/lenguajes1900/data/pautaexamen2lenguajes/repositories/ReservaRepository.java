package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Reserva;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Long>{
    
}
