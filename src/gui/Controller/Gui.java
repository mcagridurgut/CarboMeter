package gui.Controller;
import gui.View.*;
import mail.JavaMail;
import user.Login;
import user.NormalUser;
import user.SuperUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Eren Özen, Onur Ertunç
 */

public class Gui extends JFrame{
    private JPanel contentPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();
    private CarbometerMenuBar menuBar = new CarbometerMenuBar();
    private TheHandler handler = new TheHandler();

    private AccountPanel accountPanel = new AccountPanel();
    private AboutUsPanel aboutUsPanel = new AboutUsPanel();
    private DonationPanel donationPanel = new DonationPanel();
    private FQPanel faqPanel = new FQPanel();
    private FriendsPanel friendsPanel = new FriendsPanel();
    private HouseQuestionPanel houseQuestionPanel = new HouseQuestionPanel();
    private FoodQuestionPanel foodQuestionPanel = new FoodQuestionPanel();
    private LoginPanel loginPanel = new LoginPanel();
    private NewReportPanel newReportPanel = new NewReportPanel();
    private NormalChallengesPanel normalChallengesPanel = new NormalChallengesPanel();
    private NormalUserHomePanel normalUserHomePanel = new NormalUserHomePanel();
    private OldReportsPanel oldReportsPanel = new OldReportsPanel();
    private OthersQuestionPanel othersQuestionPanel = new OthersQuestionPanel();
    private RecommendationsPanel recommendationsPanel = new RecommendationsPanel();
    private ReportPanel reportPanel = new ReportPanel();
    private SignUpPanel signUpPanel = new SignUpPanel();
    private SuperChallengesPanel superChallengesPanel = new SuperChallengesPanel();
    private SuperUserHomePanel0 superUserHomePanel = new SuperUserHomePanel0();
    private TransportationQuestionPanel transportationQuestionPanel = new TransportationQuestionPanel();
    private TransportationQuestion2Panel transportationQuestion2Panel = new TransportationQuestion2Panel();
    private UsersPanel usersPanel = new UsersPanel();
    Boolean food, home, transportation, others;
    NormalUser normalUser;
    SuperUser superUser;

    public Gui() {
        super("Carbometer");
        normalUser = new NormalUser("","","","");
        superUser = new SuperUser("","","","");
        this.setJMenuBar(menuBar);

        menuBar.exit.addActionListener(handler);

        buttonCreator();
        panelAdder();
        this.setContentPane(contentPanel);
        cardLayout.show(contentPanel,"loginPanel");
    }

    public class actionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            JButton src = (JButton) event.getSource();

            //if(src.equals(accountPanel.changePasswordButton)) cardLayout.show(contentPanel,"aboutUsPanel");
            if(src.equals(donationPanel.backPageButton)) cardLayout.show(contentPanel,"reportPanel");
            if(src.equals(houseQuestionPanel.goBackButton)) {
                if( transportation )
                    cardLayout.show(contentPanel,"transportationQuestion2Panel");
                else if ( food )
                    cardLayout.show(contentPanel,"foodQuestionPanel");
                else
                    cardLayout.show(contentPanel,"reportPanel");
            }
            if(src.equals(houseQuestionPanel.nextButton)){
                if( others )
                    cardLayout.show(contentPanel,"othersQuestionPanel");
                else
                    cardLayout.show(contentPanel,"reportPanel");
            }

            if(src.equals(loginPanel.loginButton)){
                try{
                    normalUser = Login.NormalLogin(loginPanel.userNameField.getText(),loginPanel.passwordField.getText());
                    if( !normalUser.getUsername().equals(""))
                        cardLayout.show(contentPanel,"normalUserHomePanel");
                    menuBar.addMenu();
                }catch (Exception e){
                    //NO SUCH USER
                    System.out.println("no such user");
                }
            }

            if(src.equals(loginPanel.signUpButton)) cardLayout.show(contentPanel,"signUpPanel");

            //if(src.equals(newReportPanel.nextPageButton)) cardLayout.show(contentPanel,"foodQuestionPanel");

            if(src.equals(newReportPanel.nextPageButton)) {
                food = newReportPanel.comboBoxFood.getItemAt(newReportPanel.comboBoxFood.getSelectedIndex()).equals("Personalize");
                home = newReportPanel.comboBoxFood.getItemAt(newReportPanel.homeComboBox.getSelectedIndex()).equals("Personalize");
                transportation = newReportPanel.comboBoxFood.getItemAt(newReportPanel.travelComboBox.getSelectedIndex()).equals("Personalize");
                others = newReportPanel.comboBoxFood.getItemAt(newReportPanel.stuffComboBox.getSelectedIndex()).equals("Personalize");
                if( food )
                    cardLayout.show(contentPanel,"foodQuestionPanel");
                else if( transportation )
                    cardLayout.show(contentPanel,"transportationQuestionPanel");
                else if( home )
                    cardLayout.show(contentPanel,"houseQuestionPanel");
                else if ( others )
                    cardLayout.show(contentPanel,"othersQuestionPanel");
                else
                    cardLayout.show(contentPanel,"reportPanel");
            }

