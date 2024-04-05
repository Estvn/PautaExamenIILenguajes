package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoVehiculo;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Vehiculo;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.TipoVehiculoRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public String eliminarTipoVehiculo(long idTipoVehiculo) {

        if(this.tipoVehiculoRepository.existsById(idTipoVehiculo)){

            TipoVehiculo tipoVehiculo = this.tipoVehiculoRepository.findById(idTipoVehiculo).get();
            List<Vehiculo> vehiculos = tipoVehiculo.getVehiculos();

            for (Vehiculo vehiculo : vehiculos) {
                if(vehiculo.getTipovehiculo().getIdTipoVehiculo() == idTipoVehiculo){
                    long id = vehiculo.getIdVehiculo();
                    this.vehiculoRepository.deleteById(id);
                }
            }
            this.tipoVehiculoRepository.deleteById(idTipoVehiculo);
            
            return "El tipo de vehículo se ha borrado correctamente";
        }
        return "El tipo de vehículo no existe en la base de datos";
    }

}
