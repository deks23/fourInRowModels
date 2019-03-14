package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public class Response implements Serializable {
    private ResponseStatus responseStatus;


    public Response() {
    }

    public Response(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
