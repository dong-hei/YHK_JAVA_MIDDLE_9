package exception.basic.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExV2 {
        if (connectError){
//            throw new NetworkClientExV2("connectError", address + "서버 연결 실패");
        }

        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExV2 {
        if (sendError){
            throw new NetworkClientExV2("sendError", address + " 서버에 데이터 전송 실패 : ");
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
