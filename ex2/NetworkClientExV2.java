package exception.basic.ex2;

public class NetworkClientExV2 extends Exception {
    private String errorCode;

    public NetworkClientExV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
