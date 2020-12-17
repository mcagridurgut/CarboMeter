package CarbometerGUI;

/**
 * Greeting page panel of Carbometer
 * @author Onur Ertunc
 * @version 17.12.2020
 */
public class GreetingPagePanel extends javax.swing.JPanel {
    
    // Variables declaration
    private javax.swing.JLabel carbometerLabel;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel greenFuture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signInButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration

    /**
     * Creates new form GreetingPagePanel
     */
    public GreetingPagePanel() {
        initComponents();
        this.setVisible( true );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")

    private void initComponents() {

        carbometerLabel = new javax.swing.JLabel();
        greenFuture = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        forgotPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(75, 139, 59));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1280, 700));

        carbometerLabel.setBackground(new java.awt.Color(75, 139, 59));
        carbometerLabel.setFont(new java.awt.Font("Georgia", 1, 48)); 
        carbometerLabel.setText("Carbometer");

        greenFuture.setBackground(new java.awt.Color(75, 139, 59));
        greenFuture.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        greenFuture.setText("For a Green Future");

        welcomeLabel.setBackground(new java.awt.Color(75, 139, 59));
        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome");
        welcomeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        usernameField.setFont(new java.awt.Font("Tahoma", 2, 14)); 
        usernameField.setText("Username");
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        forgotPassword.setFont(new java.awt.Font("Tahoma", 2, 11));
        forgotPassword.setText("Forgot my password?");

        jLabel1.setText("Don't have an account?");

        signInButton.setText("Sign in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(carbometerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(welcomeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField)
                            .addComponent(greenFuture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(583, 583, 583)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(loginButton))
                            .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(608, 608, 608)
                        .addComponent(signInButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(575, 575, 575)
                        .addComponent(jLabel1)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(carbometerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenFuture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel)
                .addGap(101, 101, 101)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signInButton)
                .addGap(87, 87, 87))
        );

        passwordField.getAccessibleContext().setAccessibleName("PasswordField");
        usernameField.getAccessibleContext().setAccessibleName("UsernameField");
    }

    // ActionListeners
    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }



}
