package pe.idat.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class HospedajeReservaFK implements Serializable{

	private static final long serialVersionUID = 5741157097128929445L;
	
	@Column(name = "id_hospedaje", nullable = false)
	private Integer idHospedaje;
	
	@Column(name = "id_reserva", nullable = false)
	private Integer idReserva;

	public Integer getIdHospedaje() {
		return idHospedaje;
	}

	public void setIdHospedaje(Integer idHospedaje) {
		this.idHospedaje = idHospedaje;
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	
	
}
