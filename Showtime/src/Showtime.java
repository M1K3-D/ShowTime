import java.util.Date;
import javax.swing.*;

public class Showtime {

   public static void main(String[] args) {
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setTitle("It is Showtime!");
      f.getContentPane().add(new JLabel(new Date().toString()));
      f.pack();
      f.setVisible(true);
      }

}