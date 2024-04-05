package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoVehiculo;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/tipoVehiculo/crear")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }

    @DeleteMapping("/tipoVehiculo/eliminar")
    public String eliminarTipoVehiculo(@RequestParam(name="id") long idTipoVehiculo) {
        return this.tipoVehiculoServiceImpl.eliminarTipoVehiculo(idTipoVehiculo);
    }   
    
    
}
