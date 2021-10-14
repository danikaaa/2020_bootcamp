package bootcamp;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ToolTipManager;

public class Main extends JFrame {
   public static final int SCREEN_WIDHT = 1000;
   public static final int SCREEN_HEIGH = 700;
   private ImageIcon musiconimg = new ImageIcon(Main.class.getResource("../images/노래키기.png"));
   private ImageIcon musicoffimg = new ImageIcon(Main.class.getResource("../images/노래끄기.png"));
   private ImageIcon coupleimg = new ImageIcon(Main.class.getResource("../images/연인.png"));
   private ImageIcon backimg = new ImageIcon(Main.class.getResource("../images/되돌리기.png"));
   private ImageIcon friendimg = new ImageIcon(Main.class.getResource("../images/친구.png"));
   private ImageIcon familyimg = new ImageIcon(Main.class.getResource("../images/가족.png"));
   private ImageIcon oldimg = new ImageIcon(Main.class.getResource("../images/추억.png"));
   private ImageIcon nextimg = new ImageIcon(Main.class.getResource("../images/다음.png"));
   private ImageIcon checkbox1img = new ImageIcon(Main.class.getResource("../images/한옥마을.png"));
   private ImageIcon checkbox2img = new ImageIcon(Main.class.getResource("../images/동물원.png"));
   private ImageIcon checkbox3img = new ImageIcon(Main.class.getResource("../images/객사.png"));
   private ImageIcon checkbox4img = new ImageIcon(Main.class.getResource("../images/덕진공원.png"));
   private ImageIcon checkbox5img = new ImageIcon(Main.class.getResource("../images/수목원.png"));
   private ImageIcon checkbox6img = new ImageIcon(Main.class.getResource("../images/팔복예술공장.png"));
   private ImageIcon checkbox7img = new ImageIcon(Main.class.getResource("../images/아중저수지.png"));
   private ImageIcon checkbox8img = new ImageIcon(Main.class.getResource("../images/막걸리골목.png"));
   private ImageIcon checkbox9img = new ImageIcon(Main.class.getResource("../images/창의체험관.png"));
   private ImageIcon checkbox1_1img = new ImageIcon(Main.class.getResource("../images/한옥마을ck.png"));
   private ImageIcon checkbox2_1img = new ImageIcon(Main.class.getResource("../images/동물원ck.png"));
   private ImageIcon checkbox3_1img = new ImageIcon(Main.class.getResource("../images/객사ck.png"));
   private ImageIcon checkbox4_1img = new ImageIcon(Main.class.getResource("../images/덕진공원ck.png"));
   private ImageIcon checkbox5_1img = new ImageIcon(Main.class.getResource("../images/수목원ck.png"));
   private ImageIcon checkbox6_1img = new ImageIcon(Main.class.getResource("../images/팔목예술공장ck.png"));
   private ImageIcon checkbox7_1img = new ImageIcon(Main.class.getResource("../images/아중저수지ck.png"));
   private ImageIcon checkbox8_1img = new ImageIcon(Main.class.getResource("../images/막걸리골목ck.png"));
   private ImageIcon checkbox9_1img = new ImageIcon(Main.class.getResource("../images/창의체험관ck.png"));
   private ImageIcon goodimg = new ImageIcon(Main.class.getResource("../images/별.png"));
   private ImageIcon terminalimg = new ImageIcon(Main.class.getResource("../images/터미널.png"));
   private ImageIcon trainimg = new ImageIcon(Main.class.getResource("../images/기차역.png"));
   private ImageIcon pingimg = new ImageIcon(Main.class.getResource("../images/핑.png"));
   private ImageIcon busimg = new ImageIcon(Main.class.getResource("../images/버스.png"));
   private ImageIcon courseimg = new ImageIcon(Main.class.getResource("../images/코스버튼.png"));
   private ImageIcon tourimg = new ImageIcon(Main.class.getResource("../images/관광지버튼.png"));
   private ImageIcon Hanokimg = new ImageIcon(Main.class.getResource("../images/한옥마을버튼.png"));
   private ImageIcon Zooimg = new ImageIcon(Main.class.getResource("../images/동물원버튼.png"));
   private ImageIcon Gaeksaimg = new ImageIcon(Main.class.getResource("../images/객사버튼.png"));
   private ImageIcon Deokjinimg = new ImageIcon(Main.class.getResource("../images/덕진공원버튼.png"));
   private ImageIcon Sumokimg = new ImageIcon(Main.class.getResource("../images/수목원버튼.png"));
   private ImageIcon Palbokimg = new ImageIcon(Main.class.getResource("../images/팔복예술공장버튼.png"));
   private ImageIcon Jeosujiimg = new ImageIcon(Main.class.getResource("../images/아중저수지버튼.png"));
   private ImageIcon Makgolimg = new ImageIcon(Main.class.getResource("../images/막걸리골목버튼.png"));
   private ImageIcon Changuiimg = new ImageIcon(Main.class.getResource("../images/창의체험관버튼.png"));
   private ImageIcon tourbackimg = new ImageIcon(Main.class.getResource("../images/관광지뒤로가기.png"));

   private JCheckBox musiconbutton = new JCheckBox(musiconimg);
   
   private JCheckBox musiconbutton1 = new JCheckBox(musiconimg);
   private JCheckBox musiconbutton2 = new JCheckBox(musiconimg);
   private JCheckBox musiconbutton3 = new JCheckBox(musiconimg);
   private JCheckBox musiconbutton4 = new JCheckBox(musiconimg);
   private JCheckBox musiconbutton5 = new JCheckBox(musiconimg);
   private JCheckBox musiconbutton6 = new JCheckBox(musiconimg);
   private JCheckBox musiconbutton7 = new JCheckBox(musiconimg);
   private JButton startbutton1 = new JButton(courseimg);
   private JButton startbutton2 = new JButton(tourimg);

   private JButton Hanokbutton = new JButton(Hanokimg);
   private JButton Zoobutton = new JButton(Zooimg);
   private JButton Gaeksabutton = new JButton(Gaeksaimg);
   private JButton Deokjinbutton = new JButton(Deokjinimg);
   private JButton Sumokbutton = new JButton(Sumokimg);
   private JButton Palbokbutton = new JButton(Palbokimg);
   private JButton Jeosujibutton = new JButton(Jeosujiimg);
   private JButton Makgolbutton = new JButton(Makgolimg);
   private JButton Changuibutton = new JButton(Changuiimg);

   private JButton couplebutton = new JButton(coupleimg); // 버튼
   private JButton friendbutton = new JButton(friendimg);
   private JButton oldbutton = new JButton(oldimg);
   private JButton familybutton = new JButton(familyimg);
   private JButton backbutton = new JButton(backimg);
   private JLabel good1 = new JLabel(goodimg);
   private JLabel good2 = new JLabel(goodimg);
   private JLabel good3 = new JLabel(goodimg);
   private JLabel good4 = new JLabel(goodimg);
   private JLabel good5 = new JLabel(goodimg);
   private JLabel good6 = new JLabel(goodimg);
   private JLabel good7 = new JLabel(goodimg);
   private JLabel good8 = new JLabel(goodimg);
   private JLabel good9 = new JLabel(goodimg);

