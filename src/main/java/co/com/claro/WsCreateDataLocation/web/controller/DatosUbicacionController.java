package co.com.claro.WsCreateDataLocation.web.controller;

import co.com.claro.WsCreateDataLocation.entity.DatosUbicacion;
import co.com.claro.WsCreateDataLocation.models.ResponseDataLocation;
import co.com.claro.WsCreateDataLocation.models.ResponseGeneral;
import co.com.claro.WsCreateDataLocation.service.DatosUbicacionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/dataLocation")
@Slf4j
public class DatosUbicacionController {

    private final DatosUbicacionService datosUbicacion;

    @Autowired
    public DatosUbicacionController(DatosUbicacionService userService, DatosUbicacionService datosUbicacion) {
        this.datosUbicacion = datosUbicacion;
    }

    @GetMapping("/queryDataLocation")
    public ResponseDataLocation queryDataLocation(@RequestParam String documentNumber, @RequestParam String documentType) {
        ResponseDataLocation response = new ResponseDataLocation();
        try {
            documentType = documentType.replaceAll("\"", "").replaceAll("\'", "");
            documentNumber = documentNumber.replaceAll("\"", "").replaceAll("\'", "");
            Optional<DatosUbicacion> listado = this.datosUbicacion.findByDocAndType(documentNumber, documentType);
            if (listado != null) {
                response.setDataLocation(listado);
                ResponseGeneral responseG = new ResponseGeneral(true, "Usuario encontrado satisfactoriamente.");
                response.setResponse(responseG);
            } else {
                response.setDataLocation(null);
                ResponseGeneral responseG = new ResponseGeneral(false, "El usuario no se encuentra dentro de los registros almacenados.");
                response.setResponse(responseG);
            }
        } catch (Exception e) {
            ResponseGeneral responseG = new ResponseGeneral(false, "No se logró consultar el usuario con los datos enviados. Detalle: " + e.getMessage());
            response.setResponse(responseG);
        }
        return response;
    }

    @PostMapping("/createDataLocation")
    public ResponseDataLocation createDataLocation(DatosUbicacion objetoDatos) {
        ResponseDataLocation response = new ResponseDataLocation();
        try {
            ResponseGeneral responseG = new ResponseGeneral(true, "Usuario creado satisfactoriamente.");
        } catch (Exception e) {
            ResponseGeneral responseG = new ResponseGeneral(false, "No se logró crear el usuario.");
        }

        return response;
    }

    @PutMapping("/updateDataLocation")
    public String updateDataLocation() {
        return "Actualizando data location";
    }

}
