/*
 * Główne okno
 */
package classes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tablemodels.*;

/**
 *
 * @author Dominik
 */
public class GUI extends javax.swing.JFrame {

    Function f;
    Employee user;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        f = new Function();
        //ukrycie wszystkich paneli
        jPanelMailbox.setVisible(false);
        jButtonShowEmail.setVisible(false);
        jPanelWriteMail.setVisible(false);
        jPanelLogin.setVisible(false);//odznaczyć przy logowaniu ręcznym
        jPanelRepairForm.setVisible(false);
        
        
        f.fillComboboxWithEmployees(jComboBoxLoginEmployees);
        user = new Employee(1,"Andrzej","Kowalski","a.kowal@wp.pl","OBXY2JIQxC2AJ/xO7bRukw==","Admin");
         if(f.thereIsNewMail(user)){
            jMenuEmails.setForeground(Color.red);
            //JOptionPane.showMessageDialog(null, "Jest mail");
        }
        else{
            jMenuEmails.setForeground(Color.BLACK);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanelSideButtons = new javax.swing.JPanel();
        jButtonShowEmail = new javax.swing.JButton();
        jButtonRepair = new javax.swing.JButton();
        jPanelMailbox = new javax.swing.JPanel();
        jScrollPaneForMailbox = new javax.swing.JScrollPane();
        jTableMailbox = new javax.swing.JTable();
        jPanelWriteMail = new javax.swing.JPanel();
        jComboBoxEmployeeList = new javax.swing.JComboBox();
        jScrollPaneWriteMail = new javax.swing.JScrollPane();
        jTextAreaWriteMail = new javax.swing.JTextArea();
        jButtonMailSend = new javax.swing.JButton();
        jPanelLogin = new javax.swing.JPanel();
        jComboBoxLoginEmployees = new javax.swing.JComboBox();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jPanelRepairForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldClientsName = new javax.swing.JTextField();
        jTextFieldClientsFullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRepairInfo = new javax.swing.JTextArea();
        jButtonRepairInfo = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuEmails = new javax.swing.JMenu();
        jMenuItemWriteEmail = new javax.swing.JMenuItem();
        jMenuItemMailbox = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanelSideButtons.setBackground(new java.awt.Color(204, 255, 255));

        jButtonShowEmail.setText("Wyświetl ");
        jButtonShowEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowEmailActionPerformed(evt);
            }
        });

        jButtonRepair.setText("Naprawa");
        jButtonRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSideButtonsLayout = new javax.swing.GroupLayout(jPanelSideButtons);
        jPanelSideButtons.setLayout(jPanelSideButtonsLayout);
        jPanelSideButtonsLayout.setHorizontalGroup(
            jPanelSideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonShowEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRepair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanelSideButtonsLayout.setVerticalGroup(
            jPanelSideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonShowEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRepair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableMailbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneForMailbox.setViewportView(jTableMailbox);

        javax.swing.GroupLayout jPanelMailboxLayout = new javax.swing.GroupLayout(jPanelMailbox);
        jPanelMailbox.setLayout(jPanelMailboxLayout);
        jPanelMailboxLayout.setHorizontalGroup(
            jPanelMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMailboxLayout.createSequentialGroup()
                .addComponent(jScrollPaneForMailbox, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addGap(116, 116, 116))
        );
        jPanelMailboxLayout.setVerticalGroup(
            jPanelMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneForMailbox, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        jPanelWriteMail.setPreferredSize(new java.awt.Dimension(659, 579));

        jComboBoxEmployeeList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEmployeeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmployeeListActionPerformed(evt);
            }
        });

        jTextAreaWriteMail.setColumns(20);
        jTextAreaWriteMail.setRows(5);
        jScrollPaneWriteMail.setViewportView(jTextAreaWriteMail);

        jButtonMailSend.setText("Wyślij");
        jButtonMailSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMailSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelWriteMailLayout = new javax.swing.GroupLayout(jPanelWriteMail);
        jPanelWriteMail.setLayout(jPanelWriteMailLayout);
        jPanelWriteMailLayout.setHorizontalGroup(
            jPanelWriteMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWriteMailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWriteMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEmployeeList, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMailSend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneWriteMail, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelWriteMailLayout.setVerticalGroup(
            jPanelWriteMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWriteMailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWriteMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneWriteMail, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGroup(jPanelWriteMailLayout.createSequentialGroup()
                        .addComponent(jComboBoxEmployeeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMailSend)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jComboBoxLoginEmployees.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonLogin.setText("Zaloguj");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldPassword)
                            .addComponent(jComboBoxLoginEmployees, 0, 210, Short.MAX_VALUE)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jButtonLogin)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jComboBoxLoginEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLogin)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        jLabel1.setText("Imie klienta: ");

        jLabel2.setText("Nazwisko klienta: ");

        jTextFieldClientsName.setText("jTextField1");

        jTextFieldClientsFullName.setText("jTextField1");

        jLabel3.setText("Opis (opcjonalnie):");

        jTextAreaRepairInfo.setColumns(20);
        jTextAreaRepairInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRepairInfo);

        jButtonRepairInfo.setText("Wyślij informację");
        jButtonRepairInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepairInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRepairFormLayout = new javax.swing.GroupLayout(jPanelRepairForm);
        jPanelRepairForm.setLayout(jPanelRepairFormLayout);
        jPanelRepairFormLayout.setHorizontalGroup(
            jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRepairFormLayout.createSequentialGroup()
                .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRepairFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldClientsName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(jTextFieldClientsFullName))))
                    .addGroup(jPanelRepairFormLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButtonRepairInfo)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanelRepairFormLayout.setVerticalGroup(
            jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRepairFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldClientsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldClientsFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButtonRepairInfo)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        jMenuEmails.setText("Wiadomości");

        jMenuItemWriteEmail.setText("Napisz");
        jMenuItemWriteEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemWriteEmailActionPerformed(evt);
            }
        });
        jMenuEmails.add(jMenuItemWriteEmail);

        jMenuItemMailbox.setText("Skrzynka Odbiorcza");
        jMenuItemMailbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMailboxActionPerformed(evt);
            }
        });
        jMenuEmails.add(jMenuItemMailbox);

        jMenuBar.add(jMenuEmails);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSideButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMailbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 141, Short.MAX_VALUE)
                    .addComponent(jPanelWriteMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 141, Short.MAX_VALUE)
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 141, Short.MAX_VALUE)
                    .addComponent(jPanelRepairForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSideButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMailbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelWriteMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelRepairForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMailboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMailboxActionPerformed
        //Otwieranie skrzynki z wiadomościami
        jPanelMailbox.setVisible(true);
        if(jPanelWriteMail.isVisible()) 
            jPanelWriteMail.setVisible(false);
        jButtonShowEmail.setVisible(true);
        
        f.fillTableWithEmailsForUser(jTableMailbox,user);
    }//GEN-LAST:event_jMenuItemMailboxActionPerformed

    private void jButtonShowEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowEmailActionPerformed
        //Wyświetlanie meila
        Email email = new Email();
        int row = jTableMailbox.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Email");				
                    return;
		}
        
        email = (Email) jTableMailbox.getValueAt(row, EmailTableModel.OBJECT_COL);
        
        JOptionPane.showMessageDialog(null, email.getText());//tu jakoś poprawić
        f.setEmailChecked(email);
        f.fillTableWithEmailsForUser(jTableMailbox,user);
        if(f.thereIsNewMail(user)){
            jMenuEmails.setForeground(Color.red);
            //JOptionPane.showMessageDialog(null, "Jest mail");
        }
        else{
            jMenuEmails.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jButtonShowEmailActionPerformed

    private void jMenuItemWriteEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemWriteEmailActionPerformed
        // Pisanie meila
        jPanelWriteMail.setVisible(true);
        if(jPanelMailbox.isVisible()) 
            jPanelMailbox.setVisible(false);
        
        f.fillComboboxWithEmployeesWithoutUser(jComboBoxEmployeeList,user);
        
    }//GEN-LAST:event_jMenuItemWriteEmailActionPerformed

    private void jButtonMailSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMailSendActionPerformed
        Employee employee = (Employee) jComboBoxEmployeeList.getSelectedItem();
        int id_sender = user.getId();
        int id_receiver = employee.getId();
        String text = jTextAreaWriteMail.getText();
        
        Email email = new Email(id_sender, id_receiver, text,false);
        f.addEmail(email);
        
        JOptionPane.showMessageDialog(null, "Wysłano");
    }//GEN-LAST:event_jButtonMailSendActionPerformed

    private void jComboBoxEmployeeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmployeeListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEmployeeListActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // Logowanie 
        try{
        Employee e = (Employee) jComboBoxLoginEmployees.getSelectedItem();
        String password = jPasswordFieldPassword.getText();
        String encryptedpassword = f.encrypt(password);
        if(!encryptedpassword.equals(e.getPassword()))
            throw new Exception();
        
        user = e;
        jPanelLogin.setVisible(false);
        
        if(f.thereIsNewMail(user)){
            jMenuEmails.setBackground(Color.red);
        }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Złe hasło");
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepairActionPerformed
        // Przyjmowanie do naprawy
        jPanelRepairForm.setVisible(true);
        jTextFieldClientsName.setText("");
        jTextFieldClientsFullName.setText("");
        
    }//GEN-LAST:event_jButtonRepairActionPerformed

    private void jButtonRepairInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepairInfoActionPerformed
        // Wysyłanie formularza do naprawy
        try{
            String client_name = jTextFieldClientsName.getText();
            String client_full_name = jTextFieldClientsFullName.getText();
            String desc = jTextAreaRepairInfo.getText();
            
            Repair temp = new Repair(user.getId(),client_name,client_full_name,desc,false);
            f.addRepair(temp);
            JOptionPane.showMessageDialog(null, "Dodano");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error adding Repair Form");
        }
    }//GEN-LAST:event_jButtonRepairInfoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                Function f = new Function();
                
                /*
                 List<Order> list = new ArrayList<Order>();
                 list = f.getAllOrders();
                 JOptionPane.showMessageDialog(null, list);
                 */

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonMailSend;
    private javax.swing.JButton jButtonRepair;
    private javax.swing.JButton jButtonRepairInfo;
    private javax.swing.JButton jButtonShowEmail;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox jComboBoxEmployeeList;
    private javax.swing.JComboBox jComboBoxLoginEmployees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEmails;
    private javax.swing.JMenuItem jMenuItemMailbox;
    private javax.swing.JMenuItem jMenuItemWriteEmail;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelMailbox;
    private javax.swing.JPanel jPanelRepairForm;
    private javax.swing.JPanel jPanelSideButtons;
    private javax.swing.JPanel jPanelWriteMail;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneForMailbox;
    private javax.swing.JScrollPane jScrollPaneWriteMail;
    private javax.swing.JTable jTableMailbox;
    private javax.swing.JTextArea jTextAreaRepairInfo;
    private javax.swing.JTextArea jTextAreaWriteMail;
    private javax.swing.JTextField jTextFieldClientsFullName;
    private javax.swing.JTextField jTextFieldClientsName;
    // End of variables declaration//GEN-END:variables
}
