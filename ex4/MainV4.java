package exception.basic.ex4;

import exception.basic.ex4.ex.SendExV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args)  {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println(" 전송할 문자 : ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }

            //예외 공통 처리
            try{
                networkService.sendMessage(input);
            } catch (Exception e){
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메세지 : 알 수 없는 문제가 발생했습니다");
        System.out.println("==developer debug message ==");
        e.printStackTrace(System.out); // 스택 트레이스 출력
        //e.printStackTrace();
        
        //필요하면 예외 별도 추가 처리 가능
        if (e instanceof SendExV4 sendEx){
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}
