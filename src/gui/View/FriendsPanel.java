package gui.View;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

/**
 * FriendsPanel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class FriendsPanel extends JPanel {

    // Properties - components
    private JLabel addFriendLabel;
    private JTextField addFrinedField;
    private JProgressBar averageBar;
    private JLabel averageLabel;
    private JLabel background;
    private JLabel friendsLabel;
    private JScrollPane frinedsPane;
    private JTable frinedsTable;
    private JProgressBar meBar;
    private JLabel meLabel;

    public FriendsPanel() {
        initComponents();
    }


    private void initComponents() {

        friendsLabel = new JLabel();
        frinedsPane = new JScrollPane();
        frinedsTable = new JTable();
        meLabel = new JLabel();
        addFrinedField = new JTextField();
        addFriendLabel = new JLabel();
        averageLabel = new JLabel();
        averageBar = new JProgressBar();
        meBar = new JProgressBar();
        background = new JLabel();

        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        friendsLabel.setBackground(new Color(255, 255, 255));
        friendsLabel.setFont(new Font("Calibri", 1, 48));
        friendsLabel.setForeground(new Color(255, 255, 255));
        friendsLabel.setText("FRIENDS");
        add(friendsLabel);
        friendsLabel.setBounds(575, 80, 180, 60);

        frinedsTable.setBackground(new Color(88, 78, 69));
        frinedsTable.setFont(new Font("Arial", 0, 24));
        frinedsTable.setForeground(new Color(255, 255, 255));
        frinedsTable.setModel(new DefaultTableModel(
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

        meLabel.setFont(new Font("Arial", 0, 24));
        meLabel.setForeground(new Color(255, 255, 255));
        meLabel.setText("Me");
        add(meLabel);
        meLabel.setBounds(980, 410, 40, 29);

        addFrinedField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addFrinedFieldActionPerformed(evt);
            }
        });
        add(addFrinedField);
        addFrinedField.setBounds(390, 580, 120, 30);

        addFriendLabel.setFont(new Font("Arial", 0, 12));
        addFriendLabel.setForeground(new Color(255, 255, 255));
        addFriendLabel.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/add.png")));
        addFriendLabel.setText("Add Friend");
        add(addFriendLabel);
        addFriendLabel.setBounds(290, 580, 110, 32);

        averageLabel.setFont(new Font("Arial", 0, 24));
        averageLabel.setForeground(new Color(255, 255, 255));
        averageLabel.setText("Average");
        add(averageLabel);
        averageLabel.setBounds(950, 220, 90, 29);

        averageBar.setValue(45);
        averageBar.setPreferredSize(new Dimension(300, 20));
        averageBar.setRequestFocusEnabled(false);
        add(averageBar);
        averageBar.setBounds(850, 260, 300, 20);

        meBar.setValue(70);
        meBar.setPreferredSize(new Dimension(300, 20));
        meBar.setRequestFocusEnabled(false);
        add(meBar);
        meBar.setBounds(850, 450, 300, 20);

        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }// end of the initComponents

    private void addFrinedFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

}
