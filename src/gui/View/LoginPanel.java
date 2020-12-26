package gui.View;

import javax.swing.plaf.basic.BasicTextFieldUI;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class LoginPanel extends javax.swing.JPanel {

    public LoginPanel() {
        initComponents();
    }

    private void initComponents() {

        carbometerLabel = new javax.swing.JLabel();
        forAGreenFutureLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        forgotPasswordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        noAccountLabel = new javax.swing.JLabel();
        usernameSignature = new javax.swing.JLabel();
        passwordSignature = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        carbometerLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        carbometerLabel.setForeground(new java.awt.Color(255, 255, 255));
        carbometerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carbometerLabel.setText("CARBOMETER");
        add(carbometerLabel);
        carbometerLabel.setBounds(500, 80, 280, 40);

        forAGreenFutureLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        forAGreenFutureLabel.setForeground(new java.awt.Color(255, 255, 255));
        forAGreenFutureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forAGreenFutureLabel.setText("For a Green Future");
        add(forAGreenFutureLabel);
        forAGreenFutureLabel.setBounds(545, 130, 190, 20);

        welcomeLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome");
        add(welcomeLabel);
        welcomeLabel.setBounds(590, 160, 100, 20);

        userNameField.setBackground(new java.awt.Color(240, 240, 240));
        userNameField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userNameField.setUI(new JTextFieldHintUI("Username or Email", Color.gray));
        add(userNameField);
        userNameField.setBounds(550, 280, 180, 30);

        passwordField.setBackground(new java.awt.Color(240, 240, 240));
        passwordField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(passwordField);
        passwordField.setBounds(550, 320, 180, 30);

        forgotPasswordLabel.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        forgotPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        forgotPasswordLabel.setText("Forgot my password");
        add(forgotPasswordLabel);
        forgotPasswordLabel.setBounds(585, 375, 110, 20);

        loginButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loginButton.setText("Login");
        add(loginButton);
        loginButton.setBounds(590, 400, 100, 30);

        signUpButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        signUpButton.setText("Sign Up");
        add(signUpButton);
        signUpButton.setBounds(590, 530, 100, 30);

        noAccountLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        noAccountLabel.setForeground(new java.awt.Color(255, 255, 255));
        noAccountLabel.setText("Don't have an account?");
        add(noAccountLabel);
        noAccountLabel.setBounds(575, 500, 130, 20);

        usernameSignature.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usernameSignature.setForeground(new java.awt.Color(255, 255, 255));
        usernameSignature.setText("Username or e-mail");
        add(usernameSignature);
        usernameSignature.setBounds(350, 280, 180, 30);

        passwordSignature.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        passwordSignature.setForeground(new java.awt.Color(255, 255, 255));
        passwordSignature.setText("Password");
        add(passwordSignature);
        passwordSignature.setBounds(440, 320, 90, 30);

        background.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private javax.swing.JLabel background;
    private javax.swing.JLabel carbometerLabel;
    private javax.swing.JLabel forAGreenFutureLabel;
    private javax.swing.JLabel forgotPasswordLabel;
    public javax.swing.JButton loginButton;
    private javax.swing.JLabel noAccountLabel;
    public javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordSignature;
    public javax.swing.JButton signUpButton;
    public javax.swing.JTextField userNameField;
    private javax.swing.JLabel usernameSignature;
    private javax.swing.JLabel welcomeLabel;

}
