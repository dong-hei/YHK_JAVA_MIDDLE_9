package exception.basic.ex3;


import exception.basic.ex3.ex.ConnectExV3;
import exception.basic.ex3.ex.SendExV3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExV3 {
        if (connectError){
            throw new ConnectExV3(address, address + "서버 연결 실패");
        }

        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws ConnectExV3, SendExV3 {
        if (sendError){
            throw new SendExV3(data, address + " 서버에 데이터 전송 실패 : " + data);
//            throw new RuntimeException("ex"); // 중간에 다른 예외가 발생하면 대처 불가

        }
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제 ");
    }

    public void initError(String data) {
        if (data.contains("error1")){
            connectError = true;
        }

        if (data.contains("error2")){
            sendError = true;
        }
    }
}
