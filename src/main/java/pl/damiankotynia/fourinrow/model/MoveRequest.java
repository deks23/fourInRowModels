package pl.damiankotynia.fourinrow.model;

public class MoveRequest extends Request{
    private GameField gameField;

    public MoveRequest(Player player) {
        super(player);
    }

    public GameField getGameField() {
        return gameField;
    }

    public void setGameField(GameField gameField) {
        this.gameField = gameField;
    }
}
