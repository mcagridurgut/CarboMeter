package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class TransportationQuestionPanel extends javax.swing.JPanel {

    public TransportationQuestionPanel() {
        initComponents();
    }

    private void initComponents() {

        transportationLabel = new javax.swing.JLabel();
        flightsLabel = new javax.swing.JLabel();
        travelledDistanceInfoField = new javax.swing.JLabel();
        flightDistanceTextField = new javax.swing.JTextField();
        kilometersYearLabel = new javax.swing.JLabel();
        carLabel = new javax.swing.JLabel();
        mileageInfoLabel = new javax.swing.JLabel();
        carMileageTextField = new javax.swing.JTextField();
        kilometersYearLabel2 = new javax.swing.JLabel();
        efficiencyOfCarLabel = new javax.swing.JLabel();
        efficiencyOfCarTextField = new javax.swing.JTextField();
        liters100kilometersLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        fuelTypeLabel = new javax.swing.JLabel();
        motorbikeLabel = new javax.swing.JLabel();
        mileageInfoLabel2 = new javax.swing.JLabel();
        motorbikeMileageTextField = new javax.swing.JTextField();
        kilometersYearLabel3 = new javax.swing.JLabel();
        motorbikeComboBox = new javax.swing.JComboBox<>();
        selectMotorbikeTypeLabel = new javax.swing.JLabel();
        enterEfficiencyLabel = new javax.swing.JLabel();
        motorbikeEfficiencyTextField = new javax.swing.JTextField();
        liters100kilometersLabel2 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        transportationLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        transportationLabel.setForeground(new java.awt.Color(255, 255, 255));
        transportationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transportationLabel.setText("TRANSPORTATION");
        add(transportationLabel);
        transportationLabel.setBounds(455, 80, 374, 60);

        flightsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        flightsLabel.setForeground(new java.awt.Color(255, 255, 255));
        flightsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flightsLabel.setText("Flight Statistics");
        add(flightsLabel);
        flightsLabel.setBounds(260, 150, 140, 30);

        travelledDistanceInfoField.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        travelledDistanceInfoField.setForeground(new java.awt.Color(255, 255, 255));
        travelledDistanceInfoField.setText("Enter the total travelled distance:");
        add(travelledDistanceInfoField);
        travelledDistanceInfoField.setBounds(260, 190, 190, 30);

        flightDistanceTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        flightDistanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightDistanceTextFieldActionPerformed(evt);
            }
        });
        add(flightDistanceTextField);
        flightDistanceTextField.setBounds(460, 190, 150, 30);

        kilometersYearLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel.setText("kilometers/year");
        add(kilometersYearLabel);
        kilometersYearLabel.setBounds(620, 190, 100, 30);

        carLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        carLabel.setForeground(new java.awt.Color(255, 255, 255));
        carLabel.setText("Car Statistics");
        add(carLabel);
        carLabel.setBounds(260, 240, 130, 30);

        mileageInfoLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        mileageInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
        mileageInfoLabel.setText("Enter the mileage:");
        add(mileageInfoLabel);
        mileageInfoLabel.setBounds(260, 280, 190, 30);

        carMileageTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(carMileageTextField);
        carMileageTextField.setBounds(460, 280, 150, 30);

        kilometersYearLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel2.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel2.setText("kilometers/year");
        add(kilometersYearLabel2);
        kilometersYearLabel2.setBounds(620, 280, 100, 30);

        efficiencyOfCarLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        efficiencyOfCarLabel.setForeground(new java.awt.Color(255, 255, 255));
        efficiencyOfCarLabel.setText("Enter the efficiency of your car:");
        add(efficiencyOfCarLabel);
        efficiencyOfCarLabel.setBounds(260, 320, 190, 30);

        efficiencyOfCarTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(efficiencyOfCarTextField);
        efficiencyOfCarTextField.setBounds(460, 320, 150, 30);

        liters100kilometersLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        liters100kilometersLabel.setForeground(new java.awt.Color(255, 255, 255));
        liters100kilometersLabel.setText("Litres/100kilometers");
        add(liters100kilometersLabel);
        liters100kilometersLabel.setBounds(620, 320, 118, 30);

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol", "Diesel", "LPG", "CNG" }));
        add(jComboBox1);
        jComboBox1.setBounds(880, 320, 100, 30);

        fuelTypeLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        fuelTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        fuelTypeLabel.setText("Fuel Type");
        add(fuelTypeLabel);
        fuelTypeLabel.setBounds(810, 320, 60, 30);

        motorbikeLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        motorbikeLabel.setForeground(new java.awt.Color(255, 255, 255));
        motorbikeLabel.setText("Motorbike Statistics");
        add(motorbikeLabel);
        motorbikeLabel.setBounds(260, 380, 180, 30);

        mileageInfoLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        mileageInfoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        mileageInfoLabel2.setText("Enter the mileage:");
        add(mileageInfoLabel2);
        mileageInfoLabel2.setBounds(260, 420, 190, 30);

        motorbikeMileageTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        add(motorbikeMileageTextField);
        motorbikeMileageTextField.setBounds(460, 420, 150, 30);

        kilometersYearLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel3.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel3.setText("kilometers/year");
        add(kilometersYearLabel3);
        kilometersYearLabel3.setBounds(620, 420, 100, 30);

        motorbikeComboBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        motorbikeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select this for specific efficiency -", "Small Motorbike - Moped - Scooter (up to 125cc)", "Medium Motorbike (125cc - 500cc)", "Large Motorbike (over 500cc) " }));
        add(motorbikeComboBox);
        motorbikeComboBox.setBounds(410, 460, 300, 30);

        selectMotorbikeTypeLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        selectMotorbikeTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectMotorbikeTypeLabel.setText("Select type:");
        add(selectMotorbikeTypeLabel);
        selectMotorbikeTypeLabel.setBounds(260, 460, 140, 30);

        enterEfficiencyLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        enterEfficiencyLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterEfficiencyLabel.setText("or enter efficiency:");
        add(enterEfficiencyLabel);
        enterEfficiencyLabel.setBounds(720, 460, 110, 30);

        motorbikeEfficiencyTextField.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        motorbikeEfficiencyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorbikeEfficiencyTextFieldActionPerformed(evt);
            }
        });
        add(motorbikeEfficiencyTextField);
        motorbikeEfficiencyTextField.setBounds(840, 460, 80, 30);

        liters100kilometersLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        liters100kilometersLabel2.setForeground(new java.awt.Color(255, 255, 255));
        liters100kilometersLabel2.setText("Litres/100kilometers");
        add(liters100kilometersLabel2);
        liters100kilometersLabel2.setBounds(930, 460, 120, 30);

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

    private void flightDistanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void motorbikeEfficiencyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JLabel background;
    private javax.swing.JLabel carLabel;
    private javax.swing.JTextField carMileageTextField;
    private javax.swing.JLabel efficiencyOfCarLabel;
    private javax.swing.JTextField efficiencyOfCarTextField;
    private javax.swing.JLabel enterEfficiencyLabel;
    private javax.swing.JTextField flightDistanceTextField;
    private javax.swing.JLabel flightsLabel;
    private javax.swing.JLabel fuelTypeLabel;
    public javax.swing.JButton goBackButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel kilometersYearLabel;
    private javax.swing.JLabel kilometersYearLabel2;
    private javax.swing.JLabel kilometersYearLabel3;
    private javax.swing.JLabel liters100kilometersLabel;
    private javax.swing.JLabel liters100kilometersLabel2;
    private javax.swing.JLabel mileageInfoLabel;
    private javax.swing.JLabel mileageInfoLabel2;
    private javax.swing.JComboBox<String> motorbikeComboBox;
    private javax.swing.JTextField motorbikeEfficiencyTextField;
    private javax.swing.JLabel motorbikeLabel;
    private javax.swing.JTextField motorbikeMileageTextField;
    public javax.swing.JButton nextButton;
    private javax.swing.JLabel selectMotorbikeTypeLabel;
    private javax.swing.JLabel transportationLabel;
    private javax.swing.JLabel travelledDistanceInfoField;

}
