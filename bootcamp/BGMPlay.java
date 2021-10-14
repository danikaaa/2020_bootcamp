package bootcamp;
 
public class BGMPlay extends Thread{
	 
    @Override
    public void run() {
 
        while (true) {
            System.out.println("배경 음악 재생 중......");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }    
}