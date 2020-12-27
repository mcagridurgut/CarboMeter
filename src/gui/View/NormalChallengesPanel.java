package gui.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Normal Challenges panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class NormalChallengesPanel extends javax.swing.JPanel {

    // Properties of the normal challenges panel
    private JLabel background;
    private JComboBox<String> challengesComboBox;
    private JLabel currentChallengesLabel;
    private JLabel normalChallengesLabel;
    private JScrollPane normalChallengesPanel;
    private JTextArea normalChallengesTextArea;

    /**
     * constructor of the class
     */
    public NormalChallengesPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        normalChallengesLabel = new JLabel();
        currentChallengesLabel = new JLabel();
        challengesComboBox = new JComboBox<>();
        normalChallengesPanel = new JScrollPane();
        normalChallengesTextArea = new JTextArea();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // normalChallenges label alignment (background, font, foreground, text and position)
        normalChallengesLabel.setBackground(new Color(255, 255, 255));
        normalChallengesLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        normalChallengesLabel.setForeground(new Color(255, 255, 255));
        normalChallengesLabel.setText("CHALLENGES");
        add(normalChallengesLabel);
        normalChallengesLabel.setBounds(505, 80, 270, 60);

        // currentChallenges label alignment (font, foreground, text and position)
        currentChallengesLabel.setFont(new Font("Arial", 0, 18)); // NOI18N
        currentChallengesLabel.setForeground(new Color(255, 255, 255));
        currentChallengesLabel.setText("Current Challenges");
        add(currentChallengesLabel);
        currentChallengesLabel.setBounds(380, 220, 160, 22);

        // challengesComboBox alignment (font, model and position)
        challengesComboBox.setFont(new Font("Arial", 0, 18)); // NOI18N
        challengesComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2" }));
        challengesComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                challengesComboBoxActionPerformed(evt);
            }
        });
        add(challengesComboBox);
        challengesComboBox.setBounds(330, 250, 250, 50);

        // normal Challenges Text Area alignment (background, columns, font, foreground, rows and position)
        normalChallengesTextArea.setBackground(new Color(88, 78, 69));
        normalChallengesTextArea.setColumns(20);
        normalChallengesTextArea.setFont(new Font("Arial", 0, 18)); // NOI18N
        normalChallengesTextArea.setForeground(new Color(255, 255, 255));
        normalChallengesTextArea.setRows(5);
        normalChallengesPanel.setViewportView(normalChallengesTextArea);

        add(normalChallengesPanel);
        normalChallengesPanel.setBounds(730, 230, 500, 380);

        // background alignment ( icon, ToolTipText and positioning)
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setToolTipText("");
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1282, 700);
    }

    /**
     * challengesComboBox action performed method. check the gui class.
     * @param evt action event
     */
    private void challengesComboBoxActionPerformed(ActionEvent evt) {

    }



}
