package pe.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.modelo.Reserva;
import pe.idat.servicio.ReservaService;

@Controller
@RequestMapping("/api/aula/v1")
public class ReservaController {

	@Autowired
	private ReservaService service;
	
    @PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody Reserva reserva){
        service.guardarReserva(reserva);
    }

    @GetMapping("/asignar")
    public @ResponseBody void asignar(){
        service.asignarHospedajeReserva();
    }
	
}
