package gui;
import gui.Controller.*;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {

        // initialization of the Carbometer frame
        Gui gui = new Gui();


        // makes the frame borderless
        gui.setUndecorated(true);
        gui.getRootPane().setWindowDecorationStyle(JRootPane.NONE);

        // alignment that puts the frame into the middle of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        gui.setBounds( (width-1280)/2, (height-720)/2, 1280, 720  );

        // frame visibility and resizability
        gui.setVisible(true);
        gui.setResizable(false);

    }
}
