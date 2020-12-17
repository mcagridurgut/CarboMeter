package CarbometerGUI;

/**
 *
 * @author Onur Ertunc
 * @version 17.12.2020
 */
public class RecommendationsPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecommendationsPanel
     */
    public RecommendationsPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        recommendationsLabel = new javax.swing.JLabel();
        houseButton = new javax.swing.JButton();
        travelButton = new javax.swing.JButton();
        foodButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        suggestionLabel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(75, 139, 59));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        recommendationsLabel.setFont(new java.awt.Font("Georgia", 1, 48));
        recommendationsLabel.setText("Recommendations");

        houseButton.setText("House");
        houseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseButtonActionPerformed(evt);
            }
        });

        travelButton.setText("Travel");
        travelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelButtonActionPerformed(evt);
            }
        });

        foodButton.setText("Food");
        foodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Others");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout suggestionLabelLayout = new javax.swing.GroupLayout(suggestionLabel);
        suggestionLabel.setLayout(suggestionLabelLayout);
        suggestionLabelLayout.setHorizontalGroup(
            suggestionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );
        suggestionLabelLayout.setVerticalGroup(
            suggestionLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addComponent(recommendationsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(foodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(travelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(houseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(suggestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(recommendationsLabel)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(houseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(travelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(foodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(suggestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }

    private void travelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void houseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void foodButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration
    private javax.swing.JButton foodButton;
    private javax.swing.JButton houseButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel recommendationsLabel;
    private javax.swing.JPanel suggestionLabel;
    private javax.swing.JButton travelButton;
    // End of variables declaration
}
