package gui.View;
import javax.swing.*;

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

    }

    public void addMenu() {
        this.add(menu);
        repaint();
    }
    public void removeMenu() {
        this.remove(menu);
        repaint();
    }

}
