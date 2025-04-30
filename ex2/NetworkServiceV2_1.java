package exception.basic.ex2;


public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExV2 {
        String address = "http://www.naver.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
