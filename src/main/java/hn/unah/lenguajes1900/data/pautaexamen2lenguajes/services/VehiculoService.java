package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services;

import java.util.List;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Vehiculo;

public interface VehiculoService {
    
    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerVehiculos();

    public Vehiculo obtenerPorId(long codigoVehiculo);

}
