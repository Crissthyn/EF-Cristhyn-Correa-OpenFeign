package pe.idat.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.idat.client.OpenFeignClient;
import pe.idat.dto.HospedajeDTO;
import pe.idat.modelo.HospedajeReservaFK;
import pe.idat.modelo.Reserva;
import pe.idat.modelo.ReservaDetalle;
import pe.idat.repositorio.DetalleReservaRepository;
import pe.idat.repositorio.ReservaRepository;

public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private DetalleReservaRepository detalleRepo;
	
	@Autowired
	private ReservaRepository reservaRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void guardarReserva(Reserva reserva) {
		reservaRepo.save(reserva);
	}

	@Override
	public void asignarHospedajeReserva() {
		List<HospedajeDTO> listado = client.listarAlumnos();
		HospedajeReservaFK fk = null;
		ReservaDetalle detalle = null;
		
		for (HospedajeDTO hospedajeDTO: listado) {
			fk = new HospedajeReservaFK();
			fk.setIdHospedaje(hospedajeDTO.getCod);
			fk.setIdReserva(1);
			
			detalle = new ReservaDetalle();
			detalle.setFk(fk);
			detalleRepo.save(detalle);
		}
	}

}
