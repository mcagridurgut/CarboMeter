import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JSlider;
import java.awt.Cursor;
import java.awt.Component;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class WindowTest {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WindowTest window = new WindowTest();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public WindowTest() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.getContentPane().setLayout(null);

        JPanel panel111 = new JPanel();
        panel111.setBounds(0, 0, 600, 111);
        panel111.setBackground(new Color(0, 255, 255));
        frame.getContentPane().add(panel111);
        panel111.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(240, 255, 240));
        panel_1.setBounds(26, 21, 543, 90);
        panel111.add(panel_1);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(224, 255, 255));
        panel.setBounds(0, 111, 600, 189);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(240, 255, 255));
        panel_2.setBounds(24, 0, 545, 131);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.setBounds(95, 5, 268, 115);
        panel_2.add(tabbedPane);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 100, 0));
        tabbedPane.addTab("New tab", null, panel_3, null);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(153, 50, 204));
        tabbedPane.addTab("New tab", null, panel_4, null);

        JPanel panel_5 = new JPanel();
        panel_5.setBackground(new Color(0, 0, 255));
        tabbedPane.addTab("New tab", null, panel_5, null);
    }
}
