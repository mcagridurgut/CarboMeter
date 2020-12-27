package gui.View;
import database.DatabaseConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * FriendsPanel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class FriendsPanel extends JPanel {
    ArrayList<String> list;
    public void function ( ArrayList<String> list){
        this.list = list;
        int a = list.size();
        Object[][] arr = new Object[a][2];
        for( int i = 0; i< a; i++){
            arr[i][0] = list.get(i);
            arr[i][1] = DatabaseConnection.select(list.get(i))[4];
        }
        frinedsTable.setModel(new DefaultTableModel(
                arr,
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
    }

    public void addFriend(String friend){
        list.add(friend);
        function(list);
        repaint();
    }

    // Properties - components
    private JLabel addFriendLabel;
    public JTextField addFrinedField;
    private JProgressBar averageBar;
    private JLabel averageLabel;
    private JLabel background;
    private JLabel friendsLabel;
    private JScrollPane frinedsPane;
    private JTable frinedsTable;
    private JProgressBar meBar;
    private JLabel meLabel;

    /**
     * constructor of the class. Calls initComponents to initalize properties
     */
    public FriendsPanel() {
        initComponents();
    }

    /**
     * initializes the components of the class
     */
    private void initComponents() {

        // initialization of the properties
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

        // size and layout of the panel aligned
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // friends label alignment
        friendsLabel.setBackground(new Color(255, 255, 255));
        friendsLabel.setFont(new Font("Calibri", 1, 48));
        friendsLabel.setForeground(new Color(255, 255, 255));
        friendsLabel.setText("FRIENDS");
        add(friendsLabel);
        friendsLabel.setBounds(575, 80, 180, 60);

        // friends table alignments
        frinedsTable.setBackground(new Color(88, 78, 69));
        frinedsTable.setFont(new Font("Arial", 0, 24));
        frinedsTable.setForeground(new Color(255, 255, 255));
        frinedsTable.setRowHeight(36);
        frinedsPane.setViewportView(frinedsTable);
        if (frinedsTable.getColumnModel().getColumnCount() > 0) {
            frinedsTable.getColumnModel().getColumn(0).setResizable(false);
            frinedsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        // adds it to the panel
        add(frinedsPane);
        frinedsPane.setBounds(300, 260, 400, 210);

        // me label alignments
        meLabel.setFont(new Font("Arial", 0, 24));
        meLabel.setForeground(new Color(255, 255, 255));
        meLabel.setText("Me");
        add(meLabel);
        meLabel.setBounds(980, 410, 40, 29);

        // add friend label alignments
        addFrinedField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addFrinedFieldActionPerformed(evt);
            }
        });
        //added to the panel
        add(addFrinedField);
        addFrinedField.setBounds(390, 580, 120, 30);

        // add friend label alignments
        addFriendLabel.setFont(new Font("Arial", 0, 12));
        addFriendLabel.setForeground(new Color(255, 255, 255));
        addFriendLabel.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/add.png")));
        addFriendLabel.setText("Add Friend");
        add(addFriendLabel);
        addFriendLabel.setBounds(290, 580, 110, 32);

        // average label alignments
        averageLabel.setFont(new Font("Arial", 0, 24));
        averageLabel.setForeground(new Color(255, 255, 255));
        averageLabel.setText("Average");
        add(averageLabel);
        averageLabel.setBounds(950, 220, 90, 29);

        // average bar alignments
        averageBar.setValue(45);
        averageBar.setPreferredSize(new Dimension(300, 20));
        averageBar.setRequestFocusEnabled(false);
        add(averageBar);
        averageBar.setBounds(850, 260, 300, 20);

        // me bar alignments
        meBar.setValue(70);
        meBar.setPreferredSize(new Dimension(300, 20));
        meBar.setRequestFocusEnabled(false);
        add(meBar);
        meBar.setBounds(850, 450, 300, 20);

        // background alignment
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }// end of the initComponents

    /**
     * addFrinedField action performed method. check the gui class.
     * @param evt action event
     */
    private void addFrinedFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

}
