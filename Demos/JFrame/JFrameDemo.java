//Import the JFrame class
import javax.swing.JFrame;

public class JFrameDemo {
    public static void main(String[] args) {
        //Create a new JFrame variable
        JFrame frame = new JFrame();

        //Set the frame size to be 300 pixels by 300 pixels
        frame.setSize(300, 300);
        //Notify the application to exit when the JFrame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Tells the JFrame to become visible
        frame.setVisible(true);
    }
}