            if(src.equals(foodQuestionPanel.nextButton)) {
                if( transportation )
                    cardLayout.show(contentPanel,"transportationQuestionPanel");
                else if( home )
                    cardLayout.show(contentPanel,"houseQuestionPanel");
                else if ( others )
                    cardLayout.show(contentPanel,"othersQuestionPanel");
                else
                    cardLayout.show(contentPanel,"reportPanel");
            }

            if(src.equals(foodQuestionPanel.goBackButton) ) {
                cardLayout.show(contentPanel,"newReportPanel");
            }

            if(src.equals(normalUserHomePanel.newReportButton)){
                cardLayout.show(contentPanel,"newReportPanel");
            }

            if(src.equals(normalUserHomePanel.oldReportButton)) cardLayout.show(contentPanel,"oldReportsPanel");
            if(src.equals(normalUserHomePanel.challengesButton)) cardLayout.show(contentPanel,"normalChallengesPanel");
            if(src.equals(normalUserHomePanel.donationButton)) cardLayout.show(contentPanel,"donationPanel");
            if(src.equals(normalUserHomePanel.friendsButton)) cardLayout.show(contentPanel,"friendsPanel");
            if(src.equals(normalUserHomePanel.recommendationsButton)) cardLayout.show(contentPanel,"recommendationsPanel");

            if(src.equals(othersQuestionPanel.goBackButton)){
                if( home )
                    cardLayout.show(contentPanel,"houseQuestionPanel");
                else if( transportation )
                    cardLayout.show(contentPanel,"transportationQuestion2Panel");
                else if( food )
                    cardLayout.show(contentPanel,"foodQuestionPanel");
                else
                    cardLayout.show(contentPanel,"reportPanel");

            }
            if(src.equals(othersQuestionPanel.showTheReportButton)) cardLayout.show(contentPanel,"reportPanel");

            if(src.equals(reportPanel.backPageButton)){
                if( others )
                    cardLayout.show(contentPanel,"othersQuestionPanel");
                else if ( home )
                    cardLayout.show(contentPanel,"houseQuestionPanel");
                else if ( transportation )
                    cardLayout.show(contentPanel,"transportationQuestion2Panel");
                else if ( food )
                    cardLayout.show(contentPanel,"foodQuestionPanel");
                else
                    cardLayout.show(contentPanel, "newReportPanel");
            }
            if(src.equals(reportPanel.nextPageButton)) cardLayout.show(contentPanel,"donationPanel");
            if(src.equals(signUpPanel.loginButton)) cardLayout.show(contentPanel,"loginPanel");

