package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */
public class DonationPanel extends javax.swing.JPanel {


    public DonationPanel() {
        initComponents();
    }

    private void initComponents() {

        donationLabel = new javax.swing.JLabel();
        carbopointLabel = new javax.swing.JLabel();
        eggButton = new javax.swing.JButton();
        upScrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        questionLabel = new javax.swing.JLabel();
        tlLabel = new javax.swing.JLabel();
        downPane = new javax.swing.JScrollPane();
        donationTable = new javax.swing.JTable();
        backPageButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        donationLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        donationLabel.setForeground(new java.awt.Color(255, 255, 255));
        donationLabel.setText("DONATION");
        add(donationLabel);
        donationLabel.setBounds(525, 80, 230, 60);

        carbopointLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        carbopointLabel.setForeground(new java.awt.Color(255, 255, 255));
        carbopointLabel.setText("Your Total Carbopoint Level Corresponds to ");
        add(carbopointLabel);
        carbopointLabel.setBounds(330, 200, 650, 44);

        eggButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        eggButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/exclamation-mark.png"))); // NOI18N
        eggButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eggButtonActionPerformed(evt);
            }
        });
        add(eggButton);
        eggButton.setBounds(630, 360, 40, 30);

        upScrollPane.setBackground(new java.awt.Color(0, 51, 51));
//TEST

        textArea.setEditable(false);
        textArea.setBackground(new java.awt.Color(88, 78, 69));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setRows(5);
        textArea.setText("\nYou can fullfill your responsibility to future generations by donating\nan equal amount of money to one of the following organizations.");
        upScrollPane.setViewportView(textArea);

        add(upScrollPane);
        upScrollPane.setBounds(420, 270, 470, 120);

        questionLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(255, 255, 255));
        questionLabel.setText("How much did you donate?");
        add(questionLabel);
        questionLabel.setBounds(420, 550, 280, 30);

        tlLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        tlLabel.setForeground(new java.awt.Color(255, 255, 255));
        tlLabel.setText("₺");
        add(tlLabel);
        tlLabel.setBounds(760, 550, 20, 30);

        donationTable.setBackground(new java.awt.Color(88, 78, 69));
        donationTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        donationTable.setForeground(new java.awt.Color(255, 255, 255));
        donationTable.setModel(new javax.swing.table.DefaultTableModel(
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

        backPageButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png"))); // NOI18N
        backPageButton.setText("Go Back");
        backPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backPageButtonActionPerformed(evt);
            }
        });
        add(backPageButton);
        backPageButton.setBounds(50, 620, 110, 35);

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(700, 550, 50, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private void eggButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void backPageButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }


    public javax.swing.JButton backPageButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel carbopointLabel;
    private javax.swing.JLabel donationLabel;
    private javax.swing.JTable donationTable;
    private javax.swing.JScrollPane downPane;
    public javax.swing.JButton eggButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel tlLabel;
    private javax.swing.JScrollPane upScrollPane;

}