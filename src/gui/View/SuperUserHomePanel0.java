package gui.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * super user home panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class SuperUserHomePanel0 extends JPanel {

    // Properties of the sign up panel
    private JLabel background;
    public JButton challengesButton;
    public JButton logOutButton;
    public JButton newCodeButton;
    private JLabel superHomeLabel;
    public JButton totalDonationsButton;
    public JButton usersButton;

    /**
     * constructor of the class
     */
    public SuperUserHomePanel0() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        usersButton = new JButton();
        superHomeLabel = new JLabel();
        challengesButton = new JButton();
        totalDonationsButton = new JButton();
        newCodeButton = new JButton();
        logOutButton = new JButton();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // users button alignment (font, icon, text and position)
        usersButton.setFont(new Font("Arial", 0, 24));
        usersButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/world-grid.png")));
        usersButton.setText("Users");
        add(usersButton);
        usersButton.setBounds(440, 230, 400, 60);

        // super home label alignment (background, font, foreground, text and position)
        superHomeLabel.setBackground(new Color(255, 255, 255));
        superHomeLabel.setFont(new Font("Calibri", 1, 48));
        superHomeLabel.setForeground(new Color(255, 255, 255));
        superHomeLabel.setText("HOME");
        add(superHomeLabel);
        superHomeLabel.setBounds(575, 80, 130, 60);

        // challenges button alignment (font, icon, text and position)
        challengesButton.setFont(new Font("Arial", 0, 24));
        challengesButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/note.png")));
        challengesButton.setText("Challenges");
        add(challengesButton);
        challengesButton.setBounds(440, 390, 400, 60);

        // total donations button alignment (font, icon, text and position)
        totalDonationsButton.setFont(new Font("Arial", 0, 24));
        totalDonationsButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/donation.png")));
        totalDonationsButton.setText("Total Donations");
        totalDonationsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                totalDonationsButtonActionPerformed(evt);
            }
        });
        add(totalDonationsButton);
        totalDonationsButton.setBounds(440, 310, 400, 60);

        // new code button alignment (font, icon, text and position)
        newCodeButton.setFont(new Font("Arial", 0, 24));
        newCodeButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/key.png")));
        newCodeButton.setText("Create New Code");
        add(newCodeButton);
        newCodeButton.setBounds(440, 470, 400, 60);

        // log out button alignment (font, icon, text and position)
        logOutButton.setFont(new Font("Arial", 0, 12));
        logOutButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/door.png")));
        logOutButton.setText("Log Out");
        add(logOutButton);
        logOutButton.setBounds(1140, 30, 110, 35);

        // background alignment (icon and positioning)
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        background.setToolTipText("");
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1282, 700);
    }

    /**
     * total donations button action performed method. check the gui class.
     * @param evt action event
     */
    private void totalDonationsButtonActionPerformed(ActionEvent evt) {
    }



}
