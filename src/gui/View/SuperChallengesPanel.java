package gui.View;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * super user challenges panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */
public class SuperChallengesPanel extends JPanel {

    // Properties of the sign up panel
    private JPanel activeChallengePanel;
    public JButton addChallengeButton1;
    private JLabel background;
    private JTable challengeTable;
    private JComboBox<String> challengesComboBox;
    private JLabel currentChallengesLabel;
    private JScrollPane jScrollPane1;
    public JButton removeChallengeButton;
    private JLabel superChallengesLabel;

    /**
     * constructor of the class
     */
    public SuperChallengesPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        superChallengesLabel = new JLabel();
        currentChallengesLabel = new JLabel();
        challengesComboBox = new JComboBox<>();
        activeChallengePanel = new JPanel();
        jScrollPane1 = new JScrollPane();
        challengeTable = new JTable();
        removeChallengeButton = new JButton();
        addChallengeButton1 = new JButton();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // super challenges label alignment (background, font, foreground, text and position)
        superChallengesLabel.setBackground(new Color(255, 255, 255));
        superChallengesLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        superChallengesLabel.setForeground(new Color(255, 255, 255));
        superChallengesLabel.setText("CHALLENGES");
        add(superChallengesLabel);
        superChallengesLabel.setBounds(505, 80, 270, 60);

        // current challenges label alignment (font, foreground, text and position)
        currentChallengesLabel.setFont(new Font("Arial", 0, 18)); // NOI18N
        currentChallengesLabel.setForeground(new Color(255, 255, 255));
        currentChallengesLabel.setText("Current Challenges");
        add(currentChallengesLabel);
        currentChallengesLabel.setBounds(380, 240, 160, 22);

        // challenges combobox alignment (font, model and position)
        challengesComboBox.setFont(new Font("Arial", 0, 18)); // NOI18N
        challengesComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2" }));
        challengesComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                challengesComboBoxActionPerformed(evt);
            }
        });
        add(challengesComboBox);
        challengesComboBox.setBounds(330, 270, 250, 50);

        // challenges table alignment (background, font, foreground, model and position)
        challengeTable.setBackground(new Color(88, 78, 69));
        challengeTable.setFont(new Font("Arial", 0, 18)); // NOI18N
        challengeTable.setForeground(new Color(255, 255, 255));
        challengeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,  new Boolean(false)},
                {null,  new Boolean(false)},
                {null,  new Boolean(false)},
                {null,  new Boolean(false)},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Current Situation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        challengeTable.setRowHeight(36);
        jScrollPane1.setViewportView(challengeTable);

        GroupLayout activeChallengePanelLayout = new GroupLayout(activeChallengePanel);
        activeChallengePanel.setLayout(activeChallengePanelLayout);
        activeChallengePanelLayout.setHorizontalGroup(
            activeChallengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        activeChallengePanelLayout.setVerticalGroup(
            activeChallengePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        add(activeChallengePanel);
        activeChallengePanel.setBounds(810, 240, 400, 300);

        // remove challenge button alignment (font, icon, text and position)
        removeChallengeButton.setFont(new Font("Arial", 0, 14)); // NOI18N
        removeChallengeButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/cancel.png"))); // NOI18N
        removeChallengeButton.setText("Delete Challenge");
        removeChallengeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removeChallengeButtonActionPerformed(evt);
            }
        });
        add(removeChallengeButton);
        removeChallengeButton.setBounds(1030, 550, 180, 33);

        // add challenge button alignment (font, icon, text and position)
        addChallengeButton1.setFont(new Font("Arial", 0, 14)); // NOI18N
        addChallengeButton1.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/add-button.png"))); // NOI18N
        addChallengeButton1.setText("Add Challenge");
        addChallengeButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addChallengeButton1ActionPerformed(evt);
            }
        });
        add(addChallengeButton1);
        addChallengeButton1.setBounds(810, 550, 180, 33);

        // background alignment (font, icon and positioning)
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setToolTipText("");
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1282, 700);
    }

    /**
     * challenges combobox action performed method. check the gui class.
     * @param evt action event
     */
    private void challengesComboBoxActionPerformed(ActionEvent evt) {
    }

    /**
     * remove challenge button action performed method. check the gui class.
     * @param evt action event
     */
    private void removeChallengeButtonActionPerformed(ActionEvent evt) {
    }

    /**
     * add challenge button action performed method. check the gui class.
     * @param evt action event
     */
    private void addChallengeButton1ActionPerformed(ActionEvent evt) {
    }



}
