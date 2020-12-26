package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class FriendsPanel extends javax.swing.JPanel {

    public FriendsPanel() {
        initComponents();
    }


    private void initComponents() {

        friendsLabel = new javax.swing.JLabel();
        frinedsPane = new javax.swing.JScrollPane();
        frinedsTable = new javax.swing.JTable();
        meLabel = new javax.swing.JLabel();
        addFrinedField = new javax.swing.JTextField();
        addFriendLabel = new javax.swing.JLabel();
        averageLabel = new javax.swing.JLabel();
        averageBar = new javax.swing.JProgressBar();
        meBar = new javax.swing.JProgressBar();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        friendsLabel.setBackground(new java.awt.Color(255, 255, 255));
        friendsLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        friendsLabel.setForeground(new java.awt.Color(255, 255, 255));
        friendsLabel.setText("FRIENDS");
        add(friendsLabel);
        friendsLabel.setBounds(575, 80, 180, 40);

        frinedsTable.setBackground(new java.awt.Color(88, 78, 69));
        frinedsTable.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        frinedsTable.setForeground(new java.awt.Color(255, 255, 255));
        frinedsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Friend", "Carbopoint Level"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
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
        frinedsTable.setRowHeight(36);
        frinedsPane.setViewportView(frinedsTable);
        if (frinedsTable.getColumnModel().getColumnCount() > 0) {
            frinedsTable.getColumnModel().getColumn(0).setResizable(false);
            frinedsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(frinedsPane);
        frinedsPane.setBounds(300, 260, 400, 210);

        meLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        meLabel.setForeground(new java.awt.Color(255, 255, 255));
        meLabel.setText("Me");
        add(meLabel);
        meLabel.setBounds(980, 410, 40, 29);

        addFrinedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFrinedFieldActionPerformed(evt);
            }
        });
        add(addFrinedField);
        addFrinedField.setBounds(390, 580, 120, 30);

        addFriendLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addFriendLabel.setForeground(new java.awt.Color(255, 255, 255));
        addFriendLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/add.png"))); // NOI18N
        addFriendLabel.setText("Add Friend");
        add(addFriendLabel);
        addFriendLabel.setBounds(290, 580, 110, 32);

        averageLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        averageLabel.setForeground(new java.awt.Color(255, 255, 255));
        averageLabel.setText("Average");
        add(averageLabel);
        averageLabel.setBounds(950, 220, 90, 29);

        averageBar.setValue(45);
        averageBar.setPreferredSize(new java.awt.Dimension(300, 20));
        averageBar.setRequestFocusEnabled(false);
        add(averageBar);
        averageBar.setBounds(850, 260, 300, 20);

        meBar.setValue(70);
        meBar.setPreferredSize(new java.awt.Dimension(300, 20));
        meBar.setRequestFocusEnabled(false);
        add(meBar);
        meBar.setBounds(850, 450, 300, 20);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void addFrinedFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private javax.swing.JLabel addFriendLabel;
    private javax.swing.JTextField addFrinedField;
    private javax.swing.JProgressBar averageBar;
    private javax.swing.JLabel averageLabel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel friendsLabel;
    private javax.swing.JScrollPane frinedsPane;
    private javax.swing.JTable frinedsTable;
    private javax.swing.JProgressBar meBar;
    private javax.swing.JLabel meLabel;

}
