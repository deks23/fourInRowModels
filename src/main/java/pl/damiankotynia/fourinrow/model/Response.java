package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public class Response implements Serializable {
    private ResponseStatus responseStatus;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