   private JCheckBox checkbox1 = new JCheckBox(checkbox1img);
   private JCheckBox checkbox2 = new JCheckBox(checkbox2img);
   private JCheckBox checkbox3 = new JCheckBox(checkbox3img);
   private JCheckBox checkbox4 = new JCheckBox(checkbox4img);
   private JCheckBox checkbox5 = new JCheckBox(checkbox5img);
   private JCheckBox checkbox6 = new JCheckBox(checkbox6img);
   private JCheckBox checkbox7 = new JCheckBox(checkbox7img);
   private JCheckBox checkbox8 = new JCheckBox(checkbox8img);
   private JCheckBox checkbox9 = new JCheckBox(checkbox9img);
   private JCheckBox[] spot = new JCheckBox[] { checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, checkbox6,
         checkbox7, checkbox8, checkbox9 };
   private JButton next = new JButton(nextimg);

   private JButton terminalbutton = new JButton(terminalimg); // 터미널버튼
   private JButton trainbutton = new JButton(trainimg); // 전주역버튼
   // 뒤로가기 버튼들
   private JButton back0 = new JButton(backimg);
   private JButton back1 = new JButton(backimg);
   private JButton back2 = new JButton(backimg);
   private JButton back3 = new JButton(backimg);
   private JButton backtour0 = new JButton(backimg);
   private JButton backtour1 = new JButton(tourbackimg);
   private JButton backtour2 = new JButton(tourbackimg);
   private JButton backtour3 = new JButton(tourbackimg);
   private JButton backtour4 = new JButton(tourbackimg);
   private JButton backtour5 = new JButton(tourbackimg);
   private JButton backtour6 = new JButton(tourbackimg);
   private JButton backtour7 = new JButton(tourbackimg);
   private JButton backtour8 = new JButton(tourbackimg);
   private JButton backtour9 = new JButton(tourbackimg);
   private JButton ping1 = new JButton(pingimg);
   private JButton ping2 = new JButton(pingimg);
   private JButton ping3 = new JButton(pingimg);
   private JButton ping4 = new JButton(pingimg);
   private JButton ping5 = new JButton(pingimg);
   private JButton ping6 = new JButton(pingimg);
   private JButton ping7 = new JButton(pingimg);
   private JButton ping8 = new JButton(pingimg);
   private JButton ping9 = new JButton(pingimg);
   private JButton pingtrain = new JButton(pingimg);
   private JButton pingterminal = new JButton(pingimg);

   private JButton pingbutton1 = new JButton(pingimg);
   private JButton pingbutton2 = new JButton(pingimg);
   private JButton pingbutton3 = new JButton(pingimg);
   private JButton pingbutton4 = new JButton(pingimg);
   private JButton pingbutton5 = new JButton(pingimg);
   private JButton pingbutton6 = new JButton(pingimg);
   private JButton pingbutton7 = new JButton(pingimg);
   private JButton pingbutton8 = new JButton(pingimg);
   private JButton pingbutton9 = new JButton(pingimg);
   private JButton busButton = new JButton(busimg);
   private Music introMusic = new Music("배경음악.mp3", true);
   static ArrayList<pingdata> pingList = new ArrayList<pingdata>();
   static LinkedList<pingdata> pingLinke = new LinkedList<pingdata>();

