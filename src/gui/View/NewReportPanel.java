package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class NewReportPanel extends javax.swing.JPanel {

    public NewReportPanel() {
        initComponents();
    }

    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        newReportLabel = new javax.swing.JLabel();
        comboBoxFood = new javax.swing.JComboBox<>();
        carbobarLabel = new javax.swing.JLabel();
        carbobarProgressBar = new javax.swing.JProgressBar();
        nextPageButton = new javax.swing.JButton();
        homeComboBox = new javax.swing.JComboBox<>();
        stuffComboBox = new javax.swing.JComboBox<>();
        travelComboBox = new javax.swing.JComboBox<>();
        stuffIcon = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        foodIcon = new javax.swing.JLabel();
        travelIcon = new javax.swing.JLabel();
        newReportPane = new javax.swing.JScrollPane();
        newReportTextArea = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        newReportLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        newReportLabel.setForeground(new java.awt.Color(255, 255, 255));
        newReportLabel.setText("NEW REPORT");
        add(newReportLabel);
        newReportLabel.setBounds(505, 80, 270, 40);

        comboBoxFood.setBackground(new java.awt.Color(240, 240, 240));
        comboBoxFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        comboBoxFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFoodActionPerformed(evt);
            }
        });
        add(comboBoxFood);
        comboBoxFood.setBounds(650, 260, 100, 40);

        carbobarLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        carbobarLabel.setForeground(new java.awt.Color(255, 255, 255));
        carbobarLabel.setText("Carbobar");
        add(carbobarLabel);
        carbobarLabel.setBounds(1000, 320, 100, 30);

        carbobarProgressBar.setValue(60);
        carbobarProgressBar.setPreferredSize(new java.awt.Dimension(300, 20));
        carbobarProgressBar.setRequestFocusEnabled(false);
        add(carbobarProgressBar);
        carbobarProgressBar.setBounds(900, 370, 300, 20);

        nextPageButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nextPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png"))); // NOI18N
        nextPageButton.setText("Next");
        add(nextPageButton);
        nextPageButton.setBounds(1120, 620, 110, 35);

        homeComboBox.setBackground(new java.awt.Color(240, 240, 240));
        homeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        homeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeComboBoxActionPerformed(evt);
            }
        });
        add(homeComboBox);
        homeComboBox.setBounds(650, 380, 100, 40);

        stuffComboBox.setBackground(new java.awt.Color(240, 240, 240));
        stuffComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        stuffComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuffComboBoxActionPerformed(evt);
            }
        });
        add(stuffComboBox);
        stuffComboBox.setBounds(650, 440, 100, 40);

        travelComboBox.setBackground(new java.awt.Color(240, 240, 240));
        travelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        travelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelComboBoxActionPerformed(evt);
            }
        });
        add(travelComboBox);
        travelComboBox.setBounds(650, 320, 100, 40);

        stuffIcon.setForeground(new java.awt.Color(255, 255, 255));
        stuffIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/application (1).png"))); // NOI18N
        add(stuffIcon);
        stuffIcon.setBounds(610, 440, 30, 40);

        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/home (2).png"))); // NOI18N
        add(homeIcon);
        homeIcon.setBounds(610, 380, 30, 40);

        foodIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/diet (1).png"))); // NOI18N
        add(foodIcon);
        foodIcon.setBounds(610, 260, 30, 40);

        travelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/globe (1).png"))); // NOI18N
        add(travelIcon);
        travelIcon.setBounds(610, 320, 40, 40);

        newReportPane.setBackground(new java.awt.Color(255, 255, 255));

        newReportTextArea.setEditable(false);
        newReportTextArea.setBackground(new java.awt.Color(88, 78, 69));
        newReportTextArea.setColumns(20);
        newReportTextArea.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        newReportTextArea.setForeground(new java.awt.Color(255, 255, 255));
        newReportTextArea.setRows(5);
        newReportTextArea.setText("FOOD\n\nTRANSPORTATION\n\nHOME\n\nOTHERS\n");
        newReportPane.setViewportView(newReportTextArea);

        add(newReportPane);
        newReportPane.setBounds(290, 260, 460, 260);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private void comboBoxFoodActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void homeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void stuffComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void travelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JLabel background;
    private javax.swing.JLabel carbobarLabel;
    private javax.swing.JProgressBar carbobarProgressBar;
    public javax.swing.JComboBox<String> comboBoxFood;
    private javax.swing.JLabel foodIcon;
    public javax.swing.JComboBox<String> homeComboBox;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel newReportLabel;
    private javax.swing.JScrollPane newReportPane;
    private javax.swing.JTextArea newReportTextArea;
    public javax.swing.JButton nextPageButton;
    public javax.swing.JComboBox<String> stuffComboBox;
    private javax.swing.JLabel stuffIcon;
    public javax.swing.JComboBox<String> travelComboBox;
    private javax.swing.JLabel travelIcon;

}