            if(src.equals(signUpPanel.signUpButton)){
                if ( !signUpPanel.passwordField.getText().equals(signUpPanel.confirmPasswordField.getText()) )
                {
                    // POP UP PASSWORDS DOESNT MATCH
                    System.out.println("passwords doesnt match");
                }
                else{
                    try{
                        normalUser = Login.register(signUpPanel.userNameField.getText(),signUpPanel.emailField.getText(),signUpPanel.passwordField.getText(),signUpPanel.superUserCodeField.getText());
                        String str = randomCodeGenerator();

                        try{
                            JavaMail.sendMail(normalUser.getEmail(), "CarboMeter E-Mail Verification", "Your code is: "+str);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        cardLayout.show(contentPanel,"normalUserHomePanel");
                    }catch(Exception e){
                        // POP UP USER ALREADY EXİSTS
                        System.out.println("already exists");
                    }
                }
            }

            if(src.equals(normalUserHomePanel.logOutButton)){
                loginPanel.userNameField.setText("");
                loginPanel.passwordField.setText("");
                cardLayout.show(contentPanel,"loginPanel");
            }


            if(src.equals(superUserHomePanel.logOutButton)){
                cardLayout.show(contentPanel,"loginPanel");
            }

            if(src.equals(superUserHomePanel.challengesButton)) cardLayout.show(contentPanel,"superChallengesPanel");
            if(src.equals(transportationQuestion2Panel.goBackButton)) cardLayout.show(contentPanel,"transportationQuestionPanel");

            if(src.equals(transportationQuestion2Panel.nextButton)){
                if( home )
                    cardLayout.show(contentPanel,"houseQuestionPanel");
                else if ( others )
                    cardLayout.show(contentPanel,"othersQuestionPanel");
                else
                    cardLayout.show(contentPanel,"reportPanel");

            }

            if(src.equals(transportationQuestionPanel.goBackButton)){
                if( food )
                    cardLayout.show(contentPanel,"foodQuestionPanel");
                else
                    cardLayout.show(contentPanel,"newReportPanel");
            }

            if(src.equals(transportationQuestionPanel.nextButton)) cardLayout.show(contentPanel,"transportationQuestion2Panel");
        }
    }

    private void buttonCreator() {
        actionListener al = new actionListener();

        accountPanel.changePasswordButton.addActionListener(al);
        accountPanel.logOutButton.addActionListener(al);
        donationPanel.backPageButton.addActionListener(al);
        donationPanel.eggButton.addActionListener(al);
        houseQuestionPanel.goBackButton.addActionListener(al);
        houseQuestionPanel.nextButton.addActionListener(al);
        loginPanel.loginButton.addActionListener(al);
        loginPanel.signUpButton.addActionListener(al);
        newReportPanel.nextPageButton.addActionListener(al);
        normalUserHomePanel.challengesButton.addActionListener(al);
        normalUserHomePanel.logOutButton.addActionListener(al);
        normalUserHomePanel.donationButton.addActionListener(al);
        normalUserHomePanel.friendsButton.addActionListener(al);
        normalUserHomePanel.newReportButton.addActionListener(al);
        normalUserHomePanel.oldReportButton.addActionListener(al);
        normalUserHomePanel.recommendationsButton.addActionListener(al);
        othersQuestionPanel.goBackButton.addActionListener(al);
        othersQuestionPanel.showTheReportButton.addActionListener(al);
        recommendationsPanel.foodRecommendationButton.addActionListener(al);
        recommendationsPanel.houseRecommendationButton.addActionListener(al);
        recommendationsPanel.othersRecommendationButton.addActionListener(al);
        recommendationsPanel.transportationlRecommendationButton.addActionListener(al);
        reportPanel.backPageButton.addActionListener(al);
        reportPanel.nextPageButton.addActionListener(al);
        signUpPanel.signUpButton.addActionListener(al);
        signUpPanel.loginButton.addActionListener(al);
        superChallengesPanel.addChallengeButton1.addActionListener(al);
        superChallengesPanel.removeChallengeButton.addActionListener(al);
        superUserHomePanel.challengesButton.addActionListener(al);
        superUserHomePanel.logOutButton.addActionListener(al);
        superUserHomePanel.usersButton.addActionListener(al);
        superUserHomePanel.totalDonationsButton.addActionListener(al);
        superUserHomePanel.newCodeButton.addActionListener(al);
        transportationQuestion2Panel.goBackButton.addActionListener(al);
        transportationQuestion2Panel.nextButton.addActionListener(al);
        transportationQuestionPanel.goBackButton.addActionListener(al);
        transportationQuestionPanel.nextButton.addActionListener(al);
        usersPanel.kickUserButton.addActionListener(al);
        foodQuestionPanel.goBackButton.addActionListener(al);
        foodQuestionPanel.nextButton.addActionListener(al);

        // menubar listener
        //menuBar.exit.addActionListener(al);
    }

    private void panelAdder(){
        contentPanel.setLayout(cardLayout);
        contentPanel.add(aboutUsPanel,"aboutUsPanel");
        contentPanel.add(accountPanel, "accountPanel");
        contentPanel.add(donationPanel,"donationPanel");
        contentPanel.add(faqPanel, "faqPanel");
        contentPanel.add(friendsPanel,"friendsPanel");
        contentPanel.add(houseQuestionPanel, "houseQuestionPanel");
        contentPanel.add(loginPanel,"loginPanel");
        contentPanel.add(newReportPanel, "newReportPanel");
        contentPanel.add(normalChallengesPanel,"normalChallengesPanel");
        contentPanel.add(normalUserHomePanel, "normalUserHomePanel");
        contentPanel.add(oldReportsPanel,"oldReportsPanel");
        contentPanel.add(othersQuestionPanel, "othersQuestionPanel");
        contentPanel.add(recommendationsPanel,"recommendationsPanel");
        contentPanel.add(reportPanel, "reportPanel");
        contentPanel.add(signUpPanel,"signUpPanel");
        contentPanel.add(superChallengesPanel, "superChallengesPanel");
        contentPanel.add(superUserHomePanel,"superUserHomePanel");
        contentPanel.add(transportationQuestionPanel, "transportationQuestionPanel");
        contentPanel.add(transportationQuestion2Panel,"transportationQuestion2Panel");
        contentPanel.add(usersPanel, "usersPanel");
        contentPanel.add(foodQuestionPanel,"foodQuestionPanel");

    }
    private String randomCodeGenerator(){
        String str = "";
        String randoms = "wertyuıopğüasdfghjklşizxcvbnmöç.,-*1234567890";
        for(int i = 0; i<13; i++){
            int rndm = (int) (Math.random()*randoms.length());
            char random = randoms.charAt(rndm);
            str += random;
        }
        return str;
    }

    private class TheHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if( event.getSource()== menuBar.exit) System.exit(0);
        }
    }
}
