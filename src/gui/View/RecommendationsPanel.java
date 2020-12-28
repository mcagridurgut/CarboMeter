package gui.View;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Recommendations panel of the Carbometer desktop application. Draws the panel by swing components.
 * @author Eren Özen, Onur Ertunç
 */

public class RecommendationsPanel extends JPanel {

    // Properties of the others question panel
    private JLabel background;
    public JButton foodRecommendationButton;
    public JButton houseRecommendationButton;
    private JScrollPane jScrollPane1;
    public JButton othersRecommendationButton;
    private JLabel recommendationsLabel;
    private JTextArea recommendationsTextArea;
    public JButton transportationlRecommendationButton;

    /**
     * constructor of the class
     */
    public RecommendationsPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        recommendationsLabel = new JLabel();
        foodRecommendationButton = new JButton();
        transportationlRecommendationButton = new JButton();
        houseRecommendationButton = new JButton();
        othersRecommendationButton = new JButton();
        jScrollPane1 = new JScrollPane();
        recommendationsTextArea = new JTextArea();
        background = new JLabel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // recommendations label alignment (font, foreground, text and position)
        recommendationsLabel.setFont(new Font("Calibri", 1, 48));
        recommendationsLabel.setForeground(new Color(255, 255, 255));
        recommendationsLabel.setText("RECOMMENDATIONS");
        add(recommendationsLabel);
        recommendationsLabel.setBounds(425, 80, 429, 60);

        // food recommendations button alignment (font, icon, text and position)
        foodRecommendationButton.setFont(new Font("Arial", 0, 18));
        foodRecommendationButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/diet (1).png")));
        foodRecommendationButton.setText("Food");
        add(foodRecommendationButton);
        foodRecommendationButton.setBounds(200, 150, 210, 80);

        // transportation recommendations button alignment (font, icon, text and position)
        transportationlRecommendationButton.setFont(new Font("Arial", 0, 18));
        transportationlRecommendationButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/globe (1).png")));
        transportationlRecommendationButton.setText("Transportation");
        add(transportationlRecommendationButton);
        transportationlRecommendationButton.setBounds(200, 260, 210, 80);

        // house recommendations button alignment (font, icon, text and position)
        houseRecommendationButton.setFont(new Font("Arial", 0, 18));
        houseRecommendationButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/home (2).png")));
        houseRecommendationButton.setText("House");
        houseRecommendationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                houseRecommendationButtonActionPerformed(evt);
            }
        });
        add(houseRecommendationButton);
        houseRecommendationButton.setBounds(200, 370, 210, 80);

        // others recommendations button alignment (font, icon, text and position)
        othersRecommendationButton.setFont(new Font("Arial", 0, 18));
        othersRecommendationButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/application (1).png")));
        othersRecommendationButton.setText("Others");
        add(othersRecommendationButton);
        othersRecommendationButton.setBounds(200, 480, 210, 80);

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        // recommendations text area alignment (background, columns, font, foreground, rows, border and position)
        recommendationsTextArea.setBackground(new Color(88, 78, 69));
        recommendationsTextArea.setColumns(20);
        recommendationsTextArea.setFont(new Font("Arial", 1, 12));
        recommendationsTextArea.setForeground(new Color(255, 255, 255));
        recommendationsTextArea.setRows(5);
        recommendationsTextArea.setBorder(null);
        jScrollPane1.setViewportView(recommendationsTextArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(570, 150, 540, 410);

        // background alignment (font, icon and positioning)
        background.setFont(new Font("Calibri", 0, 11));
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);
    }

    /**
     * house recommendation button action performed method. check the gui class.
     * @param evt action event
     */
    private void houseRecommendationButtonActionPerformed(ActionEvent evt) {
    }



}
