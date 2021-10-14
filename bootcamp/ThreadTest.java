package bootcamp;
 
public class ThreadTest extends Thread{
    
    String str;
    public ThreadTest(String str) {
        this.str = str;
        
        // TODO Auto-generated constructor stub
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            try {
                Thread.sleep((int)(Math.random()*1000));//스레드 안에 들어있는 메소드 sleep
                //sleep 메소드는 예외처리가 필요하기 때문에 try-catch문을 사용한다
                //sleep은 프로그램의 수행을 지연시킬 수 있다
                //지연시키는 단위는 1/1000초입니다.
                //Math.random이 출력문에서 t1과 t2의 지연시간을 랜덤하게 다르게 해준다.
                //그래서 *과 -이 무작위로 번갈아가며 출력된다.
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        super.run();
    }
}


출처: https://fors.tistory.com/143 [우종선]