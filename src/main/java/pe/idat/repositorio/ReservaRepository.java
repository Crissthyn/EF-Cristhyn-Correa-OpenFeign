package pe.idat.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.modelo.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
