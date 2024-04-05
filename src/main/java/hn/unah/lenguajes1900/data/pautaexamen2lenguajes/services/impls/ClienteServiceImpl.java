package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Cliente;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoCliente;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.ClienteRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.TipoClienteRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {

        long idtipocliente = cliente.getTipocliente().getIdTipoCliente();
        
        if(this.tipoClienteRepository.existsById(idtipocliente)){
            TipoCliente tipoCliente = this.tipoClienteRepository.findById(idtipocliente).get();
            cliente.setTipocliente(tipoCliente);
        }
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerPorId(long codigoCliente) {
        return this.clienteRepository.findById(codigoCliente).get();
    }
}
