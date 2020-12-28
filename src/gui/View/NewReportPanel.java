package gui.View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * NewReportPanel class of the Carbometer desktop app.  Draws the panel by using swing components.
 * @author Eren Özen, Onur Ertunç
 */
public class NewReportPanel extends JPanel {

    // Properties - components
    private JLabel background;
    private JLabel carbobarLabel;
    private JProgressBar carbobarProgressBar;
    public JComboBox<String> comboBoxFood;
    private JLabel foodIcon;
    public JComboBox<String> homeComboBox;
    private JLabel homeIcon;
    private JLabel jLabel3;
    private JLabel newReportLabel;
    private JScrollPane newReportPane;
    private JTextArea newReportTextArea;
    public JButton nextPageButton;
    public JComboBox<String> stuffComboBox;
    private JLabel stuffIcon;
    public JComboBox<String> travelComboBox;
    private JLabel travelIcon;

    /**
     * constructor of the class. calls the initComponents method.
     */
    public NewReportPanel() {
        initComponents();
    }

    /**
     * initializes the components of the class and makes alignments on them
     */
    private void initComponents() {

        // initialization of the components
        jLabel3 = new JLabel();
        newReportLabel = new JLabel();
        comboBoxFood = new JComboBox<>();
        carbobarLabel = new JLabel();
        carbobarProgressBar = new JProgressBar();
        nextPageButton = new JButton();
        homeComboBox = new JComboBox<>();
        stuffComboBox = new JComboBox<>();
        travelComboBox = new JComboBox<>();
        stuffIcon = new JLabel();
        homeIcon = new JLabel();
        foodIcon = new JLabel();
        travelIcon = new JLabel();
        newReportPane = new JScrollPane();
        newReportTextArea = new JTextArea();
        background = new JLabel();

        jLabel3.setText("jLabel3");

        // size and layout alignment
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // newreportlabel alignment
        newReportLabel.setFont(new Font("Calibri", 1, 48));
        newReportLabel.setForeground(new Color(255, 255, 255));
        newReportLabel.setText("NEW REPORT");
        add(newReportLabel);
        newReportLabel.setBounds(505, 80, 270, 60);

        // food combobox alignment
        comboBoxFood.setBackground(new Color(240, 240, 240));
        comboBoxFood.setModel(new DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        comboBoxFood.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                comboBoxFoodActionPerformed(evt);
            }
        });
        add(comboBoxFood);
        comboBoxFood.setBounds(650, 260, 100, 40);

        // carbobarLabel alignment
        carbobarLabel.setFont(new Font("Arial", 0, 24));
        carbobarLabel.setForeground(new Color(255, 255, 255));
        carbobarLabel.setText("Carbobar");
        add(carbobarLabel);
        carbobarLabel.setBounds(1000, 320, 100, 30);

        // the real carbobar alignment
        setBar(60);
        carbobarProgressBar.setPreferredSize(new Dimension(300, 20));
        carbobarProgressBar.setRequestFocusEnabled(false);
        add(carbobarProgressBar);
        carbobarProgressBar.setBounds(900, 370, 300, 20);

        // nextPageButton alignment
        nextPageButton.setFont(new Font("Arial", 0, 12));
        nextPageButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png")));
        nextPageButton.setText("Next");
        add(nextPageButton);
        nextPageButton.setBounds(1120, 620, 110, 35);

        // home combobox alignment
        homeComboBox.setBackground(new Color(240, 240, 240));
        homeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        homeComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                homeComboBoxActionPerformed(evt);
            }
        });
        add(homeComboBox);
        homeComboBox.setBounds(650, 380, 100, 40);

        // stuff combobox alignment(others question)
        stuffComboBox.setBackground(new Color(240, 240, 240));
        stuffComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        stuffComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                stuffComboBoxActionPerformed(evt);
            }
        });
        add(stuffComboBox);
        stuffComboBox.setBounds(650, 440, 100, 40);

        // transportation combobox alignment
        travelComboBox.setBackground(new Color(240, 240, 240));
        travelComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        travelComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                travelComboBoxActionPerformed(evt);
            }
        });
        add(travelComboBox);
        travelComboBox.setBounds(650, 320, 100, 40);

        // icon alignments for each category
        stuffIcon.setForeground(new Color(255, 255, 255));
        stuffIcon.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/application (1).png")));
        add(stuffIcon);
        stuffIcon.setBounds(610, 440, 30, 40);

        homeIcon.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/home (2).png")));
        add(homeIcon);
        homeIcon.setBounds(610, 380, 30, 40);

        foodIcon.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/diet (1).png")));
        add(foodIcon);
        foodIcon.setBounds(610, 260, 30, 40);

        travelIcon.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/globe (1).png")));
        add(travelIcon);
        travelIcon.setBounds(610, 320, 40, 40);

        // new report pane alignment
        newReportPane.setBackground(new Color(255, 255, 255));

        // new report text area alignment
        newReportTextArea.setEditable(false);
        newReportTextArea.setBackground(new Color(88, 78, 69));
        newReportTextArea.setColumns(20);
        newReportTextArea.setFont(new Font("Arial", 0, 24));
        newReportTextArea.setForeground(new Color(255, 255, 255));
        newReportTextArea.setRows(5);
        newReportTextArea.setText("FOOD\n\nTRANSPORTATION\n\nHOUSE\n\nOTHERS\n");
        newReportPane.setViewportView(newReportTextArea);

        add(newReportPane);
        newReportPane.setBounds(290, 260, 460, 260);

        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    /**
     * check the Gui class which is the controller of the program
     */
    private void comboBoxFoodActionPerformed(ActionEvent evt) {

    }

    /**
     * check the Gui class which is the controller of the program
     */
    private void homeComboBoxActionPerformed(ActionEvent evt) {

    }

    /**
     * check the Gui class which is the controller of the program
     */
    private void stuffComboBoxActionPerformed(ActionEvent evt) {

    }

    /**
     * check the Gui class which is the controller of the program
     */
    private void travelComboBoxActionPerformed(ActionEvent evt) {

    }

    /**
     * sets the carbobar
     * @param num carbopoint value
     */
    public void setBar (int num){
        carbobarProgressBar.setValue(num);
    }



}// end of the class