   static JPanel page0 = new JPanel() { // 패널0
      private Graphics screenGraphic;
      private Image screenImage;
      private Image page0 = new ImageIcon(Main.class.getResource("../images/패널0.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(page0, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };

   static JPanel page1 = new JPanel() { // 패널1
      private Graphics screenGraphic;
      private Image screenImage;
      private Image page1 = new ImageIcon(Main.class.getResource("../images/패널1.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(page1, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };

   static JPanel page2 = new JPanel() { // 패널2
      private Graphics screenGraphic;
      private Image screenImage;
      private Image page2 = new ImageIcon(Main.class.getResource("../images/패널2.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(page2, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }

   };

   static JPanel page3 = new JPanel() { // 패널3
      private Graphics screenGraphic;
      private Image screenImage;
      private Image page3 = new ImageIcon(Main.class.getResource("../images/패널3.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(page3, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }

   };

   static JPanel page4 = new JPanel() { // 패널4
      private Graphics screenGraphic;
      private Image screenImage;
      private Image page4 = new ImageIcon(Main.class.getResource("../images/패널4.png")).getImage();
      private Image Arrow = new ImageIcon(Main.class.getResource("../images/화살표.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(page4, 0, 0, null);
         g.setFont(new Font("휴먼고딕", Font.BOLD, 20));
         for (int i = 0; i < pingLinke.size(); i++) {
            g.drawString(pingLinke.get(i).getspot(), 670, 50 * i + 183);

         }
         for (int i = 0; i < pingLinke.size() - 1; i++) {
            g.drawImage(Arrow, 800, 50 * i + 183, null);
         }
         paintComponents(g);
         this.repaint();
      }
   };

   static JPanel page5 = new JPanel() { // 패널5
      private Graphics screenGraphic;
      private Image screenImage;
      private Image page5 = new ImageIcon(Main.class.getResource("../images/패널5.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(page5, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };

   static JPanel tourpage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image tourpage = new ImageIcon(Main.class.getResource("../images/관광지소개페이지.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(tourpage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };

   static JPanel Hanokpage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image Hanokpage = new ImageIcon(Main.class.getResource("../images/한옥마을설명.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(Hanokpage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };

   static JPanel zoopage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image zoopage = new ImageIcon(Main.class.getResource("../images/전주동물원설명.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(zoopage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };
   static JPanel Gaeksapage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image Gaeksapage = new ImageIcon(Main.class.getResource("../images/객사정보.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(Gaeksapage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };
   static JPanel Deokjinpage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image Deokjinpage = new ImageIcon(Main.class.getResource("../images/덕진공원설명.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(Deokjinpage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };
   static JPanel Sumokpage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image Sumokpage = new ImageIcon(Main.class.getResource("../images/수목원설명.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(Sumokpage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };
   static JPanel Palbokpage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image Palbokpage = new ImageIcon(Main.class.getResource("../images/팔복예술공장설명.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(Palbokpage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };
   static JPanel Jeosujipage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image Jeosujipage = new ImageIcon(Main.class.getResource("../images/아중저수지설명.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(Jeosujipage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };
   static JPanel Makgolpage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image Makgolpage = new ImageIcon(Main.class.getResource("../images/막걸리골목설명.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(Makgolpage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };
   static JPanel Changuipage = new JPanel() {
      private Graphics screenGraphic;
      private Image screenImage;
      private Image Changuipage = new ImageIcon(Main.class.getResource("../images/창의체험관설명.png")).getImage();

      public void paint(Graphics g) {
         screenImage = createImage(Main.SCREEN_WIDHT, Main.SCREEN_HEIGH);
         screenGraphic = screenImage.getGraphics();
         screenDraw((Graphics2D) screenGraphic);
         g.drawImage(screenImage, 0, 0, null);
      }

      public void screenDraw(Graphics2D g) {
         g.drawImage(Changuipage, 0, 0, null);
         paintComponents(g);
         this.repaint();
      }
   };

   public Main() {
      introMusic.start();// 배경음악 시작
      setping();
      setframe();// setframe함수를 실행
      setpanel0();
      setpanel1();
      setpanel2();
      setpanel3();
      setpanel4();
      setpanel5();
      cg();// cg함수를 실행
      settourpage();
   }

   public void setframe() { // 프레임 설정
      setTitle("전주관광소개");// 타이틀
      setSize(1000, 700);// 프레임의 크기
      setResizable(false);// 창의 크기를 변경하지 못하게
      setLocationRelativeTo(null);// 창이 가운데 나오게
      getContentPane().setLayout(null);// 레이아웃 설정
      setVisible(true);// 창이 보이게
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame이 정상적으로 종료되게
   }

   public void setbutton(JButton btn) {
      btn.setBorderPainted(false);
      btn.setContentAreaFilled(false);
      btn.setFocusPainted(false);
   }

   public void setpanel0() {
      // 패널0 설정
      page0.setBounds(0, 0, 1000, 700);// 패널1의 위치 설정
      page0.setLayout(null);// 레이아웃 설정
      page0.setVisible(true);
      getContentPane().add(page0);// 프레임에 패널을 추가

      startbutton1.setBounds(600, 300, 300, 300);
      setbutton(startbutton1);
      page0.add(startbutton1);

      startbutton2.setBounds(100, 300, 300, 300);
      setbutton(startbutton2);
      page0.add(startbutton2);

      musiconbutton.setContentAreaFilled(false);
      musiconbutton.setBounds(0, 0, 80, 80);
      musiconbutton.setBorderPainted(true);
      musiconbutton.setSelectedIcon(musicoffimg); // 체크박스 이미지
      musiconbutton.setVisible(true);
      page0.add(musiconbutton);

   }

   public void setpanel1() { // 페이지1 설정
      // 패널1 설정
      page1.setBounds(0, 0, 1000, 700);// 패널1의 위치 설정
      page1.setLayout(null);// 레이아웃 설정
      page1.setVisible(false);

      back0.setBounds(0, 610, 100, 50);
      setbutton(back0);
      page1.add(back0);
      // 연인버튼 설정
      couplebutton.setBounds(170, 200, 250, 150);// 버튼 위치 설정
      setbutton(couplebutton);
      page1.add(couplebutton);
      // 친구버튼설정
      friendbutton.setBounds(575, 200, 250, 150);
      setbutton(friendbutton);
      page1.add(friendbutton);
      // 추억버튼설정
      oldbutton.setBounds(170, 400, 250, 150);
      setbutton(oldbutton);
      page1.add(oldbutton);
      // 가족버튼설정
      familybutton.setBounds(575, 400, 250, 150);
      setbutton(familybutton);
      page1.add(familybutton);

      musiconbutton1.setContentAreaFilled(false);
      musiconbutton1.setBounds(0, 0, 80, 80);
      musiconbutton1.setBorderPainted(true);
      musiconbutton1.setSelectedIcon(musicoffimg); // 체크박스 이미지
      musiconbutton1.setVisible(true);
      page1.add(musiconbutton1);
      getContentPane().add(page1);// 프레임에 패널을 추가

   }

   public void setpanel2() { // 페이지2 설정
      // 패널2 설정
      page2.setBounds(0, 0, 1000, 700);// 패널2의 위치 설정
      page2.setLayout(null);// 레이아웃 설정
      page2.setVisible(false);// 창이 보이지 않게
      getContentPane().add(page2);// 프레임에 패널을 추가
      // 뒤로가기 버튼 설정
      setbutton(backbutton);
      backbutton.setBounds(0, 610, 100, 50);
      page2.add(backbutton);
      // 다음버튼 설정
      next.setBounds(860, 630, 100, 50);
      setbutton(next);
      page2.add(next);
      // 체크박스 1 설정
      good1.setBounds(60, 100, 100, 100);
      page2.add(good1);
      checkbox1.setBounds(100, 150, 220, 120);
      checkbox1.setBorderPainted(true);
      checkbox1.setSelectedIcon(checkbox1_1img); // 체크박스 이미지
      checkbox1.setVisible(true);
      page2.add(checkbox1);

      // 체크박스 2 설정
      good2.setBounds(340, 100, 100, 100);
      page2.add(good2);
      checkbox2.setBounds(390, 150, 220, 120);
      checkbox2.setSelectedIcon(checkbox2_1img); // 체크박스 이미지
      checkbox2.setBorderPainted(true);
      checkbox2.setVisible(true);
      page2.add(checkbox2);
      // 체크박스 3 설정
      good3.setBounds(640, 100, 100, 100);
      page2.add(good3);
      checkbox3.setBounds(680, 150, 220, 120);
      checkbox3.setBorderPainted(true);
      checkbox3.setSelectedIcon(checkbox3_1img); // 체크박스 이미지
      checkbox3.setVisible(true);
      page2.add(checkbox3);
      // 체크박스 4 설정
      good4.setBounds(60, 260, 100, 100);
      page2.add(good4);
      checkbox4.setBounds(100, 310, 220, 120);
      checkbox4.setBorderPainted(true);
      checkbox4.setSelectedIcon(checkbox4_1img); // 체크박스 이미지
      checkbox4.setVisible(true);
      page2.add(checkbox4);
      // 체크박스 5 설정
      good5.setBounds(340, 260, 100, 100);
      page2.add(good5);
      checkbox5.setBounds(390, 310, 220, 120);
      checkbox5.setBorderPainted(true);
      checkbox5.setSelectedIcon(checkbox5_1img); // 체크박스 이미지
      checkbox5.setVisible(true);
      page2.add(checkbox5);
      // 체크박스 6 설정
      good6.setBounds(640, 260, 100, 100);
      page2.add(good6);
      checkbox6.setBounds(680, 310, 220, 120);
      checkbox6.setBorderPainted(true);
      checkbox6.setSelectedIcon(checkbox6_1img); // 체크박스 이미지
      checkbox6.setVisible(true);
      page2.add(checkbox6);
      // 체크박스 7 설정
      good7.setBounds(60, 420, 100, 100);
      page2.add(good7);
      checkbox7.setBounds(100, 470, 220, 120);
      checkbox7.setBorderPainted(true);
      checkbox7.setSelectedIcon(checkbox7_1img); // 체크박스 이미지
      checkbox7.setVisible(true);
      page2.add(checkbox7);
      // 체크박스 8 설정
      good8.setBounds(340, 420, 100, 100);
      page2.add(good8);
      checkbox8.setBounds(390, 470, 220, 120);
      checkbox8.setBorderPainted(true);
      checkbox8.setSelectedIcon(checkbox8_1img); // 체크박스 이미지
      checkbox8.setVisible(true);
      page2.add(checkbox8);
      // 체크박스 9 설정
      good9.setBounds(640, 420, 100, 100);
      page2.add(good9);
      checkbox9.setBounds(680, 470, 220, 120);
      checkbox9.setBorderPainted(true);
      checkbox9.setSelectedIcon(checkbox9_1img); // 체크박스 이미지
      checkbox9.setVisible(true);
      page2.add(checkbox9);
      // spot배열에 아이템리스터 추가
      MyItemListener listener = new MyItemListener();
      for (int i = 0; i < spot.length; i++) {
         spot[i].addItemListener(listener);
      }
      musiconbutton2.setContentAreaFilled(false);
      musiconbutton2.setBounds(0, 0, 80, 80);
      musiconbutton2.setBorderPainted(true);
      musiconbutton2.setSelectedIcon(musicoffimg); // 체크박스 이미지
      musiconbutton2.setVisible(true);
      page2.add(musiconbutton2);
   }

   public void setpanel3() { // 페이지3 설정
      // 패널3 설정
      page3.setBounds(0, 0, 1000, 700);// 패널2의 위치 설정
      page3.setLayout(null);// 레이아웃 설정
      page3.setVisible(false);// 창이 보이지 않게
      getContentPane().add(page3);// 프레임에 패널을 추가
      // 뒤로가기 버튼 설정
      back1.setBounds(0, 610, 100, 50);
      setbutton(back1);
      page3.add(back1);
      // 터미널버튼 설정
      terminalbutton.setBounds(100, 250, 320, 200);// 버튼 위치 설정
      setbutton(terminalbutton);
      page3.add(terminalbutton);
      // 전주역버튼설정
      trainbutton.setBounds(580, 250, 320, 200);
      setbutton(trainbutton);
      page3.add(trainbutton);

      musiconbutton3.setContentAreaFilled(false);
      musiconbutton3.setBounds(0, 0, 80, 80);
      musiconbutton3.setBorderPainted(true);
      musiconbutton3.setSelectedIcon(musicoffimg); // 체크박스 이미지
      musiconbutton3.setVisible(true);
      page3.add(musiconbutton3);
   }

   public void setpanel4() { // 페이지4 설정
      ToolTipManager m = ToolTipManager.sharedInstance(); // 툴팁 딜레이 시간
      m.setInitialDelay(0);
      m.setDismissDelay(10000);
      // 패널4 설정
      page4.setBounds(0, 0, 1000, 700);// 패널2의 위치 설정
      page4.setLayout(null);// 레이아웃 설정
      page4.setVisible(false);// 창이 보이지 않게
      getContentPane().add(page4);// 프레임에 패널을 추가
      // 뒤로가기 버튼 설정
      back2.setBounds(0, 610, 100, 50);
      back2.setBorderPainted(false);
      back2.setContentAreaFilled(false);
      back2.setFocusPainted(false);
      page4.add(back2);

      // 핑1 설정
      ping1.setBounds(390, 391, 50, 50);
      ping1.setVisible(false);
      ping1.setBorderPainted(false);
      ping1.setContentAreaFilled(false);
      ping1.setFocusPainted(false);
      ping1.setToolTipText("한옥마을");
      page4.add(ping1);
      // 핑2 설정
      ping2.setBounds(352, 265, 50, 50);
      ping2.setVisible(false);
      ping2.setBorderPainted(false);
      ping2.setContentAreaFilled(false);
      ping2.setFocusPainted(false);
      ping2.setToolTipText("동물원");
      page4.add(ping2);
      // 핑3 설정
      ping3.setBounds(345, 382, 50, 50);
      ping3.setVisible(false);
      ping3.setBorderPainted(false);
      ping3.setContentAreaFilled(false);
      ping3.setFocusPainted(false);
      ping3.setToolTipText("객사");
      page4.add(ping3);
      // 핑4 설정
      ping4.setBounds(305, 265, 50, 50);
      ping4.setVisible(false);
      ping4.setBorderPainted(false);
      ping4.setContentAreaFilled(false);
      ping4.setFocusPainted(false);
      ping4.setToolTipText("덕진공원");
      page4.add(ping4);
      // 핑5 설정
      ping5.setBounds(146, 230, 50, 50);
      ping5.setVisible(false);
      ping5.setBorderPainted(false);
      ping5.setContentAreaFilled(false);
      ping5.setFocusPainted(false);
      ping5.setToolTipText("수목원");
      page4.add(ping5);
      // 핑6 설정
      ping6.setBounds(252, 230, 50, 50);
      ping6.setVisible(false);
      ping6.setBorderPainted(false);
      ping6.setContentAreaFilled(false);
      ping6.setFocusPainted(false);
      ping6.setToolTipText("팔복예술공장");
      page4.add(ping6);
      // 핑7 설정
      ping7.setBounds(430, 391, 50, 50);
      ping7.setVisible(false);
      ping7.setBorderPainted(false);
      ping7.setContentAreaFilled(false);
      ping7.setFocusPainted(false);
      ping7.setToolTipText("아중저수지");
      page4.add(ping7);
      // 핑8 설정
      ping8.setBounds(290, 450, 50, 50);
      ping8.setVisible(false);
      ping8.setBorderPainted(false);
      ping8.setContentAreaFilled(false);
      ping8.setFocusPainted(false);
      ping8.setToolTipText("막걸리골목");
      page4.add(ping8);
      // 핑9 설정
      ping9.setBounds(331, 246, 50, 50);
      ping9.setVisible(false);
      ping9.setBorderPainted(false);
      ping9.setContentAreaFilled(false);
      ping9.setFocusPainted(false);
      ping9.setToolTipText("창의체험관");
      page4.add(ping9);
      // 기차역핑 설정
      pingtrain.setBounds(385, 270, 50, 50);
      pingtrain.setVisible(false);
      pingtrain.setBorderPainted(false);
      pingtrain.setContentAreaFilled(false);
      pingtrain.setFocusPainted(false);
      pingtrain.setToolTipText("전주역");
      page4.add(pingtrain);
      // 터미널핑 설정
      pingterminal.setBounds(315, 310, 50, 50);
      pingterminal.setVisible(false);
      pingterminal.setBorderPainted(false);
      pingterminal.setContentAreaFilled(false);
      pingterminal.setFocusPainted(false);
      pingterminal.setToolTipText("전주시외버스터미널");
      page4.add(pingterminal);

      // 버스 노선 버튼
      busButton.setBounds(880, 15, 100, 100);
      busButton.setVisible(true);
      busButton.setBorderPainted(false);
      busButton.setContentAreaFilled(false);
      busButton.setFocusPainted(false);
      page4.add(busButton);

      musiconbutton4.setContentAreaFilled(false);
      musiconbutton4.setBounds(0, 0, 80, 80);
      musiconbutton4.setBorderPainted(true);
      musiconbutton4.setSelectedIcon(musicoffimg); // 체크박스 이미지
      musiconbutton4.setVisible(true);
      page4.add(musiconbutton4);

   }

   public void setpanel5() { // 페이지5 설정
      // 패널5 설정
      page5.setBounds(0, 0, 1000, 700);// 패널2의 위치 설정
      page5.setLayout(null);// 레이아웃 설정
      page5.setVisible(false);// 창이 보이지 않게
      getContentPane().add(page5);// 프레임에 패널을 추가
      // 뒤로가기 버튼 설정
      back3.setBounds(0, 610, 100, 50);
      back3.setBorderPainted(false);
      back3.setContentAreaFilled(false);
      back3.setFocusPainted(false);
      page5.add(back3);

      musiconbutton5.setContentAreaFilled(false);
      musiconbutton5.setBounds(0, 0, 80, 80);
      musiconbutton5.setBorderPainted(true);
      musiconbutton5.setSelectedIcon(musicoffimg); // 체크박스 이미지
      musiconbutton5.setVisible(true);
      page5.add(musiconbutton5);

      getContentPane().add(page5);// 프레임에 패널을 추가

   }

   public void setbackbutton(JButton btn) {
      btn.setVisible(true);
      btn.setBorderPainted(false);
      btn.setContentAreaFilled(false);
      btn.setFocusPainted(false);
      btn.setBounds(0, 610, 100, 50);
   }

   public void settourpage() {
      setbackbutton(backtour0);
      setbackbutton(backtour1);
      setbackbutton(backtour2);
      setbackbutton(backtour3);
      setbackbutton(backtour4);
      setbackbutton(backtour5);
      setbackbutton(backtour6);
      setbackbutton(backtour7);
      setbackbutton(backtour8);
      setbackbutton(backtour9);
      tourpage.add(backtour0);
      Hanokpage.add(backtour1);
      zoopage.add(backtour2);
      Gaeksapage.add(backtour3);
      Deokjinpage.add(backtour4);
      Sumokpage.add(backtour5);
      Palbokpage.add(backtour6);
      Jeosujipage.add(backtour7);
      Makgolpage.add(backtour8);
      Changuipage.add(backtour9);
      tourpage.setBounds(0, 0, 1000, 700);
      tourpage.setLayout(null);// 레이아웃 설정
      tourpage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(tourpage);// 프레임에 패널을 추가
      tourpage.add(backtour0);

      Hanokbutton.setBounds(754, 85, 220, 167);
      Hanokbutton.setBorderPainted(true);
      Hanokbutton.setVisible(true);
      tourpage.add(Hanokbutton);

      Changuibutton.setBounds(22, 265, 220, 167);
      Changuibutton.setBorderPainted(true);
      Changuibutton.setVisible(true);
      tourpage.add(Changuibutton);

      Sumokbutton.setBounds(267, 265, 220, 167);
      Sumokbutton.setBorderPainted(true);
      Sumokbutton.setVisible(true);
      tourpage.add(Sumokbutton);

      Makgolbutton.setBounds(511, 265, 220, 167);
      Makgolbutton.setBorderPainted(true);
      Makgolbutton.setVisible(true);
      tourpage.add(Makgolbutton);

      Jeosujibutton.setBounds(754, 265, 220, 167);
      Jeosujibutton.setBorderPainted(true);
      Jeosujibutton.setVisible(true);
      tourpage.add(Jeosujibutton);

      Deokjinbutton.setBounds(22, 445, 220, 167);
      Deokjinbutton.setBorderPainted(true);
      Deokjinbutton.setVisible(true);
      tourpage.add(Deokjinbutton);

      Gaeksabutton.setBounds(267, 445, 220, 167);
      Gaeksabutton.setBorderPainted(true);
      Gaeksabutton.setVisible(true);
      tourpage.add(Gaeksabutton);

      Palbokbutton.setBounds(511, 445, 220, 167);
      Palbokbutton.setBorderPainted(true);
      Palbokbutton.setVisible(true);
      tourpage.add(Palbokbutton);

      Zoobutton.setBounds(754, 445, 220, 167);
      Zoobutton.setBorderPainted(true);
      Zoobutton.setVisible(true);
      tourpage.add(Zoobutton);

      musiconbutton6.setContentAreaFilled(false);
      musiconbutton6.setBounds(0, 0, 80, 80);
      musiconbutton6.setBorderPainted(true);
      musiconbutton6.setSelectedIcon(musicoffimg); // 체크박스 이미지
      musiconbutton6.setVisible(true);
      tourpage.add(musiconbutton6);

      Hanokpage.setBounds(0, 0, 1000, 700);
      Hanokpage.setLayout(null);// 레이아웃 설정
      Hanokpage.setVisible(false);
      getContentPane().add(Hanokpage);// 프레임에 패널을 추가
      zoopage.setBounds(0, 0, 1000, 700);
      zoopage.setLayout(null);// 레이아웃 설정
      zoopage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(zoopage);// 프레임에 패널을 추가
      Gaeksapage.setBounds(0, 0, 1000, 700);
      Gaeksapage.setLayout(null);// 레이아웃 설정
      Gaeksapage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(Gaeksapage);// 프레임에 패널을 추가
      Deokjinpage.setBounds(0, 0, 1000, 700);
      Deokjinpage.setLayout(null);// 레이아웃 설정
      Deokjinpage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(Deokjinpage);// 프레임에 패널을 추가
      Sumokpage.setBounds(0, 0, 1000, 700);
      Sumokpage.setLayout(null);// 레이아웃 설정
      Sumokpage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(Sumokpage);// 프레임에 패널을 추가
      Palbokpage.setBounds(0, 0, 1000, 700);
      Palbokpage.setLayout(null);// 레이아웃 설정
      Palbokpage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(Palbokpage);// 프레임에 패널을 추가
      Jeosujipage.setBounds(0, 0, 1000, 700);
      Jeosujipage.setLayout(null);// 레이아웃 설정
      Jeosujipage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(Jeosujipage);// 프레임에 패널을 추가
      Makgolpage.setBounds(0, 0, 1000, 700);
      Makgolpage.setLayout(null);// 레이아웃 설정
      Makgolpage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(Makgolpage);// 프레임에 패널을 추가
      Changuipage.setBounds(0, 0, 1000, 700);
      Changuipage.setLayout(null);// 레이아웃 설정
      Changuipage.setVisible(false);// 창이 보이지 않게
      getContentPane().add(Changuipage);// 프레임에 패널을 추가
   }

   public void cg() {
      Hanokbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            Hanokpage.setVisible(true);
         }
      });
      Zoobutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            zoopage.setVisible(true);// 창이 안보이게
         }
      });
      Gaeksabutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            Gaeksapage.setVisible(true);// 창이 안보이게
         }
      });
      Deokjinbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            Deokjinpage.setVisible(true);// 창이 안보이게
         }
      });
      Sumokbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            Sumokpage.setVisible(true);// 창이 안보이게
         }
      });
      Palbokbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            Palbokpage.setVisible(true);// 창이 안보이게
         }
      });
      Jeosujibutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            Jeosujipage.setVisible(true);// 창이 안보이게
         }
      });
      Makgolbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            Makgolpage.setVisible(true);// 창이 안보이게
         }
      });
      Changuibutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            Changuipage.setVisible(true);// 창이 안보이게
         }
      });
      busButton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            Runtime rtm = Runtime.getRuntime();
            try {
               rtm.exec("c:/Program Files/Internet Explorer/iexplore.exe "
                     + "https://m.map.naver.com/directions/#/main/%25EC%25A0%2584%25EC%25A3%25BC%25EA%25B3%25A0%25EC%2586%258D%25EB%25B2%2584%25EC%258A%25A4%25ED%2584%25B0%25EB%25AF%25B8%25EB%2584%2590,127.1292061,35.8345597,127.1289579,35.8352925,false,11815660/");
            } catch (java.io.IOException ee) {
            }
         }
      });

      startbutton1.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(true);// 창이 보이게
            page2.setVisible(false); // 창이 안보이게
            page3.setVisible(false); // 창이 안보이게
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
         }
      });

