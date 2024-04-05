package hn.unah.lenguajes1900.data.pautaexamen2lenguajes.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tipocliente")
@Data
public class TipoCliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipocliente")
    private long idTipoCliente;

    private String descripcion;

    @OneToMany(mappedBy = "tipocliente")
    private List<Cliente> clientes;

}
