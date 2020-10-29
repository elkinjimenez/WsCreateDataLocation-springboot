package co.com.claro.WsCreateDataLocation.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class ResponseGeneral {

    private Boolean isValid;

    private String description;

    public ResponseGeneral() {
    }

    public ResponseGeneral(Boolean isValid, String description) {
        this.isValid = isValid;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        isValid = isValid;
    }
}
