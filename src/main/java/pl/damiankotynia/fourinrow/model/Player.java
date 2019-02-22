package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public class Player implements Serializable {
    private String nick;
    private PlayerStatus status;
    private RequestExecutor requestExecutor;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public PlayerStatus getStatus() {
        return status;
    }

    public void setStatus(PlayerStatus status) {
        this.status = status;
    }

    public RequestExecutor getRequestExecutor() {
        return requestExecutor;
    }

    public void setRequestExecutor(RequestExecutor requestExecutor) {
        this.requestExecutor = requestExecutor;
    }
}
