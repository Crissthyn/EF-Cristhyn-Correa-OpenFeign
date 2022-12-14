package pe.idat.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import pe.idat.dto.HospedajeDTO;

@FeignClient(name = "evafinal-microservicio", url= "localhost:8085")
public interface OpenFeignClient {

	   @GetMapping("/api/hospedaje/v1/listar")
	    public List<HospedajeDTO> listarHospedajes();
}
