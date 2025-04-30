package exception.basic.ex2;


public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "http://www.naver.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect();

        } catch (NetworkClientExV2 e) {
            System.out.println("[오류] : " + e.getErrorCode() + ", 메시지 : " + e.getMessage() + " ");
        }

    }
}
