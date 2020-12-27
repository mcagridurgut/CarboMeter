package gui.View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * House question panel of the Carbometer desktop app. Draws the panel by using swing components.
 * @author Eren Özen, Onur Ertunç
 */
public class HouseQuestionPanel extends JPanel {

    // Properties - components
    private JLabel LPGLabel;
    public JTextField LPGTextField;
    private JLabel aMessageToUserLabel;
    private JLabel background;
    private JLabel coalLabel;
    public JTextField coalTextField;
    private JLabel cubicMetersLabel;
    private JLabel electricityLabel;
    public JTextField electricityTextField;
    public JButton goBackButton;
    private JLabel heatingOilLabel;
    public JTextField heatingOilTextField;
    private JLabel houseLabel;
    private JLabel kwhLabel;
    private JLabel litresLabel1;
    private JLabel litresLabel2;
    private JLabel litresLabel3;
    private JLabel metricTonnesLabel1;
    private JLabel metricTonnesLabel2;
    private JLabel naturalGasLabel;
    public JTextField naturalGasTextField;
    public JButton nextButton;
    public JTextField numOfPeople;
    private JLabel numberPeopleLabel;
    private JLabel propaneLabel;
    public JTextField propaneTextField;
    private JLabel woodenPelletsLabel;
    public JTextField woodenPelletsTextField;

    /**
     * constructor of the class. calls initComponents method
     */
    public HouseQuestionPanel() {
        initComponents();
    }

