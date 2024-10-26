package pe.edu.cibertec.app_docker_pipeline_pena.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/reserva")
public class ReservaController {
    @GetMapping
    public String testJenkins (){
        log.info("API REST Microservicio de Reserva de Hotel - testeo");
        return
                "Bienvenido al microservicio de reserva - Jenkins";

    }

}
