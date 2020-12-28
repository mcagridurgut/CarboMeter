package gui.View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * TransportationQuestionPanel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */
public class TransportationQuestionPanel extends JPanel {

    // Properties - components
    private JLabel background;
    private JLabel carLabel;
    private JTextField carMileageTextField;
    private JLabel efficiencyOfCarLabel;
    private JTextField efficiencyOfCarTextField;
    private JLabel enterEfficiencyLabel;
    private JTextField flightDistanceTextField;
    private JLabel flightsLabel;
    private JLabel fuelTypeLabel;
    public JButton goBackButton;
    private JComboBox<String> jComboBox1;
    private JLabel kilometersYearLabel;
    private JLabel kilometersYearLabel2;
    private JLabel kilometersYearLabel3;
    private JLabel liters100kilometersLabel;
    private JLabel liters100kilometersLabel2;
    private JLabel mileageInfoLabel;
    private JLabel mileageInfoLabel2;
    private JComboBox<String> motorbikeComboBox;
    private JTextField motorbikeEfficiencyTextField;
    private JLabel motorbikeLabel;
    private JTextField motorbikeMileageTextField;
    public JButton nextButton;
    private JLabel selectMotorbikeTypeLabel;
    private JLabel transportationLabel;
    private JLabel travelledDistanceInfoField;

    /**
     * constructor of the TransportationQuestionPanel. calls the initComponents
     */
    public TransportationQuestionPanel() {
        initComponents();
    }

