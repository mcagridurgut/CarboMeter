package gui.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Normal user home panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */
public class NormalUserHomePanel extends javax.swing.JPanel {

    // Properties of the normal user home panel
    private JLabel background;
    public JButton challengesButton;
    public JButton donationButton;
    public JButton friendsButton;
    public JButton logOutButton;
    public JButton newReportButton;
    private JLabel normalHomeLabel;
    public JButton oldReportButton;
    public JButton recommendationsButton;

    /**
     * constructor of the class
     */
    public NormalUserHomePanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        normalHomeLabel = new JLabel();
        newReportButton = new JButton();
        oldReportButton = new JButton();
        donationButton = new JButton();
        challengesButton = new JButton();
        friendsButton = new JButton();
        recommendationsButton = new JButton();
        logOutButton = new JButton();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // normal home label alignment (background, font, foreground, text and position)
        normalHomeLabel.setBackground(new Color(255, 255, 255));
        normalHomeLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        normalHomeLabel.setForeground(new Color(255, 255, 255));
        normalHomeLabel.setText("HOME");
        add(normalHomeLabel);
        normalHomeLabel.setBounds(575, 80, 130, 60);

        // new report button alignment (font, icon, text and position)
        newReportButton.setFont(new Font("Arial", 0, 24)); // NOI18N
        newReportButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/report.png"))); // NOI18N
        newReportButton.setText("Create a New Report");
        newReportButton.setMaximumSize(new Dimension(200, 37));
        newReportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newReportButtonActionPerformed(evt);
            }
        });
        add(newReportButton);
        newReportButton.setBounds(440, 210, 400, 50);

        // old report button alignment (font, icon, text and position)
        oldReportButton.setFont(new Font("Arial", 0, 24)); // NOI18N
        oldReportButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/seo-report.png"))); // NOI18N
        oldReportButton.setText("My Old Reports");
        oldReportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                oldReportButtonActionPerformed(evt);
            }
        });
        add(oldReportButton);
        oldReportButton.setBounds(440, 280, 400, 50);

        // donation button alignment (font, icon, text and position)
        donationButton.setFont(new Font("Arial", 0, 24)); // NOI18N
        donationButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/heart.png"))); // NOI18N
        donationButton.setText("Donations");
        add(donationButton);
        donationButton.setBounds(440, 420, 400, 50);

        // challenges button alignment (font, icon, text and position)
        challengesButton.setFont(new Font("Arial", 0, 24)); // NOI18N
        challengesButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/note.png"))); // NOI18N
        challengesButton.setText("Challenges");
        challengesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                challangesButtonActionPerformed(evt);
            }
        });
        add(challengesButton);
        challengesButton.setBounds(440, 350, 400, 50);

        // friends button alignment (font, icon, text and position)
        friendsButton.setFont(new Font("Arial", 0, 24)); // NOI18N
        friendsButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/friends.png"))); // NOI18N
        friendsButton.setText("Friends");
        friendsButton.setToolTipText("");
        add(friendsButton);
        friendsButton.setBounds(440, 490, 400, 50);

        // recommendations button alignment (font, icon, text and position)
        recommendationsButton.setFont(new Font("Arial", 0, 24)); // NOI18N
        recommendationsButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/star.png"))); // NOI18N
        recommendationsButton.setText("Reccommendations");
        add(recommendationsButton);
        recommendationsButton.setBounds(440, 560, 400, 50);

        // logout button alignment (font, icon, text and position)
        logOutButton.setFont(new Font("Arial", 0, 12)); // NOI18N
        logOutButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/door.png"))); // NOI18N
        logOutButton.setText("Log Out");
        add(logOutButton);
        logOutButton.setBounds(1140, 30, 110, 35);

        // background alignment ( icon and positioning)
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    /**
     * newReportButton action performed method. check the gui class.
     * @param evt action event
     */
    private void newReportButtonActionPerformed(ActionEvent evt) {

    }

    /**
     * oldReportButton action performed method. check the gui class.
     * @param evt action event
     */
    private void oldReportButtonActionPerformed(ActionEvent evt) {

    }

    /**
     * challengesButton action performed method. check the gui class.
     * @param evt action event
     */
    private void challangesButtonActionPerformed(ActionEvent evt) {

    }



}
