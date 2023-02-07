import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setSize(420,420);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Kanika fanclub");
        ImageIcon image = new ImageIcon("Kanika ;-; (3).jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.lightGray);
        this.setVisible(true);
    }
}
