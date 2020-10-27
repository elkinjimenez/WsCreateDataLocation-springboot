package co.com.claro.WsCreateDataLocation.models;

import co.com.claro.WsCreateDataLocation.entity.DatosUbicacion;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Data
public class ResponseDataLocation {

    private ResponseGeneral response;

    private Optional<DatosUbicacion> dataLocation;

    public ResponseDataLocation(){}

    public ResponseGeneral getResponse() {
        return response;
    }

    public void setResponse(ResponseGeneral response) {
        this.response = response;
    }

    public Optional<DatosUbicacion> getDataLocation() {
        return dataLocation;
    }

    public void setDataLocation(Optional<DatosUbicacion> dataLocation) {
        this.dataLocation = dataLocation;
    }
}
