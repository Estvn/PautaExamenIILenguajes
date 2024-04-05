package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Reserva;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {
    
    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping("/reserva/crear")
    public Reserva crearReserva(Reserva reserva) { 
        return this.reservaServiceImpl.crearReserva(reserva);
    }

}
