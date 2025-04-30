package exception.basic.ex3;


import exception.basic.ex3.ex.ConnectExV3;
import exception.basic.ex3.ex.SendExV3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "http://www.naver.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch (SendExV3 e) {
            System.out.println("[연결 오류] 전송 데이터 : " + e.getSendData() + ", 메시지 : " + e.getMessage());

        } finally {
            //finally가 반드시 호출, Exception에 해당하지 않는 에러가 나와도 실행한다.
            client.disconnect();
        }

    }
}
