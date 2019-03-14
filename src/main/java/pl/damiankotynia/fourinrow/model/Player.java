package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Player implements Serializable {
    private String nick;
    private PlayerStatus status;
    private RequestExecutor requestExecutor;
    private int playerSign;

    public Player() {
        this.nick = UUID.randomUUID().toString();
    }

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

    public int getPlayerSign() {
        return playerSign;
    }

    public void setPlayerSign(int playerSign) {
        this.playerSign = playerSign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(nick, player.nick) &&
                status == player.status &&
                Objects.equals(requestExecutor, player.requestExecutor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nick, status, requestExecutor);
    }
}
