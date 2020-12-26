package gui.View;

public class SignUpPanel extends javax.swing.JPanel {

    public SignUpPanel() {
        initComponents();
    }

    private void initComponents() {

        carbometerLabel = new javax.swing.JLabel();
        signUpSignatureLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        emailField = new javax.swing.JTextField();
        superUserCodeField = new javax.swing.JTextField();
        userTypeCombo = new javax.swing.JComboBox<>();
        signUpButton = new javax.swing.JButton();
        userTypeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        superuserLabel = new javax.swing.JLabel();
        verificationCodeLabel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        carbometerLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        carbometerLabel.setForeground(new java.awt.Color(255, 255, 255));
        carbometerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carbometerLabel.setText("CARBOMETER");
        add(carbometerLabel);
        carbometerLabel.setBounds(500, 80, 280, 40);

        signUpSignatureLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        signUpSignatureLabel.setForeground(new java.awt.Color(255, 255, 255));
        signUpSignatureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpSignatureLabel.setText("Sign Up for Payback");
        add(signUpSignatureLabel);
        signUpSignatureLabel.setBounds(540, 130, 200, 20);

        userNameField.setBackground(new java.awt.Color(240, 240, 240));
        userNameField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userNameField.setText("Username");
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        add(userNameField);
        userNameField.setBounds(470, 250, 180, 30);

        passwordField.setBackground(new java.awt.Color(240, 240, 240));
        passwordField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passwordField.setText("Password");
        add(passwordField);
        passwordField.setBounds(470, 300, 180, 30);

        confirmPasswordField.setBackground(new java.awt.Color(240, 240, 240));
        confirmPasswordField.setText("Confirm password");
        add(confirmPasswordField);
        confirmPasswordField.setBounds(470, 350, 180, 30);

        emailField.setBackground(new java.awt.Color(240, 240, 240));
        emailField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailField.setText("E-mail");
        add(emailField);
        emailField.setBounds(470, 400, 180, 30);

        superUserCodeField.setBackground(new java.awt.Color(240, 240, 240));
        superUserCodeField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        superUserCodeField.setText("Super User Code (Optional)");
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

        verificationCodeLabel.setBackground(new java.awt.Color(240, 240, 240));
        verificationCodeLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        verificationCodeLabel.setText("E-mail Verification Code");
        add(verificationCodeLabel);
        verificationCodeLabel.setBounds(690, 400, 180, 30);

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

    private javax.swing.JLabel background;
    private javax.swing.JLabel carbometerLabel;
    public javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    public javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    public javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpSignatureLabel;
    private javax.swing.JTextField superUserCodeField;
    private javax.swing.JLabel superuserLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JComboBox<String> userTypeCombo;
    private javax.swing.JLabel userTypeLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField verificationCodeLabel;

}
