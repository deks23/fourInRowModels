package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public class Request implements Serializable {
    private RequestType requestType;
    private Player player;
    public RequestType getRequestType() {
        return requestType;
    }

    public Request(Player player) {
        this.player = player;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
