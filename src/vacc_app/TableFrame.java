package vacc_app;

import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * The TableFrame class provides most of the functionality, such as automatic email 
 * notification, working with Excel files, and an internal table.
 */

public class TableFrame extends javax.swing.JFrame {
private String login; // This variable keeps login name
    /**
     * Creates new form TableFrame
     */
    public TableFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Img_source/Logo_64.png")));
        setExtendedState(MAXIMIZED_BOTH);
        sendNotifications();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        tablePanel = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        menuPanel = new keeptoo.KGradientPanel();
        openMenuBtn = new javax.swing.JLabel();
        importBtn = new javax.swing.JLabel();
        exportBtn = new javax.swing.JLabel();
        historyBtn = new javax.swing.JLabel();
        mailingBtn = new javax.swing.JLabel();
        autosaveBtn = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuSave = new javax.swing.JMenu();
        menuSortOptions = new javax.swing.JMenu();
        menuNoSortOption = new javax.swing.JRadioButtonMenuItem();
        menuSort = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaccinations app");
        setMinimumSize(new java.awt.Dimension(700, 350));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        mainPanel.setLayout(null);

        tablePanel.setBackground(new java.awt.Color(255, 153, 153));
        tablePanel.setLayout(new java.awt.GridLayout(1, 0));

        dataTable.setBackground(new java.awt.Color(255, 234, 215));
        dataTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        dataTable.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        dataTable.setForeground(new java.awt.Color(143, 61, 6));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dataTable.setToolTipText(""); // NOI18N
        dataTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        dataTable.setDoubleBuffered(true);
        dataTable.setGridColor(new java.awt.Color(255, 196, 177));
        dataTable.setRowHeight(18);
        dataTable.setSelectionBackground(new java.awt.Color(255, 197, 140));
        dataTable.setShowGrid(true);
        dataTable.getTableHeader().setReorderingAllowed(false);
        dataTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dataTablePropertyChange(evt);
            }
        });
        scrollPanel.setViewportView(dataTable);

        tablePanel.add(scrollPanel);

        mainPanel.add(tablePanel);
        tablePanel.setBounds(50, 1, 651, 330);

        menuPanel.setkEndColor(new java.awt.Color(255, 191, 0));
        menuPanel.setkStartColor(new java.awt.Color(255, 102, 0));
        menuPanel.setLayout(null);

        openMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/right_arrow.png"))); // NOI18N
        openMenuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openMenuBtnMousePressed(evt);
            }
        });
        menuPanel.add(openMenuBtn);
        openMenuBtn.setBounds(160, 10, 30, 30);

        importBtn.setBackground(new java.awt.Color(233, 103, 24));
        importBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        importBtn.setForeground(new java.awt.Color(143, 61, 6));
        importBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        importBtn.setText("Import excel file");
        importBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        importBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                importBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                importBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                importBtnMousePressed(evt);
            }
        });
        menuPanel.add(importBtn);
        importBtn.setBounds(10, 70, 140, 30);

        exportBtn.setBackground(new java.awt.Color(233, 103, 24));
        exportBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        exportBtn.setForeground(new java.awt.Color(143, 61, 6));
        exportBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exportBtn.setText("Export data");
        exportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exportBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exportBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exportBtnMousePressed(evt);
            }
        });
        menuPanel.add(exportBtn);
        exportBtn.setBounds(10, 120, 140, 30);

        historyBtn.setBackground(new java.awt.Color(233, 103, 24));
        historyBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        historyBtn.setForeground(new java.awt.Color(143, 61, 6));
        historyBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historyBtn.setText("History");
        historyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historyBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historyBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                historyBtnMousePressed(evt);
            }
        });
        menuPanel.add(historyBtn);
        historyBtn.setBounds(10, 170, 140, 30);

        mailingBtn.setBackground(new java.awt.Color(233, 103, 24));
        mailingBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mailingBtn.setForeground(new java.awt.Color(143, 61, 6));
        mailingBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mailingBtn.setText("Mailing");
        mailingBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mailingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mailingBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailingBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mailingBtnMousePressed(evt);
            }
        });
        menuPanel.add(mailingBtn);
        mailingBtn.setBounds(10, 220, 140, 30);

        autosaveBtn.setBackground(new java.awt.Color(233, 103, 24));
        autosaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        autosaveBtn.setForeground(new java.awt.Color(143, 61, 6));
        autosaveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autosaveBtn.setText("Autosave: off");
        autosaveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        autosaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                autosaveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                autosaveBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                autosaveBtnMousePressed(evt);
            }
        });
        menuPanel.add(autosaveBtn);
        autosaveBtn.setBounds(10, 270, 140, 30);

        mainPanel.add(menuPanel);
        menuPanel.setBounds(-150, 0, 201, 331);

        getContentPane().add(mainPanel);

        menuBar.setBackground(new java.awt.Color(0, 255, 102));
        menuBar.setBorder(null);
        menuBar.setBorderPainted(false);
        menuBar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        menuSave.setForeground(new java.awt.Color(143, 61, 6));
        menuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/save_18px.png"))); // NOI18N
        menuSave.setText("Save");
        menuSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSaveMousePressed(evt);
            }
        });
        menuBar.add(menuSave);

        menuSortOptions.setForeground(new java.awt.Color(143, 61, 6));
        menuSortOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/sorting_18px.png"))); // NOI18N
        menuSortOptions.setText("Sort options");

        buttonGroup.add(menuNoSortOption);
        menuNoSortOption.setSelected(true);
        menuNoSortOption.setText("No sort");
        menuNoSortOption.setToolTipText("");
        menuSortOptions.add(menuNoSortOption);

        menuBar.add(menuSortOptions);

        menuSort.setForeground(new java.awt.Color(143, 61, 6));
        menuSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/sort_18px.png"))); // NOI18N
        menuSort.setText("Sort");
        menuSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSortMousePressed(evt);
            }
        });
        menuBar.add(menuSort);

        setJMenuBar(menuBar);

        setBounds(0, 0, 714, 387);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        repaintFrame();
    }//GEN-LAST:event_formComponentResized

    /* 
     * Next method is responsible for extending the left pane of the GUI
     */
    
    private void openMenuBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openMenuBtnMousePressed
        if (menuPanel.getX() == -150) {
            menuPanel.setLocation(0, 0);
            tablePanel.setBounds(201, 0, tablePanel.getWidth() - 150, tablePanel.getHeight());
            openMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/left_arrow.png")));
            this.repaint();
            this.revalidate();
        } else {
            menuPanel.setLocation(-150, 0);
            tablePanel.setBounds(51, 0, tablePanel.getWidth() + 150, tablePanel.getHeight());
            openMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_source/right_arrow.png")));
            this.repaint();
            this.revalidate();
        }
    }//GEN-LAST:event_openMenuBtnMousePressed

    /* 
     * Next method is responsible for importing excel table
     */
    
    private void importBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importBtnMousePressed
        String[] headers = null;
        Object[][] data = null;
        File excelFile;
        int lastCell, lowestCell;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelImportToJTable = null;
        String defaultCurrentDirectoryPath = "C:\\Users\\hugo_\\Desktop";
        JFileChooser excelFileChooser = new JFileChooser(defaultCurrentDirectoryPath);
        excelFileChooser.setDialogTitle("Select Excel File");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        int excelChooser = excelFileChooser.showOpenDialog(null);
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = excelFileChooser.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelImportToJTable = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelImportToJTable.getSheetAt(0);
                headers = new String[excelSheet.getRow(0).getLastCellNum()];
                lastCell = excelSheet.getRow(0).getLastCellNum();
                lowestCell = excelSheet.getLastRowNum();
                for (int row = 0; row < excelSheet.getRow(0).getLastCellNum(); row++) { 
                    headers[row] = excelSheet.getRow(0).getCell(row).toString(); // Fills an array of headers
                }
                data = new Object[excelSheet.getLastRowNum()][excelSheet.getRow(0).getLastCellNum()];
                for (int count = 1; count <= excelSheet.getLastRowNum(); count++) {
                    for (int row = 0; row < excelSheet.getRow(0).getLastCellNum(); row++) {
                        if (excelSheet.getRow(count).getCell(row) == null) {
                            data[count - 1][row] = "";
                        } else
                            data[count - 1][row] = excelSheet.getRow(count).getCell(row); // Fills an array of data
                    }
                }
                DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
                    for (int i = 0; i < lastCell; i++) {
                        writer.write(headers[i] + "//&@"); // Writes data to file
                    }
                    writer.write(".");
                    writer.newLine();
                    for (int r = 0; r < lowestCell - 1; r++) {
                        for (int i = 0; i < lastCell; i++) {
                            String str, month = null;
                            str = data[r][i].toString();
                            String[] strArray;
                            strArray = str.split("-");
                            if (strArray.length == 3) {
                                switch (strArray[1]) { // Since the program is used in Russia, some features of the language are taken into account
                                    case "сент.":
                                        month = "09";
                                        break;
                                    case "окт.":
                                        month = "10";
                                        break;
                                    case "нояб.":
                                        month = "11";
                                        break;
                                    case "дек.":
                                        month = "12";
                                        break;
                                    case "февр.":
                                        month = "02";
                                        break;
                                    case "янв.":
                                        month = "01";
                                        break;
                                    case "мар.":
                                        month = "03";
                                        break;
                                    case "апр.":
                                        month = "04";
                                        break;
                                    case "мая":
                                        month = "05";
                                        break;
                                    case "июн.":
                                        month = "06";
                                        break;
                                    case "июл.":
                                        month = "07";
                                        break;
                                    case "авг.":
                                        month = "08";
                                        break;

                                }
                                str = strArray[0] + "." + month + "." + strArray[2];
                            }
                            strArray = str.split("\\.");
                            if (strArray.length == 2 && i == 0) {
                                str = strArray[0];
                            }
                            writer.write(str + "//&@");
                        }
                        writer.write(".");
                        if (r != lowestCell - 1) {
                            writer.newLine();
                        }
                    }
                    writer.close();
                    loadTable();
                } catch (IOException e) {
                    e.printStackTrace();
                    model.setDataVector(data, headers);
                }
                setColumnWidths(); // Soring columns by width
                JOptionPane.showMessageDialog(null, "Imported Successfully");
            } catch (IOException iOException) {
                JOptionPane.showMessageDialog(null, iOException.getMessage());
            } finally {
                try {
                    if (excelFIS != null) {
                        excelFIS.close();
                    }
                    if (excelBIS != null) {
                        excelBIS.close();
                    }
                    if (excelImportToJTable != null) {
                        excelImportToJTable.close();
                    }
                } catch (IOException iOException) {
                    JOptionPane.showMessageDialog(null, iOException.getMessage());
                }
            }
        }
    }//GEN-LAST:event_importBtnMousePressed

    private void importBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importBtnMouseEntered
        importBtn.setOpaque(true);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_importBtnMouseEntered

    private void importBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importBtnMouseExited
        importBtn.setOpaque(false);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_importBtnMouseExited

    private void exportBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportBtnMouseEntered
        exportBtn.setOpaque(true);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_exportBtnMouseEntered

    private void exportBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportBtnMouseExited
        exportBtn.setOpaque(false);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_exportBtnMouseExited

    /* 
     * Next method is responsible for exporting excel table
     */
    
    private void exportBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportBtnMousePressed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fileChooser.setSelectedFile(new File("fileToSave.txt"));
            int option = fileChooser.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                String path = fileChooser.getSelectedFile().getAbsolutePath(); // Gets path
                String file_name = JOptionPane.showInputDialog(null, "Enter file name (with .xlsx extension)", "File name", 
                       JOptionPane.QUESTION_MESSAGE, null, null, "new_file.xlsx").toString(); // Gets file name
                String filename = path + "\\" + file_name;
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("FirstSheet");
                XSSFCellStyle cellStyle = workbook.createCellStyle();
                XSSFFont font = workbook.createFont();
                font.setFontName("Calibri");
                cellStyle.setFont(font);
                String string;
                String[] words, headers = null;
                int rowCount = 0, columnCount = 0;
                String[][] data = null;
                Scanner rowScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
                while (rowScanner.hasNextLine()) { // Check row and coumn count
                    string = rowScanner.nextLine();
                    if (rowCount == 0) {
                        words = string.split("//&@");
                        columnCount = words.length - 1;
                    }
                    rowCount++;
                }
                rowScanner.close();
                Scanner dataScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
                headers = new String[columnCount];
                data = new String[rowCount - 1][columnCount];
                int rows = 0;
                while (dataScanner.hasNextLine()) { // Assign value to array of headers and data
                    string = dataScanner.nextLine();
                    if (rows == 0) {
                        words = string.split("//&@");
                        for (int u = 0; u < words.length - 1; u++) {
                            headers[u] = words[u];
                        }
                    } else {
                        words = string.split("//&@");
                        for (int i = 0; i < words.length - 1; i++) {

                            data[rows - 1][i] = words[i];
                        }
                    }
                    rows++;
                }
                for (int y = 0; y < columnCount; y++) {}
                XSSFRow rowhead = sheet.createRow((short) 0);
                for (int i = 0; i < headers.length; i++) {
                    rowhead.createCell(i).setCellValue(headers[i]);
                    sheet.setDefaultColumnStyle(i, cellStyle);
                }
                for (int i = 0; i < data.length; i++) {
                    XSSFRow row = sheet.createRow((short) i + 1);
                    for (int j = 0; j < data[0].length; j++) {
                        row.createCell(j).setCellValue(data[i][j]);
                    }
                }
                /* Fills the Excel table with data */
                for (int i = 0; i < headers.length; i++) { // Sorts Excel column widths
                    sheet.autoSizeColumn(i);
                    if (sheet.getColumnWidth(i) > 20 * 256) {
                        sheet.setColumnWidth(i, 20 * 256);
                    }
                }
                FileOutputStream fileOut = new FileOutputStream(filename);
                workbook.write(fileOut);
                fileOut.close();
                workbook.close();
                JOptionPane.showMessageDialog(this, "The file was successfully saved!", "File saved", JOptionPane.PLAIN_MESSAGE);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Something went wrong", "Try again", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_exportBtnMousePressed

    /* 
     * Next method is responsible for saving internal table to the file when the corresponding button is pressed
     */
    
    private void menuSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSaveMousePressed
        saveTable();
        JOptionPane.showMessageDialog(this, "Data was successfully saved!", "Success", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuSaveMousePressed

    private void historyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyBtnMouseEntered
        historyBtn.setOpaque(true);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_historyBtnMouseEntered

    private void historyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyBtnMouseExited
        historyBtn.setOpaque(false);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_historyBtnMouseExited

    /* 
     * Next method is responsible for creating new HistoryFrame
     */
    
    private void historyBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyBtnMousePressed
        HistoryFrame frame = new HistoryFrame();
        frame.getLogin(this.login);
        frame.start();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_historyBtnMousePressed

    private void mailingBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailingBtnMouseEntered
        mailingBtn.setOpaque(true);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_mailingBtnMouseEntered

    private void mailingBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailingBtnMouseExited
        mailingBtn.setOpaque(false);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_mailingBtnMouseExited

    /* 
     * Next method is responsible for creating new MailingFrame
     */
    
    private void mailingBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailingBtnMousePressed
        MailingFrame frame = new MailingFrame();
        frame.getLogin(this.login);
        frame.start();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mailingBtnMousePressed

    /* 
     * Next method is responsible for sorting rows by pressing the corresponding button
     */
    
    private void menuSortMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSortMousePressed
        sortRows();
    }//GEN-LAST:event_menuSortMousePressed

    /* 
     * Next method is responsible for enabling or disabling autosave
     */
    
    private void autosaveBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autosaveBtnMousePressed
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_settings.txt"));
            if (autosaveBtn.getText().equals("Autosave: off")) {
                autosaveBtn.setText("Autosave: on");
                writer.write("On");
                autosaveBtn.repaint();
                autosaveBtn.revalidate();
            } else {
                autosaveBtn.setText("Autosave: off");
                writer.write("Off");
                autosaveBtn.repaint();
                autosaveBtn.revalidate();
            }
        } catch (IOException ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_autosaveBtnMousePressed

    /* 
     * Next method is responsible for saving table automaticaly if something it it was changed
     */
    
    private void dataTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dataTablePropertyChange
        try {
            Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_settings.txt"));
            String str = scan.nextLine();
            if (str.equals("On") && dataTable.isEnabled()==true) {
                saveTable();
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dataTablePropertyChange

    private void autosaveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autosaveBtnMouseEntered
        autosaveBtn.setOpaque(true);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_autosaveBtnMouseEntered

    private void autosaveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autosaveBtnMouseExited
        autosaveBtn.setOpaque(false);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_autosaveBtnMouseExited
    
    /* 
     * Next method runs when TableFrame class is created
     */

    public void start() {
        loadTable();
        createSorts();
        loadAutosave();
        menuNoSortOption.setActionCommand("No sort");
    }

    /* 
     * Next method starts with class creation
     */

    private void sortRows() {
        try {
            Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
            String str = scan.nextLine();
            String[] strArray = str.split("//&@");
            String selectedMenuString = buttonGroup.getSelection().getActionCommand();
            if (selectedMenuString.equals("No sort")) {
                loadTable();
                dataTable.setEnabled(true);
            } else {
                int columnNumber = 0;
                for (int i = 0; i < strArray.length; i++) { // Finds number of the column with sorted data
                    if (strArray[i].equals(selectedMenuString)) {
                        columnNumber = i;
                    }
                }
                ArrayList list = new ArrayList();
                while (scan.hasNextLine()) {
                    list.add(scan.nextLine());
                }
                String[] firstRow, secondRow, firstDate, secondDate;
                for (int i = 0; i < list.size() - 1; i++) {
                    for (int j = 0; j < list.size() - i - 1; j++) {
                        firstRow = list.get(j).toString().split("//&@");
                        secondRow = list.get(j + 1).toString().split("//&@");
                        firstDate = firstRow[columnNumber].split("\\.");
                        secondDate = secondRow[columnNumber].split("\\.");
                        if (firstDate.length != 3 || secondDate.length != 3) {
                            if (firstDate.length != 3) {
                                Collections.swap(list, j, j + 1);
                            }
                        } else {
                            /* Date sorting algorythm */
                            if (Integer.valueOf(firstDate[2]) > Integer.valueOf(secondDate[2])) {
                                Collections.swap(list, j, j + 1);
                            } else if (Integer.valueOf(firstDate[2]).equals(Integer.valueOf(secondDate[2]))) {
                                if (Integer.valueOf(firstDate[1]) > Integer.valueOf(secondDate[1])) {
                                    Collections.swap(list, j, j + 1);
                                } else if (Integer.valueOf(firstDate[1]).equals(Integer.valueOf(secondDate[1]))) {
                                    if (Integer.valueOf(firstDate[0]) > Integer.valueOf(secondDate[0])) {
                                        Collections.swap(list, j, j + 1);
                                    }
                                }
                            }
                        }
                    }
                }
                String[][] data = new String[list.size()][strArray.length];
                for (int i = 0; i < list.size(); i++) {
                    firstRow = list.get(i).toString().split("//&@");
                    for (int j = 0; j < firstRow.length; j++) {
                        data[i][j] = firstRow[j];
                    }
                }
                DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
                model.setDataVector(data, strArray); // Fills the table with sorted data
                model.setColumnCount(strArray.length - 1);
                setColumnWidths();
                scan.close();
                dataTable.setEnabled(false);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /* 
     * Next method loads autosave label
     */

    private void loadAutosave() {
        try {
            Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_settings.txt"));
            String string = scan.nextLine();
            if (string.equals("Off")) {
                autosaveBtn.setText("Autosave: off");
            } else {
                autosaveBtn.setText("Autosave: on");
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* 
     * Next method saves data from table to file
     */

    private void saveTable() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
            for (int i = 0; i < dataTable.getColumnCount(); i++) {
                writer.write(dataTable.getColumnName(i) + "//&@");
            }
            writer.write(".");
            writer.newLine();
            for (int i = 0; i < dataTable.getRowCount(); i++) {
                for (int j = 0; j < dataTable.getColumnCount(); j++) {
                    writer.write(dataTable.getValueAt(i, j) + "//&@");
                }
                writer.write(".");
                writer.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /* 
     * Next method creates sorts options in menuSortOptions
     */

    private void createSorts() {
        try {
            Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
            String temporaryString, name;
            String[] scanString, checkString;
            int count = 1;
            while (scan.hasNextLine()) {
                temporaryString = scan.nextLine();
                scanString = temporaryString.split("//&@");
                checkString = scanString[1].split(": ");
                if (checkString[0].equals("Repetition period")) {
                    /* If it is a vaccination */
                    count++;
                    name = "jRadioButtonMenuItem" + count;
                    javax.swing.JRadioButtonMenuItem menuItem = new JRadioButtonMenuItem();
                    buttonGroup.add(menuItem);
                    menuItem.setSelected(true);
                    menuItem.setText(scanString[0]);
                    menuSortOptions.add(menuItem);
                    menuItem.setActionCommand(scanString[0]);
                    menuItem.setName(name); // Adds menu item with the neme of vaccination
                }
            }
            buttonGroup.clearSelection();
            menuNoSortOption.setSelected(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* 
     * Next method loads data into an internal table from a file
     */

    private void loadTable() {
        try {
            String string;
            String[] words, headers = null;
            int rowCount = 0, columnCount = 0;
            String[][] data = null;
            Scanner rowScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
            while (rowScanner.hasNextLine()) { // Counts the number of lines and columns
                string = rowScanner.nextLine();
                if (rowCount == 0) {
                    words = string.split("//&@");
                    columnCount = words.length - 1;
                }
                rowCount++;
            }
            rowScanner.close();
            Scanner dataScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
            headers = new String[columnCount];
            data = new String[rowCount - 1][columnCount];
            int row = 0;
            while (dataScanner.hasNextLine()) { // Fills the array with data
                string = dataScanner.nextLine();
                if (row == 0) {
                    words = string.split("//&@");
                    for (int u = 0; u < words.length - 1; u++) {
                        headers[u] = words[u];
                    }
                } else {
                    words = string.split("//&@");
                    for (int i = 0; i < words.length - 1; i++) {
                        data[row - 1][i] = words[i];
                    }
                }
                row++;
            }
            dataScanner.close();
            DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
            model.setDataVector(data, headers); // Fills the table with data
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        dataTable.getTableHeader().setFont(new Font("Times New Roman", 0, 13));
        dataTable.getTableHeader().setOpaque(false);
        dataTable.getTableHeader().setBackground(new java.awt.Color(255, 214, 177));
        dataTable.getTableHeader().setForeground(new java.awt.Color(143, 61, 6));
        dataTable.setToolTipText(null);
        setColumnWidths();
    }

    /* 
     * Next method automatically sets column widths based on content
     */

    private void setColumnWidths() {
        for (int i = 0; i < dataTable.getColumnCount(); i++) {
            DefaultTableColumnModel colModel = (DefaultTableColumnModel) dataTable.getColumnModel();
            TableColumn col = colModel.getColumn(i);
            int width = 0;
            TableCellRenderer renderer = col.getHeaderRenderer();
            for (int r = 0; r < dataTable.getRowCount(); r++) {
                renderer = dataTable.getCellRenderer(r, i);
                Component comp = renderer.getTableCellRendererComponent(dataTable, dataTable.getValueAt(r, i),
                    false, false, r, i);
                width = Math.max(width, comp.getPreferredSize().width);
            }
            col.setPreferredWidth(width + 6);
            col.setMaxWidth(200);
            col.setMinWidth(30);
        }
    }

    /* 
     * Next method is needed in order to render the GUI correctly
     */

    private void repaintFrame() {
        tablePanel.setBounds(tablePanel.getX(), tablePanel.getY(), mainPanel.getWidth() - menuPanel.getWidth() - menuPanel.getX(), mainPanel.getHeight());
        menuPanel.setBounds(menuPanel.getX(), menuPanel.getY(), menuPanel.getWidth(), mainPanel.getHeight());
        mainPanel.invalidate();
        mainPanel.validate();
        mainPanel.repaint();
    }

    /* 
     * Next method sets login string
     */

    public void getLogin(String login) {
        this.login = login;
    }

    /* 
     * Next method automatically sends messages
     */

    private void sendNotifications() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
            try {
                if (isEnoughData() == true) {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_history.txt", true));
                    Scanner ifFileExistsScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_history.txt"));
                    if (ifFileExistsScanner.hasNext() == false) { // Check if file exists
                        writer.write("Message//&@You should set an emails, names and periods in mailing.");
                    }
                    writer.close();
                    ifFileExistsScanner.close();
                    Scanner vaccinationsScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
                    String temp;
                    String[] data, repetitionPeriodString, fileData, vaccDate;
                    int period, dateColumn = 0, check = 0, nameColumn = 0, emailColumn = 0;
                    String emails = "", names = "";
                    Scanner headersScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
                    while (headersScanner.hasNextLine()) {
                        data = headersScanner.nextLine().split("//&@");
                        if (data[1].equals("Emails")) { // Write configuration to variables
                            emails = data[0];
                        } else if (data[1].equals("Names")) {
                            names = data[0];
                        }
                    }
                    while (vaccinationsScanner.hasNextLine()) {
                        data = vaccinationsScanner.nextLine().split("//&@");
                        repetitionPeriodString = data[1].split(": ");
                        if (repetitionPeriodString[0].equals("Repetition period")) {
                            period = Integer.valueOf(repetitionPeriodString[1]);
                            Scanner fileScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_data.txt"));
                            fileData = fileScanner.nextLine().split("//&@");
                            for (int i = 0; i < fileData.length - 1; i++) {
                                if (fileData[i].equals(data[0])) { // Find numbers of columns with the required data
                                    dateColumn = i;
                                } else if (fileData[i].equals(names)) {
                                    nameColumn = i;
                                } else if (fileData[i].equals(emails)) {
                                    emailColumn = i;
                                }
                            }
                            Date date = new Date();
                            Calendar cal = Calendar.getInstance();
                            cal.setTime(date);
                            while (fileScanner.hasNextLine()) {
                                fileData = fileScanner.nextLine().split("//&@");
                                vaccDate = fileData[dateColumn].split("\\.");
                                if (vaccDate.length == 3) {
                                    if (cal.get(Calendar.DATE) - Integer.valueOf(vaccDate[0]) < 0) {
                                        check = 1;
                                    }
                                    if ((cal.get(Calendar.YEAR) - Integer.valueOf(vaccDate[2])) * 12 - Integer.valueOf(vaccDate[1]) + cal.get(Calendar.MONTH) + 1 - check >= period) {
                                        /* If more than the specified time has passed */
                                        String[] full_name;
                                        full_name = fileData[nameColumn].split(" ");
                                        Scanner nameScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_history.txt"));
                                        String[] nameStrings;
                                        String recentDate = "";
                                        aa:
                                            while (nameScanner.hasNextLine()) { // Look for the recent date the message was sent in history if there is one
                                                temp = nameScanner.nextLine();
                                                nameStrings = temp.split("//&@");
                                                if (nameStrings[0].equals("Data")) {
                                                    if (nameStrings[3].equals(data[0])) {
                                                        if (nameStrings[1].equals(fileData[nameColumn])) {
                                                            recentDate = nameStrings[2];
                                                            break aa;
                                                        }
                                                    }
                                                }
                                            }
                                        nameScanner.close();
                                        if (recentDate == "") {
                                            /* If there is no such date */
                                            try {
                                                sendEmail(fileData[emailColumn], full_name[1], data[0]);
                                                writeInHistory("Data//&@" + fileData[nameColumn] + "//&@" + cal.get(Calendar.DATE) + "." + cal.get(Calendar.MONTH) + 1 + "." + cal.get(Calendar.YEAR) + "//&@" + data[0]);
                                            } catch (IOException ex) {
                                                Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
                                            } catch (MessagingException ex) {
                                                Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        } else {
                                            /* If there is such a date */
                                            Scanner scan_mail = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_mail.txt"));
                                            scan_mail.nextLine();
                                            String emailRepetition = scan_mail.nextLine();
                                            scan_mail.close();
                                            String[] recentDateStringArray = recentDate.split("\\.");
                                            int[] recentDateIntegerArray = new int[3];
                                            for (int i = 0; i < 3; i++) {
                                                recentDateIntegerArray[i] = Integer.valueOf(recentDateStringArray[i]);
                                            }
                                            if ((cal.get(Calendar.YEAR) - recentDateIntegerArray[2]) * 12 - recentDateIntegerArray[1] + cal.get(Calendar.MONTH) + 1 - recentDateIntegerArray[0] + cal.get(Calendar.DATE) >= Integer.valueOf(emailRepetition) && emailRepetition.equals("-") == false) {
                                                /* If more than the specified time has passed */
                                                try {
                                                    sendEmail(fileData[emailColumn], full_name[1], data[0]);
                                                    writeInHistory("Data//&@" + fileData[nameColumn] + "//&@" + cal.get(Calendar.DATE) + "." + cal.get(Calendar.MONTH) + 1 + "." + cal.get(Calendar.YEAR) + "//&@" + data[0]);
                                                } catch (IOException ex) {
                                                    Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
                                                } catch (MessagingException ex) {
                                                    Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            }
                                        }
                                    }
                                    check = 0;
                                }
                            }
                            fileScanner.close();
                        }
                    }
                    vaccinationsScanner.close();
                    headersScanner.close();
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Please, set names, emails, login, password and email notification period in mailing window.", "Unexpected error", JOptionPane.WARNING_MESSAGE);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        executor.scheduleWithFixedDelay(task, 0, 15, TimeUnit.MINUTES);
    }

    /* 
     * Next method checks if everything is present for sending messages
     */

    private boolean isEnoughData() throws FileNotFoundException {
        boolean isEnough = true;
        Scanner mailScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_mail.txt"));
        if (mailScanner.hasNextLine()) {
            String[] str;
            str = mailScanner.nextLine().split("//&@");
            if (str.length != 2) {
                /* If there is lack of email login or password */
                isEnough = false;
            } else {
                if (str[0].equals("") || str[1].equals("")) {
                    /* If email login or password is not entered */
                    isEnough = false;
                }
            }
            if (mailScanner.hasNextLine()) {
                String temporaryString = mailScanner.nextLine();
                if (temporaryString.equals("")) {
                    /* If no message repetition period is entered */
                    isEnough = false;
                }
            } else {
                isEnough = false;
            }
        } else {
            isEnough = false;
        }
        mailScanner.close();
        String[] stringArray;
        String emails = "", names = "";
        Scanner headersScanner = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_headers.txt"));
        while (headersScanner.hasNextLine()) {
            stringArray = headersScanner.nextLine().split("//&@");
            if (stringArray[1].equals("Emails")) {
                emails = stringArray[0];
            } else if (stringArray[1].equals("Names")) {
                names = stringArray[0];
            }
        }
        if (names == "" || emails == "") {
            /* If columns containing names and emails are not set */
            isEnough = false;
        }
        headersScanner.close();
        return isEnough;
    }

    /* 
     * Next method sends messages
     */
    private void sendEmail(String to, String name, String procedure) throws FileNotFoundException, IOException, MessagingException {
        Properties props = new Properties();
        Scanner scan_mail = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_mail.txt"));
        String[] mail_dat = scan_mail.nextLine().split("//&@");
        FileOutputStream out = new FileOutputStream(System.getProperty("user.dir") + "/src/vacc_app/" + "mail.properties");
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.auth", "true");
        props.put("mail.smtps.host", "smtp.gmail.com");
        props.put("mail.smtps.user", "email");
        props.setProperty("mail.smtps.user", mail_dat[0]);
        props.store(out, null);
        out.close();
        final Properties properties = new Properties();
        properties.load(TableFrame.class.getResourceAsStream("mail.properties"));
        Session mailSession = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(mailSession);
        message.setFrom(mail_dat[0]);
        message.addRecipients(Message.RecipientType.TO, to);
        message.setSubject ("Medical examination");
        message.setText ("Dear" + name + ", the procedure" + procedure + "is about to expire, please go to the medical office.");Transport tr = mailSession.getTransport();
        tr.connect(null, mail_dat[1]);
        tr.sendMessage (message, message. getAllRecipients()); 
        tr.close();
    }

    /* 
     * Next method writes the history of sent messages to a file
     */
//НЕ ЗАБЫТЬ ОТКОММЕНТИРОВАТЬ
    private void writeInHistory(String str) throws IOException {
        try {
            Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "/src/Data/" + login + "_history.txt"));
            ArrayList < String > list = new ArrayList < > ();
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
            list.add(0, str);
            scan.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/Data/" + login + "_history.txt"));
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
                writer.newLine();
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TableFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autosaveBtn;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel exportBtn;
    private javax.swing.JLabel historyBtn;
    private javax.swing.JLabel importBtn;
    private javax.swing.JLabel mailingBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButtonMenuItem menuNoSortOption;
    private keeptoo.KGradientPanel menuPanel;
    private javax.swing.JMenu menuSave;
    private javax.swing.JMenu menuSort;
    private javax.swing.JMenu menuSortOptions;
    private javax.swing.JLabel openMenuBtn;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
