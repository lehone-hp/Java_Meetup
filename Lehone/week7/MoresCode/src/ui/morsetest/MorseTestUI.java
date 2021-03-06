/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.morsetest;
import java.awt.print.PrinterException;
import java.io.File;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import mores.*;

/**
 *
 * @author lehone_hope
 */
public class MorseTestUI extends javax.swing.JFrame {

    //create a morse object
    private Morse morse = new Morse();
    private Writer writer;
    private Reader reader;
    
    
    /**
     * Creates new form MorseTestUI
     */
    public MorseTestUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        engPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        englishText = new javax.swing.JTextArea();
        engFilePath = new javax.swing.JTextField();
        browseEngFile = new javax.swing.JButton();
        printEngText = new javax.swing.JButton();
        buttons = new javax.swing.JPanel();
        toMorse = new javax.swing.JButton();
        toEnglish = new javax.swing.JButton();
        clearScreen = new javax.swing.JButton();
        morPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        morseText = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        morFilePath = new javax.swing.JTextField();
        printMorText = new javax.swing.JButton();
        exitCmd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenuOption = new javax.swing.JMenu();
        openFileMI = new javax.swing.JMenuItem();
        clearMI = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        editMenuOption = new javax.swing.JMenu();
        aboutMenuOption = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morse/English Converter");

        engPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "English", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("DejaVu Sans", 0, 14))); // NOI18N

        englishText.setColumns(20);
        englishText.setRows(5);
        jScrollPane1.setViewportView(englishText);

        browseEngFile.setText("Browse...");
        browseEngFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseEngFileActionPerformed(evt);
            }
        });

        printEngText.setText("print");
        printEngText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printEngTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout engPanelLayout = new javax.swing.GroupLayout(engPanel);
        engPanel.setLayout(engPanelLayout);
        engPanelLayout.setHorizontalGroup(
            engPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, engPanelLayout.createSequentialGroup()
                .addComponent(engFilePath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browseEngFile))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, engPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(printEngText))
        );

        engPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {browseEngFile, printEngText});

        engPanelLayout.setVerticalGroup(
            engPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(engPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseEngFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printEngText)
                .addContainerGap())
        );

        buttons.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buttons", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("DejaVu Sans", 0, 14))); // NOI18N

        toMorse.setText("To Morse >>");
        toMorse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMorseActionPerformed(evt);
            }
        });

        toEnglish.setText("<< To English");
        toEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toEnglishActionPerformed(evt);
            }
        });

        clearScreen.setText("Clear");
        clearScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearScreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toMorse, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toEnglish, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearScreen, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        buttonsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearScreen, toEnglish, toMorse});

        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toMorse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toEnglish)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearScreen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        morPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Morse", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("DejaVu Sans", 0, 14))); // NOI18N

        morseText.setColumns(20);
        morseText.setRows(5);
        jScrollPane2.setViewportView(morseText);

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        printMorText.setText("print");
        printMorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printMorTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout morPanelLayout = new javax.swing.GroupLayout(morPanel);
        morPanel.setLayout(morPanelLayout);
        morPanelLayout.setHorizontalGroup(
            morPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, morPanelLayout.createSequentialGroup()
                .addComponent(morFilePath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, morPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(printMorText))
        );

        morPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, printMorText});

        morPanelLayout.setVerticalGroup(
            morPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(morPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(morPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(morFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printMorText))
        );

        exitCmd.setText("Exit");
        exitCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitCmdActionPerformed(evt);
            }
        });

        FileMenuOption.setText("File");

        openFileMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        openFileMI.setText("Open File");
        openFileMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileMIActionPerformed(evt);
            }
        });
        FileMenuOption.add(openFileMI);

        clearMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        clearMI.setText("Clear");
        clearMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMIActionPerformed(evt);
            }
        });
        FileMenuOption.add(clearMI);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        FileMenuOption.add(jMenuItem3);

        jMenuBar1.add(FileMenuOption);

        editMenuOption.setText("Edit");
        jMenuBar1.add(editMenuOption);

        aboutMenuOption.setText("About");
        aboutMenuOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuOptionActionPerformed(evt);
            }
        });

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        aboutMenuOption.add(jMenuItem1);

        jMenuBar1.add(aboutMenuOption);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(engPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(morPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(morPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(engPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitCmdActionPerformed
        //close the JFrame
        System.exit(0);
    }//GEN-LAST:event_exitCmdActionPerformed

    private void clearScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearScreenActionPerformed
        //clear the english and morse text are
        //also clear the english file path and morse file path text fields 
        englishText.setText("");
        morseText.setText("");
        engFilePath.setText("");
        morFilePath.setText("");
    }//GEN-LAST:event_clearScreenActionPerformed

    private void browseEngFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseEngFileActionPerformed
        //first clear all text boxes
        clearScreenActionPerformed(null);
        
        //open a file from file system
        JFileChooser engFile = new JFileChooser();
        engFile.showOpenDialog(this);
        
        //get selected files name and assign to engFilePath text field
        File selectedFile = engFile.getSelectedFile();
        
        //try to select a file
        try{
            engFilePath.setText(selectedFile.getAbsolutePath());

            //read all the text from the selected file and asign to englishText
            reader = new Reader(engFilePath.getText());
            reader.openFile();
            englishText.setText(reader.read());
            reader.closeFile();
        
        }catch (NullPointerException e){    //if no file's selected
            JOptionPane.showMessageDialog(this, "No File selected", 
                        "No File", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_browseEngFileActionPerformed

    private void toMorseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMorseActionPerformed
        //convert the english text to morse and display in the morse text area
        
        //if no text has been entered in the english text area
        if (englishText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "English Text Area is empty", 
                    "No Input", JOptionPane.ERROR_MESSAGE);
        else{
            //if a file was specified
            if (!engFilePath.getText().equals("")){
                //convert the text and write it to another file
                morseText.setText(morse.getMorseEquiv(englishText.getText()));
                
                //add "-MorseEquiv" at the end of the english file's path, 
                //causing the  new file to be created in the same directory
                writer = new Writer(engFilePath.getText()+"-MorseEquiv");
                writer.openFile();
                writer.write(morseText.getText());
                writer.closeFile();
                
            }else{  //if text was entered directly
                //display on the morse text area
                morseText.setText(morse.getMorseEquiv(englishText.getText()));
            }//end if...else...
        }//end parent if...else...
        
    }//GEN-LAST:event_toMorseActionPerformed

    private void toEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toEnglishActionPerformed
       //convert the morse text to english and display in the morse text area
        
        //if no text has been entered in the morse text area
        if (morseText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Morse Text Area is empty", 
                    "No Input", JOptionPane.ERROR_MESSAGE);
        else{
            //if a file was specified
            if (!morFilePath.getText().equals("")){
                //convert the text and write it to another file
                englishText.setText(morse.getEnglishEquiv(morseText.getText()));
                
                //add "-EnglishEquiv" at the end of the Morse file's path, 
                //causing the new file to be created in the same directory
                writer = new Writer(engFilePath.getText()+"-EndlishEquiv");
                writer.openFile();
                writer.write(englishText.getText());
                writer.closeFile();
                
            }else{  //if text was entered directly
                //display on the morse text area
                englishText.setText(morse.getEnglishEquiv(morseText.getText()));
            }//end if...else...
        }//end parent if...else...
        
    }//GEN-LAST:event_toEnglishActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //first clear all text boxes
        clearScreenActionPerformed(null);
        
        //open a file from file system
        JFileChooser morFile = new JFileChooser();
        morFile.showOpenDialog(this);
        
        //get selected files name and assign to morFilePath text field
        File selectedFile = morFile.getSelectedFile();
        
        //try to select a file 
        try{
            morFilePath.setText(selectedFile.getAbsolutePath());
        
            //read all the text from the selected file and asign to morseText
            reader = new Reader(morFilePath.getText());
            reader.openFile();
            morseText.setText(reader.read());
            reader.closeFile();
        }catch (NullPointerException e){    //if File chooser was closed without selection
            JOptionPane.showMessageDialog(this, "No file was selected", 
                    "No selection", JOptionPane.ERROR_MESSAGE);
        }//end try...catch...
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void printEngTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printEngTextActionPerformed
        MessageFormat header = new MessageFormat("Print English Text");
        MessageFormat footer = new MessageFormat("Page{0, number, integer}");
        
        
        try{
            boolean complete = englishText.print();
            
            if (complete)
                JOptionPane.showMessageDialog(this, 
                        "Printing Complete", "Print", JOptionPane.INFORMATION_MESSAGE);   
        }catch (PrinterException e){
            JOptionPane.showMessageDialog(this, 
                    "Could not print document\n"+e.getMessage(), 
                    "Printing error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_printEngTextActionPerformed

    private void printMorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printMorTextActionPerformed
        MessageFormat header = new MessageFormat("Print Morse Text");
        MessageFormat footer = new MessageFormat("Page{0, number, integer}");
        
        
        try{
            boolean complete = morseText.print();
            
            if (complete)
                JOptionPane.showMessageDialog(this, 
                        "Printing Complete", "Print", JOptionPane.INFORMATION_MESSAGE);   
        }catch (PrinterException e){
            JOptionPane.showMessageDialog(this, 
                    "Could not print document\n"+e.getMessage(), 
                    "Printing error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_printMorTextActionPerformed

    private void openFileMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileMIActionPerformed
        browseEngFileActionPerformed(null);
    }//GEN-LAST:event_openFileMIActionPerformed

    private void clearMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMIActionPerformed
        clearScreenActionPerformed(null);
    }//GEN-LAST:event_clearMIActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        exitCmdActionPerformed(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void aboutMenuOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuOptionActionPerformed
        
    }//GEN-LAST:event_aboutMenuOptionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(this, "Morse/English convertor is an application "
                + "used\nto convert Phrases written in English to Morse and vice versa", 
                "About Morse/English Converter", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MorseTestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MorseTestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MorseTestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MorseTestUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MorseTestUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FileMenuOption;
    private javax.swing.JMenu aboutMenuOption;
    private javax.swing.JButton browseEngFile;
    private javax.swing.JPanel buttons;
    private javax.swing.JMenuItem clearMI;
    private javax.swing.JButton clearScreen;
    private javax.swing.JMenu editMenuOption;
    private javax.swing.JTextField engFilePath;
    private javax.swing.JPanel engPanel;
    private javax.swing.JTextArea englishText;
    private javax.swing.JButton exitCmd;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField morFilePath;
    private javax.swing.JPanel morPanel;
    private javax.swing.JTextArea morseText;
    private javax.swing.JMenuItem openFileMI;
    private javax.swing.JButton printEngText;
    private javax.swing.JButton printMorText;
    private javax.swing.JButton toEnglish;
    private javax.swing.JButton toMorse;
    // End of variables declaration//GEN-END:variables
}
