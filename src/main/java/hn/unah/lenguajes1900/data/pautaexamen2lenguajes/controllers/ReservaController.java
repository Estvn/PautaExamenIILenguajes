package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {
    
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("/reserva/crear")
    public String crearReserva(@RequestParam(name = "idCliente") long idCliente, @RequestParam(name = "idVehiculo") long idVehiculo, @RequestParam(name = "dias") long dias) { 
        return this.reservaServiceImpl.crearReserva(idCliente, idVehiculo, dias);
    }

}
