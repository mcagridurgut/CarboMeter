package gui.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * New Report panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class NewReportPanel extends JPanel {

    // Properties of the new report panel
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
     * constructor of the class
     */
    public NewReportPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
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

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // newReportLabel alignment ( font, foreground, text and position)
        newReportLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        newReportLabel.setForeground(new Color(255, 255, 255));
        newReportLabel.setText("NEW REPORT");
        add(newReportLabel);
        newReportLabel.setBounds(505, 80, 270, 60);

        // comboBoxFood alignment ( background, model and position)
        comboBoxFood.setBackground(new Color(240, 240, 240));
        comboBoxFood.setModel(new DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        comboBoxFood.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                comboBoxFoodActionPerformed(evt);
            }
        });
        add(comboBoxFood);
        comboBoxFood.setBounds(650, 260, 100, 40);

        // carbobarLabel alignment ( font, foreground, text and position)
        carbobarLabel.setFont(new Font("Arial", 0, 24)); // NOI18N
        carbobarLabel.setForeground(new Color(255, 255, 255));
        carbobarLabel.setText("Carbobar");
        add(carbobarLabel);
        carbobarLabel.setBounds(1000, 320, 100, 30);

        // carbobarProgressBar alignment ( size, requestFocus and position)
        setBar(60);
        carbobarProgressBar.setPreferredSize(new Dimension(300, 20));
        carbobarProgressBar.setRequestFocusEnabled(false);
        add(carbobarProgressBar);
        carbobarProgressBar.setBounds(900, 370, 300, 20);

        // nextPage button alignment ( font, icon, text and position)
        nextPageButton.setFont(new Font("Arial", 0, 12)); // NOI18N
        nextPageButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png"))); // NOI18N
        nextPageButton.setText("Next");
        add(nextPageButton);
        nextPageButton.setBounds(1120, 620, 110, 35);

        // homeComboBox alignment ( background, model and position)
        homeComboBox.setBackground(new Color(240, 240, 240));
        homeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        homeComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                homeComboBoxActionPerformed(evt);
            }
        });
        add(homeComboBox);
        homeComboBox.setBounds(650, 380, 100, 40);

        // stuffComboBox alignment  ( background, model and position)
        stuffComboBox.setBackground(new Color(240, 240, 240));
        stuffComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        stuffComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                stuffComboBoxActionPerformed(evt);
            }
        });
        add(stuffComboBox);
        stuffComboBox.setBounds(650, 440, 100, 40);

        // travelComboBox alignment ( background, model and position)
        travelComboBox.setBackground(new Color(240, 240, 240));
        travelComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Default", "Personalize" }));
        travelComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                travelComboBoxActionPerformed(evt);
            }
        });
        add(travelComboBox);
        travelComboBox.setBounds(650, 320, 100, 40);

        // stuffIcon alignment ( foreground and position)
        stuffIcon.setForeground(new Color(255, 255, 255));
        stuffIcon.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/application (1).png"))); // NOI18N
        add(stuffIcon);
        stuffIcon.setBounds(610, 440, 30, 40);

        // homeIcon alignment (position)
        homeIcon.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/home (2).png"))); // NOI18N
        add(homeIcon);
        homeIcon.setBounds(610, 380, 30, 40);

        // foodIcon alignment (position)
        foodIcon.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/diet (1).png"))); // NOI18N
        add(foodIcon);
        foodIcon.setBounds(610, 260, 30, 40);

        // travelIcon alignment (position)
        travelIcon.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/globe (1).png"))); // NOI18N
        add(travelIcon);
        travelIcon.setBounds(610, 320, 40, 40);

        newReportPane.setBackground(new Color(255, 255, 255));

        // new Report Text Area alignment (editable, background, columns, font, foreground, rows, text and position)
        newReportTextArea.setEditable(false);
        newReportTextArea.setBackground(new Color(88, 78, 69));
        newReportTextArea.setColumns(20);
        newReportTextArea.setFont(new Font("Arial", 0, 24)); // NOI18N
        newReportTextArea.setForeground(new Color(255, 255, 255));
        newReportTextArea.setRows(5);
        newReportTextArea.setText("FOOD\n\nTRANSPORTATION\n\nHOUSE\n\nOTHERS\n");
        newReportPane.setViewportView(newReportTextArea);

        add(newReportPane);
        newReportPane.setBounds(290, 260, 460, 260);

        // background alignment ( dimension and positioning)
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    /**
     * comboBox action performed method. check the gui class.
     * @param evt action event
     */
    private void comboBoxFoodActionPerformed(ActionEvent evt) {

    }

    /**
     * homeComboBox action performed method. check the gui class.
     * @param evt action event
     */
    private void homeComboBoxActionPerformed(ActionEvent evt) {

    }

    /**
     * stuffComboBox action performed method. check the gui class.
     * @param evt action event
     */
    private void stuffComboBoxActionPerformed(ActionEvent evt) {

    }

    /**
     * travelComboBox action performed method. check the gui class.
     * @param evt action event
     */
    private void travelComboBoxActionPerformed(ActionEvent evt) {

    }

    /**
     * Sets the bar
     * @param num value
     */
    public void setBar (int num){
        carbobarProgressBar.setValue(num);
    }



}
