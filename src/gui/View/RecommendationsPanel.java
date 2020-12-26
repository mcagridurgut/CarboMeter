package gui.View;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class RecommendationsPanel extends javax.swing.JPanel {

    public RecommendationsPanel() {
        initComponents();
    }

    private void initComponents() {

        recommendationsLabel = new javax.swing.JLabel();
        foodRecommendationButton = new javax.swing.JButton();
        transportationlRecommendationButton = new javax.swing.JButton();
        houseRecommendationButton = new javax.swing.JButton();
        othersRecommendationButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        recommendationsTextArea = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(null);

        recommendationsLabel.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        recommendationsLabel.setForeground(new java.awt.Color(255, 255, 255));
        recommendationsLabel.setText("RECOMMENDATIONS");
        add(recommendationsLabel);
        recommendationsLabel.setBounds(425, 80, 429, 60);

        foodRecommendationButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        foodRecommendationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/diet (1).png"))); // NOI18N
        foodRecommendationButton.setText("Food");
        add(foodRecommendationButton);
        foodRecommendationButton.setBounds(200, 150, 210, 80);

        transportationlRecommendationButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        transportationlRecommendationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/globe (1).png"))); // NOI18N
        transportationlRecommendationButton.setText("Transportation");
        add(transportationlRecommendationButton);
        transportationlRecommendationButton.setBounds(200, 260, 210, 80);

        houseRecommendationButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        houseRecommendationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/home (2).png"))); // NOI18N
        houseRecommendationButton.setText("House");
        houseRecommendationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseRecommendationButtonActionPerformed(evt);
            }
        });
        add(houseRecommendationButton);
        houseRecommendationButton.setBounds(200, 370, 210, 80);

        othersRecommendationButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        othersRecommendationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/application (1).png"))); // NOI18N
        othersRecommendationButton.setText("Others");
        add(othersRecommendationButton);
        othersRecommendationButton.setBounds(200, 480, 210, 80);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        recommendationsTextArea.setBackground(new java.awt.Color(88, 78, 69));
        recommendationsTextArea.setColumns(20);
        recommendationsTextArea.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        recommendationsTextArea.setForeground(new java.awt.Color(255, 255, 255));
        recommendationsTextArea.setRows(5);
        recommendationsTextArea.setBorder(null);
        jScrollPane1.setViewportView(recommendationsTextArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(570, 150, 540, 410);

        background.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1280, 700));
        background.setMinimumSize(new java.awt.Dimension(1280, 700));
        background.setPreferredSize(new java.awt.Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    private void houseRecommendationButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private javax.swing.JLabel background;
    public javax.swing.JButton foodRecommendationButton;
    public javax.swing.JButton houseRecommendationButton;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton othersRecommendationButton;
    private javax.swing.JLabel recommendationsLabel;
    private javax.swing.JTextArea recommendationsTextArea;
    public javax.swing.JButton transportationlRecommendationButton;

}
