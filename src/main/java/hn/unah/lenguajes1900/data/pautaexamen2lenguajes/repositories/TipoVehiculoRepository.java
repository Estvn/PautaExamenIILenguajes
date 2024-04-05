package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoVehiculo;

@Repository
public interface TipoVehiculoRepository extends CrudRepository<TipoVehiculo, Long>{
    
}
