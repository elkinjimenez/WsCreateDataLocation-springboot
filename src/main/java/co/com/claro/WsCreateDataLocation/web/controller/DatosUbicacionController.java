package co.com.claro.WsCreateDataLocation.web.controller;

import co.com.claro.WsCreateDataLocation.entity.DatosUbicacion;
import co.com.claro.WsCreateDataLocation.models.Response;
import co.com.claro.WsCreateDataLocation.service.DatosUbicacionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class DatosUbicacionController {

    private final DatosUbicacionService datosUbicacion;

    @Autowired
    public DatosUbicacionController(DatosUbicacionService userService, DatosUbicacionService datosUbicacion) {
        this.datosUbicacion = datosUbicacion;
    }

    @GetMapping("queryDataLocation")
    public ResponseEntity<DatosUbicacion> queryDataLocation(@RequestParam String numeroIdentificacion, @RequestParam  String tipoIdentificacion) {
        Optional<DatosUbicacion> datos = this.datosUbicacion.findByDocAndType(numeroIdentificacion, tipoIdentificacion);
        if(datos == null){
            return null;
        }else{
            return datos.map( u -> ResponseEntity.ok(u))
                    .orElse(ResponseEntity.notFound().build());
        }

    }

}
