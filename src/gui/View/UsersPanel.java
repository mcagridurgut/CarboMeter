package gui.View;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Users panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */
public class UsersPanel extends JPanel {

    // Properties - components
    private JLabel background;
    public JButton kickUserButton;
    private JLabel usersLabel;
    private JScrollPane usersPane;
    private JTable usersTable;

    /**
     * constructor of the class. Calls the initComponents method
     */
    public UsersPanel() {
        initComponents();
    }

    /**
     * initializes components of the panel and align them
     */
    private void initComponents() {

        // initialization of the components
        usersLabel = new JLabel();
        usersPane = new JScrollPane();
        usersTable = new JTable();
        kickUserButton = new JButton();
        background = new JLabel();

        // dimension of the panel and layout settings
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // usersLabel alignment
        usersLabel.setBackground(new Color(255, 255, 255));
        usersLabel.setFont(new Font("Calibri", 1, 48));
        usersLabel.setForeground(new Color(255, 255, 255));
        usersLabel.setText("USERS");
        add(usersLabel);
        usersLabel.setBounds(575, 80, 130, 60);

        // usersTable alignment
        usersTable.setBackground(new Color(88, 78, 69));
        usersTable.setFont(new Font("Arial", 0, 18));
        usersTable.setForeground(new Color(255, 255, 255));
        usersTable.setModel(new DefaultTableModel(
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

        // usersTable added to the panel
        add(usersPane);
        usersPane.setBounds(230, 180, 810, 320);

        // kick user button alignments
        kickUserButton.setFont(new Font("Arial", 0, 18));
        kickUserButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/cancel.png")));
        kickUserButton.setText("Kick User");
        kickUserButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                kickUserButtonActionPerformed(evt);
            }
        });
        add(kickUserButton);
        kickUserButton.setBounds(560, 550, 180, 60);

        // background
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    } // end of the initComponents

    /**
     * kickUser button action performed method
     * @param evt action event
     */
    private void kickUserButtonActionPerformed(ActionEvent evt) {
    }

} // end of the class
