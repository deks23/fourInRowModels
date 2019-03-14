package pl.damiankotynia.fourinrow.model;

public class MessageRequest extends Request {
    private String message;

    public MessageRequest(Player player) {
        super(player);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
