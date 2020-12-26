package gui;

/**
 * @author Eren Özen, Onur Ertunç
 */
public class OldReportsPanel extends javax.swing.JPanel {

    public OldReportsPanel() {
        initComponents();
    }

    private void initComponents() {

        oldReportLabel = new javax.swing.JLabel();
        carbobarProgressBar = new javax.swing.JProgressBar();
        datePane = new javax.swing.JScrollPane();
        dateTable = new javax.swing.JTable();
        detailsPane = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();
        leftLabel = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        carbobarLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        oldReportLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        oldReportLabel.setForeground(new java.awt.Color(255, 255, 255));
        oldReportLabel.setText("OLD REPORTS");
        add(oldReportLabel);
        oldReportLabel.setBounds(500, 80, 280, 40);

        carbobarProgressBar.setValue(10);
        carbobarProgressBar.setPreferredSize(new java.awt.Dimension(300, 20));
        carbobarProgressBar.setRequestFocusEnabled(false);
        add(carbobarProgressBar);
        carbobarProgressBar.setBounds(480, 610, 300, 20);

        dateTable.setBackground(new java.awt.Color(88, 78, 69));
        dateTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dateTable.setForeground(new java.awt.Color(255, 255, 255));
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

        detailsTable.setBackground(new java.awt.Color(88, 78, 69));
        detailsTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        detailsTable.setForeground(new java.awt.Color(255, 255, 255));
        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Total", null},
                {"Food", null},
                {"Transportation", null},
                {"Home", null},
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

        leftLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        leftLabel.setForeground(new java.awt.Color(255, 255, 255));
        leftLabel.setText("Click a date to see details!");
        add(leftLabel);
        leftLabel.setBounds(370, 260, 150, 15);

        detailsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        detailsLabel.setForeground(new java.awt.Color(255, 255, 255));
        detailsLabel.setText("DETAILS");
        add(detailsLabel);
        detailsLabel.setBounds(900, 250, 90, 22);

        carbobarLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        carbobarLabel.setForeground(new java.awt.Color(255, 255, 255));
        carbobarLabel.setText("Carbobar");
        add(carbobarLabel);
        carbobarLabel.setBounds(590, 580, 80, 22);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons and backgrounds/final.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private javax.swing.JLabel background;
    private javax.swing.JLabel carbobarLabel;
    private javax.swing.JProgressBar carbobarProgressBar;
    private javax.swing.JScrollPane datePane;
    private javax.swing.JTable dateTable;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JScrollPane detailsPane;
    private javax.swing.JTable detailsTable;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JLabel oldReportLabel;


}
