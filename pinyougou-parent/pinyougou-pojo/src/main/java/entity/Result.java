package entity;
import java.io.Serializable;

public class Result implements Serializable{
    private boolean success;
    private String message;
    public Result(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }
}
