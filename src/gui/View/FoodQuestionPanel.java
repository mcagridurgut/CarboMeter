package gui.View;
import javax.swing.*;
import java.awt.*;
/**
 * Food question panel of the Carbometer desktop app. Draws the panel by using swing components.
 * @author Onur Ertunc
 */
public class FoodQuestionPanel extends JPanel {

    // Properties - components
    private JLabel background;
    private JLabel beefLambVealLabel;
    private JLabel caloriesLabel1;
    private JLabel caloriesLabel2;
    private JLabel caloriesLabel3;
    private JLabel caloriesLabel4;
    private JLabel caloriesLabel5;
    private JLabel caloriesLabel6;
    private JLabel caloriesLabel7;
    private JLabel caloriesLabel8;
    private JLabel dairyLabel;
    private JLabel fishAndSeafoodLabel;
    private JLabel foodLabel;
    private JLabel fruitsAndVegetablesLabel;
    private JLabel grainsAndBakedLabel;
    private JLabel howMuchConsumeLabel;
    public JButton goBackButton;
    public JTextField jTextField1;
    public JTextField jTextField2;
    public JTextField jTextField3;
    public JTextField jTextField4;
    public JTextField jTextField5;
    public JTextField jTextField6;
    public JTextField jTextField7;
    public JTextField jTextField8;
    public JButton nextButton;
    private JLabel otherMeatLabel;
    private JLabel poultryAndEggsLabel;
    private JLabel snacksLabel;

    /**
     * initializes the components of FoodQuestionPanel by calling initComponents
     */
    public FoodQuestionPanel() {
        initComponents();
    }

