package exception.basic.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "http://www.naver.com";
        NetworkClientV0 client = new NetworkClientV0(address);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
