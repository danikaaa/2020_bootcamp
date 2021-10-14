package bootcamp;

public class pingdata {
   private double x;
   private double y;
   private boolean YN;
   private int index;
   private String spot;
   public double getX() {
      return x;
   }
   public void setX(double x) {
      this.x = x;
   }
   public double getY() {
      return y;
   }
   public void setY(double y) {
      this.y = y;
   }
   public boolean isYN() {
      return YN;
   }
   public void setYN(boolean yN) {
      YN = yN;
   }
   public String getspot() {
      return spot;
   }
   public void setspot() {
      this.spot = spot;
   }
   public pingdata(String spot,double x, double y, boolean YN) {
      super();
      this.spot = spot;
      this.x = x;
      this.y = y;
      this.YN = YN;
   }
   public pingdata(String spot) {
      super();
      this.spot = spot;
   }
}