package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public class Request implements Serializable {
    private RequestType requestType;

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }
}
