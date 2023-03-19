import javax.swing.*;

public class Frame extends JFrame {
    Frame(){
        // panel class would be made later adding panel to frame ;
        this.add(new panel());
        // naming the frame window
        this .setTitle("SnakeGame");
        //not allow window to resize the window to make window uniform size
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
    }
}
