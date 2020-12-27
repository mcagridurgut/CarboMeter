package gui.View;
import javax.swing.*;
import java.awt.*;
/**
 * @author Eren Özen, Onur Ertunç
 */
public class FQPanel extends JPanel {

    // properties - components
    private JLabel FAQLabel;
    private JScrollPane FAQPane;
    private JTextArea FAQTextArea;
    private JLabel background;

    /**
     * constructor of the class. calls the initComponents method.
     */
    public FQPanel() {
        initComponents();
    }

    /**
     * initializes the properties and components of the of the class
     */
    private void initComponents() {

        // initialization of the components
        FAQLabel = new JLabel();
        FAQPane = new JScrollPane();
        FAQTextArea = new JTextArea();
        background = new JLabel();

        // size and layout of the panel aligned
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // faq label alignment
        FAQLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        FAQLabel.setForeground(new Color(255, 255, 255));
        FAQLabel.setText("FREQUENTLY ASKED QUESTIONS");
        add(FAQLabel);
        FAQLabel.setBounds(315, 80, 650, 60);

        // faq text area alignment
        FAQTextArea.setEditable(false);
        FAQTextArea.setBackground(new Color(88, 78, 69));
        FAQTextArea.setColumns(20);
        FAQTextArea.setFont(new Font("Arial", 0, 16)); // NOI18N
        FAQTextArea.setForeground(new Color(255, 255, 255));
        FAQTextArea.setRows(5);
        FAQTextArea.setText("Are donations mandotary?\nNo. It is optional to donate any non-govermental environmental organizations.\n\nAre super users able to see how much donatiıns I made?\nNo. Super users can only see the total donation amount of the users who entered their reference code.\n\nWhat different features does a super user have?\nSuper users are able to give challenges to users that entered their code and ect.\n\n");
        FAQPane.setViewportView(FAQTextArea);

        // faq pane added and bounds are added to the panel
        add(FAQPane);
        FAQPane.setBounds(255, 280, 770, 210);

        // background
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    } // end of the initComponents method

} // end of the class
