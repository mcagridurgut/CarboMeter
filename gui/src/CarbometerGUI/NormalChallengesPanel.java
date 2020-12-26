package gui;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class NormalChallengesPanel extends javax.swing.JPanel {

    public NormalChallengesPanel() {
        initComponents();
    }

    private void initComponents() {

        normalChallengesLabel = new javax.swing.JLabel();
        currentChallengesLabel = new javax.swing.JLabel();
        challengesComboBox = new javax.swing.JComboBox<>();
        normalChallengesPanel = new javax.swing.JScrollPane();
        normalChallengesTextArea = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        normalChallengesLabel.setBackground(new java.awt.Color(255, 255, 255));
        normalChallengesLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        normalChallengesLabel.setForeground(new java.awt.Color(255, 255, 255));
        normalChallengesLabel.setText("CHALLENGES");
        add(normalChallengesLabel);
        normalChallengesLabel.setBounds(505, 80, 270, 40);

        currentChallengesLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        currentChallengesLabel.setForeground(new java.awt.Color(255, 255, 255));
        currentChallengesLabel.setText("Current Challenges");
        add(currentChallengesLabel);
        currentChallengesLabel.setBounds(380, 220, 160, 22);

        challengesComboBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        challengesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2" }));
        challengesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challengesComboBoxActionPerformed(evt);
            }
        });
        add(challengesComboBox);
        challengesComboBox.setBounds(330, 250, 250, 50);

        normalChallengesTextArea.setBackground(new java.awt.Color(88, 78, 69));
        normalChallengesTextArea.setColumns(20);
        normalChallengesTextArea.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        normalChallengesTextArea.setForeground(new java.awt.Color(255, 255, 255));
        normalChallengesTextArea.setRows(5);
        normalChallengesPanel.setViewportView(normalChallengesTextArea);

        add(normalChallengesPanel);
        normalChallengesPanel.setBounds(730, 230, 500, 380);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/final.jpg"))); // NOI18N
        background.setToolTipText("");
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1282, 700);
    }

    private void challengesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> challengesComboBox;
    private javax.swing.JLabel currentChallengesLabel;
    private javax.swing.JLabel normalChallengesLabel;
    private javax.swing.JScrollPane normalChallengesPanel;
    private javax.swing.JTextArea normalChallengesTextArea;

}
