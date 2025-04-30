package exception.basic.ex4.ex;


public class ConnectExV4 extends NetworkClientExV4 {

    private final String address;

    public ConnectExV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
