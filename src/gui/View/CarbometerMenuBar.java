package gui.View;
import javax.swing.*;

/**
 * extends the jmenubar for carbometer app menubar. Draws the menubar by swing components
 * @author Onur Ertunc, Eren Özen, Çağrı Durgut
 */
public class CarbometerMenuBar extends JMenuBar {

    public JMenu menu;
    public JMenu exitMenu;
    public JMenuItem home;
    public JMenuItem about;
    public JMenuItem faq;
    public JMenuItem account;
    public JMenuItem exit;

    public CarbometerMenuBar() {

        // JMenu on the JMenuBar
        menu = new JMenu( "Menu" );
        exitMenu = new JMenu( "Exit");

        // MenuItems
        home = new JMenuItem("Home");
        about = new JMenuItem("About");
        faq = new JMenuItem("FAQ");

        account = new JMenuItem("Account");

        exit = new JMenuItem("Exit");

        // adding JMenuItems on JMenu
        menu.add(home);
        menu.add(account);
        menu.add(about);
        menu.add(faq);


        exitMenu.add(exit);

        // adding JMenu menu to the JMenuBar
        this.add(exitMenu);

    } // end of the initComponents

    /**
     * for security and logic purposes, adds menu to the bar after an operation.
     */
    public void addMenu() {
        this.add(menu);
        repaint();
    }

    /**
     * for security and logic purposes, removes the menu from the bar
     */
    public void removeMenu() {
        this.remove(menu);
        repaint();
    }

}
