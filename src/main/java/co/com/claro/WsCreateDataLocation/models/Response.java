package co.com.claro.WsCreateDataLocation.models;

import lombok.Getter;
import lombok.Setter;

public class Response {
    @Getter
    @Setter
    private Boolean isValid;

    @Getter
    @Setter
    private String description;

    public Response() {
    }

    public Response(Boolean isValid, String description) {
        this.isValid = isValid;
        this.description = description;
    }
}
