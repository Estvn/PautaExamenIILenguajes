package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Vehiculo;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls.VehiculoServiceImpl;

@RestController
@RequestMapping("/api")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/vehiculo/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/vehiculo/obtenerVehiculos")
    public List<Vehiculo> obtenerVehiculos() {
        return this.vehiculoServiceImpl.obtenerVehiculos();
    }

    @GetMapping("/vehiculo/obtenerPorId")
    public Vehiculo obtenerPorId(@RequestParam(name="codigo") long codigoVehiculo) {
        return this.vehiculoServiceImpl.obtenerPorId(codigoVehiculo);
    }
    
}
