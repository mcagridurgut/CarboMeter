package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class SuperChallengesPanel extends javax.swing.JPanel {

    public SuperChallengesPanel() {
        initComponents();
    }

    private void initComponents() {

        superChallengesLabel = new javax.swing.JLabel();
        currentChallengesLabel = new javax.swing.JLabel();
        challengesComboBox = new javax.swing.JComboBox<>();
        activeChallengePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        challengeTable = new javax.swing.JTable();
        removeChallengeButton = new javax.swing.JButton();
        addChallengeButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        superChallengesLabel.setBackground(new java.awt.Color(255, 255, 255));
        superChallengesLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        superChallengesLabel.setForeground(new java.awt.Color(255, 255, 255));
        superChallengesLabel.setText("CHALLENGES");
        add(superChallengesLabel);
        superChallengesLabel.setBounds(505, 80, 270, 40);

        currentChallengesLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        currentChallengesLabel.setForeground(new java.awt.Color(255, 255, 255));
        currentChallengesLabel.setText("Current Challenges");
        add(currentChallengesLabel);
        currentChallengesLabel.setBounds(380, 240, 160, 22);

        challengesComboBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        challengesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2" }));
        challengesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challengesComboBoxActionPerformed(evt);
            }
        });
        add(challengesComboBox);
        challengesComboBox.setBounds(330, 270, 250, 50);

        challengeTable.setBackground(new java.awt.Color(88, 78, 69));
        challengeTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        challengeTable.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout activeChallengePanelLayout = new javax.swing.GroupLayout(activeChallengePanel);
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

        removeChallengeButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        removeChallengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/cancel.png"))); // NOI18N
        removeChallengeButton.setText("Delete Challenge");
        removeChallengeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeChallengeButtonActionPerformed(evt);
            }
        });
        add(removeChallengeButton);
        removeChallengeButton.setBounds(1030, 550, 180, 33);

        addChallengeButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addChallengeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/add-button.png"))); // NOI18N
        addChallengeButton1.setText("Add Challenge");
        addChallengeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChallengeButton1ActionPerformed(evt);
            }
        });
        add(addChallengeButton1);
        addChallengeButton1.setBounds(810, 550, 180, 33);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setToolTipText("");
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1282, 700);
    }

    private void challengesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void removeChallengeButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void addChallengeButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JPanel activeChallengePanel;
    public javax.swing.JButton addChallengeButton1;
    private javax.swing.JLabel background;
    private javax.swing.JTable challengeTable;
    private javax.swing.JComboBox<String> challengesComboBox;
    private javax.swing.JLabel currentChallengesLabel;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton removeChallengeButton;
    private javax.swing.JLabel superChallengesLabel;

}
