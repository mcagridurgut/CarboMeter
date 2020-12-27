package gui.View;

import user.NormalUser;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Report panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class ReportPanel extends JPanel {

    // Properties of the report panel
    public JButton backPageButton;
    private JLabel background;
    private JLabel carbobarLabel;
    public JButton nextPageButton;
    private JProgressBar reportBar;
    private JLabel reportLabel;
    private JScrollPane reportPane;
    private JTable reportTable;

    /**
     * constructor of the class
     */
    public ReportPanel() {
       initComponents();
    }

    public void function(Double newFood,Double newTravel,Double newHome,Double newOthers,Double oldHome,Double oldTravel,Double oldFood,Double oldOthers){
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"Total", (double)(newFood.intValue()+newTravel.intValue()+newHome.intValue()+newOthers.intValue())/1000, 48.721, (double) (oldFood.intValue()+oldTravel.intValue()+oldHome.intValue()+oldOthers.intValue() )/1000 },
                        {"Food",(double) (newFood.intValue() ) /1000, 7.182,(double) (oldFood.intValue() ) /1000},
                        {"Transportation", (double) ( newTravel.intValue() ) /1000, 15.391, (double ) (oldTravel.intValue() ) /1000 },
                        {"House", (double)(newHome.intValue() ) /1000, 12.106, (double) (oldHome.intValue() ) /1000 },
                        {"Others", (double)(newOthers.intValue())/1000, 14.042,(double) (oldOthers.intValue())/1000}
                },
                new String [] {
                        "", "My Carbopoint", "Average", "My Old Data"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        reportLabel = new JLabel();
        reportBar = new JProgressBar();
        carbobarLabel = new JLabel();
        reportPane = new JScrollPane();
        reportTable = new JTable();
        nextPageButton = new JButton();
        backPageButton = new JButton();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // report label alignment (background, font, foreground, text and position)
        reportLabel.setBackground(new Color(255, 255, 255));
        reportLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        reportLabel.setForeground(new Color(255, 255, 255));
        reportLabel.setText("REPORT");
        add(reportLabel);
        reportLabel.setBounds(575, 80, 160, 60);

        // report label alignment (focus and position)
        reportBar.setValue(45);
        reportBar.setPreferredSize(new Dimension(300, 20));
        reportBar.setRequestFocusEnabled(false);
        add(reportBar);
        reportBar.setBounds(500, 630, 300, 20);

        // carbobar label alignment (font, foreground, text and position)
        carbobarLabel.setFont(new Font("Arial", 0, 24)); // NOI18N
        carbobarLabel.setForeground(new Color(255, 255, 255));
        carbobarLabel.setText("Carbobar");
        add(carbobarLabel);
        carbobarLabel.setBounds(600, 600, 100, 29);

        // report table alignment (background, font, foreground and position)
        reportTable.setBackground(new Color(88, 78, 69));
        reportTable.setFont(new Font("Arial", 0, 18)); // NOI18N
        reportTable.setForeground(new Color(255, 255, 255));

        function (0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);

        reportTable.setRowHeight(72);
        reportPane.setViewportView(reportTable);
        if (reportTable.getColumnModel().getColumnCount() > 0) {
            reportTable.getColumnModel().getColumn(0).setResizable(false);
            reportTable.getColumnModel().getColumn(1).setResizable(false);
            reportTable.getColumnModel().getColumn(2).setResizable(false);
            reportTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(reportPane);
        reportPane.setBounds(240, 190, 800, 390);

        // next page button alignment (font, icon, text and position)
        nextPageButton.setFont(new Font("Arial", 0, 12)); // NOI18N
        nextPageButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/right-arrow.png"))); // NOI18N
        nextPageButton.setText("Next");
        add(nextPageButton);
        nextPageButton.setBounds(1120, 620, 110, 35);

        // back page button alignment (font, icon, text and position)
        backPageButton.setFont(new Font("Arial", 0, 12)); // NOI18N
        backPageButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/left Arrow.png"))); // NOI18N
        backPageButton.setText("Go Back");
        add(backPageButton);
        backPageButton.setBounds(50, 620, 110, 35);

        // background alignment (font, icon and positioning)
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setToolTipText("");
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1282, 700);
    }



}
