package vacc_app;

import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * This class shows message history.
 */
public class HistoryFrame extends javax.swing.JFrame {
    private String login; // This variable keeps login name
    /**
     * Creates new form HistoryFrame
     */
    public HistoryFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img_source/Logo_64.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new keeptoo.KGradientPanel();
        scrollPanel = new javax.swing.JScrollPane();
        historyList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("History");
        setMinimumSize(new java.awt.Dimension(527, 337));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        mainPanel.setkEndColor(new java.awt.Color(255, 191, 0));
        mainPanel.setkStartColor(new java.awt.Color(255, 102, 0));
        mainPanel.setLayout(new java.awt.CardLayout());

        historyList.setBackground(new java.awt.Color(255, 234, 215));
        historyList.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        historyList.setForeground(new java.awt.Color(143, 61, 6));
        historyList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "History:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historyList.setGridColor(new java.awt.Color(255, 196, 177));
        historyList.setRowHeight(20);
        historyList.setSelectionBackground(new java.awt.Color(255, 197, 140));
        historyList.getTableHeader().setReorderingAllowed(false);
        scrollPanel.setViewportView(historyList);

        mainPanel.add(scrollPanel, "card2");

        getContentPane().add(mainPanel, "card2");

        setBounds(0, 0, 414, 387);
    }// </editor-fold>//GEN-END:initComponents

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
     * Next method assigns a login value to a variable
     */

    public void getLogin(String login) {
        this.login = login;
    }

    /* 
     * Next method runs when HistoryFrame class is created
     */

    public void start() {
        loadHistory();
    }

    /* 
     * Next method loads message history from file
     */

    private void loadHistory() {
        try {
            String[][] data;
            String[] headers = {
                "History:"
            };
            DefaultTableModel model = (DefaultTableModel) historyList.getModel();
            BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_history.txt", true));
            Scanner historyScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_history.txt"));
            Scanner emptyScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_history.txt"));
            if (emptyScanner.hasNext() == false) {
                writer.write("Message//&@You should set an emails, names and periods in mailing.");
            }
            writer.close();
            emptyScanner.close();
            String[] temp;
            ArrayList < String > list = new ArrayList < String > ();
            while (historyScanner.hasNextLine()) { // Fill list 
                list.add(historyScanner.nextLine());
            }
            data = new String[list.size()][1];
            for (int i = 0; i < list.size(); i++) {
                temp = list.get(i).split("//&@");
                if (temp[0].equals("Message")) {
                    /* If it is a message */
                    data[i][0] = temp[1];
                } else {
                    data[i][0] = temp[1] + " - " + temp[2] + " - " + temp[3];
                }
            }
            historyScanner.close();
            model.setDataVector(data, headers); // Fill table
            historyList.getTableHeader().setFont(new Font("Times New Roman", 0, 13));
            historyList.getTableHeader().setOpaque(false);
            historyList.getTableHeader().setBackground(new java.awt.Color(255, 214, 177));
            historyList.getTableHeader().setForeground(new java.awt.Color(143, 61, 6));
        } catch (IOException ex) {
            Logger.getLogger(HistoryFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable historyList;
    private keeptoo.KGradientPanel mainPanel;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}
