package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class HouseQuestionPanel extends javax.swing.JPanel {

    public HouseQuestionPanel() {
        initComponents();
    }


    private void initComponents() {

        houseLabel = new javax.swing.JLabel();
        electricityLabel = new javax.swing.JLabel();
        heatingOilLabel = new javax.swing.JLabel();
        naturalGasLabel = new javax.swing.JLabel();
        coalLabel = new javax.swing.JLabel();
        LPGLabel = new javax.swing.JLabel();
        propaneLabel = new javax.swing.JLabel();
        woodenPelletsLabel = new javax.swing.JLabel();
        electricityTextField = new javax.swing.JTextField();
        naturalGasTextField = new javax.swing.JTextField();
        coalTextField = new javax.swing.JTextField();
        LPGTextField = new javax.swing.JTextField();
        woodenPelletsTextField = new javax.swing.JTextField();
        heatingOilTextField = new javax.swing.JTextField();
        propaneTextField = new javax.swing.JTextField();
        aMessageToUserLabel = new javax.swing.JLabel();
        numberPeopleLabel = new javax.swing.JLabel();
        numOfPeople = new javax.swing.JTextField();
        kwhLabel = new javax.swing.JLabel();
        cubicMetersLabel = new javax.swing.JLabel();
        metricTonnesLabel1 = new javax.swing.JLabel();
        metricTonnesLabel2 = new javax.swing.JLabel();
        litresLabel1 = new javax.swing.JLabel();
        litresLabel3 = new javax.swing.JLabel();
        litresLabel2 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        houseLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        houseLabel.setForeground(new java.awt.Color(255, 255, 255));
        houseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        houseLabel.setText("HOUSE");
        add(houseLabel);
        houseLabel.setBounds(560, 80, 160, 40);

        electricityLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        electricityLabel.setForeground(new java.awt.Color(255, 255, 255));
        electricityLabel.setText("Electricity");
        add(electricityLabel);
        electricityLabel.setBounds(230, 300, 90, 30);

        heatingOilLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        heatingOilLabel.setForeground(new java.awt.Color(255, 255, 255));
        heatingOilLabel.setText("Heating Oil");
        add(heatingOilLabel);
        heatingOilLabel.setBounds(670, 360, 90, 30);

        naturalGasLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        naturalGasLabel.setForeground(new java.awt.Color(255, 255, 255));
        naturalGasLabel.setText("Natural Gas");
        add(naturalGasLabel);
        naturalGasLabel.setBounds(230, 360, 90, 30);

        coalLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        coalLabel.setForeground(new java.awt.Color(255, 255, 255));
        coalLabel.setText("Coal");
        add(coalLabel);
        coalLabel.setBounds(230, 420, 90, 30);

        LPGLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LPGLabel.setForeground(new java.awt.Color(255, 255, 255));
        LPGLabel.setText("LPG");
        add(LPGLabel);
        LPGLabel.setBounds(230, 480, 90, 30);

        propaneLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        propaneLabel.setForeground(new java.awt.Color(255, 255, 255));
        propaneLabel.setText("Propane");
        add(propaneLabel);
        propaneLabel.setBounds(670, 420, 90, 30);

        woodenPelletsLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        woodenPelletsLabel.setForeground(new java.awt.Color(255, 255, 255));
        woodenPelletsLabel.setText("Wooden Pellets");
        add(woodenPelletsLabel);
        woodenPelletsLabel.setBounds(670, 300, 90, 30);

        electricityTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        electricityTextField.setText("Enter here");
        add(electricityTextField);
        electricityTextField.setBounds(340, 300, 100, 30);

        naturalGasTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        naturalGasTextField.setText("Enter here");
        add(naturalGasTextField);
        naturalGasTextField.setBounds(340, 360, 100, 30);

        coalTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        coalTextField.setText("Enter here");
        add(coalTextField);
        coalTextField.setBounds(340, 420, 100, 30);

        LPGTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LPGTextField.setText("Enter here");
        add(LPGTextField);
        LPGTextField.setBounds(340, 480, 100, 30);

        woodenPelletsTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        woodenPelletsTextField.setText("Enter here");
        add(woodenPelletsTextField);
        woodenPelletsTextField.setBounds(810, 300, 100, 30);

        heatingOilTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        heatingOilTextField.setText("Enter here");
        add(heatingOilTextField);
        heatingOilTextField.setBounds(810, 360, 100, 30);

        propaneTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        propaneTextField.setText("Enter here");
        add(propaneTextField);
        propaneTextField.setBounds(810, 420, 100, 30);

        aMessageToUserLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        aMessageToUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        aMessageToUserLabel.setText("Your individual Carbopoint will be calculated by dividing the total consumption to the number of people in the house. \"1\" calculates the full household.");
        add(aMessageToUserLabel);
        aMessageToUserLabel.setBounds(230, 170, 820, 20);

        numberPeopleLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numberPeopleLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberPeopleLabel.setText("Please enter the number of people who live in our household:");
        add(numberPeopleLabel);
        numberPeopleLabel.setBounds(230, 200, 340, 20);

        numOfPeople.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numOfPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfPeopleActionPerformed(evt);
            }
        });
        add(numOfPeople);
        numOfPeople.setBounds(580, 200, 50, 20);

        kwhLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kwhLabel.setForeground(new java.awt.Color(255, 255, 255));
        kwhLabel.setText("kwh");
        add(kwhLabel);
        kwhLabel.setBounds(460, 300, 90, 30);

        cubicMetersLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        cubicMetersLabel.setForeground(new java.awt.Color(255, 255, 255));
        cubicMetersLabel.setText("cubic meters");
        add(cubicMetersLabel);
        cubicMetersLabel.setBounds(460, 360, 90, 30);

        metricTonnesLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        metricTonnesLabel1.setForeground(new java.awt.Color(255, 255, 255));
        metricTonnesLabel1.setText("metric tonnes");
        add(metricTonnesLabel1);
        metricTonnesLabel1.setBounds(460, 420, 90, 30);

        metricTonnesLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        metricTonnesLabel2.setForeground(new java.awt.Color(255, 255, 255));
        metricTonnesLabel2.setText("metric tonnes");
        add(metricTonnesLabel2);
        metricTonnesLabel2.setBounds(930, 300, 90, 30);

        litresLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        litresLabel1.setForeground(new java.awt.Color(255, 255, 255));
        litresLabel1.setText("litres");
        add(litresLabel1);
        litresLabel1.setBounds(460, 480, 90, 30);

        litresLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        litresLabel3.setForeground(new java.awt.Color(255, 255, 255));
        litresLabel3.setText("litres");
        add(litresLabel3);
        litresLabel3.setBounds(930, 360, 90, 30);

        litresLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        litresLabel2.setForeground(new java.awt.Color(255, 255, 255));
        litresLabel2.setText("litres");
        add(litresLabel2);
        litresLabel2.setBounds(930, 420, 90, 30);

        goBackButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        goBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png"))); // NOI18N
        goBackButton.setText("Go Back");
        add(goBackButton);
        goBackButton.setBounds(50, 620, 110, 35);

        nextButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png"))); // NOI18N
        nextButton.setText("Next");
        add(nextButton);
        nextButton.setBounds(1120, 620, 110, 35);

        background.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private void numOfPeopleActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JLabel LPGLabel;
    private javax.swing.JTextField LPGTextField;
    private javax.swing.JLabel aMessageToUserLabel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel coalLabel;
    private javax.swing.JTextField coalTextField;
    private javax.swing.JLabel cubicMetersLabel;
    private javax.swing.JLabel electricityLabel;
    private javax.swing.JTextField electricityTextField;
    public javax.swing.JButton goBackButton;
    private javax.swing.JLabel heatingOilLabel;
    private javax.swing.JTextField heatingOilTextField;
    private javax.swing.JLabel houseLabel;
    private javax.swing.JLabel kwhLabel;
    private javax.swing.JLabel litresLabel1;
    private javax.swing.JLabel litresLabel2;
    private javax.swing.JLabel litresLabel3;
    private javax.swing.JLabel metricTonnesLabel1;
    private javax.swing.JLabel metricTonnesLabel2;
    private javax.swing.JLabel naturalGasLabel;
    private javax.swing.JTextField naturalGasTextField;
    public javax.swing.JButton nextButton;
    private javax.swing.JTextField numOfPeople;
    private javax.swing.JLabel numberPeopleLabel;
    private javax.swing.JLabel propaneLabel;
    private javax.swing.JTextField propaneTextField;
    private javax.swing.JLabel woodenPelletsLabel;
    private javax.swing.JTextField woodenPelletsTextField;

}