    /**
     * initializes the components of the class
     */
    private void initComponents() {

        // initialization of the components
        transportationLabel = new JLabel();
        flightsLabel = new JLabel();
        travelledDistanceInfoField = new JLabel();
        flightDistanceTextField = new JTextField();
        kilometersYearLabel = new JLabel();
        carLabel = new JLabel();
        mileageInfoLabel = new JLabel();
        carMileageTextField = new JTextField();
        kilometersYearLabel2 = new JLabel();
        efficiencyOfCarLabel = new JLabel();
        efficiencyOfCarTextField = new JTextField();
        liters100kilometersLabel = new JLabel();
        jComboBox1 = new JComboBox<>();
        fuelTypeLabel = new JLabel();
        motorbikeLabel = new JLabel();
        mileageInfoLabel2 = new JLabel();
        motorbikeMileageTextField = new JTextField();
        kilometersYearLabel3 = new JLabel();
        motorbikeComboBox = new JComboBox<>();
        selectMotorbikeTypeLabel = new JLabel();
        enterEfficiencyLabel = new JLabel();
        motorbikeEfficiencyTextField = new JTextField();
        liters100kilometersLabel2 = new JLabel();
        goBackButton = new JButton();
        nextButton = new JButton();
        background = new JLabel();

        // imension of the panel and layout settings
        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        // transportationLabel alignments
        transportationLabel.setFont(new Font("Calibri", 1, 48));
        transportationLabel.setForeground(new Color(255, 255, 255));
        transportationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        transportationLabel.setText("TRANSPORTATION");
        add(transportationLabel);
        transportationLabel.setBounds(455, 80, 374, 60);

        // flightsLabel alignments
        flightsLabel.setFont(new Font("Arial", 1, 18));
        flightsLabel.setForeground(new Color(255, 255, 255));
        flightsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        flightsLabel.setText("Flight Statistics");
        add(flightsLabel);
        flightsLabel.setBounds(260, 150, 140, 30);

        // travelledDistanceField alignments
        travelledDistanceInfoField.setFont(new Font("Arial", 3, 12));
        travelledDistanceInfoField.setForeground(new Color(255, 255, 255));
        travelledDistanceInfoField.setText("Enter the total travelled distance:");
        add(travelledDistanceInfoField);
        travelledDistanceInfoField.setBounds(260, 190, 190, 30);

        // flightDistanceTextField alignments
        flightDistanceTextField.setFont(new Font("Arial", 1, 12));
        flightDistanceTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                flightDistanceTextFieldActionPerformed(evt);
            }
        });
        flightDistanceTextField.setUI(new JTextFieldHintUI("Flight Distance", Color.gray));
        add(flightDistanceTextField);
        flightDistanceTextField.setBounds(460, 190, 150, 30);

        // kilometersYearLabel alignments
        kilometersYearLabel.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel.setForeground(new Color(255, 255, 255));
        kilometersYearLabel.setText("kilometers/year");
        add(kilometersYearLabel);
        kilometersYearLabel.setBounds(620, 190, 100, 30);

        // carLabel alignments
        carLabel.setFont(new Font("Arial", 1, 18));
        carLabel.setForeground(new Color(255, 255, 255));
        carLabel.setText("Car Statistics");
        add(carLabel);
        carLabel.setBounds(260, 240, 130, 30);

        // mileageInfoLabel alignments
        mileageInfoLabel.setFont(new Font("Arial", 3, 12));
        mileageInfoLabel.setForeground(new Color(255, 255, 255));
        mileageInfoLabel.setText("Enter the mileage:");
        add(mileageInfoLabel);
        mileageInfoLabel.setBounds(260, 280, 190, 30);

        // carMileageTextField alignments
        carMileageTextField.setFont(new Font("Arial", 1, 12));
        carMileageTextField.setUI(new JTextFieldHintUI("Car Mileage", Color.gray));
        add(carMileageTextField);
        carMileageTextField.setBounds(460, 280, 150, 30);

        // kilometersYearLabel2 alignments
        kilometersYearLabel2.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel2.setForeground(new Color(255, 255, 255));
        kilometersYearLabel2.setText("kilometers/year");
        add(kilometersYearLabel2);
        kilometersYearLabel2.setBounds(620, 280, 100, 30);

        // efficiencyCarLabel alignments
        efficiencyOfCarLabel.setFont(new Font("Arial", 3, 12));
        efficiencyOfCarLabel.setForeground(new Color(255, 255, 255));
        efficiencyOfCarLabel.setText("Enter the efficiency of your car:");
        add(efficiencyOfCarLabel);
        efficiencyOfCarLabel.setBounds(260, 320, 190, 30);

        // efficiencyOfCarTextField alignments
        efficiencyOfCarTextField.setFont(new Font("Arial", 1, 12));
        efficiencyOfCarTextField.setUI(new JTextFieldHintUI("Efficiency Of Car", Color.gray));
        add(efficiencyOfCarTextField);
        efficiencyOfCarTextField.setBounds(460, 320, 150, 30);

        // liters100kilometersLabel alignments
        liters100kilometersLabel.setFont(new Font("Arial", 3, 12));
        liters100kilometersLabel.setForeground(new Color(255, 255, 255));
        liters100kilometersLabel.setText("Litres/100kilometers");
        add(liters100kilometersLabel);
        liters100kilometersLabel.setBounds(620, 320, 118, 30);

        // jComboBox alignments
        jComboBox1.setFont(new Font("Arial", 1, 12));
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Petrol", "Diesel", "LPG", "CNG" }));
        add(jComboBox1);
        jComboBox1.setBounds(880, 320, 100, 30);

        // fuelTypeLabel alignments
        fuelTypeLabel.setFont(new Font("Arial", 3, 12));
        fuelTypeLabel.setForeground(new Color(255, 255, 255));
        fuelTypeLabel.setText("Fuel Type");
        add(fuelTypeLabel);
        fuelTypeLabel.setBounds(810, 320, 60, 30);

        // motorbikeLabel alignments
        motorbikeLabel.setFont(new Font("Arial", 1, 18));
        motorbikeLabel.setForeground(new Color(255, 255, 255));
        motorbikeLabel.setText("Motorbike Statistics");
        add(motorbikeLabel);
        motorbikeLabel.setBounds(260, 380, 180, 30);

        // mileageInfoLabel2 alignments
        mileageInfoLabel2.setFont(new Font("Arial", 3, 12));
        mileageInfoLabel2.setForeground(new Color(255, 255, 255));
        mileageInfoLabel2.setText("Enter the mileage:");
        add(mileageInfoLabel2);
        mileageInfoLabel2.setBounds(260, 420, 190, 30);

        // motorbikeMileageTextField alignments
        motorbikeMileageTextField.setFont(new Font("Arial", 1, 12));
        motorbikeMileageTextField.setUI(new JTextFieldHintUI("Motorbike Mileage", Color.gray));
        add(motorbikeMileageTextField);
        motorbikeMileageTextField.setBounds(460, 420, 150, 30);

        // kilometersYearLabel3 alignments
        kilometersYearLabel3.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel3.setForeground(new Color(255, 255, 255));
        kilometersYearLabel3.setText("kilometers/year");
        add(kilometersYearLabel3);
        kilometersYearLabel3.setBounds(620, 420, 100, 30);

        // motorbikeComboBox alignments
        motorbikeComboBox.setFont(new Font("Arial", 1, 12));
        motorbikeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "- Select this for specific efficiency -", "Small Motorbike - Moped - Scooter (up to 125cc)", "Medium Motorbike (125cc - 500cc)", "Large Motorbike (over 500cc) " }));
        add(motorbikeComboBox);
        motorbikeComboBox.setBounds(410, 460, 300, 30);

        // selectMotorbikeTypeLabel alignments
        selectMotorbikeTypeLabel.setFont(new Font("Arial", 3, 12));
        selectMotorbikeTypeLabel.setForeground(new Color(255, 255, 255));
        selectMotorbikeTypeLabel.setText("Select type:");
        add(selectMotorbikeTypeLabel);
        selectMotorbikeTypeLabel.setBounds(260, 460, 140, 30);

        // enterEfficiencyLabel alignments
        enterEfficiencyLabel.setFont(new Font("Arial", 3, 12));
        enterEfficiencyLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterEfficiencyLabel.setText("or enter efficiency:");
        add(enterEfficiencyLabel);
        enterEfficiencyLabel.setBounds(720, 460, 110, 30);

        // motorbikeEfficiencyTextField alignments
        motorbikeEfficiencyTextField.setFont(new Font("Arial", 3, 12));
        motorbikeEfficiencyTextField.setUI(new JTextFieldHintUI("Motorbike Efficiency", Color.gray));
        motorbikeEfficiencyTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                motorbikeEfficiencyTextFieldActionPerformed(evt);
            }
        });
        add(motorbikeEfficiencyTextField);
        motorbikeEfficiencyTextField.setBounds(840, 460, 80, 30);

        // liters100kilometersLabel2 alignment
        liters100kilometersLabel2.setFont(new Font("Arial", 3, 12));
        liters100kilometersLabel2.setForeground(new Color(255, 255, 255));
        liters100kilometersLabel2.setText("Litres/100kilometers");
        add(liters100kilometersLabel2);
        liters100kilometersLabel2.setBounds(930, 460, 120, 30);

        // goBackButton alignments
        goBackButton.setFont(new Font("Arial", 0, 12));
        goBackButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png")));
        goBackButton.setText("Go Back");
        add(goBackButton);
        goBackButton.setBounds(50, 620, 110, 35);

        // nextButton alignments
        nextButton.setFont(new Font("Arial", 0, 12));
        nextButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png")));
        nextButton.setText("Next");
        add(nextButton);
        nextButton.setBounds(1120, 620, 110, 35);

        // background
        background.setFont(new Font("Calibri", 0, 11));
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    /**
     * check the Gui class for this method. Implemented as controller in Gui
     * @param evt action event
     */
    private void flightDistanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * check the Gui class for this method. Implemented as controller in Gui
     * @param evt action event
     */
    private void motorbikeEfficiencyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

} // end of the class
