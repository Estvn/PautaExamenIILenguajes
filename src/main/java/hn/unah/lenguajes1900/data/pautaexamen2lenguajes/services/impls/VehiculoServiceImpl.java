package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoVehiculo;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Vehiculo;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {

        long id = vehiculo.getTipovehiculo().getIdTipoVehiculo();

        if(this.tipoVehiculoRepository.existsById(id)){

            TipoVehiculo tipoVehiculo = this.tipoVehiculoRepository.findById(id).get();
            vehiculo.setTipovehiculo(tipoVehiculo);
        }

        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerVehiculos() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerPorId(long codigoVehiculo) {
        return this.vehiculoRepository.findById(codigoVehiculo).get();
    }
    
}
