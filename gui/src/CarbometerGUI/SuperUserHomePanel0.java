package gui;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class SuperUserHomePanel0 extends javax.swing.JPanel {

    public SuperUserHomePanel0() {
        initComponents();
    }

    private void initComponents() {

        usersButton = new javax.swing.JButton();
        superHomeLabel = new javax.swing.JLabel();
        challengesButton = new javax.swing.JButton();
        totalDonationsButton = new javax.swing.JButton();
        newCodeButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        usersButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        usersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/world-grid.png"))); // NOI18N
        usersButton.setText("Users");
        add(usersButton);
        usersButton.setBounds(440, 230, 400, 60);

        superHomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        superHomeLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        superHomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        superHomeLabel.setText("HOME");
        add(superHomeLabel);
        superHomeLabel.setBounds(575, 80, 130, 40);

        challengesButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        challengesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/note.png"))); // NOI18N
        challengesButton.setText("Challenges");
        add(challengesButton);
        challengesButton.setBounds(440, 390, 400, 60);

        totalDonationsButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        totalDonationsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/donation.png"))); // NOI18N
        totalDonationsButton.setText("Total Donations");
        totalDonationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalDonationsButtonActionPerformed(evt);
            }
        });
        add(totalDonationsButton);
        totalDonationsButton.setBounds(440, 310, 400, 60);

        newCodeButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        newCodeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/key.png"))); // NOI18N
        newCodeButton.setText("Create New Code");
        add(newCodeButton);
        newCodeButton.setBounds(440, 470, 400, 60);

        logOutButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/door.png"))); // NOI18N
        logOutButton.setText("Log Out");
        add(logOutButton);
        logOutButton.setBounds(1140, 30, 110, 35);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/final.jpg"))); // NOI18N
        background.setToolTipText("");
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1282, 700);
    }

    private void totalDonationsButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JLabel background;
    private javax.swing.JButton challengesButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton newCodeButton;
    private javax.swing.JLabel superHomeLabel;
    private javax.swing.JButton totalDonationsButton;
    private javax.swing.JButton usersButton;

}
