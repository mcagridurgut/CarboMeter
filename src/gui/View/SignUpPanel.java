package gui.View;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * sign up panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */
public class SignUpPanel extends JPanel {

    // Properties of the sign up panel
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

    /**
     * constructor of the class
     */
    public SignUpPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
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

        // size of the panel and layout adjusted
        setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // carbometer label alignment (font, foreground, alignment, text and position)
        carbometerLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        carbometerLabel.setForeground(new Color(255, 255, 255));
        carbometerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        carbometerLabel.setText("CARBOMETER");
        add(carbometerLabel);
        carbometerLabel.setBounds(500, 80, 280, 60);

        // sign up signature label alignment (font, foreground, alignment, text and position)
        signUpSignatureLabel.setFont(new Font("Calibri", 0, 24)); // NOI18N
        signUpSignatureLabel.setForeground(new Color(255, 255, 255));
        signUpSignatureLabel.setHorizontalAlignment(SwingConstants.CENTER);
        signUpSignatureLabel.setText("Sign Up for Payback");
        add(signUpSignatureLabel);
        signUpSignatureLabel.setBounds(540, 130, 200, 25);

        // user name field alignment (background, font and position)
        userNameField.setBackground(new Color(240, 240, 240));
        userNameField.setFont(new Font("Arial", 1, 12)); // NOI18N
        userNameField.setUI(new JTextFieldHintUI("Username", Color.gray));
        userNameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        add(userNameField);
        userNameField.setBounds(570, 250, 180, 30);

        // password field alignment (background, font and position)
        passwordField.setBackground(new Color(240, 240, 240));
        passwordField.setFont(new Font("Arial", 1, 12)); // NOI18N
        add(passwordField);
        passwordField.setBounds(570, 300, 180, 30);

        // confirm password field alignment (background, font and position)
        confirmPasswordField.setBackground(new Color(240, 240, 240));
        add(confirmPasswordField);
        confirmPasswordField.setBounds(570, 350, 180, 30);

        // email field alignment (background, font and position)
        emailField.setBackground(new Color(240, 240, 240));
        emailField.setFont(new Font("Arial", 1, 12)); // NOI18N
        emailField.setUI(new JTextFieldHintUI("E-mail", Color.gray));
        add(emailField);
        emailField.setBounds(570, 400, 180, 30);

        // superusercode field alignment (background, font and position)
        superUserCodeField.setBackground(new Color(240, 240, 240));
        superUserCodeField.setFont(new Font("Arial", 1, 12)); // NOI18N
        superUserCodeField.setUI(new JTextFieldHintUI("Super User Code (optional)", Color.gray));
        add(superUserCodeField);
        superUserCodeField.setBounds(570, 450, 180, 30);

        /*userTypeCombo.setFont(new Font("Arial", 1, 12)); // NOI18N
        userTypeCombo.setModel(new DefaultComboBoxModel<>(new String[] { "Normal User", "Super User", " " }));
        add(userTypeCombo);
        userTypeCombo.setBounds(700, 280, 150, 30);

         */

        // sign up button alignment (text and position)
        signUpButton.setText("Sign Up");
        add(signUpButton);
        signUpButton.setBounds(590, 530, 100, 30);

        /*userTypeLabel.setFont(new Font("Arial", 1, 12)); // NOI18N
        userTypeLabel.setForeground(new Color(255, 255, 255));
        userTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userTypeLabel.setText("User Type");
        add(userTypeLabel);
        userTypeLabel.setBounds(700, 250, 150, 20);

         */

        // username label alignment (font, foreground, alignment, text and position)
        usernameLabel.setFont(new Font("Arial", 1, 18)); // NOI18N
        usernameLabel.setForeground(new Color(255, 255, 255));
        usernameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        usernameLabel.setText("Username");
        add(usernameLabel);
        usernameLabel.setBounds(460, 250, 100, 30);

        // password label alignment (font, foreground, alignment, text and position)
        passwordLabel.setFont(new Font("Arial", 1, 18)); // NOI18N
        passwordLabel.setForeground(new Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(460, 300, 100, 30);

        // confirm password label alignment (font, foreground, alignment, text and position)
        confirmPasswordLabel.setFont(new Font("Arial", 1, 18)); // NOI18N
        confirmPasswordLabel.setForeground(new Color(255, 255, 255));
        confirmPasswordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        confirmPasswordLabel.setText("Confirm Password");
        add(confirmPasswordLabel);
        confirmPasswordLabel.setBounds(380, 350, 180, 30);

        // email label alignment (font, foreground, alignment, text and position)
        emailLabel.setFont(new Font("Arial", 1, 18)); // NOI18N
        emailLabel.setForeground(new Color(255, 255, 255));
        emailLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        emailLabel.setText("E-mail");
        emailLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        add(emailLabel);
        emailLabel.setBounds(460, 400, 100, 30);

        // superuser label alignment (font, foreground, alignment, text and position)
        superuserLabel.setFont(new Font("Arial", 1, 18)); // NOI18N
        superuserLabel.setForeground(new Color(255, 255, 255));
        superuserLabel.setText("Super User Code");
        add(superuserLabel);
        superuserLabel.setBounds(410, 450, 150, 30);

//        verificationCodeLabel.setBackground(new Color(240, 240, 240));
//        verificationCodeLabel.setFont(new Font("Arial", 1, 12)); // NOI18N
//        verificationCodeLabel.setText("E-mail Verification Code");
//        add(verificationCodeLabel);
//        verificationCodeLabel.setBounds(690, 400, 180, 30);

        // jlabel1 alignment (font, foreground, alignment, text and position)
        jLabel1.setFont(new Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Do you have an account?");
        add(jLabel1);
        jLabel1.setBounds(570, 580, 150, 15);

        // login button alignment (text and position)
        loginButton.setText("Login");
        add(loginButton);
        loginButton.setBounds(590, 600, 100, 30);

        // background alignment (font, icon and positioning)
        background.setFont(new Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    /**
     * user name field action performed method. check the gui class.
     * @param evt action event
     */
    private void userNameFieldActionPerformed(ActionEvent evt) {

    }

}
