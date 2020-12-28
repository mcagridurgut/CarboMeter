package gui.View;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
/**
 * Donation panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç, Çağrı Durgut
 */

public class DonationPanel extends JPanel {

    // Properties
    public JButton backPageButton;
    private JLabel background;
    private JLabel carbopointLabel;
    private JLabel donationLabel;
    private JTable donationTable;
    private JScrollPane downPane;
    public JButton eggButton;
    private JTextField jTextField1;
    private JLabel questionLabel;
    private JTextArea textArea;
    private JLabel tlLabel;
    private JScrollPane upScrollPane;

    /**
     * Constructor of the class
     */
    public DonationPanel() {
        initComponents();
    }

    /**
     * initializes the instances of the class and makes alignments on the panel
     */
    private void initComponents() {

        //initialization of the components
        donationLabel = new JLabel();
        carbopointLabel = new JLabel();
        eggButton = new JButton();
        upScrollPane = new JScrollPane();
        textArea = new JTextArea();
        questionLabel = new JLabel();
        tlLabel = new JLabel();
        downPane = new JScrollPane();
        donationTable = new JTable();
        backPageButton = new JButton();
        jTextField1 = new JTextField();
        background = new JLabel();

        //size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        //font, size and content adjusted
        donationLabel.setFont(new Font("Calibri", 1, 48));
        donationLabel.setForeground(new Color(255, 255, 255));
        donationLabel.setText("DONATION");
        add(donationLabel);
        donationLabel.setBounds(525, 80, 230, 60);

        //font, size and content adjusted
        carbopointLabel.setFont(new Font("Calibri", 0, 36));
        carbopointLabel.setForeground(new Color(255, 255, 255));
        add(carbopointLabel);
        carbopointLabel.setBounds(330, 200, 900, 44);

        //easter egg button
        eggButton.setFont(new Font("Arial", 0, 12));
        eggButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/exclamation-mark.png")));
        eggButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                eggButtonActionPerformed(evt);
            }
        });
        add(eggButton);
        eggButton.setBounds(850, 360, 40, 30);

        upScrollPane.setBackground(new Color(0, 51, 51));

        //text area
        textArea.setEditable(false);
        textArea.setBackground(new Color(88, 78, 69));
        textArea.setColumns(25);
        textArea.setFont(new Font("Arial", 0, 14));
        textArea.setForeground(new Color(255, 255, 255));
        textArea.setRows(5);
        textArea.setText("You can fulfill your responsibility to future generations by donating\n" +
                "an equal amount of money to one of the following organizations.\n" +
                "We are deviding your Carbopoint value by 7. This indicates how many\n" +
                "trees you should donate in dollars so that these trees compensate\n" +
                "the damage you cause to the atmosphere and the soil. We calculate\n" +
                "this donation amount by multiply it with 10($ per tree)");
        upScrollPane.setViewportView(textArea);

        add(upScrollPane);
        upScrollPane.setBounds(420, 270, 470, 120);

        //question label
        questionLabel.setFont(new Font("Calibri", 0, 24));
        questionLabel.setForeground(new Color(255, 255, 255));
        questionLabel.setText("How much did you donate?");
        add(questionLabel);
        questionLabel.setBounds(420, 550, 280, 30);

        //tl symbol label
        tlLabel.setFont(new Font("Calibri", 1, 25));
        tlLabel.setForeground(new Color(255, 255, 255));
        tlLabel.setText("$");
        add(tlLabel);
        tlLabel.setBounds(760, 550, 20, 30);

        //donation table. contains the links of environmental organizations.
        donationTable.setBackground(new Color(88, 78, 69));
        donationTable.setFont(new Font("Arial", 0, 14));
        donationTable.setForeground(new Color(255, 255, 255));
        donationTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {"TEMA", "https://www.tema.org.tr/bagislar"},
                        {"WWF", "https://destek.wwf.org.tr/"},
                        {"Greenpeace", "https://destek.greenpeace.org/"},
                        {"ÇEKÜL", "https://fonzip.com/cekul/bagis#/"}
                },
                new String [] {
                        "Organization", "Link"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        donationTable.setRowHeight(28);
        donationTable.getTableHeader().setReorderingAllowed(false);
        downPane.setViewportView(donationTable);
        if (donationTable.getColumnModel().getColumnCount() > 0) {
            donationTable.getColumnModel().getColumn(0).setResizable(false);
            donationTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(downPane);
        downPane.setBounds(422, 402, 470, 140);

        /*
        //back page button
        backPageButton.setFont(new Font("Arial", 0, 12));
        backPageButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png")));
        backPageButton.setText("Go Back");
        backPageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backPageButtonActionPerformed(evt);
            }
        });
        add(backPageButton);
        backPageButton.setBounds(50, 620, 110, 35);
        */

        jTextField1.setBackground(new Color(240, 240, 240));
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(700, 550, 50, 30);

        // background adjusted and added
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);

    } // end of the initComponents

    /**
     * action performed of the eggButton. shows a message
     * @param evt action event
     */
    private void eggButtonActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "https://climate.nasa.gov/" );
    }

    /**
     * action performed of the back page button
     * @param evt action performed
     */
    private void backPageButtonActionPerformed(ActionEvent evt) {
    }

    /**
     * jtextfield action performed method
     * @param evt action event
     */
    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    public void setDollar(double variable){
        carbopointLabel.setText("Your Total Carbopoint Level Corresponds to "+ Math.round(10*(variable/7)) + "$");
    }

} // end of the class