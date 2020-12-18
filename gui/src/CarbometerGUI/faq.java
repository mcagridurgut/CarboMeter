package guifinal;

/**
 * @author Eren Özen, Onur Ertunç
 * @date 17.12.2020
 */
public class faq extends javax.swing.JPanel {

    /**
     * Creates new form faq
     */
    public faq() {
        initComponents();
    }


    
    private void initComponents() {

        faqLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(75, 139, 59));
        setPreferredSize(new java.awt.Dimension(1280, 700));

        faqLabel.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        faqLabel.setForeground(new java.awt.Color(255, 255, 255));
        faqLabel.setText("Frequently Asked Questions");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(75, 139, 59));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("*Are donations mandotary? \n- No. It is optional to donate any non-govermental environmental organizations.\n\n* Are super users able to see how much donation I made?\n- No, super users can only see the total donation amount of the users\n  who entered their reference code.\n\n* What different features does a super users have?\n- Super users are able to give challanges to users that entered their code");
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mainPanel.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(faqLabel)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(faqLabel)
                .addGap(44, 44, 44)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel faqLabel;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane mainPanel;
    // End of variables declaration//GEN-END:variables
}