      startbutton2.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(false);// 창이 보이게
            page2.setVisible(false); // 창이 안보이게
            page3.setVisible(false); // 창이 안보이게
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
         }
      });

      backtour0.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(false);
            page0.setVisible(true);

         }
      });

      backtour1.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });
      backtour2.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });
      backtour3.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });
      backtour4.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });
      backtour5.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });
      backtour6.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });
      backtour7.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });
      backtour8.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });
      backtour9.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            tourpage.setVisible(true);
            Hanokpage.setVisible(false);
            zoopage.setVisible(false);
            Gaeksapage.setVisible(false);
            Deokjinpage.setVisible(false);
            Sumokpage.setVisible(false);
            Palbokpage.setVisible(false);
            Jeosujipage.setVisible(false);
            Makgolpage.setVisible(false);
            Changuipage.setVisible(false);
         }
      });

      couplebutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            good1.setVisible(true);
            good2.setVisible(false);
            good3.setVisible(false);
            good4.setVisible(true);
            good5.setVisible(false);
            good6.setVisible(false);
            good7.setVisible(false);
            good8.setVisible(false);
            good9.setVisible(false);
            checkbox1.setSelected(false);
            checkbox2.setSelected(false);
            checkbox3.setSelected(false);
            checkbox4.setSelected(false);
            checkbox5.setSelected(false);
            checkbox6.setSelected(false);
            checkbox7.setSelected(false);
            checkbox8.setSelected(false);
            checkbox9.setSelected(false);
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(false);// 창이 안보이게
            page2.setVisible(true); // 창이 보이게
            page3.setVisible(false); // 창이 안보이게
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
         }
      });

      friendbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            good1.setVisible(false);
            good2.setVisible(false);
            good3.setVisible(false);
            good4.setVisible(true);
            good5.setVisible(false);
            good6.setVisible(false);
            good7.setVisible(false);
            good8.setVisible(true);
            good9.setVisible(false);
            checkbox1.setSelected(false);
            checkbox2.setSelected(false);
            checkbox3.setSelected(false);
            checkbox4.setSelected(false);
            checkbox5.setSelected(false);
            checkbox6.setSelected(false);
            checkbox7.setSelected(false);
            checkbox8.setSelected(false);
            checkbox9.setSelected(false);
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(false);// 창이 안보이게
            page2.setVisible(true); // 창이 보이게
            page3.setVisible(false); // 창이 안보이게
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
         }
      });

      oldbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            good1.setVisible(false);
            good2.setVisible(false);
            good3.setVisible(false);
            good4.setVisible(false);
            good5.setVisible(false);
            good6.setVisible(false);
            good7.setVisible(false);
            good8.setVisible(false);
            good9.setVisible(false);
            checkbox1.setSelected(false); // 선택한 상태로 설정
            checkbox2.setSelected(false); // 선택한 상태로 설정
            checkbox3.setSelected(false); // 선택한 상태로 설정
            checkbox4.setSelected(false); // 선택한 상태로 설정
            checkbox5.setSelected(false); // 선택한 상태로 설정
            checkbox6.setSelected(false); // 선택한 상태로 설정
            checkbox7.setSelected(false); // 선택한 상태로 설정
            checkbox8.setSelected(false); // 선택한 상태로 설정
            checkbox9.setSelected(false); // 선택한 상태로 설정
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(false);// 창이 안보이게
            page2.setVisible(true); // 창이 보이게
            page3.setVisible(false); // 창이 안보이게
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
         }
      });

      familybutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            good1.setVisible(false);
            good2.setVisible(false);
            good3.setVisible(false);
            good4.setVisible(false);
            good5.setVisible(false);
            good6.setVisible(true);
            good7.setVisible(false);
            good8.setVisible(false);
            good9.setVisible(true);
            checkbox1.setSelected(false); // 선택한 상태로 설정
            checkbox2.setSelected(false); // 선택한 상태로 설정
            checkbox3.setSelected(false); // 선택한 상태로 설정
            checkbox4.setSelected(false); // 선택한 상태로 설정
            checkbox5.setSelected(false); // 선택한 상태로 설정
            checkbox6.setSelected(false); // 선택한 상태로 설정
            checkbox7.setSelected(false); // 선택한 상태로 설정
            checkbox8.setSelected(false); // 선택한 상태로 설정
            checkbox9.setSelected(false); // 선택한 상태로 설정
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(false);// 창이 안보이게
            page2.setVisible(true); // 창이 보이게
            page3.setVisible(false); // 창이 안보이게
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
         }
      });

      backbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(false); // 창이 안보이게
            page1.setVisible(true); // 창이 보이게
            page2.setVisible(false); // 창이 안보이게
            page3.setVisible(false); // 창이 안보이게
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
         }
      });

      next.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(false); // 창이 안보이게
            page2.setVisible(false); // 창이 안보이게
            page3.setVisible(true); // 창이 보이게
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
         }
      });

      back1.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(false);
            page1.setVisible(false);
            page2.setVisible(true);
            page3.setVisible(false);
            page4.setVisible(false);
            page5.setVisible(false);
         }
      });
      back0.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(true);
            page1.setVisible(false);
            page2.setVisible(false);
            page3.setVisible(false);
            page4.setVisible(false);
            page5.setVisible(false);
         }
      });
      terminalbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(false);
            page1.setVisible(false);// 창이 안보이게
            page2.setVisible(false); // 창 안보이게
            page3.setVisible(false); // 창 안보이게
            page4.setVisible(true); // 창이 보이게
            page5.setVisible(false); // 창이 안보이게
            pingterminal.setVisible(true);
            pingtrain.setVisible(false);
            pingList.get(10).setYN(true);
            routeset("터미널");
         }
      });

      trainbutton.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(false);// 창이 안보이게
            page2.setVisible(false); // 창 안보이게
            page3.setVisible(false); // 창 안보이게
            page4.setVisible(true); // 창 보이게
            page5.setVisible(false); // 창이 안보이게
            pingtrain.setVisible(true);
            pingterminal.setVisible(false);
            pingList.get(9).setYN(true);
            routeset("기차역");
         }
      });

      back2.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(false);
            page2.setVisible(false);
            page3.setVisible(true);
            page4.setVisible(false); // 창이 안보이게
            page5.setVisible(false); // 창이 안보이게
            pingLinke.clear();
         }
      });

      back3.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            page0.setVisible(false);// 창이 안보이게
            page1.setVisible(false);
            page2.setVisible(false);
            page3.setVisible(false);
            page4.setVisible(true); // 창이 보이게
            page5.setVisible(false);
         }
      });
      ping1.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null,
                  "전주한옥마을\r\n" + "\r\n" + "전화 : 063-282-1330\r\n" + "주소 : 전북 전주시 완산구 기린대로 99\r\n" + "\r\n"
                        + "-운영시간\r\n" + "매일 00:00 ~ 24:00\r\n" + "\r\n" + "-요금\r\n" + "무료\r\n" + "\r\n"
                        + "전주경기전\r\n" + "\r\n" + "-운영시간\r\n" + "3월 ~10월 : 09:00 ~ 19:00\r\n"
                        + "11월~2월  : 09:00 ~ 18:00\r\n" + "\r\n" + "-요금\r\n" + "어른    3,000원\r\n"
                        + "군인    2,000원\r\n" + "청소년 2,000원\r\n" + "대학생 2,000원\r\n" + "어린이 1,000원\r\n" + "",
                  "한옥마을", JOptionPane.PLAIN_MESSAGE);
         }
      });

      ping2.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null,
                  "전화 : 063-281-6759\r\n" + "주소 : 전북 전주시 덕진구 소리로 68 전주동물원\r\n" + "\r\n"
                        + "- 운영시간(입장마감 1시간전)    드림랜드(놀이공원)\r\n" + "3월~10월 : 09:00 ~ 18:00    10:00 ~ 18:00\r\n"
                        + "11월~2월 : 09:00 ~ 17:00   10:00 ~ 18:00\r\n" + "\r\n" + "-요금\r\n" + "일반 1,300원\r\n"
                        + "청소년 600원\r\n" + "어린이 400원\r\n" + "군인 600원\r\n" + "\r\n" + "",
                  "동물원", JOptionPane.PLAIN_MESSAGE);
         }
      });

      ping3.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null,
                  "만남의 장소, 풍패지관\r\n" + "\r\n" + "063-281-2787\r\n" + "전주시 완산구 충경로 59 전주풍패지관(객사)\r\n" + "\r\n"
                        + "풍패지관은 조선 초 전주부성을 창건할 때 같이 지은 것으로 추청된다.\r\n"
                        + "그 뒤 성종3년(1473)에 전부윤 조근이 전주사고를 창설할 때 남은 재력으로\r\n" + "객사를 개축했다는 기록있다.\r\n"
                        + " 현재는 근처에 다향한 먹거리와 유명한 맛집들이 많다.",
                  "객사", JOptionPane.PLAIN_MESSAGE);
         }
      });

      ping4.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null,
                  "덕진공원\r\n" + "\r\n" + "전화 : 063-239-2607\r\n" + "주소 : 전북 전주시 덕진구 권삼득로 390 전주덕진공원\r\n" + "\r\n"
                        + "- 운영시간\r\n" + "매일 00:00 ~ 24:00\r\n" + "\r\n" + "-요금\r\n" + "무료",
                  "덕진공원", JOptionPane.PLAIN_MESSAGE);
         }
      });

      ping5.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null,
                  "한국도로공사 전주수목원\r\n" + "\r\n" + "전화 : 063-714-7200\r\n" + "주소 : 전북 전주시 덕진구 462-45 전주수목원\r\n"
                        + "\r\n" + "-운영시간\r\n" + "9월16일 ~ 3월 14일 : 09:00 ~ 18:00\r\n"
                        + "3월15일 ~ 9월 15일 : 09:00 ~ 19:00\r\n" + "월요일, 설날, 추석휴무\r\n" + "\r\n" + "-요금\r\n"
                        + "무료",
                  "수목원", JOptionPane.PLAIN_MESSAGE);
         }
      });

      ping6.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null,
                  "팔복예술공장 (복합문화공간)\r\n" + "\r\n" + "전화 : 063-211-0288\r\n" + "주소 : 전북 전주시 덕진구 구렛들 1길 46 \r\n"
                        + "\r\n" + "-운영시간(입장마감 17:30)\r\n" + "매일 10:00 ~ 18:00 - 전시장\r\n"
                        + "매일 10:00 ~ 19:00 - 카페써니\r\n" + "매일 11:30 ~ 14:30 - 써니부엌\r\n"
                        + "월요일 휴무 설,추석 당일 휴무\r\n" + "",
                  "팔복예술공장", JOptionPane.PLAIN_MESSAGE);
         }
      });

      ping7.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null,
                  "아중호수\r\n" + "\r\n" + "주소 : 전북 전주시 덕진구 우아동1가\r\n" + "\r\n" + "- 운영시간\r\n"
                        + "매일 00:00 ~ 24:00\r\n" + "\r\n" + "-요금\r\n" + "무료",
                  "아중저수지", JOptionPane.PLAIN_MESSAGE);
         }
      });

      ping8.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null, "막걸리골목\r\n" + "\r\n" + "주소 : 전북 전주시 완산구 삼천동 1가\r\n");
         }
      });

      ping9.addMouseListener(new MouseAdapter() { // 마우스 이벤트
         @Override
         public void mousePressed(MouseEvent e) { // 클릭했을때
            JOptionPane.showMessageDialog(null,
                  "전라북도어린이창의체험관\r\n" + "\r\n" + "전화 : 063-277-6660\r\n"
                        + "주소 : 전북 전주시 덕진구 조경단로 258-18 어린이창의체험관\r\n" + "\r\n" + "-운영시간\r\n"
                        + "09:30 ~ 17~00\r\n" + "월요일, 설날, 추석, 1월1일 휴무\r\n" + "\r\n" + "-요금\r\n"
                        + "개인  3,000원\r\n" + "-운영방식 : 회차별 운영 \r\n" + "-예매방법 : 온라인",
                  "창의체험관", JOptionPane.PLAIN_MESSAGE);
         }
      });

      musiconbutton.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               introMusic.close();
            }
            else {
               introMusic = new Music("배경음악.mp3", true);
               introMusic.start();
            }
         }
      });

      musiconbutton1.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               introMusic.close();
            }
            else {
               introMusic = new Music("배경음악.mp3", true);
               introMusic.start();
            }
         }
      });
      musiconbutton2.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               introMusic.close();
            }
            else {
               introMusic = new Music("배경음악.mp3", true);
               introMusic.start();
            }
         }
      });
      musiconbutton3.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               introMusic.close();
            }
            else {
               introMusic = new Music("배경음악.mp3", true);
               introMusic.start();
            }
         }
      });
      musiconbutton4.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               introMusic.close();
            }
            else {
               introMusic = new Music("배경음악.mp3", true);
               introMusic.start();
            }
         }
      });
      musiconbutton5.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               introMusic.close();
            }
            else {
               introMusic = new Music("배경음악.mp3", true);
               introMusic.start();
            }
         }
      });
      musiconbutton6.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               introMusic.close();
            }
            else {
               introMusic = new Music("배경음악.mp3", true);
               introMusic.start();
            }
         }
      });
      musiconbutton7.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               introMusic.close();
            }
            else {
               introMusic = new Music("배경음악.mp3", true);
               introMusic.start();
            }
         }
      });
   }

   class MyItemListener implements ItemListener {
      @Override
      public void itemStateChanged(ItemEvent e) {
         if (e.getStateChange() == ItemEvent.SELECTED) {
            if (e.getItem() == spot[0]) {
               ping1.setVisible(true);
               pingList.get(0).setYN(true);
            } else if (e.getItem() == spot[1]) {
               ping2.setVisible(true);
               pingList.get(1).setYN(true);
            } else if (e.getItem() == spot[2]) {
               ping3.setVisible(true);
               pingList.get(2).setYN(true);
            } else if (e.getItem() == spot[3]) {
               ping4.setVisible(true);
               pingList.get(3).setYN(true);
            } else if (e.getItem() == spot[4]) {
               ping5.setVisible(true);
               pingList.get(4).setYN(true);
            } else if (e.getItem() == spot[5]) {
               ping6.setVisible(true);
               pingList.get(5).setYN(true);
            } else if (e.getItem() == spot[6]) {
               ping7.setVisible(true);
               pingList.get(6).setYN(true);
            } else if (e.getItem() == spot[7]) {
               ping8.setVisible(true);
               pingList.get(7).setYN(true);
            } else if (e.getItem() == spot[8]) {
               ping9.setVisible(true);
               pingList.get(8).setYN(true);
            }
         } else {
            if (e.getItem() == spot[0]) {
               ping1.setVisible(false);
               pingList.get(0).setYN(false);
            } else if (e.getItem() == spot[1]) {
               ping2.setVisible(false);
               pingList.get(1).setYN(false);
            } else if (e.getItem() == spot[2]) {
               ping3.setVisible(false);
               pingList.get(2).setYN(false);
            } else if (e.getItem() == spot[3]) {
               ping4.setVisible(false);
               pingList.get(3).setYN(false);
            } else if (e.getItem() == spot[4]) {
               ping5.setVisible(false);
               pingList.get(4).setYN(false);
            } else if (e.getItem() == spot[5]) {
               ping6.setVisible(false);
               pingList.get(5).setYN(false);
            } else if (e.getItem() == spot[6]) {
               ping7.setVisible(false);
               pingList.get(6).setYN(false);
            } else if (e.getItem() == spot[7]) {
               ping8.setVisible(false);
               pingList.get(7).setYN(false);
            } else if (e.getItem() == spot[8]) {
               ping9.setVisible(false);
               pingList.get(8).setYN(false);
            }
         }
      }
   }

   public void setping() { // 핑 데이터 셋팅
      pingList.add(new pingdata("한옥마을", 390, 391, false));
      pingList.add(new pingdata("동물원", 352, 265, false));
      pingList.add(new pingdata("객사", 345, 382, false));
      pingList.add(new pingdata("덕진공원", 305, 265, false));
      pingList.add(new pingdata("수목원", 146, 230, false));
      pingList.add(new pingdata("팔복예술공장", 252, 230, false));
      pingList.add(new pingdata("아중저수지", 430, 391, false));
      pingList.add(new pingdata("막걸리골목", 290, 450, false));
      pingList.add(new pingdata("창의체험관", 331, 246, false));
      pingList.add(new pingdata("기차역", 385, 270, false));
      pingList.add(new pingdata("터미널", 315, 310, false));
   }

   public void routeset(String spot) {
      // 시작 지점과의 거리를 모두 구함 -> 가장 짧은 거리를 다음 시작지점으로 만듬 , 다음 시작지점이 된 장소는 false로 바꿔줌 ->
      int startindex = 0;
      boolean isyn[] = new boolean[] { false, false, false, false, false, false, false, false, false, false, false };
      for (int i = 0; i < pingList.size(); i++) { // 시작장소 인덱스 넣기
         if (pingList.get(i).getspot() == spot && pingList.get(i).isYN() == true) {
            startindex = i;
         }
      }
      int count = 0;
      for (int i = 0; i < pingList.size(); i++) {
         if (pingList.get(i).isYN() == true) {
            isyn[i] = true;
            count++;
         }
      }

      while (true) { // 모든 장소의 boolean 값이 false이면 종료
         count--;
         int newstartindex = 0;
         pingLinke.add(new pingdata(pingList.get(startindex).getspot())); // 경로 순서대로 추가
         double min = 1000000000;
         if (count == 0) {
            return;
         }

         for (int i = 0; i < pingList.size(); i++) { // 시작 장소와 가장 가까운 장소 찾기
            if (i != startindex && isyn[i] == true) {
               if (pingList.get(i).getspot() == "기차역") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;
                  }
               }
               if (pingList.get(i).getspot() == "터미널") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;
                  }
               }
               if (pingList.get(i).getspot() == "한옥마을") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
               if (pingList.get(i).getspot() == "동물원") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
               if (pingList.get(i).getspot() == "객사") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
               if (pingList.get(i).getspot() == "덕진공원") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
               if (pingList.get(i).getspot() == "수목원") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
               if (pingList.get(i).getspot() == "팔복예술공장") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
               if (pingList.get(i).getspot() == "아중저수지") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
               if (pingList.get(i).getspot() == "막걸리골목") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
               if (pingList.get(i).getspot() == "창의체험관") {
                  if (min > Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                        pingList.get(i).getX(), pingList.get(i).getY())) {
                     min = Distance(pingList.get(startindex).getX(), pingList.get(startindex).getY(),
                           pingList.get(i).getX(), pingList.get(i).getY());
                     newstartindex = i;

                  }
               }
            }
         }

         isyn[startindex] = false;
         startindex = newstartindex;
      }
   }

   public static double Distance(double x1, double y1, double x2, double y2) { // 두 지점의 거리 구하기
      return Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
   }

   public static void main(String[] args) {
      new Main();// 실행
   }
}