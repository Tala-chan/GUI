import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MyLabel extends JLabel{
    MyLabel(){
        ImageIcon image = new ImageIcon("Kanika idea.png");
        Border border = BorderFactory.createDashedBorder(Color.blue,3,2,2,false);
        Font RetGanon = null;
        try{
            RetGanon = Font.createFont(Font.TRUETYPE_FONT, new File("RetGanon.ttf")).deriveFont(30f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("RetGanon.ttf")));
        }
        catch(IOException | FontFormatException e){}

        this.setText("Do you even lift bro?");
        this.setIcon(image);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(Color.blue);
        this.setFont(RetGanon);
        this.setBorder(border);

        MyFrame myFrame = new MyFrame();
        myFrame.add(this);
    }
}
