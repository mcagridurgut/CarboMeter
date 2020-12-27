package gui.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Others question panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class OthersQuestionPanel extends JPanel {

    // Properties of the others question panel
    private JLabel background;
    public JTextField bankingAndFinanceTextField;
    private JLabel bankingLabel;
    private JLabel callCostLabel;
    public JTextField clothesTextilesShoesTextField;
    private JLabel culturalActsLabel;
    public JTextField culturalSpendingTextField;
    private JLabel educationLabel;
    public JTextField educationSpendingTextField;
    private JLabel furnitureLabel;
    public JTextField furnitureSpendingTextField;
    public JButton goBackButton;
    private JLabel hotelPubLabel;
    public JTextField hotelRest_pubSpendingTextField;
    private JLabel insuranceLabel;
    public JTextField insuranceTextField;
    private JLabel itLabel;
    private JLabel othersLabel;
    public JTextField paperBasedProductsTextField;
    private JLabel paperProductsLabel;
    public JTextField pcAndITequipmentTextField;
    private JLabel pharmaLabel;
    public JTextField pharmaceuticalsTextField;
    public JTextField phoneMobileCallSpendingTextField;
    public JButton showTheReportButton;
    private JLabel textilesLabel;
    public JTextField tvRadioPhoneEquipmentSpending;
    private JLabel tvRadioPhoneLabel;
    private JLabel vehicleSpendingLabel;
    public JTextField vehicleSpendingTextField;
    private JLabel warningLabel;

    /**
     * constructor of the class
     */
    public OthersQuestionPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        othersLabel = new JLabel();
        pharmaLabel = new JLabel();
        textilesLabel = new JLabel();
        paperProductsLabel = new JLabel();
        tvRadioPhoneLabel = new JLabel();
        vehicleSpendingLabel = new JLabel();
        furnitureLabel = new JLabel();
        hotelPubLabel = new JLabel();
        callCostLabel = new JLabel();
        bankingLabel = new JLabel();
        insuranceLabel = new JLabel();
        itLabel = new JLabel();
        educationLabel = new JLabel();
        culturalActsLabel = new JLabel();
        furnitureSpendingTextField = new JTextField();
        vehicleSpendingTextField = new JTextField();
        educationSpendingTextField = new JTextField();
        culturalSpendingTextField = new JTextField();
        hotelRest_pubSpendingTextField = new JTextField();
        phoneMobileCallSpendingTextField = new JTextField();
        tvRadioPhoneEquipmentSpending = new JTextField();
        pcAndITequipmentTextField = new JTextField();
        bankingAndFinanceTextField = new JTextField();
        paperBasedProductsTextField = new JTextField();
        insuranceTextField = new JTextField();
        clothesTextilesShoesTextField = new JTextField();
        pharmaceuticalsTextField = new JTextField();
        showTheReportButton = new JButton();
        goBackButton = new JButton();
        warningLabel = new JLabel();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // others label alignment (background, font, foreground, alignment, text and position)
        othersLabel.setBackground(new Color(255, 255, 255));
        othersLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        othersLabel.setForeground(new Color(255, 255, 255));
        othersLabel.setHorizontalAlignment(SwingConstants.CENTER);
        othersLabel.setText("OTHERS");
        add(othersLabel);
        othersLabel.setBounds(555, 80, 170, 60);

        // pharma label alignment (font, foreground, text and position)
        pharmaLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        pharmaLabel.setForeground(new Color(255, 255, 255));
        pharmaLabel.setText("Pharmaceuticals");
        add(pharmaLabel);
        pharmaLabel.setBounds(230, 630, 360, 30);

        // textiles label alignment (font, foreground, text and position)
        textilesLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        textilesLabel.setForeground(new Color(255, 255, 255));
        textilesLabel.setText("Clothes, textiles and shoes");
        add(textilesLabel);
        textilesLabel.setBounds(230, 590, 360, 30);

        // paper products label alignment (font, foreground, text and position)
        paperProductsLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        paperProductsLabel.setForeground(new Color(255, 255, 255));
        paperProductsLabel.setText("Paper based products (e.g. books, magazines, newspapers)\t");
        add(paperProductsLabel);
        paperProductsLabel.setBounds(230, 510, 360, 30);

        // tv radio phone label alignment (font, foreground, text and position)
        tvRadioPhoneLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        tvRadioPhoneLabel.setForeground(new Color(255, 255, 255));
        tvRadioPhoneLabel.setText("Television, radio and phone (equipment)");
        add(tvRadioPhoneLabel);
        tvRadioPhoneLabel.setBounds(230, 390, 360, 30);

        // vehicle spending label alignment (font, foreground, text and position)
        vehicleSpendingLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        vehicleSpendingLabel.setForeground(new Color(255, 255, 255));
        vehicleSpendingLabel.setText("Motor vehicles (not including fuel costs)");
        add(vehicleSpendingLabel);
        vehicleSpendingLabel.setBounds(230, 190, 360, 30);

        // furniture label alignment (font, foreground, text and position)
        furnitureLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        furnitureLabel.setForeground(new Color(255, 255, 255));
        furnitureLabel.setText("Furniture and other manufactured goods");
        add(furnitureLabel);
        furnitureLabel.setBounds(230, 150, 360, 30);

        // hotel pub label alignment (font, foreground, text and position)
        hotelPubLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        hotelPubLabel.setForeground(new Color(255, 255, 255));
        hotelPubLabel.setText("Hotels, restaurants, and pubs etc.");
        add(hotelPubLabel);
        hotelPubLabel.setBounds(230, 310, 360, 30);

        // call cost label alignment (font, foreground, text and position)
        callCostLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        callCostLabel.setForeground(new Color(255, 255, 255));
        callCostLabel.setText("Telephone, mobile/cell phone call costs");
        add(callCostLabel);
        callCostLabel.setBounds(230, 350, 360, 30);

        // banking label alignment (font, foreground, text and position)
        bankingLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        bankingLabel.setForeground(new Color(255, 255, 255));
        bankingLabel.setText("Banking and finance (mortgage and loan interest payments)\t");
        add(bankingLabel);
        bankingLabel.setBounds(230, 470, 360, 30);

        // insurance label alignment (font, foreground, text and position)
        insuranceLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        insuranceLabel.setForeground(new Color(255, 255, 255));
        insuranceLabel.setText("Insurance");
        add(insuranceLabel);
        insuranceLabel.setBounds(230, 550, 360, 30);

        // it label alignment (font, foreground, text and position)
        itLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        itLabel.setForeground(new Color(255, 255, 255));
        itLabel.setText("Computers and IT equipment");
        add(itLabel);
        itLabel.setBounds(230, 430, 360, 30);

        // education label alignment (font, foreground, text and position)
        educationLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        educationLabel.setForeground(new Color(255, 255, 255));
        educationLabel.setText("Education");
        add(educationLabel);
        educationLabel.setBounds(230, 230, 360, 30);

        // cultural acts label alignment (font, foreground, text and position)
        culturalActsLabel.setFont(new Font("Arial", 3, 12)); // NOI18N
        culturalActsLabel.setForeground(new Color(255, 255, 255));
        culturalActsLabel.setText("Recreational, cultural and sporting activities");
        add(culturalActsLabel);
        culturalActsLabel.setBounds(230, 270, 360, 30);

        // furniture spending text field alignment (position)
        furnitureSpendingTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(furnitureSpendingTextField);
        furnitureSpendingTextField.setBounds(700, 150, 200, 30);

        // vehicle spending text field alignment (position)
        vehicleSpendingTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(vehicleSpendingTextField);
        vehicleSpendingTextField.setBounds(700, 190, 200, 30);

        // education spending text field alignment (position)
        educationSpendingTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(educationSpendingTextField);
        educationSpendingTextField.setBounds(700, 230, 200, 30);

        // cultural spending text field alignment (position)
        culturalSpendingTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(culturalSpendingTextField);
        culturalSpendingTextField.setBounds(700, 270, 200, 30);

        // hotel rest pub spending text field alignment (position)
        hotelRest_pubSpendingTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(hotelRest_pubSpendingTextField);
        hotelRest_pubSpendingTextField.setBounds(700, 310, 200, 30);

        // phone mobile call spending text field alignment (position)
        phoneMobileCallSpendingTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(phoneMobileCallSpendingTextField);
        phoneMobileCallSpendingTextField.setBounds(700, 350, 200, 30);

        // tv radio phone equipment spending text field alignment (position)
        tvRadioPhoneEquipmentSpending.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(tvRadioPhoneEquipmentSpending);
        tvRadioPhoneEquipmentSpending.setBounds(700, 390, 200, 30);

        // pc and IT equipment  text field alignment (position)
        pcAndITequipmentTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(pcAndITequipmentTextField);
        pcAndITequipmentTextField.setBounds(700, 430, 200, 30);

        // banking and finance  text field alignment (position)
        bankingAndFinanceTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(bankingAndFinanceTextField);
        bankingAndFinanceTextField.setBounds(700, 470, 200, 30);

        // paper based products text field alignment (position)
        paperBasedProductsTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(paperBasedProductsTextField);
        paperBasedProductsTextField.setBounds(700, 510, 200, 30);

        // insurance text field alignment (position)
        insuranceTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(insuranceTextField);
        insuranceTextField.setBounds(700, 550, 200, 30);

        // clothes textiles shoes  text field alignment (position)
        clothesTextilesShoesTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(clothesTextilesShoesTextField);
        clothesTextilesShoesTextField.setBounds(700, 590, 200, 30);

        // pharmaceuticals spending text field alignment (position)
        pharmaceuticalsTextField.setUI(new JTextFieldHintUI("Spending", Color.gray));
        add(pharmaceuticalsTextField);
        pharmaceuticalsTextField.setBounds(700, 630, 200, 30);

        // show the report button alignment (font, icon, text and position)
        showTheReportButton.setFont(new Font("Arial", 0, 12)); // NOI18N
        showTheReportButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png"))); // NOI18N
        showTheReportButton.setText("Show the Report");
        add(showTheReportButton);
        showTheReportButton.setBounds(1040, 620, 170, 35);

        // go back button alignment (font, icon, text and position)
        goBackButton.setFont(new Font("Arial", 0, 12));
        goBackButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png"))); // NOI18N
        goBackButton.setText("Go Back");
        add(goBackButton);
        goBackButton.setBounds(50, 620, 110, 35);

        // warning label alignment (font, foreground, text and position)
        warningLabel.setFont(new Font("Arial", 1, 12)); // NOI18N
        warningLabel.setForeground(new Color(255, 255, 255));
        warningLabel.setText("Warning! Currency unit is US Dollar");
        add(warningLabel);
        warningLabel.setBounds(1030, 160, 200, 20);

        // background alignment (font, icon and positioning)
        background.setFont(new Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }


}
