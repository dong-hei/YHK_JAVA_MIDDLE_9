package exception.basic.ex4;


import exception.basic.ex4.ex.ConnectExV4;
import exception.basic.ex4.ex.SendExV4;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect()  {
        if (connectError){
            throw new ConnectExV4(address, address + "서버 연결 실패");
        }

        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError){
            throw new SendExV4(data, address + " 서버에 데이터 전송 실패 : " + data);
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
