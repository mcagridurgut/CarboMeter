package gui;
import gui.Controller.*;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {
        Gui gui = new Gui();
        //gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setUndecorated(true);
        gui.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        gui.setBounds( (width-1280)/2, (height-720)/2, 1280, 720  );
        gui.setVisible(true);
        gui.setResizable(false);

    }
}
