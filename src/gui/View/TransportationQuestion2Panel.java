package gui.View;
import javax.swing.*;
import java.awt.*;

/**
 * TransportationQuestionPanel2 of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class TransportationQuestion2Panel extends JPanel {

    // Properties - components of the class
    private JLabel background;
    private JLabel busLabel;
    private JLabel busRailTaxiStatsLabel;
    public JTextField busTextField;
    private JLabel coachLabel;
    public JTextField coachTextField;
    public JButton goBackButton;
    private JLabel kilometersYearLabel1;
    private JLabel kilometersYearLabel2;
    private JLabel kilometersYearLabel3;
    private JLabel kilometersYearLabel4;
    private JLabel kilometersYearLabel5;
    private JLabel kilometersYearLabel6;
    private JLabel kilometersYearLabel7;
    private JLabel localTrainLabel;
    public JTextField localTrainTextField;
    private JLabel longDistanceTrainLabel;
    public JTextField longDistanceTrainTextField;
    public JButton nextButton;
    private JLabel subwayLabel;
    public JTextField subwayTextField;
    private JLabel taxiLabel;
    public JTextField taxiTextField;
    private JLabel tramLabel;
    public JTextField tramTextField;
    private JLabel transportationLabel;

    /**
     * constructor of the TransportationQuestion2Panel class. calls initComponents
     */
    public TransportationQuestion2Panel() {
        initComponents();
    }

    /**
     * initalizes the components of the class
     */
    private void initComponents() {

        //initialization of the components
        transportationLabel = new JLabel();
        busRailTaxiStatsLabel = new JLabel();
        busLabel = new JLabel();
        coachLabel = new JLabel();
        localTrainLabel = new JLabel();
        longDistanceTrainLabel = new JLabel();
        tramLabel = new JLabel();
        subwayLabel = new JLabel();
        taxiLabel = new JLabel();
        busTextField = new JTextField();
        coachTextField = new JTextField();
        localTrainTextField = new JTextField();
        longDistanceTrainTextField = new JTextField();
        tramTextField = new JTextField();
        subwayTextField = new JTextField();
        taxiTextField = new JTextField();
        kilometersYearLabel1 = new JLabel();
        kilometersYearLabel2 = new JLabel();
        kilometersYearLabel3 = new JLabel();
        kilometersYearLabel4 = new JLabel();
        kilometersYearLabel5 = new JLabel();
        kilometersYearLabel6 = new JLabel();
        kilometersYearLabel7 = new JLabel();
        goBackButton = new JButton();
        nextButton = new JButton();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // transportation label alignment (font, foreground, alignment, text and position)
        transportationLabel.setFont(new Font("Calibri", 1, 48));
        transportationLabel.setForeground(new Color(255, 255, 255));
        transportationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        transportationLabel.setText("TRANSPORTATION");
        add(transportationLabel);
        transportationLabel.setBounds(455, 80, 374, 60);

        // bus rail taxi stats label alignment (font, foreground, text and position)
        busRailTaxiStatsLabel.setFont(new Font("Arial", 1, 18));
        busRailTaxiStatsLabel.setForeground(new Color(255, 255, 255));
        busRailTaxiStatsLabel.setText("Bus, Rail and Taxi Statistics");
        add(busRailTaxiStatsLabel);
        busRailTaxiStatsLabel.setBounds(260, 150, 250, 30);

        // bus label alignment (font, foreground, text and position)
        busLabel.setFont(new Font("Arial", 3, 12));
        busLabel.setForeground(new Color(255, 255, 255));
        busLabel.setText("Bus");
        add(busLabel);
        busLabel.setBounds(260, 200, 145, 30);

        // coach label alignment (font, foreground, text and position)
        coachLabel.setFont(new java.awt.Font("Arial", 3, 12));
        coachLabel.setForeground(new java.awt.Color(255, 255, 255));
        coachLabel.setText("Coach");
        add(coachLabel);
        coachLabel.setBounds(260, 250, 145, 30);

        // local train label alignment (font, foreground, text and position)
        localTrainLabel.setFont(new Font("Arial", 3, 12));
        localTrainLabel.setForeground(new Color(255, 255, 255));
        localTrainLabel.setText("Local or Commuter Train");
        add(localTrainLabel);
        localTrainLabel.setBounds(260, 300, 145, 30);

        // long distance label alignment (font, foreground, text and position)
        longDistanceTrainLabel.setFont(new Font("Arial", 3, 12));
        longDistanceTrainLabel.setForeground(new Color(255, 255, 255));
        longDistanceTrainLabel.setText("Long Distance Train");
        add(longDistanceTrainLabel);
        longDistanceTrainLabel.setBounds(260, 350, 145, 30);

        // tram label alignment (font, foreground, text and position)
        tramLabel.setFont(new Font("Arial", 3, 12));
        tramLabel.setForeground(new Color(255, 255, 255));
        tramLabel.setText("Tram");
        add(tramLabel);
        tramLabel.setBounds(260, 400, 145, 30);

        // subway label alignment (font, foreground, text and position)
        subwayLabel.setFont(new Font("Arial", 3, 12));
        subwayLabel.setForeground(new Color(255, 255, 255));
        subwayLabel.setText("Subway");
        add(subwayLabel);
        subwayLabel.setBounds(260, 450, 145, 30);

        // taxi label alignment (font, foreground, text and position)
        taxiLabel.setFont(new Font("Arial", 3, 12));
        taxiLabel.setForeground(new Color(255, 255, 255));
        taxiLabel.setText("Taxi");
        add(taxiLabel);
        taxiLabel.setBounds(260, 500, 145, 30);

        // bus text field alignment (font, and position)
        busTextField.setFont(new Font("Arial", 1, 12));
        busTextField.setUI(new JTextFieldHintUI("Bus", Color.gray));
        add(busTextField);
        busTextField.setBounds(550, 200, 150, 30);

        // coach text field alignment (font, and position)
        coachTextField.setFont(new Font("Arial", 1, 12));
        coachTextField.setUI(new JTextFieldHintUI("Coach", Color.gray));
        add(coachTextField);
        coachTextField.setBounds(550, 250, 150, 30);

        // local train text field alignment (font, and position)
        localTrainTextField.setFont(new Font("Arial", 1, 12));
        localTrainTextField.setUI(new JTextFieldHintUI("Local or Commuter Train", Color.gray));
        add(localTrainTextField);
        localTrainTextField.setBounds(550, 300, 150, 30);

        // long distance train text field alignment (font, and position)
        longDistanceTrainTextField.setFont(new Font("Arial", 1, 12));
        longDistanceTrainTextField.setUI(new JTextFieldHintUI("Long Distance Train", Color.gray));
        add(longDistanceTrainTextField);
        longDistanceTrainTextField.setBounds(550, 350, 150, 30);

        // tram text field alignment (font, and position)
        tramTextField.setFont(new Font("Arial", 1, 12));
        tramTextField.setUI(new JTextFieldHintUI("Tram", Color.gray));
        add(tramTextField);
        tramTextField.setBounds(550, 400, 150, 30);

        // subway text field alignment (font, and position)
        subwayTextField.setFont(new Font("Arial", 1, 12));
        subwayTextField.setUI(new JTextFieldHintUI("Subway", Color.gray));
        add(subwayTextField);
        subwayTextField.setBounds(550, 450, 150, 30);

        // taxi text field alignment (font, and position)
        taxiTextField.setFont(new Font("Arial", 1, 12));
        taxiTextField.setUI(new JTextFieldHintUI("Taxi", Color.gray));
        add(taxiTextField);
        taxiTextField.setBounds(550, 500, 150, 30);

        // kilometers year label1 alignment (font, foreground, text and position)
        kilometersYearLabel1.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel1.setForeground(new Color(255, 255, 255));
        kilometersYearLabel1.setText("kilometers/year");
        add(kilometersYearLabel1);
        kilometersYearLabel1.setBounds(720, 200, 90, 30);

        // kilometers year label2 alignment (font, foreground, text and position)
        kilometersYearLabel2.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel2.setForeground(new Color(255, 255, 255));
        kilometersYearLabel2.setText("kilometers/year");
        add(kilometersYearLabel2);
        kilometersYearLabel2.setBounds(720, 250, 90, 30);

        // kilometers year label3 alignment (font, foreground, text and position)
        kilometersYearLabel3.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel3.setForeground(new Color(255, 255, 255));
        kilometersYearLabel3.setText("kilometers/year");
        add(kilometersYearLabel3);
        kilometersYearLabel3.setBounds(720, 300, 90, 30);

        // kilometers year label4 alignment (font, foreground, text and position)
        kilometersYearLabel4.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel4.setForeground(new Color(255, 255, 255));
        kilometersYearLabel4.setText("kilometers/year");
        add(kilometersYearLabel4);
        kilometersYearLabel4.setBounds(720, 350, 90, 30);

        // kilometers year label5 alignment (font, foreground, text and position)
        kilometersYearLabel5.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel5.setForeground(new Color(255, 255, 255));
        kilometersYearLabel5.setText("kilometers/year");
        add(kilometersYearLabel5);
        kilometersYearLabel5.setBounds(720, 400, 90, 30);

        // kilometers year label6 alignment (font, foreground, text and position)
        kilometersYearLabel6.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel6.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel6.setText("kilometers/year");
        add(kilometersYearLabel6);
        kilometersYearLabel6.setBounds(720, 450, 90, 30);

        // kilometers year label7 alignment (font, foreground, text and position)
        kilometersYearLabel7.setFont(new Font("Arial", 3, 12));
        kilometersYearLabel7.setForeground(new Color(255, 255, 255));
        kilometersYearLabel7.setText("kilometers/year");
        add(kilometersYearLabel7);
        kilometersYearLabel7.setBounds(720, 500, 90, 30);

        // go back button alignment (font, icon, text and position)
        goBackButton.setFont(new Font("Arial", 0, 12));
        goBackButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png")));
        goBackButton.setText("Go Back");
        add(goBackButton);
        goBackButton.setBounds(50, 620, 110, 35);

        // next back button alignment (font, icon, text and position)
        nextButton.setFont(new java.awt.Font("Arial", 0, 12));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png")));
        nextButton.setText("Next");
        add(nextButton);
        nextButton.setBounds(1120, 620, 110, 35);

        // background alignment (font, icon and positioning)
        background.setFont(new Font("Calibri", 0, 11));
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

}
