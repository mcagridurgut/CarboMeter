/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarbometerGUI;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Onur Ertunc
 * @version 17.12.2020
 */
public class FrameTest extends JFrame {
    
    private JPanel mainPanel;
    private GreetingPagePanel greetingPage;
    private SignUpPagePanel signUpPage;
    public CardLayout cl;
    
    public FrameTest() {
        
        // frame setup
        super( "Carbometer" );
        this.setSize( new Dimension( 1280, 720 ) );
        
        // Cardlayout 
        cl = new CardLayout();
        
        // mainPanel 
        mainPanel = new JPanel();
        mainPanel.setLayout( cl );
        
        // panels of Carbometer
        greetingPage = new GreetingPagePanel();
        signUpPage = new SignUpPagePanel();
        
        mainPanel.add( greetingPage, "greetingPage" );
        mainPanel.add( signUpPage, "signUpPage" );
        cl.show(mainPanel, "greetingPage" );
        //this.setUndecorated(true);
        this.add( mainPanel );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setResizable( false );
        this.pack();
        this.setVisible( true );
        
    }
    
    public static void main( String[] args ) {
        
        FrameTest frame = new FrameTest();
        
    }
}
