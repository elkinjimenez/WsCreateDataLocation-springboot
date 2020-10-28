package co.com.claro.WsCreateDataLocation.service;

import co.com.claro.WsCreateDataLocation.entity.DatosUbicacion;
import co.com.claro.WsCreateDataLocation.repo.DatosUbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class DatosUbicacionService {

    private final DatosUbicacionRepository datos;

    @Autowired
    public DatosUbicacionService(DatosUbicacionRepository datos) {
        this.datos = datos;
    }

    public Optional<DatosUbicacion> findByDocAndType(String numeroIdentificacion, String tipoIdentificacion) {
        Optional<DatosUbicacion> listado = this.datos.findByNumeroIdentificacionAndTipoIdentificacion(numeroIdentificacion, tipoIdentificacion);
        if (listado.isPresent()) {
            return listado;
        } else {
            return null;
        }
    }

    public DatosUbicacion create(DatosUbicacion datosUbicacion) {
        return datos.save(datosUbicacion);
    }

    public DatosUbicacion update(DatosUbicacion datosUbicacion) {
        return datos.save(datosUbicacion);
    }

    public void remove (String numeroIdentificacion){
        this.datos.deleteById(numeroIdentificacion);
    }

}
