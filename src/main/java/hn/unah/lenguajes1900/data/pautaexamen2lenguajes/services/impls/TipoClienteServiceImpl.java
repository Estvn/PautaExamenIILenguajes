package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.TipoCliente;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.TipoClienteRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {
        return this.tipoClienteRepository.save(tipoCliente);
    }
    

}
