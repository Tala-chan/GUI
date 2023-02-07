import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("Kanika idea.png");
        Font RetGanon = null;

        try{
            RetGanon = Font.createFont(Font.TRUETYPE_FONT, new File("RetGanon.ttf")).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("RetGanon.ttf")));
        }
        catch(IOException | FontFormatException e){}

        JLabel label = new JLabel();
        label.setText("Do you even lift bro?");
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.blue);
        label.setFont(RetGanon);

        MyFrame myFrame = new MyFrame();
        myFrame.add(label);
    }
}
