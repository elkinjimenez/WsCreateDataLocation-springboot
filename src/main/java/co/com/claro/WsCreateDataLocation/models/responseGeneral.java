package co.com.claro.WsCreateDataLocation.models;

import co.com.claro.WsCreateDataLocation.entity.DatosUbicacion;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class responseGeneral {

    @Getter
    @Setter
    private Response response;

    @Getter
    @Setter
    private List<DatosUbicacion> dataLocation;
}
