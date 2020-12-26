package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class OthersQuestionPanel extends javax.swing.JPanel {

    public OthersQuestionPanel() {
        initComponents();
    }

    private void initComponents() {

        othersLabel = new javax.swing.JLabel();
        pharmaLabel = new javax.swing.JLabel();
        textilesLabel = new javax.swing.JLabel();
        paperProductsLabel = new javax.swing.JLabel();
        tvRadioPhoneLabel = new javax.swing.JLabel();
        vehicleSpendingLabel = new javax.swing.JLabel();
        furnitureLabel = new javax.swing.JLabel();
        hotelPubLabel = new javax.swing.JLabel();
        callCostLabel = new javax.swing.JLabel();
        bankingLabel = new javax.swing.JLabel();
        insuranceLabel = new javax.swing.JLabel();
        itLabel = new javax.swing.JLabel();
        educationLabel = new javax.swing.JLabel();
        culturalActsLabel = new javax.swing.JLabel();
        furnitureSpendingTextField = new javax.swing.JTextField();
        vehicleSpendingTextField = new javax.swing.JTextField();
        educationSpendingTextField = new javax.swing.JTextField();
        culturalSpendingTextField = new javax.swing.JTextField();
        hotelRest_pubSpendingTextField = new javax.swing.JTextField();
        phoneMobileCallSpendingTextField = new javax.swing.JTextField();
        tvRadioPhoneEquipmentSpending = new javax.swing.JTextField();
        pcAndITequipmentTextField = new javax.swing.JTextField();
        bankingAndFinanceTextField = new javax.swing.JTextField();
        paperBasedProductsTextField = new javax.swing.JTextField();
        insuranceTextField = new javax.swing.JTextField();
        clothesTextilesShoesTextField = new javax.swing.JTextField();
        pharmaceuticalsTextField = new javax.swing.JTextField();
        showTheReportButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        othersLabel.setBackground(new java.awt.Color(255, 255, 255));
        othersLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        othersLabel.setForeground(new java.awt.Color(255, 255, 255));
        othersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        othersLabel.setText("OTHERS");
        add(othersLabel);
        othersLabel.setBounds(555, 80, 170, 60);

        pharmaLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        pharmaLabel.setForeground(new java.awt.Color(255, 255, 255));
        pharmaLabel.setText("Pharmaceuticals");
        add(pharmaLabel);
        pharmaLabel.setBounds(230, 630, 360, 30);

        textilesLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        textilesLabel.setForeground(new java.awt.Color(255, 255, 255));
        textilesLabel.setText("Clothes, textiles and shoes");
        add(textilesLabel);
        textilesLabel.setBounds(230, 590, 360, 30);

        paperProductsLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        paperProductsLabel.setForeground(new java.awt.Color(255, 255, 255));
        paperProductsLabel.setText("Paper based products (e.g. books, magazines, newspapers)\t");
        add(paperProductsLabel);
        paperProductsLabel.setBounds(230, 510, 360, 30);

        tvRadioPhoneLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        tvRadioPhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        tvRadioPhoneLabel.setText("Television, radio and phone (equipment)");
        add(tvRadioPhoneLabel);
        tvRadioPhoneLabel.setBounds(230, 390, 360, 30);

        vehicleSpendingLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        vehicleSpendingLabel.setForeground(new java.awt.Color(255, 255, 255));
        vehicleSpendingLabel.setText("Motor vehicles (not including fuel costs)");
        add(vehicleSpendingLabel);
        vehicleSpendingLabel.setBounds(230, 190, 360, 30);

        furnitureLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        furnitureLabel.setForeground(new java.awt.Color(255, 255, 255));
        furnitureLabel.setText("Furniture and other manufactured goods");
        add(furnitureLabel);
        furnitureLabel.setBounds(230, 150, 360, 30);

        hotelPubLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        hotelPubLabel.setForeground(new java.awt.Color(255, 255, 255));
        hotelPubLabel.setText("Hotels, restaurants, and pubs etc.");
        add(hotelPubLabel);
        hotelPubLabel.setBounds(230, 310, 360, 30);

        callCostLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        callCostLabel.setForeground(new java.awt.Color(255, 255, 255));
        callCostLabel.setText("Telephone, mobile/cell phone call costs");
        add(callCostLabel);
        callCostLabel.setBounds(230, 350, 360, 30);

        bankingLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        bankingLabel.setForeground(new java.awt.Color(255, 255, 255));
        bankingLabel.setText("Banking and finance (mortgage and loan interest payments)\t");
        add(bankingLabel);
        bankingLabel.setBounds(230, 470, 360, 30);

        insuranceLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        insuranceLabel.setForeground(new java.awt.Color(255, 255, 255));
        insuranceLabel.setText("Insurance");
        add(insuranceLabel);
        insuranceLabel.setBounds(230, 550, 360, 30);

        itLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        itLabel.setForeground(new java.awt.Color(255, 255, 255));
        itLabel.setText("Computers and IT equipment");
        add(itLabel);
        itLabel.setBounds(230, 430, 360, 30);

        educationLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        educationLabel.setForeground(new java.awt.Color(255, 255, 255));
        educationLabel.setText("Education");
        add(educationLabel);
        educationLabel.setBounds(230, 230, 360, 30);

        culturalActsLabel.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        culturalActsLabel.setForeground(new java.awt.Color(255, 255, 255));
        culturalActsLabel.setText("Recreational, cultural and sporting activities");
        add(culturalActsLabel);
        culturalActsLabel.setBounds(230, 270, 360, 30);

        furnitureSpendingTextField.setText("spending");
        add(furnitureSpendingTextField);
        furnitureSpendingTextField.setBounds(700, 150, 200, 30);

        vehicleSpendingTextField.setText("spending");
        add(vehicleSpendingTextField);
        vehicleSpendingTextField.setBounds(700, 190, 200, 30);

        educationSpendingTextField.setText("spending");
        add(educationSpendingTextField);
        educationSpendingTextField.setBounds(700, 230, 200, 30);

        culturalSpendingTextField.setText("spending");
        add(culturalSpendingTextField);
        culturalSpendingTextField.setBounds(700, 270, 200, 30);

        hotelRest_pubSpendingTextField.setText("spending");
        add(hotelRest_pubSpendingTextField);
        hotelRest_pubSpendingTextField.setBounds(700, 310, 200, 30);

        phoneMobileCallSpendingTextField.setText("spending");
        add(phoneMobileCallSpendingTextField);
        phoneMobileCallSpendingTextField.setBounds(700, 350, 200, 30);

        tvRadioPhoneEquipmentSpending.setText("spending");
        add(tvRadioPhoneEquipmentSpending);
        tvRadioPhoneEquipmentSpending.setBounds(700, 390, 200, 30);

        pcAndITequipmentTextField.setText("spending");
        add(pcAndITequipmentTextField);
        pcAndITequipmentTextField.setBounds(700, 430, 200, 30);

        bankingAndFinanceTextField.setText("spending");
        add(bankingAndFinanceTextField);
        bankingAndFinanceTextField.setBounds(700, 470, 200, 30);

        paperBasedProductsTextField.setText("spending");
        add(paperBasedProductsTextField);
        paperBasedProductsTextField.setBounds(700, 510, 200, 30);

        insuranceTextField.setText("spending");
        add(insuranceTextField);
        insuranceTextField.setBounds(700, 550, 200, 30);

        clothesTextilesShoesTextField.setText("spending");
        add(clothesTextilesShoesTextField);
        clothesTextilesShoesTextField.setBounds(700, 590, 200, 30);

        pharmaceuticalsTextField.setText("spending");
        add(pharmaceuticalsTextField);
        pharmaceuticalsTextField.setBounds(700, 630, 200, 30);

        showTheReportButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showTheReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png"))); // NOI18N
        showTheReportButton.setText("Show the Report");
        add(showTheReportButton);
        showTheReportButton.setBounds(1040, 620, 170, 35);

        goBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png"))); // NOI18N
        goBackButton.setText("Go Back");
        add(goBackButton);
        goBackButton.setBounds(50, 620, 110, 35);

        warningLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 255, 255));
        warningLabel.setText("Warning! Currency unit is US Dollar");
        add(warningLabel);
        warningLabel.setBounds(1030, 160, 200, 20);

        background.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }
    private javax.swing.JLabel background;
    private javax.swing.JTextField bankingAndFinanceTextField;
    private javax.swing.JLabel bankingLabel;
    private javax.swing.JLabel callCostLabel;
    private javax.swing.JTextField clothesTextilesShoesTextField;
    private javax.swing.JLabel culturalActsLabel;
    private javax.swing.JTextField culturalSpendingTextField;
    private javax.swing.JLabel educationLabel;
    private javax.swing.JTextField educationSpendingTextField;
    private javax.swing.JLabel furnitureLabel;
    private javax.swing.JTextField furnitureSpendingTextField;
    public javax.swing.JButton goBackButton;
    private javax.swing.JLabel hotelPubLabel;
    private javax.swing.JTextField hotelRest_pubSpendingTextField;
    private javax.swing.JLabel insuranceLabel;
    private javax.swing.JTextField insuranceTextField;
    private javax.swing.JLabel itLabel;
    private javax.swing.JLabel othersLabel;
    private javax.swing.JTextField paperBasedProductsTextField;
    private javax.swing.JLabel paperProductsLabel;
    private javax.swing.JTextField pcAndITequipmentTextField;
    private javax.swing.JLabel pharmaLabel;
    private javax.swing.JTextField pharmaceuticalsTextField;
    private javax.swing.JTextField phoneMobileCallSpendingTextField;
    public javax.swing.JButton showTheReportButton;
    private javax.swing.JLabel textilesLabel;
    private javax.swing.JTextField tvRadioPhoneEquipmentSpending;
    private javax.swing.JLabel tvRadioPhoneLabel;
    private javax.swing.JLabel vehicleSpendingLabel;
    private javax.swing.JTextField vehicleSpendingTextField;
    private javax.swing.JLabel warningLabel;

}
