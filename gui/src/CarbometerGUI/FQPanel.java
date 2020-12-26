package gui;

/**
 * @author Eren Özen, Onur Ertunç
 */
public class FQPanel extends javax.swing.JPanel {


    public FQPanel() {
        initComponents();
    }



    private void initComponents() {

        FAQLabel = new javax.swing.JLabel();
        FAQPane = new javax.swing.JScrollPane();
        FAQTextArea = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        FAQLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        FAQLabel.setForeground(new java.awt.Color(255, 255, 255));
        FAQLabel.setText("FREQUENTLY ASKED QUESTIONS");
        add(FAQLabel);
        FAQLabel.setBounds(315, 80, 650, 40);

        FAQTextArea.setEditable(false);
        FAQTextArea.setBackground(new java.awt.Color(88, 78, 69));
        FAQTextArea.setColumns(20);
        FAQTextArea.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        FAQTextArea.setForeground(new java.awt.Color(255, 255, 255));
        FAQTextArea.setRows(5);
        FAQTextArea.setText("Are donations mandotary?\nNo. It is optional to donate any non-govermental environmental organizations.\n\nAre super users able to see how much donatiıns I made?\nNo. Super users can only see the total donation amount of the users who entered their reference code.\n\nWhat different features does a super user have?\nSuper users are able to give challenges to users that entered their code and ect.\n\n");
        FAQPane.setViewportView(FAQTextArea);

        add(FAQPane);
        FAQPane.setBounds(255, 280, 770, 210);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }



    private javax.swing.JLabel FAQLabel;
    private javax.swing.JScrollPane FAQPane;
    private javax.swing.JTextArea FAQTextArea;
    private javax.swing.JLabel background;

}
