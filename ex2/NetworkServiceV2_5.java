package exception.basic.ex2;


public class NetworkServiceV2_5 {
    public void sendMessage(String data) {
        String address = "http://www.naver.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (NetworkClientExV2 e) {
            System.out.println("[오류] : " + e.getErrorCode() + ", 메시지 : " + e.getMessage() + " ");
        }finally {
            //finally가 반드시 호출, Exception에 해당하지 않는 에러가 나와도 실행한다.
            client.disconnect();
        }

    }
}
