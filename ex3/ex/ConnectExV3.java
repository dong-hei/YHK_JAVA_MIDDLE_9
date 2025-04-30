package exception.basic.ex3.ex;

public class ConnectExV3 extends NetworkClientExV3 {

    private final String address;

    public ConnectExV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
