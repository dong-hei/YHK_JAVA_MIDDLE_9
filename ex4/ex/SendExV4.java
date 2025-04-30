package exception.basic.ex4.ex;

public class SendExV4 extends NetworkClientExV4 {
    private final String sendData;

    public SendExV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
