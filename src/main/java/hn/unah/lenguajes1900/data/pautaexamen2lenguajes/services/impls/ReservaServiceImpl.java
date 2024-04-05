package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.impls;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Reserva;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities.Vehiculo;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.ClienteRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.ReservaRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.repositories.VehiculoRepository;
import hn.unah.lenguajes1900.data.pautaexamen2lenguajes.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired 
    private ClienteRepository clienteRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    private Reserva reserva = new Reserva();

    @Override
    public String crearReserva(long idCliente, long idVehiculo, long dias) {


        if(this.clienteRepository.existsById(idCliente) && this.vehiculoRepository.existsById(idVehiculo)){

            this.reserva.setCliente(this.clienteRepository.findById(idCliente).get());
            
            Vehiculo vehiculo = this.vehiculoRepository.findById(idCliente).get();
            this.reserva.setVehiculo(vehiculo);
            vehiculo.setDisponible(false);

            this.reserva.setFecha(LocalDate.now());
            this.reserva.setDias(dias);
            this.reserva.setTotal(dias*vehiculo.getTipovehiculo().getPrecioXHora());

            this.reservaRepository.save(reserva);
            return "El auto se encuentra rentado";
        }
        return "El auto no está disponible";
        
    }
    
}
