package co.com.claro.WsCreateDataLocation.models;

import co.com.claro.WsCreateDataLocation.entity.DatosUbicacion;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Response {

    private ResponseGeneral response;

    private List<DatosUbicacion> dataLocation;

    public void setResponse(ResponseGeneral response) {
        this.response = response;
    }

    public void setDataLocation(List<DatosUbicacion> dataLocation) {
        this.dataLocation = dataLocation;
    }
}
