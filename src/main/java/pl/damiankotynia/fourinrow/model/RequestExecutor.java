package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public interface RequestExecutor extends Serializable {
    void executeRequest(Request request);
    void sendResponse(Response response);
}
