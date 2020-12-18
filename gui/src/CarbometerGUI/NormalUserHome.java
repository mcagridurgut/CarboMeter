package guifinal;

/**
 * @author Eren Özen, Onur Ertunç
 * @date 17.12.2020
 */

public class NormalUserHome extends javax.swing.JPanel {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton challangesButton;
    private javax.swing.JButton donationButton;
    private javax.swing.JButton friendsButton;
    private javax.swing.JButton homeLogOutButton;
    private javax.swing.JButton newReportButton;
    private javax.swing.JLabel normalHomeLabel;
    private javax.swing.JButton oldReportButton;
    private javax.swing.JButton recommendationsButton;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Creates new form NormalUserHome
     */
    public NormalUserHome() {
        initComponents();
    }

    private void initComponents() {

        normalHomeLabel = new javax.swing.JLabel();
        homeLogOutButton = new javax.swing.JButton();
        newReportButton = new javax.swing.JButton();
        oldReportButton = new javax.swing.JButton();
        donationButton = new javax.swing.JButton();
        challangesButton = new javax.swing.JButton();
        friendsButton = new javax.swing.JButton();
        recommendationsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(75, 139, 59));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        normalHomeLabel.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        normalHomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        normalHomeLabel.setText("Home");

        homeLogOutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\door.png")); // NOI18N
        homeLogOutButton.setText("Log Out");
        homeLogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeLogOutButtonActionPerformed(evt);
            }
        });

        newReportButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newReportButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\report (1).png")); // NOI18N
        newReportButton.setText("Create New Report");
        newReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReportButtonActionPerformed(evt);
            }
        });

        oldReportButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oldReportButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\electrocardiogram-report.png")); // NOI18N
        oldReportButton.setText("My Old Reports");
        oldReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldReportButtonActionPerformed(evt);
            }
        });

        donationButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        donationButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\heart.png")); // NOI18N
        donationButton.setText("Donation");
        donationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationButtonActionPerformed(evt);
            }
        });

        challangesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        challangesButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\paper.png")); // NOI18N
        challangesButton.setText("Challanges");

        friendsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        friendsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\friends.png")); // NOI18N
        friendsButton.setText("Friends");
        friendsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendsButtonActionPerformed(evt);
            }
        });

        recommendationsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        recommendationsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\recommendation.png")); // NOI18N
        recommendationsButton.setText("Recommendations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(homeLogOutButton)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(normalHomeLabel)
                        .addGap(604, 604, 604))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 720, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recommendationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(friendsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(challangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(519, 519, 519))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(homeLogOutButton)
                .addGap(32, 32, 32)
                .addComponent(normalHomeLabel)
                .addGap(50, 50, 50)
                .addComponent(newReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oldReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(challangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(friendsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recommendationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }

    private void homeLogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void newReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void friendsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void oldReportButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void donationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
    }



}
