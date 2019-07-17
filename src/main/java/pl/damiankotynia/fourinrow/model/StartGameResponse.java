package pl.damiankotynia.fourinrow.model;

public class StartGameResponse extends Response {
    private int playerNumber;


    public StartGameResponse(ResponseStatus responseStatus, int playerNumber) {
        super(responseStatus);
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}

