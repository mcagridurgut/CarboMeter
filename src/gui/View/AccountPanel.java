package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */
public class AccountPanel extends javax.swing.JPanel {



    public AccountPanel() {
        initComponents();
    }

    private void initComponents() {

        logOutButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        accountLabel = new javax.swing.JLabel();
        donationsLabel = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        donationsField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        logOutButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/door.png"))); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        add(logOutButton);
        logOutButton.setBounds(720, 390, 180, 30);

        usernameField.setEditable(false);
        usernameField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        add(usernameField);
        usernameField.setBounds(400, 290, 180, 30);

        accountLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        accountLabel.setForeground(new java.awt.Color(255, 255, 255));
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("ACCOUNT");
        accountLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(accountLabel);
        accountLabel.setBounds(540, 80, 200, 50);

        donationsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        donationsLabel.setForeground(new java.awt.Color(255, 255, 255));
        donationsLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        donationsLabel.setText("Donations");
        donationsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(donationsLabel);
        donationsLabel.setBounds(300, 390, 90, 30);

        changePasswordButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        changePasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/key.png"))); // NOI18N
        changePasswordButton.setText("Change Password");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        add(changePasswordButton);
        changePasswordButton.setBounds(720, 290, 180, 30);

        donationsField.setBackground(new java.awt.Color(240, 240, 240));
        donationsField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        donationsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationsFieldActionPerformed(evt);
            }
        });
        add(donationsField);
        donationsField.setBounds(400, 390, 180, 30);

        usernameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        usernameLabel.setText("Username");
        usernameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(usernameLabel);
        usernameLabel.setBounds(300, 290, 90, 30);

        background.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 700));
        jPanel1.setLayout(null);
        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 700);
    }

    public void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {


    }

    public void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void donationsFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JLabel accountLabel;
    private javax.swing.JLabel background;
    public javax.swing.JButton changePasswordButton;
    private javax.swing.JTextField donationsField;
    private javax.swing.JLabel donationsLabel;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton logOutButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;

}
