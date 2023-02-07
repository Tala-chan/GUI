import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("Kanika idea.png");

        JLabel label = new JLabel();
        label.setText("Do you even lift bro?");
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.blue);
        label.setFont(new Font("RetGanon.ttf", Font.PLAIN,20));

        MyFrame myFrame = new MyFrame();
        myFrame.add(label);
    }
}