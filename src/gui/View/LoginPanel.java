package gui.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Login panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class LoginPanel extends javax.swing.JPanel {

    // Properties of the login panel
    private JLabel background;
    private JLabel carbometerLabel;
    private JLabel forAGreenFutureLabel;
    public JButton forgotPasswordLabel;
    public JButton loginButton;
    private JLabel noAccountLabel;
    public JPasswordField passwordField;
    private JLabel passwordSignature;
    public JButton signUpButton;
    public JTextField userNameField;
    private JLabel usernameSignature;
    private JLabel welcomeLabel;

    /**
     * constructor of the class
     */
    public LoginPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        carbometerLabel = new JLabel();
        forAGreenFutureLabel = new JLabel();
        welcomeLabel = new JLabel();
        userNameField = new JTextField();
        passwordField = new JPasswordField();
        forgotPasswordLabel = new JButton();
        loginButton = new JButton();
        signUpButton = new JButton();
        noAccountLabel = new JLabel();
        usernameSignature = new JLabel();
        passwordSignature = new JLabel();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // carbometerlabel alignment ( font, foreground, alignment, text and position)
        carbometerLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        carbometerLabel.setForeground(new Color(255, 255, 255));
        carbometerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        carbometerLabel.setText("CARBOMETER");
        add(carbometerLabel);
        carbometerLabel.setBounds(500, 80, 280, 60);

        // forAGreenFutureLabel alignment ( font, foreground, alignment, text and position)
        forAGreenFutureLabel.setFont(new Font("Calibri", 0, 24)); // NOI18N
        forAGreenFutureLabel.setForeground(new Color(255, 255, 255));
        forAGreenFutureLabel.setHorizontalAlignment(SwingConstants.CENTER);
        forAGreenFutureLabel.setText("For a Green Future");
        add(forAGreenFutureLabel);
        forAGreenFutureLabel.setBounds(545, 130, 190, 25);

        // welcomeLabel alignment ( font, foreground, alignment, text and position)
        welcomeLabel.setFont(new Font("Calibri", 0, 24)); // NOI18N
        welcomeLabel.setForeground(new Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setText("Welcome");
        add(welcomeLabel);
        welcomeLabel.setBounds(590, 160, 100, 25);

        // usernameField alignment ( background, font)
        userNameField.setBackground(new Color(240, 240, 240));
        userNameField.setFont(new Font("Arial", 1, 12)); // NOI18N
        //userNameField.setUI(new JTextFieldHintUI("Username or Email", Color.gray));
        add(userNameField);
        userNameField.setBounds(550, 280, 180, 30);

        // passwordField alignment ( background, font, and position)
        passwordField.setBackground(new Color(240, 240, 240));
        passwordField.setFont(new Font("Arial", 1, 12)); // NOI18N
        add(passwordField);
        passwordField.setBounds(550, 320, 180, 30);

        // welcomeLabel alignment ( font, foreground, text and position)
        forgotPasswordLabel.setFont(new Font("Arial", 2, 12)); // NOI18N
        forgotPasswordLabel.setForeground(new Color(0, 0, 0));
        forgotPasswordLabel.setText("Forgot my password");
        add(forgotPasswordLabel);
        forgotPasswordLabel.setBounds(565, 415, 150, 20);

        // login button alignment ( font, text and position)
        loginButton.setFont(new Font("Arial", 0, 12)); // NOI18N
        loginButton.setText("Login");
        add(loginButton);
        loginButton.setBounds(590, 370, 100, 30);

        // signup button alignment ( font, text and position)
        signUpButton.setFont(new Font("Arial", 0, 12)); // NOI18N
        signUpButton.setText("Sign Up");
        add(signUpButton);
        signUpButton.setBounds(590, 530, 100, 30);

        // noAccountLabel alignment ( font, foreground, text and position)
        noAccountLabel.setFont(new Font("Arial", 0, 12)); // NOI18N
        noAccountLabel.setForeground(new Color(255, 255, 255));
        noAccountLabel.setText("Don't have an account?");
        add(noAccountLabel);
        noAccountLabel.setBounds(575, 500, 130, 20);

        // usernameSignature alignment ( font, foreground, text and position)
        usernameSignature.setFont(new Font("Arial", 1, 18)); // NOI18N
        usernameSignature.setForeground(new Color(255, 255, 255));
        usernameSignature.setText("Username or e-mail");
        add(usernameSignature);
        usernameSignature.setBounds(350, 280, 180, 30);

        // passwordSignature alignment ( font, foreground, text and position)
        passwordSignature.setFont(new Font("Arial", 1, 18)); // NOI18N
        passwordSignature.setForeground(new Color(255, 255, 255));
        passwordSignature.setText("Password");
        add(passwordSignature);
        passwordSignature.setBounds(440, 320, 90, 30);

        // background alignment ( dimension and positioning)
        background.setFont(new Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }



}
