package gui.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Old reports panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */
public class OldReportsPanel extends javax.swing.JPanel {

    // Properties of the old reports panel
    private JLabel background;
    private JLabel carbobarLabel;
    private JProgressBar carbobarProgressBar;
    private JScrollPane datePane;
    private JTable dateTable;
    private JLabel detailsLabel;
    private JScrollPane detailsPane;
    private JTable detailsTable;
    private JLabel leftLabel;
    private JLabel oldReportLabel;

    /**
     * constructor of the class
     */
    public OldReportsPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        oldReportLabel = new JLabel();
        carbobarProgressBar = new JProgressBar();
        datePane = new JScrollPane();
        dateTable = new JTable();
        detailsPane = new JScrollPane();
        detailsTable = new JTable();
        leftLabel = new JLabel();
        detailsLabel = new JLabel();
        carbobarLabel = new JLabel();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // old report label alignment (font, foreground, text and position)
        oldReportLabel.setFont(new Font("Calibri", 1, 48)); // NOI18N
        oldReportLabel.setForeground(new Color(255, 255, 255));
        oldReportLabel.setText("OLD REPORTS");
        add(oldReportLabel);
        oldReportLabel.setBounds(500, 80, 280, 60);

        // carbobar progress bar alignment (dimension, focus and position)
        carbobarProgressBar.setValue(10);
        carbobarProgressBar.setPreferredSize(new Dimension(300, 20));
        carbobarProgressBar.setRequestFocusEnabled(false);
        add(carbobarProgressBar);
        carbobarProgressBar.setBounds(480, 610, 300, 20);

        // date table alignment (background, font, foreground, model and position)
        dateTable.setBackground(new Color(88, 78, 69));
        dateTable.setFont(new Font("Arial", 0, 18)); // NOI18N
        dateTable.setForeground(new Color(255, 255, 255));
        dateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {"", null},
                {"", null},
                {"", null},
                {"", null}
            },
            new String [] {
                "Date", "Carbopoint"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
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
        dateTable.setRowHeight(44);
        datePane.setViewportView(dateTable);
        if (dateTable.getColumnModel().getColumnCount() > 0) {
            dateTable.getColumnModel().getColumn(0).setResizable(false);
            dateTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(datePane);
        datePane.setBounds(240, 280, 400, 250);

        // details table alignment (background, font, foreground, model and position)
        detailsTable.setBackground(new Color(88, 78, 69));
        detailsTable.setFont(new Font("Arial", 0, 18)); // NOI18N
        detailsTable.setForeground(new Color(255, 255, 255));
        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total", null},
                {"Food", null},
                {"Transportation", null},
                {"House", null},
                {"Others", null},
                {"Donation", null}
            },
            new String [] {
                "Date", "01.01.21"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detailsTable.setRowHeight(36);
        detailsPane.setViewportView(detailsTable);
        if (detailsTable.getColumnModel().getColumnCount() > 0) {
            detailsTable.getColumnModel().getColumn(0).setResizable(false);
            detailsTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(detailsPane);
        detailsPane.setBounds(740, 280, 400, 250);

        // left label alignment (font, foreground, text and position)
        leftLabel.setFont(new Font("Arial", 1, 12)); // NOI18N
        leftLabel.setForeground(new Color(255, 255, 255));
        leftLabel.setText("Click a date to see details!");
        add(leftLabel);
        leftLabel.setBounds(370, 260, 150, 15);

        // details label alignment (font, foreground, text and position)
        detailsLabel.setFont(new Font("Arial", 1, 18)); // NOI18N
        detailsLabel.setForeground(new Color(255, 255, 255));
        detailsLabel.setText("DETAILS");
        add(detailsLabel);
        detailsLabel.setBounds(900, 250, 90, 22);

        // carbobar label alignment (font, foreground, text and position)
        carbobarLabel.setFont(new Font("Arial", 1, 18)); // NOI18N
        carbobarLabel.setForeground(new Color(255, 255, 255));
        carbobarLabel.setText("Carbobar");
        add(carbobarLabel);
        carbobarLabel.setBounds(590, 580, 80, 22);

        // background alignment ( icon and positioning)
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }




}
