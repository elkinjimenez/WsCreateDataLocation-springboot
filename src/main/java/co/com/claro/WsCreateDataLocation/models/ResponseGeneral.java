package co.com.claro.WsCreateDataLocation.models;

import lombok.Getter;
import lombok.Setter;

public class ResponseGeneral {

    @Getter
    @Setter
    private Boolean isValid;

    @Getter
    @Setter
    private String description;

    public ResponseGeneral() {
    }

    public ResponseGeneral(Boolean isValid, String description) {
        this.isValid = isValid;
        this.description = description;
    }


}
