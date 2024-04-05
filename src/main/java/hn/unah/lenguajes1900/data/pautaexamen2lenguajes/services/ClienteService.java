package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services;


import java.util.List;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente obtenerPorId(long codigoCliente);

}
