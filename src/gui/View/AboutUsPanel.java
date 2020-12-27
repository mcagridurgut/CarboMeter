package gui.View;
import javax.swing.*;
import java.awt.*;
/**
 * About Us panel of the Carbometer application. Draws the panel by swing components
 * @author Eren Özen, Onur Ertunç
 */
public class AboutUsPanel extends JPanel {

    // Properties
    private JLabel aboutUsLabel;
    private JScrollPane aboutUsPane;
    private JTextArea aboutUsTextArea;
    private JLabel background;

    /**
     * Constructor of the class
     */
    public AboutUsPanel() {
        initComponents();
    }

    /**
     * initializes the instances of the class and makes alignments on the panel
     */
    private void initComponents() {

        //initialization of the components
        aboutUsLabel = new JLabel();
        aboutUsPane = new JScrollPane();
        aboutUsTextArea = new JTextArea();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // about us label font, size and content adjusted
        aboutUsLabel.setFont(new Font("Calibri", 1, 48));
        aboutUsLabel.setForeground(new Color(255, 255, 255));
        aboutUsLabel.setText("ABOUT US");
        add(aboutUsLabel);
        aboutUsLabel.setBounds(535, 80, 210, 60);

        // text label and components are adjusted
        aboutUsTextArea.setEditable(false);
        aboutUsTextArea.setBackground(new Color(88, 78, 69));
        aboutUsTextArea.setColumns(20);
        aboutUsTextArea.setFont(new Font("Arial", 0, 16));
        aboutUsTextArea.setForeground(new Color(255, 255, 255));
        aboutUsTextArea.setRows(5);
        aboutUsTextArea.setText("          Carbometer is a desktop application that utilizes information about the consumption of users to \n       measure environmental damage and gives recommendations based on the information. The program \n           gets the user data with a series of questions depending on their user type. As the user answers \n         the questions, Carbometer makes calculations to calculate users' environmental damage. After the \n      calculations,Carbometer shows their carbopoint and gives recommendations todiminish their Carbopoint\n           level, and directs users to donateto payback their environmental damage if they want to. With this\n        project, our aim is to make people aware of the damage they gave to the environment, and help them\n          to reduce their harm by giving recommendations or directing them to donate any non-governmental \n\t\t                    environmental organizations.\n\n\n\t\t                  Creators of the Carbometer              \n\t\t\t  Alper Mumcular           \n\t\t                       Mustafa Çağrı Durgut    \t\n\t\t\t    Onur Ertunç             \n\t\t                        Şeyhmus Eren Özen                  \n\t\t\t Uygar Onat Erol");
        aboutUsTextArea.setBorder(null);
        aboutUsPane.setViewportView(aboutUsTextArea);

        // added to the panel
        add(aboutUsPane);
        aboutUsPane.setBounds(255, 240, 770, 360);

        // background adjusted and added
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    } // end of the initComponents

} // end of the class
