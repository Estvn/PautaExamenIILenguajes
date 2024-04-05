package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoVehiculo;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public String eliminarTipoVehiculo(long idTipoVehiculo) {

        if(this.tipoVehiculoRepository.existsById(idTipoVehiculo)){
            this.tipoVehiculoRepository.deleteById(idTipoVehiculo);
            return "El tipo de vehículo se ha borrado correctamente";
        }
        return "El tipo de vehículo no existe en la base de datos";
    }
    
}
