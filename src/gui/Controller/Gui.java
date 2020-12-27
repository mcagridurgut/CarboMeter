package gui.Controller;
import Model.Food;
import Model.Home;
import Model.Others;
import Model.Transportation;
import gui.View.*;
import mail.JavaMail;
import user.Login;
import user.NormalUser;
import user.SuperUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

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
    Double housingValue = 0.0;
    Double travelValue= 0.0;
    Double foodValue= 0.0;
    Double othersValue= 0.0;

    public Gui() {
        super("Carbometer");
        normalUser = new NormalUser("","","","");
        superUser = new SuperUser("","","","");
        this.setJMenuBar(menuBar);

        // menu item listeners
        menuBar.exit.addActionListener(handler);
        menuBar.home.addActionListener(handler);
        menuBar.about.addActionListener(handler);
        menuBar.faq.addActionListener(handler);
        menuBar.account.addActionListener(handler);

        buttonCreator();
        panelAdder();
        this.setContentPane(contentPanel);
        cardLayout.show(contentPanel,"loginPanel");
    }

    public class actionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            JButton src = (JButton) event.getSource();

            if(src.equals(accountPanel.changePasswordButton)){
                String input = JOptionPane.showInputDialog(null, "Please enter new Password");
                String input2 = JOptionPane.showInputDialog(null, "Please enter new Password again");
                if( input.equals(input2) ){
                    normalUser.changePassword(input);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Passwords should match." );
                }
            }
            if(src.equals(donationPanel.backPageButton)) cardLayout.show(contentPanel,"reportPanel");
            if(src.equals(houseQuestionPanel.goBackButton)) {
                if( transportation )
                    cardLayout.show(contentPanel,"transportationQuestion2Panel");
                else if ( food )
                    cardLayout.show(contentPanel,"foodQuestionPanel");
                else
                    cardLayout.show(contentPanel,"newReportPanel");
            }
            if(src.equals(houseQuestionPanel.nextButton)){
                try {
                    housingValue = 0.0;
                    housingValue += Double.parseDouble(houseQuestionPanel.electricityTextField.getText()) *Home.ELECTRICITY_FACTOR;
                    housingValue += Double.parseDouble(houseQuestionPanel.LPGTextField.getText()) *Home.LPG_FACTOR;
                    housingValue += Double.parseDouble(houseQuestionPanel.naturalGasTextField.getText()) *Home.NATURAL_GAS_FACTOR;
                    housingValue += Double.parseDouble(houseQuestionPanel.coalTextField.getText()) *Home.COAL_FACTOR;
                    housingValue += Double.parseDouble(houseQuestionPanel.heatingOilTextField.getText()) *Home.HEATING_OIL_FACTOR;
                    housingValue += Double.parseDouble(houseQuestionPanel.woodenPelletsTextField.getText()) *Home.WOODEN_PELLETS;
                    housingValue += Double.parseDouble(houseQuestionPanel.propaneTextField.getText()) *Home.PROPANE_FACTOR;
                    housingValue *= Home.MONTHS_IN_A_YEAR;
                    int numberOfPeople = Integer.parseInt(houseQuestionPanel.numOfPeople.getText());
                    if( numberOfPeople != 0)
                        housingValue /= numberOfPeople;
                    else
                        throw new Exception("division by zero");
                    if (others) {
                        cardLayout.show(contentPanel, "othersQuestionPanel");
                    }
                    else {
                        othersValue = Others.DEFAULT;
                        reportDone();
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Please enter valid inputs!" );
                }
            }

            if(src.equals(loginPanel.loginButton)){
                try{
                    normalUser = Login.NormalLogin(loginPanel.userNameField.getText(),loginPanel.passwordField.getText());
                    if( !normalUser.getUsername().equals("")){
                        cardLayout.show(contentPanel,"normalUserHomePanel");
                        loginPanel.userNameField.setText("");
                        loginPanel.passwordField.setText("");
                    }
                    menuBar.addMenu();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "There is no such user" );
                }
            }

            if(src.equals(loginPanel.signUpButton)) cardLayout.show(contentPanel,"signUpPanel");

            //if(src.equals(newReportPanel.nextPageButton)) cardLayout.show(contentPanel,"foodQuestionPanel");

            if(src.equals(newReportPanel.nextPageButton)) {
                food = newReportPanel.comboBoxFood.getItemAt(newReportPanel.comboBoxFood.getSelectedIndex()).equals("Personalize");
                home = newReportPanel.comboBoxFood.getItemAt(newReportPanel.homeComboBox.getSelectedIndex()).equals("Personalize");
                transportation = newReportPanel.comboBoxFood.getItemAt(newReportPanel.travelComboBox.getSelectedIndex()).equals("Personalize");
                others = newReportPanel.comboBoxFood.getItemAt(newReportPanel.stuffComboBox.getSelectedIndex()).equals("Personalize");
                if( food ){
                    cardLayout.show(contentPanel,"foodQuestionPanel");
                }
                else if( transportation ) {
                    cardLayout.show(contentPanel, "transportationQuestionPanel");
                    foodValue =  Food.DEFAULT;
                }
                else if( home ) {
                    cardLayout.show(contentPanel, "houseQuestionPanel");
                    foodValue = Food.DEFAULT;
                    travelValue = Transportation.DEFAULT;
                }else if ( others ) {
                    cardLayout.show(contentPanel, "othersQuestionPanel");
                    foodValue = Food.DEFAULT;
                    travelValue = Transportation.DEFAULT;
                    housingValue = Home.DEFAULT;
                }
                else {
                    JOptionPane.showMessageDialog(null, "You have to personalize at least one category!" );
                }
            }

            if(src.equals(foodQuestionPanel.nextButton)) {
                try {
                    foodValue += Double.parseDouble(foodQuestionPanel.jTextField1.getText()) * Food.BEEF_LAMB_VEAL;
                    foodValue += Double.parseDouble(foodQuestionPanel.jTextField3.getText()) * Food.OTHER_MEAT;
                    foodValue += Double.parseDouble(foodQuestionPanel.jTextField4.getText()) * Food.DAIRY;
                    foodValue += Double.parseDouble(foodQuestionPanel.jTextField5.getText()) * Food.GRAINS;
                    foodValue += Double.parseDouble(foodQuestionPanel.jTextField2.getText()) * Food.FISH_SEAFOOD;
                    foodValue += Double.parseDouble(foodQuestionPanel.jTextField6.getText()) * Food.FRUITS;
                    foodValue += Double.parseDouble(foodQuestionPanel.jTextField7.getText()) * Food.SNACKS;
                    foodValue += Double.parseDouble(foodQuestionPanel.jTextField8.getText()) * Food.POULTRY_EGGS;
                    foodValue *= Food.DAYS_IN_A_YEAR;
                    if (transportation)
                        cardLayout.show(contentPanel, "transportationQuestionPanel");
                    else if (home){
                        travelValue = Transportation.DEFAULT;
                        cardLayout.show(contentPanel, "houseQuestionPanel");
                    }
                    else if (others) {
                        travelValue = Transportation.DEFAULT;
                        housingValue = Home.DEFAULT;
                        cardLayout.show(contentPanel, "othersQuestionPanel");
                    }
                    else {
                        travelValue = Transportation.DEFAULT;
                        housingValue = Home.DEFAULT;
                        othersValue = Others.DEFAULT;
                        reportDone();
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Please enter valid inputs!" );
                }
            }

            if(src.equals(foodQuestionPanel.goBackButton) ) {
                cardLayout.show(contentPanel,"newReportPanel");
            }

            if(src.equals(normalUserHomePanel.newReportButton)){
                cardLayout.show(contentPanel,"newReportPanel");
                newReportPanel.setBar(0);
            }
            if(src.equals(loginPanel.forgotPasswordLabel)){
                String str = JOptionPane.showInputDialog(null, "Lütfen kullanıcı adınızı veya e postanızı giriniz");
                Login.forgotMyPassword(str);
            }
            if(src.equals(normalUserHomePanel.oldReportButton)) cardLayout.show(contentPanel,"oldReportsPanel");
            if(src.equals(normalUserHomePanel.challengesButton)) cardLayout.show(contentPanel,"normalChallengesPanel");
            if(src.equals(normalUserHomePanel.donationButton)) cardLayout.show(contentPanel,"donationPanel");

            if(src.equals(normalUserHomePanel.friendsButton)) {
                ArrayList<String> arrayList = new ArrayList<>();
                for(int i = 0; i<normalUser.getFriends().size(); i++) {
                    arrayList.add(normalUser.getFriends().get(i).getUser());
                }
                friendsPanel.function(arrayList);
                friendsPanel.setMeBar((int)normalUser.getCurrentReport().getScore());
                cardLayout.show(contentPanel,"friendsPanel");
            }
            if(src.equals(normalUserHomePanel.recommendationsButton)) cardLayout.show(contentPanel,"recommendationsPanel");

            if(src.equals(othersQuestionPanel.goBackButton)){
                if( home ) {
                    housingValue = 0.0;
                    cardLayout.show(contentPanel, "houseQuestionPanel");
                }
                else if( transportation ) {
                    travelValue = 0.0;
                    cardLayout.show(contentPanel, "transportationQuestion2Panel");
                }
                else if( food ) {
                    cardLayout.show(contentPanel, "foodQuestionPanel");
                    foodValue = 0.0;
                }
                else
                    cardLayout.show(contentPanel,"newReportPanel");

            }
            if(src.equals(othersQuestionPanel.showTheReportButton)) {
                try{
                    othersValue += Double.parseDouble(othersQuestionPanel.furnitureSpendingTextField.getText())*Others.FURNITURE_OTHER;
                    othersValue += Double.parseDouble(othersQuestionPanel.vehicleSpendingTextField.getText())*Others.MOTOR_VEHICLES;
                    othersValue += Double.parseDouble(othersQuestionPanel.educationSpendingTextField.getText())*Others.EDUCATION;
                    othersValue += Double.parseDouble(othersQuestionPanel.culturalSpendingTextField.getText())*Others.ACTIVITIES;
                    othersValue += Double.parseDouble(othersQuestionPanel.hotelRest_pubSpendingTextField.getText())*Others.HOTELS_RESTAURANTS_PUBS;
                    othersValue += Double.parseDouble(othersQuestionPanel.phoneMobileCallSpendingTextField.getText())*Others.CALL_COST;
                    othersValue += Double.parseDouble(othersQuestionPanel.tvRadioPhoneEquipmentSpending.getText())*Others.TV_RADIO_PHONE;
                    othersValue += Double.parseDouble(othersQuestionPanel.pcAndITequipmentTextField.getText())*Others.COMPUTER_IT;
                    othersValue += Double.parseDouble(othersQuestionPanel.bankingAndFinanceTextField.getText())*Others.BANKING_FINANCE;
                    othersValue += Double.parseDouble(othersQuestionPanel.paperBasedProductsTextField.getText())*Others.BOOKS_MAGAZINES_ETC;
                    othersValue += Double.parseDouble(othersQuestionPanel.insuranceTextField.getText())*Others.INSURANCE;
                    othersValue += Double.parseDouble(othersQuestionPanel.clothesTextilesShoesTextField.getText())*Others.CLOTHES_TEXTILES_SHOES;
                    othersValue += Double.parseDouble(othersQuestionPanel.pharmaceuticalsTextField.getText())*Others.PHARMACEUTICALS;
                    reportDone();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Please enter valid inputs!" );
                }
            }

            if(src.equals(reportPanel.backPageButton)){
                cardLayout.show(contentPanel, "normalUserHomePanel");
            }
            if(src.equals(reportPanel.nextPageButton)) cardLayout.show(contentPanel,"donationPanel");
            if(src.equals(signUpPanel.loginButton)) cardLayout.show(contentPanel,"loginPanel");

            if(src.equals(signUpPanel.signUpButton)){
                if ( !signUpPanel.passwordField.getText().equals(signUpPanel.confirmPasswordField.getText()) )
                {
                    JOptionPane.showMessageDialog(null, "Passwords did not match!" );
                }
                else{
                    try{
                        normalUser = Login.register(signUpPanel.userNameField.getText(),signUpPanel.emailField.getText(),signUpPanel.passwordField.getText(),signUpPanel.superUserCodeField.getText());
                        String str = randomCodeGenerator();
                        String input = JOptionPane.showInputDialog(this, "13 haneli güvenlik kodunuzu giriniz");
                        try{
                            JavaMail.sendMail(normalUser.getEmail(), "CarboMeter E-Mail Verification", "Your code is: "+str);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        while( !str.equals(input) )
                            input = JOptionPane.showInputDialog("13 haneli güvenlik kodunuzu giriniz", "enter here");

                        cardLayout.show(contentPanel,"normalUserHomePanel");
                        signUpPanel.superUserCodeField.setText("");
                        signUpPanel.emailField.setText("");
                        signUpPanel.passwordField.setText("");
                        signUpPanel.confirmPasswordField.setText("");
                        signUpPanel.userNameField.setText("");
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "This username was taken before" );
                    }
                }
            }

            if(src.equals(accountPanel.logOutButton)){
                logout();
            }

            if(src.equals(normalUserHomePanel.logOutButton)){
                logout();
            }


            if(src.equals(superUserHomePanel.logOutButton)){
                logout();
            }

            if(src.equals(superUserHomePanel.challengesButton)) cardLayout.show(contentPanel,"superChallengesPanel");
            if(src.equals(transportationQuestion2Panel.goBackButton)) cardLayout.show(contentPanel,"transportationQuestionPanel");

            if(src.equals(transportationQuestion2Panel.nextButton)){
                if( home ) {
                    cardLayout.show(contentPanel,"houseQuestionPanel");
                }else if ( others ) {
                    housingValue = Home.DEFAULT;
                    cardLayout.show(contentPanel, "othersQuestionPanel");
                }else {
                    housingValue = Home.DEFAULT;
                    othersValue = Others.DEFAULT;
                    cardLayout.show(contentPanel, "reportPanel");
                }
            }

            if(src.equals(transportationQuestionPanel.goBackButton)){
                if( food ) {
                    cardLayout.show(contentPanel, "foodQuestionPanel");
                    foodValue = 0.0;
                }else
                    cardLayout.show(contentPanel,"newReportPanel");
            }

            if(src.equals(transportationQuestionPanel.nextButton)) {
                cardLayout.show(contentPanel,"transportationQuestion2Panel");
            }
        }
    }

    private void buttonCreator() {
        actionListener al = new actionListener();
        MyKeyListener keyListener = new MyKeyListener();
        friendsPanel.addFrinedField.addKeyListener(keyListener);
        friendsPanel.frinedsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = friendsPanel.frinedsTable.rowAtPoint(evt.getPoint());
                if (row >= 0) {
                    friendsPanel.setFriendBar(normalUser.getFriends().get(row).getUser(),
                            (int) (normalUser.getFriends().get(row).getScore()) );
                }
            }
        });
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
        //reportPanel.backPageButton.addActionListener(al);
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
        loginPanel.forgotPasswordLabel.addActionListener(al);

    }

    public class MyKeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                if( normalUser.addFriend(friendsPanel.addFrinedField.getText() ) )
                    friendsPanel.addFriend( friendsPanel.addFrinedField.getText() );
                else{
                    //POP UP NO SUCH USER
                }
            }
        }
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

    /*
     * creates random codes for email verification
     * @return random code
     */
    private String randomCodeGenerator(){
        String str = "";
        String randoms = "wertyuıopasdfghjklizxcvbnm1234567890";
        for(int i = 0; i<13; i++){
            int rndm = (int) (Math.random()*randoms.length());
            char random = randoms.charAt(rndm);
            str += random;
        }
        return str;
    }

    /**
     * implements act
     */
    private class TheHandler implements ActionListener {

        /**
         *
         * @param event
         */
        public void actionPerformed(ActionEvent event) {
            if( event.getSource()== menuBar.exit) System.exit(0);
            if( event.getSource()== menuBar.about ) cardLayout.show(contentPanel,"aboutUsPanel");
            if( event.getSource()== menuBar.home ) cardLayout.show(contentPanel,"normalUserHomePanel");
            if( event.getSource()== menuBar.faq ) cardLayout.show(contentPanel,"faqPanel");
            if( event.getSource()== menuBar.account ) {
                cardLayout.show(contentPanel,"accountPanel");
                accountPanel.usernameField.setText(normalUser.getUsername());
                accountPanel.donationsField.setText(normalUser.getDonations()+"");
            }
        }
    }
    private void logout(){
        cardLayout.show(contentPanel,"loginPanel");
        menuBar.removeMenu();
    }
    private void reportDone(){
        normalUser.createReport(housingValue, travelValue , foodValue, othersValue, home, transportation, food, others);
        reportPanel.function(normalUser.getCurrentReport().getFoodScore(),normalUser.getCurrentReport().getTransportScore(),normalUser.getCurrentReport().getHomeScore(),normalUser.getCurrentReport().getOthersScore(),
                normalUser.getPreviousReport().getFoodScore(),normalUser.getPreviousReport().getTransportScore(),normalUser.getPreviousReport().getHomeScore(),normalUser.getPreviousReport().getOthersScore());
        System.out.println(normalUser.getPreviousReport().getScore()+ " " + normalUser.getPreviousReport().getUser());
        System.out.println(normalUser.getCurrentReport().getScore()+ " " + normalUser.getCurrentReport().getUser());
        cardLayout.show(contentPanel, "reportPanel");
    }
}
