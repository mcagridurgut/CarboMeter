package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class UsersPanel extends javax.swing.JPanel {

    public UsersPanel() {
        initComponents();
    }

    private void initComponents() {

        usersLabel = new javax.swing.JLabel();
        usersPane = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        kickUserButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        usersLabel.setBackground(new java.awt.Color(255, 255, 255));
        usersLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        usersLabel.setForeground(new java.awt.Color(255, 255, 255));
        usersLabel.setText("USERS");
        add(usersLabel);
        usersLabel.setBounds(575, 80, 130, 40);

        usersTable.setBackground(new java.awt.Color(88, 78, 69));
        usersTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        usersTable.setForeground(new java.awt.Color(255, 255, 255));
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Last Carbopoint Score", "Completed Challenges", "Uncompleted Challenges"
            }
        ));
        usersTable.setRowHeight(36);
        usersPane.setViewportView(usersTable);
        if (usersTable.getColumnModel().getColumnCount() > 0) {
            usersTable.getColumnModel().getColumn(0).setHeaderValue("Username");
            usersTable.getColumnModel().getColumn(1).setHeaderValue("Last Carbopoint Score");
            usersTable.getColumnModel().getColumn(2).setHeaderValue("Completed Challenges");
            usersTable.getColumnModel().getColumn(3).setHeaderValue("Uncompleted Challenges");
        }

        add(usersPane);
        usersPane.setBounds(230, 180, 810, 320);

        kickUserButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kickUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/cancel.png"))); // NOI18N
        kickUserButton.setText("Kick User");
        kickUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kickUserButtonActionPerformed(evt);
            }
        });
        add(kickUserButton);
        kickUserButton.setBounds(560, 550, 180, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private void kickUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private javax.swing.JLabel background;
    public javax.swing.JButton kickUserButton;
    private javax.swing.JLabel usersLabel;
    private javax.swing.JScrollPane usersPane;
    private javax.swing.JTable usersTable;

}
