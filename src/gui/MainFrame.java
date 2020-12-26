package gui;
import gui.Controller.*;

import javax.swing.*;

public class MainFrame {
    public static void main(String[] args) {
        Gui gui = new Gui();
        //gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setUndecorated(true);
        gui.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        gui.setSize(1280,720);
        gui.setVisible(true);
        gui.setResizable(false);

    }
}
