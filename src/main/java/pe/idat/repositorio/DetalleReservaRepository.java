package pe.idat.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.modelo.ReservaDetalle;

@Repository
public interface DetalleReservaRepository extends JpaRepository<ReservaDetalle, Integer>{

}
