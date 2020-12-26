package gui.View;
import javax.swing.*;
import java.awt.*;

public class SignUpPanel extends JPanel {


    private JLabel background;
    private JLabel carbometerLabel;
    public JPasswordField confirmPasswordField;
    private JLabel confirmPasswordLabel;
    public JTextField emailField;
    private JLabel emailLabel;
    private JLabel jLabel1;
    public JButton loginButton;
    public JPasswordField passwordField;
    private JLabel passwordLabel;
    public JButton signUpButton;
    private JLabel signUpSignatureLabel;
    public JTextField superUserCodeField;
    private JLabel superuserLabel;
    public JTextField userNameField;
    private JComboBox<String> userTypeCombo;
    private JLabel userTypeLabel;
    private JLabel usernameLabel;
    private JTextField verificationCodeLabel;

    public SignUpPanel() {
        initComponents();
    }

    private void initComponents() {

        JLabel carbometerLabel = new JLabel();
        signUpSignatureLabel = new JLabel();
        userNameField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        emailField = new JTextField();
        superUserCodeField = new JTextField();
        userTypeCombo = new JComboBox<>();
        signUpButton = new JButton();
        userTypeLabel = new JLabel();
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();
        confirmPasswordLabel = new JLabel();
        emailLabel = new JLabel();
        superuserLabel = new JLabel();
        verificationCodeLabel = new JTextField();
        jLabel1 = new JLabel();
        loginButton = new JButton();
        background = new JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        carbometerLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        carbometerLabel.setForeground(new java.awt.Color(255, 255, 255));
        carbometerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carbometerLabel.setText("CARBOMETER");
        add(carbometerLabel);
        carbometerLabel.setBounds(500, 80, 280, 60);

        signUpSignatureLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        signUpSignatureLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpSignatureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpSignatureLabel.setText("Sign Up for Payback");
        add(signUpSignatureLabel);
        signUpSignatureLabel.setBounds(540, 130, 200, 25);

        userNameField.setBackground(new java.awt.Color(240, 240, 240));
        userNameField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userNameField.setUI(new JTextFieldHintUI("Username", Color.gray));
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        add(userNameField);
        userNameField.setBounds(470, 250, 180, 30);

        passwordField.setBackground(new java.awt.Color(240, 240, 240));
        passwordField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(passwordField);
        passwordField.setBounds(470, 300, 180, 30);

        confirmPasswordField.setBackground(new java.awt.Color(240, 240, 240));
        add(confirmPasswordField);
        confirmPasswordField.setBounds(470, 350, 180, 30);

        emailField.setBackground(new java.awt.Color(240, 240, 240));
        emailField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailField.setUI(new JTextFieldHintUI("E-mail", Color.gray));
        add(emailField);
        emailField.setBounds(470, 400, 180, 30);

        superUserCodeField.setBackground(new java.awt.Color(240, 240, 240));
        superUserCodeField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        superUserCodeField.setUI(new JTextFieldHintUI("Super User Code (optional)", Color.gray));
        add(superUserCodeField);
        superUserCodeField.setBounds(470, 450, 180, 30);

        userTypeCombo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal User", "Super User", " " }));
        add(userTypeCombo);
        userTypeCombo.setBounds(700, 280, 150, 30);

        signUpButton.setText("Sign Up");
        add(signUpButton);
        signUpButton.setBounds(590, 530, 100, 30);

        userTypeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        userTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userTypeLabel.setText("User Type");
        add(userTypeLabel);
        userTypeLabel.setBounds(700, 250, 150, 20);

        usernameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        usernameLabel.setText("Username");
        add(usernameLabel);
        usernameLabel.setBounds(360, 250, 100, 30);

        passwordLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(360, 300, 100, 30);

        confirmPasswordLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        confirmPasswordLabel.setText("Confirm Password");
        add(confirmPasswordLabel);
        confirmPasswordLabel.setBounds(280, 350, 180, 30);

        emailLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        emailLabel.setText("E-mail");
        emailLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(emailLabel);
        emailLabel.setBounds(360, 400, 100, 30);

        superuserLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        superuserLabel.setForeground(new java.awt.Color(255, 255, 255));
        superuserLabel.setText("Super User Code");
        add(superuserLabel);
        superuserLabel.setBounds(310, 450, 150, 30);

//        verificationCodeLabel.setBackground(new java.awt.Color(240, 240, 240));
//        verificationCodeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
//        verificationCodeLabel.setText("E-mail Verification Code");
//        add(verificationCodeLabel);
//        verificationCodeLabel.setBounds(690, 400, 180, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Do you have an account?");
        add(jLabel1);
        jLabel1.setBounds(570, 580, 150, 15);

        loginButton.setText("Login");
        add(loginButton);
        loginButton.setBounds(590, 600, 100, 30);

        background.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

}
