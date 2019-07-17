package pl.damiankotynia.fourinrow.model;

import java.io.Serializable;

public class MoveResponse extends Response implements Serializable {
    private GameField gameField;

    public MoveResponse(ResponseStatus responseStatus, GameField gameField) {
        super(responseStatus);
        this.gameField = gameField;
    }

    public GameField getGameField() {
        return gameField;
    }

    public void setGameField(GameField gameField) {
        this.gameField = gameField;
    }
}
