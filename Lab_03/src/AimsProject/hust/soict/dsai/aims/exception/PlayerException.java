package Lab_03.src.AimsProject.hust.soict.dsai.aims.exception;

public class PlayerException extends Exception{
    public PlayerException() {
        super();
    }

    public PlayerException(String s) {
        super(s);
    }

    public PlayerException(String s, PlayerException e) {
        super(s, e);
    }
}
