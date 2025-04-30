package exception.basic.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "http://www.naver.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult = client.connect();
        //결과가 성공이 아니다 -> 오류
        if (isErr(connectResult)){
            System.out.println("[네트워크 오류 발생!] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isErr(sendResult)){
            System.out.println("[전송 오류 발생!] 오류 코드 : " + sendResult);
            return;
        }
        
        client.disconnect();
    }

    private static boolean isErr(String connectResult) {
        return !connectResult.equals("success");
    }
}
