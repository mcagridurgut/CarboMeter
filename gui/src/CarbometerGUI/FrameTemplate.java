package CarbometerGUI;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * 
 * @author Onur Ertunc 
 * @version 17.12.2020
 */
public class FrameTemplate extends javax.swing.JFrame {

    // Instances
    private javax.swing.JMenu AboutInMenuBar;
    private javax.swing.JMenu AccountInMenuBar;
    private javax.swing.JMenu HelpInMenuBar;
    private javax.swing.JMenu HomeInMenuBar;
    private javax.swing.JMenuBar MenuBar;
    private java.awt.Label label1;
    private JPanel mainPanel;
    private GreetingPagePanel greetingPage;
    private CardLayout cl;
    
    /**
     * Creates new form FrameTemplate
     */
    public FrameTemplate() {
        
        // Cardlayout 
        cl = new CardLayout();
        
        // mainPanel 
        mainPanel = new JPanel();
        mainPanel.setLayout( cl );
        
        // panels of Carbometer
        greetingPage = new GreetingPagePanel();
        
        mainPanel.add( greetingPage, "greetingPage" );
        cl.show(mainPanel, "greetingPage" );
        this.add( mainPanel );
        initComponents();      
        
        
        
        
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        label1 = new java.awt.Label();
        MenuBar = new javax.swing.JMenuBar();
        HomeInMenuBar = new javax.swing.JMenu();
        AboutInMenuBar = new javax.swing.JMenu();
        AccountInMenuBar = new javax.swing.JMenu();
        HelpInMenuBar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carbometer");
        setBackground(new java.awt.Color(75, 139, 59));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        label1.setText("label1");

        MenuBar.setAlignmentX(0.0F);
        MenuBar.setAlignmentY(0.0F);
        MenuBar.setPreferredSize(new java.awt.Dimension(39, 20));

        HomeInMenuBar.setText("Home");
        MenuBar.add(HomeInMenuBar);

        AboutInMenuBar.setText("About");
        MenuBar.add(AboutInMenuBar);

        AccountInMenuBar.setText("Account");
        MenuBar.add(AccountInMenuBar);

        HelpInMenuBar.setText("Help");
        MenuBar.add(HelpInMenuBar);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTemplate().setVisible(true);
            }
        });
    }
}
