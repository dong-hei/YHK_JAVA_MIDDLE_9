package exception.basic.ex3;


import exception.basic.ex3.ex.ConnectExV3;
import exception.basic.ex3.ex.NetworkClientExV3;
import exception.basic.ex3.ex.SendExV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://www.naver.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } catch (NetworkClientExV3 e) {
            System.out.println("[네트워크 오류] 메세지  : " + e.getMessage());
        } catch (Exception e){
            System.out.println("[알 수 없는 오류] 메세지 : " + e.getMessage());
        }finally {
            //finally가 반드시 호출, Exception에 해당하지 않는 에러가 나와도 실행한다.
            client.disconnect();
        }

    }
}
