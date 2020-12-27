package gui.View;

import java.awt.*;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class TransportationQuestion2Panel extends javax.swing.JPanel {

    public TransportationQuestion2Panel() {
        initComponents();
    }

    private void initComponents() {

        transportationLabel = new javax.swing.JLabel();
        busRailTaxiStatsLabel = new javax.swing.JLabel();
        busLabel = new javax.swing.JLabel();
        coachLabel = new javax.swing.JLabel();
        localTrainLabel = new javax.swing.JLabel();
        longDistanceTrainLabel = new javax.swing.JLabel();
        tramLabel = new javax.swing.JLabel();
        subwayLabel = new javax.swing.JLabel();
        taxiLabel = new javax.swing.JLabel();
        busTextField = new javax.swing.JTextField();
        coachTextField = new javax.swing.JTextField();
        localTrainTextField = new javax.swing.JTextField();
        longDistanceTrainTextField = new javax.swing.JTextField();
        tramTextField = new javax.swing.JTextField();
        subwayTextField = new javax.swing.JTextField();
        taxiTextField = new javax.swing.JTextField();
        kilometersYearLabel1 = new javax.swing.JLabel();
        kilometersYearLabel2 = new javax.swing.JLabel();
        kilometersYearLabel3 = new javax.swing.JLabel();
        kilometersYearLabel4 = new javax.swing.JLabel();
        kilometersYearLabel5 = new javax.swing.JLabel();
        kilometersYearLabel6 = new javax.swing.JLabel();
        kilometersYearLabel7 = new javax.swing.JLabel();
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

        busRailTaxiStatsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        busRailTaxiStatsLabel.setForeground(new java.awt.Color(255, 255, 255));
        busRailTaxiStatsLabel.setText("Bus, Rail and Taxi Statistics");
        add(busRailTaxiStatsLabel);
        busRailTaxiStatsLabel.setBounds(260, 150, 250, 30);

        busLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        busLabel.setForeground(new java.awt.Color(255, 255, 255));
        busLabel.setText("Bus");
        add(busLabel);
        busLabel.setBounds(260, 200, 145, 30);

        coachLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        coachLabel.setForeground(new java.awt.Color(255, 255, 255));
        coachLabel.setText("Coach");
        add(coachLabel);
        coachLabel.setBounds(260, 250, 145, 30);

        localTrainLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        localTrainLabel.setForeground(new java.awt.Color(255, 255, 255));
        localTrainLabel.setText("Local or Commuter Train");
        add(localTrainLabel);
        localTrainLabel.setBounds(260, 300, 145, 30);

        longDistanceTrainLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        longDistanceTrainLabel.setForeground(new java.awt.Color(255, 255, 255));
        longDistanceTrainLabel.setText("Long Distance Train");
        add(longDistanceTrainLabel);
        longDistanceTrainLabel.setBounds(260, 350, 145, 30);

        tramLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        tramLabel.setForeground(new java.awt.Color(255, 255, 255));
        tramLabel.setText("Tram");
        add(tramLabel);
        tramLabel.setBounds(260, 400, 145, 30);

        subwayLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        subwayLabel.setForeground(new java.awt.Color(255, 255, 255));
        subwayLabel.setText("Subway");
        add(subwayLabel);
        subwayLabel.setBounds(260, 450, 145, 30);

        taxiLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        taxiLabel.setForeground(new java.awt.Color(255, 255, 255));
        taxiLabel.setText("Taxi");
        add(taxiLabel);
        taxiLabel.setBounds(260, 500, 145, 30);

        busTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        busTextField.setUI(new JTextFieldHintUI("Bus", Color.gray));
        add(busTextField);
        busTextField.setBounds(550, 200, 150, 30);

        coachTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        coachTextField.setUI(new JTextFieldHintUI("Coach", Color.gray));
        add(coachTextField);
        coachTextField.setBounds(550, 250, 150, 30);

        localTrainTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        localTrainTextField.setUI(new JTextFieldHintUI("Local or Commuter Train", Color.gray));
        add(localTrainTextField);
        localTrainTextField.setBounds(550, 300, 150, 30);

        longDistanceTrainTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        longDistanceTrainTextField.setUI(new JTextFieldHintUI("Long Distance Train", Color.gray));
        add(longDistanceTrainTextField);
        longDistanceTrainTextField.setBounds(550, 350, 150, 30);

        tramTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tramTextField.setUI(new JTextFieldHintUI("Tram", Color.gray));
        add(tramTextField);
        tramTextField.setBounds(550, 400, 150, 30);

        subwayTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        subwayTextField.setUI(new JTextFieldHintUI("Subway", Color.gray));
        add(subwayTextField);
        subwayTextField.setBounds(550, 450, 150, 30);

        taxiTextField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        taxiTextField.setUI(new JTextFieldHintUI("Taxi", Color.gray));
        add(taxiTextField);
        taxiTextField.setBounds(550, 500, 150, 30);

        kilometersYearLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel1.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel1.setText("kilometers/year");
        add(kilometersYearLabel1);
        kilometersYearLabel1.setBounds(720, 200, 90, 30);

        kilometersYearLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel2.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel2.setText("kilometers/year");
        add(kilometersYearLabel2);
        kilometersYearLabel2.setBounds(720, 250, 90, 30);

        kilometersYearLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel3.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel3.setText("kilometers/year");
        add(kilometersYearLabel3);
        kilometersYearLabel3.setBounds(720, 300, 90, 30);

        kilometersYearLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel4.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel4.setText("kilometers/year");
        add(kilometersYearLabel4);
        kilometersYearLabel4.setBounds(720, 350, 90, 30);

        kilometersYearLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel5.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel5.setText("kilometers/year");
        add(kilometersYearLabel5);
        kilometersYearLabel5.setBounds(720, 400, 90, 30);

        kilometersYearLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel6.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel6.setText("kilometers/year");
        add(kilometersYearLabel6);
        kilometersYearLabel6.setBounds(720, 450, 90, 30);

        kilometersYearLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        kilometersYearLabel7.setForeground(new java.awt.Color(255, 255, 255));
        kilometersYearLabel7.setText("kilometers/year");
        add(kilometersYearLabel7);
        kilometersYearLabel7.setBounds(720, 500, 90, 30);

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

    private javax.swing.JLabel background;
    private javax.swing.JLabel busLabel;
    private javax.swing.JLabel busRailTaxiStatsLabel;
    private javax.swing.JTextField busTextField;
    private javax.swing.JLabel coachLabel;
    private javax.swing.JTextField coachTextField;
    public javax.swing.JButton goBackButton;
    private javax.swing.JLabel kilometersYearLabel1;
    private javax.swing.JLabel kilometersYearLabel2;
    private javax.swing.JLabel kilometersYearLabel3;
    private javax.swing.JLabel kilometersYearLabel4;
    private javax.swing.JLabel kilometersYearLabel5;
    private javax.swing.JLabel kilometersYearLabel6;
    private javax.swing.JLabel kilometersYearLabel7;
    private javax.swing.JLabel localTrainLabel;
    private javax.swing.JTextField localTrainTextField;
    private javax.swing.JLabel longDistanceTrainLabel;
    private javax.swing.JTextField longDistanceTrainTextField;
    public javax.swing.JButton nextButton;
    private javax.swing.JLabel subwayLabel;
    private javax.swing.JTextField subwayTextField;
    private javax.swing.JLabel taxiLabel;
    private javax.swing.JTextField taxiTextField;
    private javax.swing.JLabel tramLabel;
    private javax.swing.JTextField tramTextField;
    private javax.swing.JLabel transportationLabel;

}