    /**
     * initializes the components of the panel
     */
    private void initComponents() {

        // initialization of the components
        houseLabel = new JLabel();
        electricityLabel = new JLabel();
        heatingOilLabel = new JLabel();
        naturalGasLabel = new JLabel();
        coalLabel = new JLabel();
        LPGLabel = new JLabel();
        propaneLabel = new JLabel();
        woodenPelletsLabel = new JLabel();
        electricityTextField = new JTextField();
        naturalGasTextField = new JTextField();
        coalTextField = new JTextField();
        LPGTextField = new JTextField();
        woodenPelletsTextField = new JTextField();
        heatingOilTextField = new JTextField();
        propaneTextField = new JTextField();
        aMessageToUserLabel = new JLabel();
        numberPeopleLabel = new JLabel();
        numOfPeople = new JTextField();
        kwhLabel = new JLabel();
        cubicMetersLabel = new JLabel();
        metricTonnesLabel1 = new JLabel();
        metricTonnesLabel2 = new JLabel();
        litresLabel1 = new JLabel();
        litresLabel3 = new JLabel();
        litresLabel2 = new JLabel();
        goBackButton = new JButton();
        nextButton = new JButton();
        background = new JLabel();

        // size and layout settings
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // houseLabel alignment
        houseLabel.setFont(new Font("Calibri", 1, 48));
        houseLabel.setForeground(new Color(255, 255, 255));
        houseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        houseLabel.setText("HOUSE");
        add(houseLabel);
        houseLabel.setBounds(560, 80, 160, 60);

        // electricity label alignment
        electricityLabel.setFont(new Font("Arial", 3, 12));
        electricityLabel.setForeground(new Color(255, 255, 255));
        electricityLabel.setText("Electricity");
        add(electricityLabel);
        electricityLabel.setBounds(230, 300, 90, 30);

        // heatingOilLabel alignment
        heatingOilLabel.setFont(new Font("Arial", 3, 12));
        heatingOilLabel.setForeground(new Color(255, 255, 255));
        heatingOilLabel.setText("Heating Oil");
        add(heatingOilLabel);
        heatingOilLabel.setBounds(670, 360, 90, 30);

        // naturalGasLabel alignment
        naturalGasLabel.setFont(new Font("Arial", 3, 12));
        naturalGasLabel.setForeground(new Color(255, 255, 255));
        naturalGasLabel.setText("Natural Gas");
        add(naturalGasLabel);
        naturalGasLabel.setBounds(230, 360, 90, 30);

        // coalLabel alignment
        coalLabel.setFont(new Font("Arial", 3, 12));
        coalLabel.setForeground(new Color(255, 255, 255));
        coalLabel.setText("Coal");
        add(coalLabel);
        coalLabel.setBounds(230, 420, 90, 30);

        // lpgLabel alignment
        LPGLabel.setFont(new Font("Arial", 3, 12));
        LPGLabel.setForeground(new Color(255, 255, 255));
        LPGLabel.setText("LPG");
        add(LPGLabel);
        LPGLabel.setBounds(230, 480, 90, 30);

        // propaneLabel alignment
        propaneLabel.setFont(new Font("Arial", 3, 12));
        propaneLabel.setForeground(new Color(255, 255, 255));
        propaneLabel.setText("Propane");
        add(propaneLabel);
        propaneLabel.setBounds(670, 420, 90, 30);

        // woodenPelletsLabel alignment
        woodenPelletsLabel.setFont(new Font("Arial", 3, 12));
        woodenPelletsLabel.setForeground(new Color(255, 255, 255));
        woodenPelletsLabel.setText("Wooden Pellets");
        add(woodenPelletsLabel);
        woodenPelletsLabel.setBounds(670, 300, 90, 30);

        // electricityLabel alignment
        electricityTextField.setFont(new Font("Arial", 0, 12));
        electricityTextField.setUI(new JTextFieldHintUI("Electricity", Color.gray));
        add(electricityTextField);
        electricityTextField.setBounds(340, 300, 100, 30);

        // naturalGasTextField alignment
        naturalGasTextField.setFont(new Font("Arial", 0, 12));
        naturalGasTextField.setUI(new JTextFieldHintUI("Enter here", Color.gray));
        add(naturalGasTextField);
        naturalGasTextField.setBounds(340, 360, 100, 30);

        // coalTextField alignment
        coalTextField.setFont(new Font("Arial", 0, 12));
        coalTextField.setUI(new JTextFieldHintUI("Enter here", Color.gray));
        add(coalTextField);
        coalTextField.setBounds(340, 420, 100, 30);

        // lpgTextField alignment
        LPGTextField.setFont(new Font("Arial", 0, 12));
        LPGTextField.setUI(new JTextFieldHintUI("Enter here", Color.gray));
        add(LPGTextField);
        LPGTextField.setBounds(340, 480, 100, 30);

        // woodenPelletsTextField allignment
        woodenPelletsTextField.setFont(new Font("Arial", 0, 12));
        woodenPelletsTextField.setUI(new JTextFieldHintUI("Enter here", Color.gray));
        add(woodenPelletsTextField);
        woodenPelletsTextField.setBounds(810, 300, 100, 30);

        // heatingOilTextField alignment
        heatingOilTextField.setFont(new Font("Arial", 0, 12));
        heatingOilTextField.setUI(new JTextFieldHintUI("Enter here", Color.gray));
        add(heatingOilTextField);
        heatingOilTextField.setBounds(810, 360, 100, 30);

        // propaneTextField alignment
        propaneTextField.setFont(new Font("Arial", 0, 12));
        propaneTextField.setUI(new JTextFieldHintUI("Enter here", Color.gray));
        add(propaneTextField);
        propaneTextField.setBounds(810, 420, 100, 30);

        // aMessageToUserLabel alignment
        aMessageToUserLabel.setFont(new Font("Arial", 0, 12));
        aMessageToUserLabel.setForeground(new Color(255, 255, 255));
        aMessageToUserLabel.setText("Your individual Carbopoint will be calculated by dividing the total consumption to the number of people in the house. \"1\" calculates the full household.");
        add(aMessageToUserLabel);
        aMessageToUserLabel.setBounds(230, 170, 820, 20);

        // numberPeopleLabel alignment
        numberPeopleLabel.setFont(new Font("Arial", 0, 12));
        numberPeopleLabel.setForeground(new Color(255, 255, 255));
        numberPeopleLabel.setText("Please enter the number of people who live in our household:");
        add(numberPeopleLabel);
        numberPeopleLabel.setBounds(230, 200, 340, 20);

        // numOfPeople textfield alignment
        numOfPeople.setFont(new Font("Arial", 0, 12));
        numOfPeople.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numOfPeopleActionPerformed(evt);
            }
        });
        add(numOfPeople);
        numOfPeople.setBounds(580, 200, 50, 20);

        // kwh label alignment
        kwhLabel.setFont(new Font("Arial", 3, 12));
        kwhLabel.setForeground(new Color(255, 255, 255));
        kwhLabel.setText("kwh");
        add(kwhLabel);
        kwhLabel.setBounds(460, 300, 90, 30);

        // cubicMetersLabel alignment
        cubicMetersLabel.setFont(new Font("Arial", 3, 12));
        cubicMetersLabel.setForeground(new Color(255, 255, 255));
        cubicMetersLabel.setText("cubic meters");
        add(cubicMetersLabel);
        cubicMetersLabel.setBounds(460, 360, 90, 30);

        // metricTonnesLabel alignment
        metricTonnesLabel1.setFont(new Font("Arial", 3, 12));
        metricTonnesLabel1.setForeground(new Color(255, 255, 255));
        metricTonnesLabel1.setText("metric tonnes");
        add(metricTonnesLabel1);
        metricTonnesLabel1.setBounds(460, 420, 90, 30);

        // metricTonnesLabel alignment
        metricTonnesLabel2.setFont(new Font("Arial", 3, 12));
        metricTonnesLabel2.setForeground(new Color(255, 255, 255));
        metricTonnesLabel2.setText("metric tonnes");
        add(metricTonnesLabel2);
        metricTonnesLabel2.setBounds(930, 300, 90, 30);

        // litresLabel alignment
        litresLabel1.setFont(new Font("Arial", 3, 12));
        litresLabel1.setForeground(new Color(255, 255, 255));
        litresLabel1.setText("litres");
        add(litresLabel1);
        litresLabel1.setBounds(460, 480, 90, 30);

        // litresLabel alignment
        litresLabel3.setFont(new Font("Arial", 3, 12));
        litresLabel3.setForeground(new Color(255, 255, 255));
        litresLabel3.setText("litres");
        add(litresLabel3);
        litresLabel3.setBounds(930, 360, 90, 30);

        // litresLabel alignment
        litresLabel2.setFont(new Font("Arial", 3, 12));
        litresLabel2.setForeground(new Color(255, 255, 255));
        litresLabel2.setText("litres");
        add(litresLabel2);
        litresLabel2.setBounds(930, 420, 90, 30);

        // goBackButton button allignment
        goBackButton.setFont(new Font("Arial", 0, 12));
        goBackButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png")));
        goBackButton.setText("Go Back");
        add(goBackButton);
        goBackButton.setBounds(50, 620, 110, 35);

        // nextButton allignment
        nextButton.setFont(new Font("Arial", 0, 12));
        nextButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png")));
        nextButton.setText("Next");
        add(nextButton);
        nextButton.setBounds(1120, 620, 110, 35);

        // background alignment
        background.setFont(new Font("Calibri", 0, 11));
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    } // end of the initComponents method

    /**
     * check the Gui class (controller of the project)
     * @param evt action event
     */
    private void numOfPeopleActionPerformed(ActionEvent evt) {

    }

} // end of the class
