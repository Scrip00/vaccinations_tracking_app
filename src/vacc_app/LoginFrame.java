package vacc_app;

import java.util.List;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * The LoginFrame class provides login GUI for user. It can be used to register 
 * new account, sign in with login password, recover forgotten password and so on
 */
public class LoginFrame extends javax.swing.JFrame {
    private String answer; //this variable is used to store the correct answer during the recovery process
    private int line; //this variable is used to store the data line number to recover during the recovery process
    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
    initComponents();
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img_source/Logo_64.png")));
    File file = new File(System.getProperty("user.dir") + "/src/Data/Remembered_login.txt");
    String login, password;
    /*
     * The following operation is used to autocomplete the remembered password
     */
    if (file.exists() == true) {
        try {
            Scanner scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/Remembered_login.txt"));
            login = scanner.nextLine();
            password = login.split("//&@")[1];
            login = login.split("//&@")[0];
            loginField.setText(login);
            passwordField.setText(password);
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainGradientPanel = new keeptoo.KGradientPanel();
        panelNameLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginIco = new javax.swing.JLabel();
        resetPasswordBtn = new javax.swing.JLabel();
        keyIco = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginField = new javax.swing.JFormattedTextField();
        enterPasswordBtn = new javax.swing.JLabel();
        rememberMeCheck = new javax.swing.JCheckBox();
        registerPanel = new javax.swing.JPanel();
        enterAccountBtn = new javax.swing.JLabel();
        answerField = new javax.swing.JFormattedTextField();
        newLoginField = new javax.swing.JFormattedTextField();
        answerLabel = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        repeatNewPasswordField = new javax.swing.JPasswordField();
        questionField = new javax.swing.JFormattedTextField();
        loginLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        repeatPasswordField = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        forgotPasswordPanel = new javax.swing.JPanel();
        chooseAccountBox = new javax.swing.JComboBox<>();
        chooseAccountLabel = new javax.swing.JLabel();
        resetAnswerField = new javax.swing.JFormattedTextField();
        resetQuestionLabel = new javax.swing.JLabel();
        enterAnswerBtn = new javax.swing.JLabel();
        writeAnswerLabel = new javax.swing.JLabel();
        resetPasswordPanel = new javax.swing.JPanel();
        typeNewPasswordLabel = new javax.swing.JLabel();
        typeNewPasswordField = new javax.swing.JFormattedTextField();
        enterNewPasswordBtn = new javax.swing.JLabel();
        typeNewPasswordAgainLabel = new javax.swing.JLabel();
        TypeNewPasswordAgainField = new javax.swing.JFormattedTextField();
        loginBtn = new javax.swing.JLabel();
        registerBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Adobe Devanagari", 0, 10)); // NOI18N
        setIconImages(null);
        setResizable(false);

        mainGradientPanel.setkEndColor(new java.awt.Color(255, 191, 0));
        mainGradientPanel.setkStartColor(new java.awt.Color(252, 102, 0));
        mainGradientPanel.setkTransparentControls(false);
        mainGradientPanel.setLayout(null);

        panelNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        panelNameLabel.setForeground(new java.awt.Color(143, 61, 6));
        panelNameLabel.setText("Login form");
        mainGradientPanel.add(panelNameLabel);
        panelNameLabel.setBounds(10, 0, 260, 40);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.CardLayout());

        loginPanel.setOpaque(false);
        loginPanel.setLayout(null);

        loginIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/Login_32.png"))); // NOI18N
        loginPanel.add(loginIco);
        loginIco.setBounds(110, 60, 30, 30);

        resetPasswordBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        resetPasswordBtn.setForeground(new java.awt.Color(143, 61, 6));
        resetPasswordBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetPasswordBtn.setText("Do not remember your password?");
        resetPasswordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetPasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetPasswordBtnMouseClicked(evt);
            }
        });
        loginPanel.add(resetPasswordBtn);
        resetPasswordBtn.setBounds(140, 230, 180, 15);

        keyIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/Password_32.png"))); // NOI18N
        loginPanel.add(keyIco);
        keyIco.setBounds(110, 120, 32, 30);

        passwordField.setBackground(new java.awt.Color(255, 191, 0));
        passwordField.setToolTipText("Password");
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        passwordField.setOpaque(false);
        passwordField.setSelectionColor(new java.awt.Color(255, 204, 0));
        loginPanel.add(passwordField);
        passwordField.setBounds(160, 120, 140, 30);

        loginField.setBackground(new java.awt.Color(255, 191, 0));
        loginField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        loginField.setToolTipText("Login");
        loginField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginField.setOpaque(false);
        loginField.setSelectionColor(new java.awt.Color(255, 204, 0));
        loginPanel.add(loginField);
        loginField.setBounds(160, 60, 140, 30);

        enterPasswordBtn.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        enterPasswordBtn.setForeground(new java.awt.Color(143, 61, 6));
        enterPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/Enter_32.png"))); // NOI18N
        enterPasswordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterPasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterPasswordBtnMousePressed(evt);
            }
        });
        loginPanel.add(enterPasswordBtn);
        enterPasswordBtn.setBounds(310, 120, 30, 30);

        rememberMeCheck.setBackground(new java.awt.Color(255, 255, 255));
        rememberMeCheck.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rememberMeCheck.setForeground(new java.awt.Color(143, 61, 6));
        rememberMeCheck.setSelected(true);
        rememberMeCheck.setText("Remember me?");
        rememberMeCheck.setBorder(null);
        rememberMeCheck.setContentAreaFilled(false);
        rememberMeCheck.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        rememberMeCheck.setFocusPainted(false);
        rememberMeCheck.setFocusable(false);
        loginPanel.add(rememberMeCheck);
        rememberMeCheck.setBounds(180, 160, 100, 21);

        mainPanel.add(loginPanel, "card2");

        registerPanel.setMinimumSize(new java.awt.Dimension(449, 249));
        registerPanel.setOpaque(false);
        registerPanel.setPreferredSize(new java.awt.Dimension(449, 249));
        registerPanel.setLayout(null);

        enterAccountBtn.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        enterAccountBtn.setForeground(new java.awt.Color(143, 61, 6));
        enterAccountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/Enter_32.png"))); // NOI18N
        enterAccountBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterAccountBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterAccountBtnMousePressed(evt);
            }
        });
        registerPanel.add(enterAccountBtn);
        enterAccountBtn.setBounds(320, 190, 30, 30);

        answerField.setBackground(new java.awt.Color(255, 191, 0));
        answerField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        answerField.setToolTipText("Answer");
        answerField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        answerField.setOpaque(false);
        answerField.setSelectionColor(new java.awt.Color(255, 204, 0));
        registerPanel.add(answerField);
        answerField.setBounds(160, 190, 140, 30);

        newLoginField.setBackground(new java.awt.Color(255, 191, 0));
        newLoginField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        newLoginField.setToolTipText("Login");
        newLoginField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newLoginField.setOpaque(false);
        newLoginField.setSelectionColor(new java.awt.Color(255, 204, 0));
        registerPanel.add(newLoginField);
        newLoginField.setBounds(160, 30, 140, 30);

        answerLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        answerLabel.setForeground(new java.awt.Color(143, 61, 6));
        answerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        answerLabel.setText("Write your answer:");
        registerPanel.add(answerLabel);
        answerLabel.setBounds(20, 190, 130, 30);

        newPasswordField.setBackground(new java.awt.Color(255, 191, 0));
        newPasswordField.setToolTipText("Password");
        newPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        newPasswordField.setOpaque(false);
        newPasswordField.setSelectionColor(new java.awt.Color(255, 204, 0));
        registerPanel.add(newPasswordField);
        newPasswordField.setBounds(160, 70, 140, 30);

        repeatNewPasswordField.setBackground(new java.awt.Color(255, 191, 0));
        repeatNewPasswordField.setToolTipText("Password");
        repeatNewPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        repeatNewPasswordField.setOpaque(false);
        repeatNewPasswordField.setSelectionColor(new java.awt.Color(255, 204, 0));
        registerPanel.add(repeatNewPasswordField);
        repeatNewPasswordField.setBounds(160, 110, 140, 30);

        questionField.setBackground(new java.awt.Color(255, 191, 0));
        questionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        questionField.setToolTipText("Question");
        questionField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionField.setOpaque(false);
        questionField.setSelectionColor(new java.awt.Color(255, 204, 0));
        registerPanel.add(questionField);
        questionField.setBounds(160, 150, 140, 30);

        loginLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(143, 61, 6));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginLabel.setText("Login:");
        registerPanel.add(loginLabel);
        loginLabel.setBounds(80, 30, 70, 30);

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(143, 61, 6));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordLabel.setText("Password:");
        registerPanel.add(passwordLabel);
        passwordLabel.setBounds(80, 70, 70, 30);

        repeatPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        repeatPasswordField.setForeground(new java.awt.Color(143, 61, 6));
        repeatPasswordField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        repeatPasswordField.setText("Password again:");
        registerPanel.add(repeatPasswordField);
        repeatPasswordField.setBounds(40, 110, 110, 30);

        questionLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(143, 61, 6));
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        questionLabel.setText("Write your question:");
        registerPanel.add(questionLabel);
        questionLabel.setBounds(10, 150, 140, 30);

        mainPanel.add(registerPanel, "card3");

        forgotPasswordPanel.setMinimumSize(new java.awt.Dimension(449, 249));
        forgotPasswordPanel.setOpaque(false);
        forgotPasswordPanel.setLayout(null);

        chooseAccountBox.setBackground(new java.awt.Color(255, 51, 255));
        chooseAccountBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chooseAccountBox.setForeground(new java.awt.Color(143, 61, 6));
        chooseAccountBox.setMaximumRowCount(3);
        chooseAccountBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                chooseAccountBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        forgotPasswordPanel.add(chooseAccountBox);
        chooseAccountBox.setBounds(200, 60, 140, 25);

        chooseAccountLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        chooseAccountLabel.setForeground(new java.awt.Color(143, 61, 6));
        chooseAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chooseAccountLabel.setText("Choose your account:");
        forgotPasswordPanel.add(chooseAccountLabel);
        chooseAccountLabel.setBounds(50, 60, 140, 20);

        resetAnswerField.setBackground(new java.awt.Color(255, 191, 0));
        resetAnswerField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        resetAnswerField.setToolTipText("Answer");
        resetAnswerField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resetAnswerField.setOpaque(false);
        resetAnswerField.setSelectionColor(new java.awt.Color(255, 204, 0));
        forgotPasswordPanel.add(resetAnswerField);
        resetAnswerField.setBounds(200, 150, 140, 30);

        resetQuestionLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resetQuestionLabel.setForeground(new java.awt.Color(143, 61, 6));
        resetQuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        forgotPasswordPanel.add(resetQuestionLabel);
        resetQuestionLabel.setBounds(50, 100, 400, 40);

        enterAnswerBtn.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        enterAnswerBtn.setForeground(new java.awt.Color(143, 61, 6));
        enterAnswerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/Enter_32.png"))); // NOI18N
        enterAnswerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterAnswerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterAnswerBtnMousePressed(evt);
            }
        });
        forgotPasswordPanel.add(enterAnswerBtn);
        enterAnswerBtn.setBounds(350, 150, 30, 30);

        writeAnswerLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        writeAnswerLabel.setForeground(new java.awt.Color(143, 61, 6));
        writeAnswerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        writeAnswerLabel.setText("Write your answer:");
        forgotPasswordPanel.add(writeAnswerLabel);
        writeAnswerLabel.setBounds(50, 150, 140, 30);

        mainPanel.add(forgotPasswordPanel, "card3");

        resetPasswordPanel.setMinimumSize(new java.awt.Dimension(449, 249));
        resetPasswordPanel.setOpaque(false);
        resetPasswordPanel.setLayout(null);

        typeNewPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        typeNewPasswordLabel.setForeground(new java.awt.Color(143, 61, 6));
        typeNewPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        typeNewPasswordLabel.setText("Type new password:");
        resetPasswordPanel.add(typeNewPasswordLabel);
        typeNewPasswordLabel.setBounds(50, 80, 140, 30);

        typeNewPasswordField.setBackground(new java.awt.Color(255, 191, 0));
        typeNewPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        typeNewPasswordField.setToolTipText("Answer");
        typeNewPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typeNewPasswordField.setOpaque(false);
        typeNewPasswordField.setSelectionColor(new java.awt.Color(255, 204, 0));
        resetPasswordPanel.add(typeNewPasswordField);
        typeNewPasswordField.setBounds(200, 80, 140, 30);

        enterNewPasswordBtn.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        enterNewPasswordBtn.setForeground(new java.awt.Color(143, 61, 6));
        enterNewPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/Enter_32.png"))); // NOI18N
        enterNewPasswordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterNewPasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enterNewPasswordBtnMousePressed(evt);
            }
        });
        resetPasswordPanel.add(enterNewPasswordBtn);
        enterNewPasswordBtn.setBounds(350, 140, 30, 30);

        typeNewPasswordAgainLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        typeNewPasswordAgainLabel.setForeground(new java.awt.Color(143, 61, 6));
        typeNewPasswordAgainLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        typeNewPasswordAgainLabel.setText("Type new password again:");
        resetPasswordPanel.add(typeNewPasswordAgainLabel);
        typeNewPasswordAgainLabel.setBounds(0, 140, 190, 30);

        TypeNewPasswordAgainField.setBackground(new java.awt.Color(255, 191, 0));
        TypeNewPasswordAgainField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        TypeNewPasswordAgainField.setToolTipText("Answer");
        TypeNewPasswordAgainField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TypeNewPasswordAgainField.setOpaque(false);
        TypeNewPasswordAgainField.setSelectionColor(new java.awt.Color(255, 204, 0));
        resetPasswordPanel.add(TypeNewPasswordAgainField);
        TypeNewPasswordAgainField.setBounds(200, 140, 140, 30);

        mainPanel.add(resetPasswordPanel, "card3");

        mainGradientPanel.add(mainPanel);
        mainPanel.setBounds(0, 40, 450, 260);

        loginBtn.setBackground(new java.awt.Color(244, 137, 37));
        loginBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(143, 61, 6));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("Login");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setOpaque(true);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        mainGradientPanel.add(loginBtn);
        loginBtn.setBounds(330, 10, 50, 20);

        registerBtn.setBackground(new java.awt.Color(244, 137, 37));
        registerBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(143, 61, 6));
        registerBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerBtn.setText("Register");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });
        mainGradientPanel.add(registerBtn);
        registerBtn.setBounds(390, 10, 50, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainGradientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 464, 337);
    }// </editor-fold>//GEN-END:initComponents

    /* 
     * Next method opens the password recovery panel and fills the 
     * chooseAccountBox with possible logins for recovery
     */
    
    private void resetPasswordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetPasswordBtnMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(forgotPasswordPanel);
        loginBtn.setOpaque(false);
        registerBtn.setOpaque(false);
        panelNameLabel.setText("Reset password form");
        this.repaint();
        mainPanel.repaint();
        mainPanel.revalidate();
        chooseAccountBox.removeAllItems();
        try {
          Scanner scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/Accounts.txt"));
          String[] String;
          String str;
          while (scanner.hasNextLine()) {
                str = scanner.nextLine();
                String = str.split("//&@");
                chooseAccountBox.addItem(String[0]);
         }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resetPasswordBtnMouseClicked

    /* 
     * Next method opens the registration panel
     */
    
    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(registerPanel);
        loginBtn.setOpaque(false);
        registerBtn.setOpaque(true);
        panelNameLabel.setText("Registration form");
        this.repaint();
        mainPanel.repaint();
        mainPanel.revalidate();
        
    }//GEN-LAST:event_registerBtnMouseClicked

    /* 
     * Next method opens the login panel
     */
    
    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(loginPanel);
        registerBtn.setOpaque(false);
        loginBtn.setOpaque(true);
        panelNameLabel.setText("Login form");
        this.repaint();
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_loginBtnMouseClicked

    /* 
     * The next method compares the saved username and password with the 
     * entered one, and if the data match, opens a window with a table
     */
    
    private void enterPasswordBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterPasswordBtnMousePressed
        try {
            Scanner scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/Accounts.txt"));
            String[] String;
            String str;
            Boolean isCorrect = false;
            while (scanner.hasNextLine()) { // Comparison of the entered login and password with the logins and passwords in the file
                str = scanner.nextLine();
                String = str.split("//&@");
                if (loginField.getText().equals(String[0]) && String[1].equals(new String(passwordField.getPassword()))) {
                    isCorrect = true;
                }
            }
            scanner.close();
            if (isCorrect == true) {
                /* If there is a match */
                if (rememberMeCheck.isSelected() == true) { 
                    /* If user wants to enable autocomplete login and password */
                    BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/Remembered_login.txt"));
                    writer.write(loginField.getText() + "//&@" + new String(passwordField.getPassword()));
                    writer.close(); // Writes the remembered username and password to the autocomplete file
                } else {
                    File file = new File(System.getProperty("user.dir") + "/src/Data/Remembered_login.txt");
                    file.delete();
                }
                TableFrame table_frame = new TableFrame();
                table_frame.getLogin(loginField.getText());
                table_frame.start();
                table_frame.setVisible(true);
                this.dispose(); // Opens TableFrame class
            } else {
                JOptionPane.showMessageDialog(mainGradientPanel, "Login or password is incorrect", "Wrong data", JOptionPane.WARNING_MESSAGE);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(mainGradientPanel, "There is no accounts yet", "Unexpected error", JOptionPane.WARNING_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enterPasswordBtnMousePressed

    /* 
     * The following method is responsible for user registration
     */
    
    private void enterAccountBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterAccountBtnMousePressed
        BufferedWriter writer = null;
        try {
            String[] account_dat = new String[5];
            account_dat[0] = newLoginField.getText();
            account_dat[1] = new String(newPasswordField.getPassword());
            account_dat[2] = new String(repeatNewPasswordField.getPassword());
            account_dat[3] = questionField.getText();
            account_dat[4] = answerField.getText(); // Reads the data entered by the user
            writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/Accounts.txt", true));
            if (account_dat[1].equals(account_dat[2]) == false) {
                /* If password and repeated password do not match */
                JOptionPane.showMessageDialog(mainGradientPanel, "These passwords do not match", "Incorrect passwords", JOptionPane.WARNING_MESSAGE);
            } else if (ifExists(account_dat[0]) == true) {
                /* If account with entered login already exists */
                JOptionPane.showMessageDialog(mainGradientPanel, "Account with this login already exists", "Account already exists", JOptionPane.WARNING_MESSAGE);
            } else {
                writer.newLine();
                writer.write(account_dat[0] + "//&@" + account_dat[1] + "//&@" + account_dat[3] + "//&@" + account_dat[4]);  // Saves the new account information to the file
                JOptionPane.showMessageDialog(mainGradientPanel, "Account was successfully created!", "Account was created", JOptionPane.PLAIN_MESSAGE);
                newLoginField.setText("");
                newPasswordField.setText("");
                repeatNewPasswordField.setText("");
                questionField.setText("");
                answerField.setText("");
                mainPanel.removeAll();
                mainPanel.repaint();
                mainPanel.revalidate();
                mainPanel.add(loginPanel);
                registerBtn.setOpaque(false);
                loginBtn.setOpaque(true);
                panelNameLabel.setText("Login form");
                this.repaint();
                mainPanel.repaint();
                mainPanel.revalidate();
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_enterAccountBtnMousePressed

    /* 
     * The next method displays a question for password recovery
     */
    
    private void chooseAccountBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_chooseAccountBoxPopupMenuWillBecomeInvisible
        try {
            Scanner scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/Accounts.txt"));
            String[] String;
            String str;
            int count = 0;
            while (scanner.hasNextLine()) {
                count++;
                str = scanner.nextLine();
                String = str.split("//&@");
                if (String[0].equals(chooseAccountBox.getSelectedItem().toString())) {
                    resetQuestionLabel.setText(String[2]);
                    answer = String[3];
                    line = count - 1;
                }
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chooseAccountBoxPopupMenuWillBecomeInvisible

    /* 
     * The next method сhecks if the answers agree to recover the password
     */
    
    private void enterAnswerBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterAnswerBtnMousePressed
        if (resetAnswerField.getText().equals(answer)) {
            /* If aswers match */
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();
            mainPanel.add(resetPasswordPanel);
            loginBtn.setOpaque(false);
            registerBtn.setOpaque(false);
            panelNameLabel.setText("New password");
            this.repaint();
            mainPanel.repaint();
            mainPanel.revalidate();
        } else {
            JOptionPane.showMessageDialog(mainGradientPanel, "Answers do not match", "Try again", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_enterAnswerBtnMousePressed

    /* 
     * The next method recovers password
     */
    
    private void enterNewPasswordBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterNewPasswordBtnMousePressed
        if (typeNewPasswordField.getText().equals(TypeNewPasswordAgainField.getText())) {
            /* If both passwords match */
            try {
                resetPass(line, typeNewPasswordField.getText());
            } catch (IOException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(mainGradientPanel, "Password was successfully changed!", "Success", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(mainGradientPanel, "Passwords do not match", "Try again", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_enterNewPasswordBtnMousePressed
    
    /* 
     * The next method used to check the existence of an identical login
     */

    private boolean ifExists(String login) {
        boolean exists = false;
        try {
            Scanner scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/Accounts.txt"));
            String[] String;
            String str;
            while (scanner.hasNextLine()) {
                str = scanner.nextLine();
                String = str.split("//&@");
                if (login.equals(String[0])) {
                    exists = true;
                }
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exists;
    }

    /* 
     * The next method overwrites the old password with the new one
     */

    private void resetPass(int count, String newPass) throws IOException {
        List < String > list = new ArrayList < String > ();
        String[] String;
        String str;
        try {
            Scanner scanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/Accounts.txt"));
            while (scanner.hasNextLine()) { // Adds data from file to the list 
                str = scanner.nextLine();
                list.add(str);
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(System.getProperty("user.dir") + "/src/Data/Accounts.txt")));
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                writer.newLine();
            }
            if (i == count) {
                String = list.get(count).split("//&@");
                writer.write(String[0] + "//&@" + newPass + "//&@" + String[2] + "//&@" + String[3]);
                /* Rewrites password */
            } else {
                writer.write(list.get(i));
            }
        }
        writer.close();
    }

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TypeNewPasswordAgainField;
    private javax.swing.JFormattedTextField answerField;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JComboBox<String> chooseAccountBox;
    private javax.swing.JLabel chooseAccountLabel;
    private javax.swing.JLabel enterAccountBtn;
    private javax.swing.JLabel enterAnswerBtn;
    private javax.swing.JLabel enterNewPasswordBtn;
    private javax.swing.JLabel enterPasswordBtn;
    private javax.swing.JPanel forgotPasswordPanel;
    private javax.swing.JLabel keyIco;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JFormattedTextField loginField;
    private javax.swing.JLabel loginIco;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private keeptoo.KGradientPanel mainGradientPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JFormattedTextField newLoginField;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel panelNameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JFormattedTextField questionField;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel registerBtn;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JCheckBox rememberMeCheck;
    private javax.swing.JPasswordField repeatNewPasswordField;
    private javax.swing.JLabel repeatPasswordField;
    private javax.swing.JFormattedTextField resetAnswerField;
    private javax.swing.JLabel resetPasswordBtn;
    private javax.swing.JPanel resetPasswordPanel;
    private javax.swing.JLabel resetQuestionLabel;
    private javax.swing.JLabel typeNewPasswordAgainLabel;
    private javax.swing.JFormattedTextField typeNewPasswordField;
    private javax.swing.JLabel typeNewPasswordLabel;
    private javax.swing.JLabel writeAnswerLabel;
    // End of variables declaration//GEN-END:variables
}