    /**
     * initializes the components of FoodQuestionPanel
     */
    private void initComponents() {

        // initialization of the components
        foodLabel = new JLabel();
        howMuchConsumeLabel = new JLabel();
        beefLambVealLabel = new JLabel();
        fishAndSeafoodLabel = new JLabel();
        otherMeatLabel = new JLabel();
        poultryAndEggsLabel = new JLabel();
        grainsAndBakedLabel = new JLabel();
        dairyLabel = new JLabel();
        fruitsAndVegetablesLabel = new JLabel();
        snacksLabel = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jTextField8 = new JTextField();
        nextButton = new JButton();
        goBackButton = new JButton();
        caloriesLabel1 = new JLabel();
        caloriesLabel2 = new JLabel();
        caloriesLabel3 = new JLabel();
        caloriesLabel4 = new JLabel();
        caloriesLabel5 = new JLabel();
        caloriesLabel6 = new JLabel();
        caloriesLabel7 = new JLabel();
        caloriesLabel8 = new JLabel();
        background = new JLabel();

        // dimension of the panel and layout settings
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // food label alignments (font, foreground, text)
        foodLabel.setFont(new Font("Calibri", 1, 48));
        foodLabel.setForeground(new Color(255, 255, 255));
        foodLabel.setHorizontalAlignment(SwingConstants.CENTER);
        foodLabel.setText("FOOD");
        add(foodLabel);
        foodLabel.setBounds(580, 80, 116, 60);

        // howMuchConsume label alignments
        howMuchConsumeLabel.setFont(new Font("Arial", 1, 18));
        howMuchConsumeLabel.setForeground(new Color(255, 255, 255));
        howMuchConsumeLabel.setText("How much do you consume? (Daily)");
        add(howMuchConsumeLabel);
        howMuchConsumeLabel.setBounds(220, 160, 316, 30);

        // beefLambVeal label alignments
        beefLambVealLabel.setFont(new Font("Arial", 3, 12));
        beefLambVealLabel.setForeground(new Color(255, 255, 255));
        beefLambVealLabel.setText("Beef, lamb, veal:");
        add(beefLambVealLabel);
        beefLambVealLabel.setBounds(220, 210, 200, 30);

        // fishAndSeaFoodLabel alignments
        fishAndSeafoodLabel.setFont(new Font("Arial", 3, 12));
        fishAndSeafoodLabel.setForeground(new Color(255, 255, 255));
        fishAndSeafoodLabel.setText("Fish & Seafood:");
        add(fishAndSeafoodLabel);
        fishAndSeafoodLabel.setBounds(220, 260, 200, 30);

        // otherMeatLabel alignments
        otherMeatLabel.setFont(new Font("Arial", 3, 12));
        otherMeatLabel.setForeground(new Color(255, 255, 255));
        otherMeatLabel.setText("Other meat (processed, etc.):");
        add(otherMeatLabel);
        otherMeatLabel.setBounds(220, 310, 200, 30);

        // poultryAndEggLabel alignments
        poultryAndEggsLabel.setFont(new Font("Arial", 3, 12));
        poultryAndEggsLabel.setForeground(new Color(255, 255, 255));
        poultryAndEggsLabel.setText("Poultry & Eggs:");
        add(poultryAndEggsLabel);
        poultryAndEggsLabel.setBounds(220, 560, 200, 30);

        // grainsAndBakedLabel alignments
        grainsAndBakedLabel.setFont(new Font("Arial", 3, 12));
        grainsAndBakedLabel.setForeground(new Color(255, 255, 255));
        grainsAndBakedLabel.setText("Grains & Baked Goods:");
        add(grainsAndBakedLabel);
        grainsAndBakedLabel.setBounds(220, 410, 200, 30);

        // dairyLabel alignments
        dairyLabel.setFont(new Font("Arial", 3, 12));
        dairyLabel.setForeground(new Color(255, 255, 255));
        dairyLabel.setText("Dairy:");
        add(dairyLabel);
        dairyLabel.setBounds(220, 360, 200, 30);

        // fruitsAndVegetables label alignments
        fruitsAndVegetablesLabel.setFont(new Font("Arial", 3, 12));
        fruitsAndVegetablesLabel.setForeground(new Color(255, 255, 255));
        fruitsAndVegetablesLabel.setText("Fruits & Vegetables:");
        add(fruitsAndVegetablesLabel);
        fruitsAndVegetablesLabel.setBounds(220, 460, 200, 30);

        // snacks label alignments
        snacksLabel.setFont(new Font("Arial", 3, 12));
        snacksLabel.setForeground(new Color(255, 255, 255));
        snacksLabel.setText("Snacks, Processed Drinks, etc:");
        add(snacksLabel);
        snacksLabel.setBounds(220, 510, 200, 30);

        // textfield that gets the input of beefLambVeal. alignments are here. not inputs - listeners
        jTextField1.setBackground(new Color(240, 240, 240));
        jTextField1.setUI(new JTextFieldHintUI("Cal", Color.gray));
        jTextField1.setFont(new Font("Arial", 1, 12));
        add(jTextField1);
        jTextField1.setBounds(530, 210, 150, 30);

        // textfield that gets the input of fishAndSeaFood. alignments are here. not inputs - listeners
        jTextField2.setBackground(new Color(240, 240, 240));
        jTextField2.setUI(new JTextFieldHintUI("Cal", Color.gray));
        jTextField2.setFont(new Font("Arial", 1, 12));
        add(jTextField2);
        jTextField2.setBounds(530, 260, 150, 30);

        // textfield that gets the input of otherMeat. alignments are here. not inputs - listeners
        jTextField3.setBackground(new Color(240, 240, 240));
        jTextField3.setUI(new JTextFieldHintUI("Cal", Color.gray));
        jTextField3.setFont(new Font("Arial", 1, 12));
        add(jTextField3);
        jTextField3.setBounds(530, 310, 150, 30);

        // textfield that gets the input of poultryAndEgg. alignments are here. not inputs - listeners
        jTextField4.setBackground(new Color(240, 240, 240));
        jTextField4.setUI(new JTextFieldHintUI("Cal", Color.gray));
        jTextField4.setFont(new Font("Arial", 1, 12));
        add(jTextField4);
        jTextField4.setBounds(530, 360, 150, 30);

        // textfield that gets the input of grainsAndBaked. alignments are here. not inputs - listeners
        jTextField5.setBackground(new Color(240, 240, 240));
        jTextField5.setUI(new JTextFieldHintUI("Cal", Color.gray));
        jTextField5.setFont(new Font("Arial", 1, 12));
        add(jTextField5);
        jTextField5.setBounds(530, 410, 150, 30);

        // textfield that gets the input of dairy. alignments are here. not inputs - listeners
        jTextField6.setBackground(new Color(240, 240, 240));
        jTextField6.setUI(new JTextFieldHintUI("Cal", Color.gray));
        jTextField6.setFont(new Font("Arial", 1, 12));
        add(jTextField6);
        jTextField6.setBounds(530, 460, 150, 30);

        // textfield that gets the input of fruitsAndVegetables. alignments are here. not inputs - listeners
        jTextField7.setBackground(new Color(240, 240, 240));
        jTextField7.setUI(new JTextFieldHintUI("Cal", Color.gray));
        jTextField7.setFont(new Font("Arial", 1, 12));
        add(jTextField7);
        jTextField7.setBounds(530, 510, 150, 30);

        // textfield that gets the input of snacks. alignments are here. not inputs - listeners
        jTextField8.setBackground(new Color(240, 240, 240));
        jTextField8.setUI(new JTextFieldHintUI("Cal", Color.gray));
        jTextField8.setFont(new Font("Arial", 1, 12));
        add(jTextField8);
        jTextField8.setBounds(530, 560, 150, 30);

        // next button alignments
        nextButton.setFont(new Font("Arial", 0, 12));
        nextButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png")));
        nextButton.setText("Next");
        add(nextButton);
        nextButton.setBounds(1120, 620, 110, 35);

        // go back button alignments
        goBackButton.setFont(new Font("Arial", 0, 12));
        goBackButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png")));
        goBackButton.setText("Go Back");
        add(goBackButton);
        goBackButton.setBounds(50, 620, 110, 35);

        // calories label alignments
        caloriesLabel1.setFont(new Font("Arial", 3, 12));
        caloriesLabel1.setForeground(new Color(255, 255, 255));
        caloriesLabel1.setText("calories");
        add(caloriesLabel1);
        caloriesLabel1.setBounds(710, 210, 50, 30);

        // calories label alignments
        caloriesLabel2.setFont(new Font("Arial", 3, 12));
        caloriesLabel2.setForeground(new Color(255, 255, 255));
        caloriesLabel2.setText("calories");
        add(caloriesLabel2);
        caloriesLabel2.setBounds(710, 260, 50, 30);

        // calories label alignments
        caloriesLabel3.setFont(new Font("Arial", 1, 12));
        caloriesLabel3.setForeground(new Color(255, 255, 255));
        caloriesLabel3.setText("calories");
        add(caloriesLabel3);
        caloriesLabel3.setBounds(710, 310, 50, 30);

        // calories label alignments
        caloriesLabel4.setFont(new Font("Arial", 3, 12));
        caloriesLabel4.setForeground(new Color(255, 255, 255));
        caloriesLabel4.setText("calories");
        add(caloriesLabel4);
        caloriesLabel4.setBounds(710, 360, 50, 30);

        // calories label alignments
        caloriesLabel5.setFont(new Font("Arial", 3, 12));
        caloriesLabel5.setForeground(new Color(255, 255, 255));
        caloriesLabel5.setText("calories");
        add(caloriesLabel5);
        caloriesLabel5.setBounds(710, 410, 50, 30);

        // calories label alignments
        caloriesLabel6.setFont(new Font("Arial", 3, 12));
        caloriesLabel6.setForeground(new Color(255, 255, 255));
        caloriesLabel6.setText("calories");
        add(caloriesLabel6);
        caloriesLabel6.setBounds(710, 460, 50, 30);

        // calories label alignments
        caloriesLabel7.setFont(new Font("Arial", 3, 12));
        caloriesLabel7.setForeground(new Color(255, 255, 255));
        caloriesLabel7.setText("calories");
        add(caloriesLabel7);
        caloriesLabel7.setBounds(710, 510, 50, 30);

        // calories label alignments
        caloriesLabel8.setFont(new Font("Arial", 3, 12));
        caloriesLabel8.setForeground(new Color(255, 255, 255));
        caloriesLabel8.setText("calories");
        add(caloriesLabel8);
        caloriesLabel8.setBounds(710, 560, 50, 30);

        // background
        background.setIcon(new ImageIcon(getClass().getResource("../icons and backgrounds/final.jpg")));
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    } // end of the init components method

} // end of the class
