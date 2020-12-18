package guifinal;

/**
 * @author Eren Özen, Onur Ertunç
 * @date 17.12.2020
 */
public class frame extends javax.swing.JFrame {
    
    // Variables declaration 
    private javax.swing.JMenu About;
    private javax.swing.JMenu Account;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Home;
    private javax.swing.JLabel bgImage;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration
    
    /**
     * Creates new form frame
     */
    public frame() {
        initComponents();
    }

    private void initComponents() {

        bgImage = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Home = new javax.swing.JMenu();
        Account = new javax.swing.JMenu();
        About = new javax.swing.JMenu();
        Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\ereno\\Desktop\\CarbometerGUIFINAL\\GUIFinal\\src\\PhotosAndIcons\\final.jpg")); // NOI18N

        Home.setText("Home");
        menuBar.add(Home);

        Account.setText("Account");
        menuBar.add(Account);

        About.setText("About");
        menuBar.add(About);

        Help.setText("Help");
        menuBar.add(Help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgImage)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgImage)
        );

        pack();
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }


}
