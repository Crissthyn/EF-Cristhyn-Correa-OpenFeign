package pe.idat.servicio;

import pe.idat.modelo.Reserva;

public interface ReservaService {

	void guardarReserva(Reserva reserva);
	void asignarHospedajeReserva();
}
