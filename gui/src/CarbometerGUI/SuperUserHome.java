package guifinal;

/**
 * @author Eren Özen, Onur Ertunç
 * @date 17.12.2020
 */
public class SuperUserHome extends javax.swing.JPanel {
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SuperHomeLabel;
    private javax.swing.JButton challengesButton;
    private javax.swing.JButton homeLogOut;
    private javax.swing.JButton newCodeButton;
    private javax.swing.JButton totalDonationsButton;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form SuperUserHome
     */
    public SuperUserHome() {
        initComponents();
    }



    private void initComponents() {

        SuperHomeLabel = new javax.swing.JLabel();
        homeLogOut = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        totalDonationsButton = new javax.swing.JButton();
        challengesButton = new javax.swing.JButton();
        newCodeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(75, 139, 59));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        SuperHomeLabel.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        SuperHomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        SuperHomeLabel.setText("Home");

        homeLogOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\door.png")); // NOI18N
        homeLogOut.setText("Log Out");
        homeLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeLogOutActionPerformed(evt);
            }
        });

        usersButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usersButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\group (1).png")); // NOI18N
        usersButton.setText("Users");
        usersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonActionPerformed(evt);
            }
        });

        totalDonationsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalDonationsButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\heart.png")); // NOI18N
        totalDonationsButton.setText("Total Donations");

        challengesButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        challengesButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\paper.png")); // NOI18N
        challengesButton.setText("Challanges");

        newCodeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newCodeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Downloads\\password.png")); // NOI18N
        newCodeButton.setText("Create New Code");
        newCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCodeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(579, 579, 579)
                .addComponent(SuperHomeLabel)
                .addContainerGap(550, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeLogOut)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(newCodeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(challengesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalDonationsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addGap(510, 510, 510))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(homeLogOut)
                .addGap(30, 30, 30)
                .addComponent(SuperHomeLabel)
                .addGap(90, 90, 90)
                .addComponent(usersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalDonationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(challengesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }

    private void homeLogOutActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void usersButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void newCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }



}
