package exception;

import lombok.Getter;

@Getter
public class NotEnoughMoney extends RuntimeException {

    private final String message;

    public NotEnoughMoney(String message) {
        this.message = message;
    }
}