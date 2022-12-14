package pe.idat.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_reserva")
public class ReservaDetalle {

	@Id
	private HospedajeReservaFK fk = new HospedajeReservaFK();

	public HospedajeReservaFK getFk() {
		return fk;
	}

	public void setFk(HospedajeReservaFK fk) {
		this.fk = fk;
	}
	
	
}
