package gui;

/**
 * @author Eren Özen, Onur Ertunç
 */
public class AboutUsPanel extends javax.swing.JPanel {

    public AboutUsPanel() {
        initComponents();
    }

    private void initComponents() {

        aboutUsLabel = new javax.swing.JLabel();
        aboutUsPane = new javax.swing.JScrollPane();
        aboutUsTextArea = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        aboutUsLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        aboutUsLabel.setForeground(new java.awt.Color(255, 255, 255));
        aboutUsLabel.setText("ABOUT US");
        add(aboutUsLabel);
        aboutUsLabel.setBounds(535, 80, 210, 40);

        aboutUsTextArea.setEditable(false);
        aboutUsTextArea.setBackground(new java.awt.Color(88, 78, 69));
        aboutUsTextArea.setColumns(20);
        aboutUsTextArea.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        aboutUsTextArea.setForeground(new java.awt.Color(255, 255, 255));
        aboutUsTextArea.setRows(5);
        aboutUsTextArea.setText("          Carbometer is a desktop application that utilizes information about the consumption of users to \n       measure environmental damage and gives recommendations based on the information. The program \n           gets the user data with a series of questions depending on their user type. As the user answers \n         the questions, Carbometer makes calculations to calculate users' environmental damage. After the \n      calculations,Carbometer shows their carbopoint and gives recommendations todiminish their Carbopoint\n           level, and directs users to donateto payback their environmental damage if they want to. With this\n        project, our aim is to make people aware of the damage they gave to the environment, and help them\n          to reduce their harm by giving recommendations or directing them to donate any non-governmental \n\t\t                    environmental organizations.\n\n\n\t\t                  Creators of the Carbometer              \n\t\t\t  Alper Mumcular           \n\t\t                       Mustafa Çağrı Durgut    \t\n\t\t\t    Onur Ertunç             \n\t\t                        Şeyhmus Eren Özen                  \n\t\t\t Uygar Onat Erol");
        aboutUsTextArea.setBorder(null);
        aboutUsPane.setViewportView(aboutUsTextArea);

        add(aboutUsPane);
        aboutUsPane.setBounds(255, 240, 770, 360);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private javax.swing.JLabel aboutUsLabel;
    private javax.swing.JScrollPane aboutUsPane;
    private javax.swing.JTextArea aboutUsTextArea;
    private javax.swing.JLabel background;

}
