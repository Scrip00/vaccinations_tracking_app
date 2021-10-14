package vacc_app;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 * This class is responsible for setting the configuration for sending emails.
 */
public class MailingFrame extends javax.swing.JFrame {
    private String login; // This variable keeps login name
    /**
     * Creates new form MailingFrame
     */
    public MailingFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img_source/Logo_64.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new keeptoo.KGradientPanel();
        scrollPanel = new javax.swing.JScrollPane();
        headerList = new javax.swing.JTable();
        mailField = new javax.swing.JFormattedTextField();
        passwordField = new javax.swing.JPasswordField();
        keyIco = new javax.swing.JLabel();
        loginIco = new javax.swing.JLabel();
        showPasswordBtn = new javax.swing.JLabel();
        saveBtn = new javax.swing.JLabel();
        saveLabel = new javax.swing.JLabel();
        repetitionPeriodField = new javax.swing.JFormattedTextField();
        repetitionPeriodLabel = new javax.swing.JLabel();
        hintBtn = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        setConfigMenu = new javax.swing.JMenu();
        setNamesMenu = new javax.swing.JMenuItem();
        setEmailsMenu = new javax.swing.JMenuItem();
        addProcedureMenu = new javax.swing.JMenuItem();
        deleteConfigMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mailing settings");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        mainPanel.setkEndColor(new java.awt.Color(255, 191, 0));
        mainPanel.setkStartColor(new java.awt.Color(255, 102, 0));
        mainPanel.setMinimumSize(new java.awt.Dimension(0, 250));
        mainPanel.setLayout(null);

        headerList.setBackground(new java.awt.Color(255, 153, 0));
        headerList.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        headerList.setForeground(new java.awt.Color(143, 61, 6));
        headerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Header", "Configuration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        headerList.setToolTipText("");
        headerList.setGridColor(new java.awt.Color(218, 143, 0));
        headerList.setSelectionBackground(new java.awt.Color(248, 127, 53));
        headerList.getTableHeader().setReorderingAllowed(false);
        scrollPanel.setViewportView(headerList);

        mainPanel.add(scrollPanel);
        scrollPanel.setBounds(0, 0, 300, 380);

        mailField.setBackground(new java.awt.Color(255, 191, 0));
        mailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        mailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mailField.setToolTipText("Login");
        mailField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mailField.setOpaque(false);
        mailField.setSelectionColor(new java.awt.Color(255, 204, 0));
        mainPanel.add(mailField);
        mailField.setBounds(390, 30, 140, 30);

        passwordField.setBackground(new java.awt.Color(255, 191, 0));
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setToolTipText("Password");
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        passwordField.setOpaque(false);
        passwordField.setSelectionColor(new java.awt.Color(255, 204, 0));
        mainPanel.add(passwordField);
        passwordField.setBounds(390, 90, 140, 30);

        keyIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/Password_32.png"))); // NOI18N
        mainPanel.add(keyIco);
        keyIco.setBounds(340, 90, 32, 30);

        loginIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/Login_32.png"))); // NOI18N
        mainPanel.add(loginIco);
        loginIco.setBounds(340, 30, 30, 30);

        showPasswordBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/closed_eye_18px.png"))); // NOI18N
        showPasswordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPasswordBtnMousePressed(evt);
            }
        });
        mainPanel.add(showPasswordBtn);
        showPasswordBtn.setBounds(550, 90, 30, 30);

        saveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/save_26px.png"))); // NOI18N
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveBtnMousePressed(evt);
            }
        });
        mainPanel.add(saveBtn);
        saveBtn.setBounds(500, 200, 30, 30);

        saveLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveLabel.setForeground(new java.awt.Color(143, 61, 6));
        saveLabel.setText("Save changes");
        mainPanel.add(saveLabel);
        saveLabel.setBounds(390, 200, 100, 30);

        repetitionPeriodField.setBackground(new java.awt.Color(255, 191, 0));
        repetitionPeriodField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 191, 0)));
        repetitionPeriodField.setToolTipText("Notification period");
        repetitionPeriodField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        repetitionPeriodField.setOpaque(false);
        repetitionPeriodField.setSelectionColor(new java.awt.Color(255, 204, 0));
        mainPanel.add(repetitionPeriodField);
        repetitionPeriodField.setBounds(480, 150, 50, 30);

        repetitionPeriodLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        repetitionPeriodLabel.setForeground(new java.awt.Color(143, 61, 6));
        repetitionPeriodLabel.setText("Notification period (in days):");
        mainPanel.add(repetitionPeriodLabel);
        repetitionPeriodLabel.setBounds(330, 150, 150, 30);

        hintBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        hintBtn.setForeground(new java.awt.Color(143, 61, 6));
        hintBtn.setText("You should turn this on (click here)");
        hintBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hintBtnMousePressed(evt);
            }
        });
        mainPanel.add(hintBtn);
        hintBtn.setBounds(370, 250, 180, 30);

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 600, 380);

        setConfigMenu.setText("Set config");

        setNamesMenu.setText("Set names");
        setNamesMenu.setIconTextGap(0);
        setNamesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setNamesMenuMousePressed(evt);
            }
        });
        setConfigMenu.add(setNamesMenu);

        setEmailsMenu.setText("Set emails");
        setEmailsMenu.setIconTextGap(0);
        setEmailsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setEmailsMenuMousePressed(evt);
            }
        });
        setConfigMenu.add(setEmailsMenu);

        addProcedureMenu.setText("Add procedure");
        addProcedureMenu.setIconTextGap(0);
        addProcedureMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addProcedureMenuMousePressed(evt);
            }
        });
        setConfigMenu.add(addProcedureMenu);

        deleteConfigMenu.setText("Delete config");
        deleteConfigMenu.setIconTextGap(0);
        deleteConfigMenu.setInheritsPopupMenu(true);
        deleteConfigMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteConfigMenuMousePressed(evt);
            }
        });
        setConfigMenu.add(deleteConfigMenu);

        menuBar.add(setConfigMenu);

        setJMenuBar(menuBar);

        setBounds(0, 0, 614, 437);
    }// </editor-fold>//GEN-END:initComponents

    private void setNamesMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setNamesMenuMousePressed
        setData("Names"); // Set names configuration
    }//GEN-LAST:event_setNamesMenuMousePressed

    private void setEmailsMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setEmailsMenuMousePressed
        setData("Emails"); // Set emails configuration
    }//GEN-LAST:event_setEmailsMenuMousePressed

    /* 
     * Next method sets repetition period for a vaccination
     */
    
    private void addProcedureMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProcedureMenuMousePressed
        String dialogResult = JOptionPane.showInputDialog("Enter repetition period (in months)");
        if (dialogResult != null && !dialogResult.matches("[0-9]+")) {
            System.out.println("Invalid number");
            JOptionPane.showMessageDialog(this, "Sorry, \"" + dialogResult + "\" " + "isn't a valid response.\n" + "Please enter " + "a number" + ".", "Try again", JOptionPane.ERROR_MESSAGE);
        } else if (dialogResult != null) {
            DefaultTableModel model = (DefaultTableModel) headerList.getModel();
            model.setValueAt("Repetition period: " + dialogResult, headerList.getSelectedRow(), 1);
            saveList();
        }
    }//GEN-LAST:event_addProcedureMenuMousePressed

    private void deleteConfigMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteConfigMenuMousePressed
        setData(""); // Delete selected configuration
    }//GEN-LAST:event_deleteConfigMenuMousePressed

    /* 
     * Next method shows or hides password
     */
    
    private void showPasswordBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordBtnMousePressed
        if (passwordField.getEchoChar() == '●') {
            passwordField.setEchoChar((char) 0);
            showPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/eye_18px.png")));
        } else {
            passwordField.setEchoChar('●');
            showPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/closed_eye_18px.png")));
        }
    }//GEN-LAST:event_showPasswordBtnMousePressed

    /* 
     * Next method saves entered data to file
     */
    
    private void saveBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMousePressed
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_mail.txt"));
            writer.write(mailField.getText() + "//&@" + new String(passwordField.getPassword()));
            writer.write("\n" + repetitionPeriodField.getText());
        } catch (IOException ex) {
            Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveBtnMousePressed

    /* 
     * Next method opens TableFrame when the window is closed
     */
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TableFrame table_frame = new TableFrame();
        table_frame.getLogin(this.login);
        table_frame.start();
        table_frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    /* 
     * Next method is responsible for showing hint
     */
    
    private void hintBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hintBtnMousePressed
        //https://myaccount.google.com/lesssecureapps
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://myaccount.google.com/lesssecureapps"));
            } catch (URISyntaxException ex) {
                Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
}
    }//GEN-LAST:event_hintBtnMousePressed
    
    /* 
     * Next method assigns a login value to a variable
     */

    public void getLogin(String login) {
        this.login = login;
    }

    /* 
     * Next method runs when MailingFrame class is created
     */

    public void start() {
        createList();
        scrollPanel.setBounds(0, 0, 300, mainPanel.getHeight());
        fillLogin();
    }

    /* 
     * Next method automatically loads the value of the entered username, password and repetition period
     */

    private void fillLogin() {
        try {
            Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_mail.txt"));
            String[] str = new String[2];
            str = scan.nextLine().split("//&@");
            mailField.setText(str[0]);
            if (str.length > 1) {
                passwordField.setText(str[1]);
            }
            if (scan.hasNextLine()) {
                String strr;
                strr = scan.nextLine();
                repetitionPeriodField.setText(strr);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /* 
     * Next method assigns a config value and saves to file
     */

    private void setData(String dat) {
        DefaultTableModel model = (DefaultTableModel) headerList.getModel();
        boolean has = check(dat);
        if (has == false) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to change existing value?", "Attention", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                for (int i = 0; i < headerList.getRowCount(); i++) {
                    if (model.getValueAt(i, 1).equals(dat)) {
                        model.setValueAt("", i, 1);
                    }
                }
                model.setValueAt(dat, headerList.getSelectedRow(), 1);
                saveList();
            }
        } else {
            model.setValueAt(dat, headerList.getSelectedRow(), 1);
            saveList();
        }
    }

    /* 
     * Next method checks for duplicate configurations
     */

    private boolean check(String str) {
        int ifFalse = 0;
        try {
            String temporaryString;
            String[] data = new String[3];
            Scanner headersScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
            while (headersScanner.hasNextLine()) {
                temporaryString = headersScanner.nextLine();
                data = temporaryString.split("//&@");
                if (data[1].equals(str)) {
                    ifFalse++;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ifFalse == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* 
     * Next method loads a list of headers into a table and saves to the file
     */

    private void createList() {
        try {
            BufferedWriter writer = null;
            DefaultTableModel model = (DefaultTableModel) headerList.getModel();
            int p = 0, length = 0;
            String str;
            String[] temp = null;
            Scanner dataScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
            str = dataScanner.nextLine();
            temp = str.split("//&@");
            String[] headers = new String[temp.length - 1];
            for (int i = 0; i < temp.length - 1; i++) { // Store headers in an array
                headers[i] = temp[i];
            }
            File file = new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt");
            if (!file.exists()) {
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
                for (int i = 0; i < headers.length; i++) { // Сreate a new file with headers
                    writer.write(headers[i] + "//&@//&@.");
                    writer.newLine();
                }
                writer.close();
            }
            Scanner headersScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
            Scanner lengthScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
            while (lengthScanner.hasNextLine()) {
                length++;
                lengthScanner.nextLine();
            }
            String[] fileheaders = new String[length];
            String[] periods = new String[length];
            while (headersScanner.hasNextLine()) { // Fill the arrays with data
                str = headersScanner.nextLine();
                temp = str.split("//&@");
                fileheaders[p] = temp[0];
                periods[p] = temp[1];
                p++;
            }

            if (Arrays.equals(headers, fileheaders)) {
                /* If the list of headers hasn't changed */
                for (int i = 0; i < headers.length; i++) {
                    model.addRow(new Object[] {
                        headers[i], periods[i]
                    });
                }
            } else {
                /* If the list of headers has changed */
                /*
                 * The following algorithm compares the previous headers with 
                 * new headers, if any, and, depending on this, adds configurations.
                 */
                ArrayList < Integer > list = new ArrayList < Integer > ();
                String[][] data = new String[headers.length][2];
                for (int i = 0; i < headers.length; i++) {
                    data[i][0] = headers[i];
                }
                String temporaryString;
                for (int i = 0; i < headers.length; i++) {
                    for (int j = 0; j < fileheaders.length; j++) {
                        if (headers[i].equals(fileheaders[j])) {
                            list.add(j);
                        }
                    }
                }
                Scanner repetitionScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
                int count = 0;
                while (repetitionScanner.hasNextLine()) {
                    temporaryString = repetitionScanner.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        if (count == list.get(i)) {
                            temp = temporaryString.split("//&@");
                            data[count][1] = temp[1];
                        }
                    }
                    count++;
                }
                String[] heads = {
                    "Procedure",
                    "Period (if exists)"
                };
                model.setDataVector(data, heads);
                saveList();
            }
            headerList.getTableHeader().setFont(new Font("Times New Roman", 0, 13));
            headerList.getTableHeader().setOpaque(false);
            headerList.getTableHeader().setBackground(new java.awt.Color(243, 145, 0));
            headerList.getTableHeader().setForeground(new java.awt.Color(143, 61, 6));
            headerList.setToolTipText(null);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /* 
     * Next method saves table data to file
     */

    private void saveList() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
            for (int i = 0; i < headerList.getRowCount(); i++) {
                for (int j = 0; j < headerList.getColumnCount(); j++) {
                    if (headerList.getValueAt(i, j) == null) {
                        writer.write("//&@");
                    } else {
                        writer.write(headerList.getValueAt(i, j) + "//&@");
                    }
                }
                writer.write(".");
                writer.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(MailingFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MailingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MailingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MailingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MailingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MailingFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addProcedureMenu;
    private javax.swing.JMenuItem deleteConfigMenu;
    private javax.swing.JTable headerList;
    private javax.swing.JLabel hintBtn;
    private javax.swing.JLabel keyIco;
    private javax.swing.JLabel loginIco;
    private javax.swing.JFormattedTextField mailField;
    private keeptoo.KGradientPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JFormattedTextField repetitionPeriodField;
    private javax.swing.JLabel repetitionPeriodLabel;
    private javax.swing.JLabel saveBtn;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JMenu setConfigMenu;
    private javax.swing.JMenuItem setEmailsMenu;
    private javax.swing.JMenuItem setNamesMenu;
    private javax.swing.JLabel showPasswordBtn;
    // End of variables declaration//GEN-END:variables
}
