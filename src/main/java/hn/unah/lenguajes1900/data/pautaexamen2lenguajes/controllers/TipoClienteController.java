package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoCliente;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class TipoClienteController {

    @Autowired 
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/tipoCliente/crear")
    public TipoCliente crearTipoCliente(@RequestBody TipoCliente tipoCliente) {
        return this.tipoClienteServiceImpl.crearTipoCliente(tipoCliente);
    }
    
}
