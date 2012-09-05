package Demos.Opacity;

import java.awt.*;
import javax.swing.*;

//Needed to determine if the graphics card can handle the translucency
import static java.awt.GraphicsDevice.WindowTranslucency.*;

public class Example extends JFrame {
    public Example() {
        super();

        //Set the size of the frame
        setSize(300, 300);

        //Notify the application to exit when JFrame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Sets the translucency
        setOpacity(0.5f);

        //Tells the JFrame to become visible
        setVisible(true);
    }

    public static void main(String[] args) {
        //Get the graphics environment
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        //Get the graphics card for the current screen
        GraphicsDevice gd = ge.getDefaultScreenDevice();

        //Verify that Translucency is allowed on the graphics card
        if(gd.isWindowTranslucencySupported(TRANSLUCENT)) {
            //Notify all future JFrames to have their default borders and appearances
            //Needed for setting the opacity and must happen before the JFrame is created
            JFrame.setDefaultLookAndFeelDecorated(true);

            Example ex = new Example();
        }
    }
}
