package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Reserva;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.ReservaRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public Reserva crearReserva(Reserva reserva) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearReserva'");
    }
    
}
