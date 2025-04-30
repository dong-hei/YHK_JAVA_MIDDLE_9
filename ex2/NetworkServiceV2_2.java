package exception.basic.ex2;


public class NetworkServiceV2_2 {
    public void sendMessage(String data) {
        String address = "http://www.naver.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
        } catch (NetworkClientExV2 e) {
            System.out.println("[오류] : " + e.getErrorCode() + ", 메시지 : " + e.getMessage() + " ");
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExV2 e) {
            System.out.println("[오류] : " + e.getErrorCode() + ", 메시지 : " + e.getMessage() + " ");
            return;
        }
        client.disconnect();
    }
}
