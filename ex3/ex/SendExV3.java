package exception.basic.ex3.ex;

public class SendExV3 extends NetworkClientExV3 {
    private final String sendData;

    public SendExV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
