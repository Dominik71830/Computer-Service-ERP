/*
 * Główne okno
 */
package classes;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import tablemodels.*;

/**
 *
 * @author Dominik
 */
public class GUI extends javax.swing.JFrame {

    Function f;
    Employee user;
    List<Product> ordered_list;
    Double price= 0.0;
    List<Product> selling_list;
    List<Product> warehouse_list;

    private static final int CAT_GPU = 1;
    private static final int CAT_HDD = 2;
    private static final int CAT_RAM = 3;
    private static final int CAT_KEYBOARD = 5;
    private static final int CAT_POWER_SUPPLY = 6;
    private static final int CAT_COOLING = 7;
    private static final int CAT_CPU = 8;
    private static final int CAT_MB = 9;
    private static final int CAT_MONITOR = 10;
    private static final int CAT_MOUSE = 11;

    /**
     * Creates new form GUI
     */
    public GUI() {
        //this.getContentPane().setBackground(Color.getHSBColor(TOP_ALIGNMENT, TOP_ALIGNMENT, TOP_ALIGNMENT));
        initComponents();
        this.setLocationRelativeTo(null);
        f = new Function();
        //ukrycie wszystkich paneli
        jPanelMailbox.setVisible(false);
        jButtonShowEmail.setVisible(false);
        jPanelWriteMail.setVisible(false);
        jPanelLogin.setVisible(false);//odznaczyć przy logowaniu ręcznym
        jPanelRepairForm.setVisible(false);
        jPanelRepairsTable.setVisible(false);
        //jButtonRepairDesc.setVisible(false);
        //jButtonRepairCheck.setVisible(false);
        jPanelWarehouse.setVisible(false);
        jPanelFood.setVisible(false);
        jPanelPartsOrders.setVisible(false);
        jPanelAdvancedBrowser.setVisible(false);
        jPanelReceivingOrders.setVisible(false);
        jPanelLogs.setVisible(false);
        jPanelAddEmployees.setVisible(false);
        jPanelEditEmployee.setVisible(false);
        jPanelSellProducts.setVisible(false);
        jPanelAddProduct.setVisible(false);
        
        //ukrycie wszystkich przycisków. Będą włączane po zalogowaniu
        jButtonRepair.setVisible(false);
        jButtonShowRepairs.setVisible(false);
        jButtonFoodOrders.setVisible(false);
        jButtonShowWarehouse.setVisible(false);
        jButtonPartsOrders.setVisible(false);
        jButtonReceiveOrders.setVisible(false);
        jButtonAddEmployees.setVisible(false);
        jButtonSellProducts.setVisible(false);
        jButtonAddProduct.setVisible(false);
        
        
        f.fillComboboxWithEmployees(jComboBoxLoginEmployees);
        user = new Employee(1,"Andrzej","Kowalski","a.kowal@wp.pl","OBXY2JIQxC2AJ/xO7bRukw==","Administrator");
        //to usunąć żeby logowanie miało sens
        if(f.thereIsNewMail(user)){
            jMenuEmails.setForeground(Color.red);
            //JOptionPane.showMessageDialog(null, "Jest mail");
        }
        else{
            jMenuEmails.setForeground(Color.BLACK);
        }
        
        //tutaj powinny się włączać przyciski w zależności od praw dostępu
        //możę funkcja może po chamsku, nie wiadomo
        if(user.getPosition().equals("Administrator")){//jeśli Admin
        jButtonRepair.setVisible(true);
        jButtonShowRepairs.setVisible(true);
        jButtonFoodOrders.setVisible(true);
        jButtonShowWarehouse.setVisible(true);
        jButtonPartsOrders.setVisible(true);
        jButtonReceiveOrders.setVisible(true);
        jButtonAddEmployees.setVisible(true);
        jButtonSellProducts.setVisible(true);
        jButtonAddProduct.setVisible(true);
        }
        else if(user.getPosition().equals("Sprzedawca")){//Jeśli Sprzedawca
        jButtonRepair.setVisible(true);
        //jButtonShowRepairs.setVisible(true);
        jButtonFoodOrders.setVisible(true);
        //jButtonShowWarehouse.setVisible(true);
        //jButtonPartsOrders.setVisible(true);
        //jButtonReceiveOrders.setVisible(true);
        //jButtonAddEmployees.setVisible(true);
        jButtonSellProducts.setVisible(true);
        //jButtonAddProduct.setVisible(true);
        }
        else if(user.getPosition().equals("Magazynier")){//jeśli Magazynier
        //jButtonRepair.setVisible(true);
        //jButtonShowRepairs.setVisible(true);
        jButtonFoodOrders.setVisible(true);
        jButtonShowWarehouse.setVisible(true);
        jButtonPartsOrders.setVisible(true);
        jButtonReceiveOrders.setVisible(true);
        //jButtonAddEmployees.setVisible(true);
        //jButtonSellProducts.setVisible(true);
        jButtonAddProduct.setVisible(true);
        }
        else if(user.getPosition().equals("Technik")){//jeśli Techink
        //jButtonRepair.setVisible(true);
        jButtonShowRepairs.setVisible(true);
        jButtonFoodOrders.setVisible(true);
        //jButtonShowWarehouse.setVisible(true);
        //jButtonPartsOrders.setVisible(true);
        //jButtonReceiveOrders.setVisible(true);
        //jButtonAddEmployees.setVisible(true);
        //jButtonSellProducts.setVisible(true);
        //jButtonAddProduct.setVisible(true);
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

        buttonGroupPartsCategories = new javax.swing.ButtonGroup();
        jPanelSideButtons = new javax.swing.JPanel();
        jButtonRepair = new javax.swing.JButton();
        jButtonShowRepairs = new javax.swing.JButton();
        jButtonFoodOrders = new javax.swing.JButton();
        jButtonShowWarehouse = new javax.swing.JButton();
        jButtonPartsOrders = new javax.swing.JButton();
        jButtonReceiveOrders = new javax.swing.JButton();
        jButtonAddEmployees = new javax.swing.JButton();
        jButtonSellProducts = new javax.swing.JButton();
        jButtonAddProduct = new javax.swing.JButton();
        jPanelMailbox = new javax.swing.JPanel();
        jScrollPaneForMailbox = new javax.swing.JScrollPane();
        jTableMailbox = new javax.swing.JTable();
        jButtonDeleteEmail = new javax.swing.JButton();
        jButtonShowEmail = new javax.swing.JButton();
        jButtonMailAnswer = new javax.swing.JButton();
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
        jButtonRepairSend = new javax.swing.JButton();
        jPanelRepairsTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRepairs = new javax.swing.JTable();
        jButtonRepairDesc = new javax.swing.JButton();
        jButtonRepairCheck = new javax.swing.JButton();
        jButtonRepairTableBack = new javax.swing.JButton();
        jPanelWarehouse = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableWarehouse = new javax.swing.JTable();
        jTextFieldBrowser = new javax.swing.JTextField();
        jButtonBrowser = new javax.swing.JButton();
        jButtonAdvancedBrowser = new javax.swing.JButton();
        jPanelFood = new javax.swing.JPanel();
        jScrollPaneFoodToOrder = new javax.swing.JScrollPane();
        jTableFoodToOrder = new javax.swing.JTable();
        jScrollPaneFoodOrdered = new javax.swing.JScrollPane();
        jTableFoodOrdered = new javax.swing.JTable();
        jButtonAddFoodProduct = new javax.swing.JButton();
        jTextFieldFoodQuantity = new javax.swing.JTextField();
        jButtonOrderFood = new javax.swing.JButton();
        jButtonFoodQuantityDelete = new javax.swing.JButton();
        jTextFieldFoodPrice = new javax.swing.JTextField();
        jPanelPartsOrders = new javax.swing.JPanel();
        jRadioButtonGPU_1 = new javax.swing.JRadioButton();
        jRadioHDD_2 = new javax.swing.JRadioButton();
        jLabelCategories = new javax.swing.JLabel();
        jRadioButtonRAM_3 = new javax.swing.JRadioButton();
        jRadioButtonKeyboard_5 = new javax.swing.JRadioButton();
        jRadioButtonPowerSupply_6 = new javax.swing.JRadioButton();
        jRadioButtonCooling_7 = new javax.swing.JRadioButton();
        jRadioButtonCPU_8 = new javax.swing.JRadioButton();
        jRadioButtonMB_9 = new javax.swing.JRadioButton();
        jRadioButtonMonitor_10 = new javax.swing.JRadioButton();
        jRadioButtonMouse_11 = new javax.swing.JRadioButton();
        jComboBoxPartsOrders = new javax.swing.JComboBox();
        jScrollPanePartsOrders = new javax.swing.JScrollPane();
        jTablePartsOrders = new javax.swing.JTable();
        jButtonAddPartToOrder = new javax.swing.JButton();
        jTextFieldPartQuantity = new javax.swing.JTextField();
        jButtonPartOrder = new javax.swing.JButton();
        jTextFieldPartsPrice = new javax.swing.JTextField();
        jLabelImagePart = new javax.swing.JLabel();
        jPanelAdvancedBrowser = new javax.swing.JPanel();
        jScrollPaneAdvancedBrowser = new javax.swing.JScrollPane();
        jTableAdvancedBrowser = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAdvBroName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAdvBroPrice_1 = new javax.swing.JTextField();
        jTextFieldAdvBroPrice_2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldAdvBroQuantity_1 = new javax.swing.JTextField();
        jTextFieldAdvBroQuantity_2 = new javax.swing.JTextField();
        jCheckBoxGPU = new javax.swing.JCheckBox();
        jCheckBoxHDD = new javax.swing.JCheckBox();
        jCheckBoxRAM = new javax.swing.JCheckBox();
        jCheckBoxKeyboard = new javax.swing.JCheckBox();
        jCheckBoxPowerSupply = new javax.swing.JCheckBox();
        jCheckBoxCooling = new javax.swing.JCheckBox();
        jCheckBoxCPU = new javax.swing.JCheckBox();
        jCheckBoxMB = new javax.swing.JCheckBox();
        jCheckBoxMonitor = new javax.swing.JCheckBox();
        jCheckBoxMouse = new javax.swing.JCheckBox();
        jButtonAdvBroSearch = new javax.swing.JButton();
        jButtonAdvBrowserBack = new javax.swing.JButton();
        jPanelReceivingOrders = new javax.swing.JPanel();
        jScrollPaneOrders = new javax.swing.JScrollPane();
        jTableOrders = new javax.swing.JTable();
        jButtonReceiveOrder = new javax.swing.JButton();
        jButtonLogs = new javax.swing.JButton();
        jPanelLogs = new javax.swing.JPanel();
        jScrollPaneLogs = new javax.swing.JScrollPane();
        jTableLogs = new javax.swing.JTable();
        jButtonLogsBack = new javax.swing.JButton();
        jPanelAddEmployees = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldPassword2 = new javax.swing.JTextField();
        jTextFieldEmailAdress = new javax.swing.JTextField();
        jTextFieldPassword1 = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldFullName = new javax.swing.JTextField();
        jComboBoxPosition = new javax.swing.JComboBox();
        jButtonAddEmployee = new javax.swing.JButton();
        jPanelEditEmployee = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBoxEditPosition = new javax.swing.JComboBox();
        jTextFieldEditName = new javax.swing.JTextField();
        jTextFieldEditFullName = new javax.swing.JTextField();
        jTextFieldEditEmailAdress = new javax.swing.JTextField();
        jPasswordFieldEditPassword1 = new javax.swing.JPasswordField();
        jPasswordFieldEditPassword2 = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        jButtonEditOK = new javax.swing.JButton();
        jPanelSellProducts = new javax.swing.JPanel();
        jLabelSellProductsImage = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSellTableWarehouse = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableSellTableCustomer = new javax.swing.JTable();
        jTextFieldSellQuantity = new javax.swing.JTextField();
        jButtonSellAdd = new javax.swing.JButton();
        jButtonSellFinish = new javax.swing.JButton();
        jPanelAddProduct = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldProductRetailPrice = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldProductVAT = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBoxProductCategory = new javax.swing.JComboBox();
        jButtonAddNewProduct = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuEmails = new javax.swing.JMenu();
        jMenuItemWriteEmail = new javax.swing.JMenuItem();
        jMenuItemMailbox = new javax.swing.JMenuItem();
        jMenuItemEditEmployee = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(56, 255, 191));
        setResizable(false);

        jPanelSideButtons.setBackground(new java.awt.Color(204, 255, 255));

        jButtonRepair.setText("Naprawa");
        jButtonRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepairActionPerformed(evt);
            }
        });

        jButtonShowRepairs.setText("Zamówienia do naprawy");
        jButtonShowRepairs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowRepairsActionPerformed(evt);
            }
        });

        jButtonFoodOrders.setText("Zamawianie jedzenia");
        jButtonFoodOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodOrdersActionPerformed(evt);
            }
        });

        jButtonShowWarehouse.setText("Stan magazynowy");
        jButtonShowWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowWarehouseActionPerformed(evt);
            }
        });

        jButtonPartsOrders.setText("Zamawianie części");
        jButtonPartsOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPartsOrdersActionPerformed(evt);
            }
        });

        jButtonReceiveOrders.setText("Przyjmowanie zamówień");
        jButtonReceiveOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceiveOrdersActionPerformed(evt);
            }
        });

        jButtonAddEmployees.setText("Dodaj pracownika");
        jButtonAddEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEmployeesActionPerformed(evt);
            }
        });

        jButtonSellProducts.setText("Sprzedaż");
        jButtonSellProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSellProductsActionPerformed(evt);
            }
        });

        jButtonAddProduct.setText("Dodaj produkt");
        jButtonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSideButtonsLayout = new javax.swing.GroupLayout(jPanelSideButtons);
        jPanelSideButtons.setLayout(jPanelSideButtonsLayout);
        jPanelSideButtonsLayout.setHorizontalGroup(
            jPanelSideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonShowRepairs)
                    .addComponent(jButtonFoodOrders)
                    .addComponent(jButtonShowWarehouse)
                    .addComponent(jButtonPartsOrders)
                    .addComponent(jButtonReceiveOrders)
                    .addComponent(jButtonSellProducts)
                    .addComponent(jButtonAddProduct)
                    .addComponent(jButtonAddEmployees))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelSideButtonsLayout.setVerticalGroup(
            jPanelSideButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRepair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowRepairs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFoodOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonShowWarehouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPartsOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReceiveOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSellProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddProduct)
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

        jButtonDeleteEmail.setText("Usuń");
        jButtonDeleteEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteEmailActionPerformed(evt);
            }
        });

        jButtonShowEmail.setText("Wyświetl ");
        jButtonShowEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowEmailActionPerformed(evt);
            }
        });

        jButtonMailAnswer.setText("Odpisz");
        jButtonMailAnswer.setEnabled(false);
        jButtonMailAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMailAnswerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMailboxLayout = new javax.swing.GroupLayout(jPanelMailbox);
        jPanelMailbox.setLayout(jPanelMailboxLayout);
        jPanelMailboxLayout.setHorizontalGroup(
            jPanelMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneForMailbox)
            .addGroup(jPanelMailboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonShowEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMailAnswer)
                .addGap(416, 416, 416))
        );
        jPanelMailboxLayout.setVerticalGroup(
            jPanelMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMailboxLayout.createSequentialGroup()
                .addComponent(jScrollPaneForMailbox, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeleteEmail)
                    .addComponent(jButtonShowEmail)
                    .addComponent(jButtonMailAnswer))
                .addGap(0, 39, Short.MAX_VALUE))
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
                    .addComponent(jScrollPaneWriteMail, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
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
                .addContainerGap(329, Short.MAX_VALUE))
        );

        jLabel1.setText("Imie klienta: ");

        jLabel2.setText("Nazwisko klienta: ");

        jTextFieldClientsName.setText("jTextField1");

        jTextFieldClientsFullName.setText("jTextField1");

        jLabel3.setText("Opis (opcjonalnie):");

        jTextAreaRepairInfo.setColumns(20);
        jTextAreaRepairInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRepairInfo);

        jButtonRepairSend.setText("Wyślij informację");
        jButtonRepairSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepairSendActionPerformed(evt);
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
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRepairFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldClientsName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addComponent(jTextFieldClientsFullName))))
                    .addGroup(jPanelRepairFormLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButtonRepairSend)))
                .addContainerGap(285, Short.MAX_VALUE))
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
                .addComponent(jButtonRepairSend)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jTableRepairs.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableRepairs);

        jButtonRepairDesc.setText("Pokaż opis");
        jButtonRepairDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepairDescActionPerformed(evt);
            }
        });

        jButtonRepairCheck.setText("Zatwierdź naprawę");
        jButtonRepairCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepairCheckActionPerformed(evt);
            }
        });

        jButtonRepairTableBack.setText("Powrót");
        jButtonRepairTableBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepairTableBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRepairsTableLayout = new javax.swing.GroupLayout(jPanelRepairsTable);
        jPanelRepairsTable.setLayout(jPanelRepairsTableLayout);
        jPanelRepairsTableLayout.setHorizontalGroup(
            jPanelRepairsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRepairsTableLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jButtonRepairDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRepairCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRepairTableBack)
                .addGap(0, 142, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelRepairsTableLayout.setVerticalGroup(
            jPanelRepairsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRepairsTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRepairsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRepairDesc)
                    .addGroup(jPanelRepairsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonRepairCheck)
                        .addComponent(jButtonRepairTableBack)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTableWarehouse.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableWarehouse);

        jTextFieldBrowser.setText("jTextField1");

        jButtonBrowser.setText("Wyszukaj");
        jButtonBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowserActionPerformed(evt);
            }
        });

        jButtonAdvancedBrowser.setText("Zaawansowane");
        jButtonAdvancedBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdvancedBrowserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelWarehouseLayout = new javax.swing.GroupLayout(jPanelWarehouse);
        jPanelWarehouse.setLayout(jPanelWarehouseLayout);
        jPanelWarehouseLayout.setHorizontalGroup(
            jPanelWarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(jPanelWarehouseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdvancedBrowser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelWarehouseLayout.setVerticalGroup(
            jPanelWarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWarehouseLayout.createSequentialGroup()
                .addGroup(jPanelWarehouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBrowser)
                    .addComponent(jButtonAdvancedBrowser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTableFoodToOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneFoodToOrder.setViewportView(jTableFoodToOrder);

        jTableFoodOrdered.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneFoodOrdered.setViewportView(jTableFoodOrdered);

        jButtonAddFoodProduct.setText("Dodaj");
        jButtonAddFoodProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFoodProductActionPerformed(evt);
            }
        });

        jTextFieldFoodQuantity.setText("jTextField1");

        jButtonOrderFood.setText("Zamów");
        jButtonOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderFoodActionPerformed(evt);
            }
        });

        jButtonFoodQuantityDelete.setText("Odejmij");
        jButtonFoodQuantityDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFoodQuantityDeleteActionPerformed(evt);
            }
        });

        jTextFieldFoodPrice.setText("jTextField1");

        javax.swing.GroupLayout jPanelFoodLayout = new javax.swing.GroupLayout(jPanelFood);
        jPanelFood.setLayout(jPanelFoodLayout);
        jPanelFoodLayout.setHorizontalGroup(
            jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodLayout.createSequentialGroup()
                        .addComponent(jScrollPaneFoodOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPaneFoodToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFoodLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFoodQuantityDelete)
                        .addGap(60, 60, 60)
                        .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFoodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFoodLayout.createSequentialGroup()
                                .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldFoodPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonOrderFood, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addComponent(jButtonAddFoodProduct)))
                        .addGap(152, 152, 152))))
        );
        jPanelFoodLayout.setVerticalGroup(
            jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneFoodToOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(jScrollPaneFoodOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jTextFieldFoodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFoodQuantityDelete)
                    .addComponent(jButtonOrderFood)
                    .addComponent(jButtonAddFoodProduct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        buttonGroupPartsCategories.add(jRadioButtonGPU_1);
        jRadioButtonGPU_1.setText("Karty graficzne");
        jRadioButtonGPU_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGPU_1ActionPerformed(evt);
            }
        });

        buttonGroupPartsCategories.add(jRadioHDD_2);
        jRadioHDD_2.setText("Dyski twarde");
        jRadioHDD_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioHDD_2ActionPerformed(evt);
            }
        });

        jLabelCategories.setText("Kategorie");

        buttonGroupPartsCategories.add(jRadioButtonRAM_3);
        jRadioButtonRAM_3.setText("Pamięć RAM");
        jRadioButtonRAM_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRAM_3ActionPerformed(evt);
            }
        });

        buttonGroupPartsCategories.add(jRadioButtonKeyboard_5);
        jRadioButtonKeyboard_5.setText("Klawiatury");
        jRadioButtonKeyboard_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKeyboard_5ActionPerformed(evt);
            }
        });

        buttonGroupPartsCategories.add(jRadioButtonPowerSupply_6);
        jRadioButtonPowerSupply_6.setText("Zasilacze");
        jRadioButtonPowerSupply_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPowerSupply_6ActionPerformed(evt);
            }
        });

        buttonGroupPartsCategories.add(jRadioButtonCooling_7);
        jRadioButtonCooling_7.setText("Chłodzenie");
        jRadioButtonCooling_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCooling_7ActionPerformed(evt);
            }
        });

        buttonGroupPartsCategories.add(jRadioButtonCPU_8);
        jRadioButtonCPU_8.setText("Procesory");
        jRadioButtonCPU_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCPU_8ActionPerformed(evt);
            }
        });

        buttonGroupPartsCategories.add(jRadioButtonMB_9);
        jRadioButtonMB_9.setText("Płyty główne");
        jRadioButtonMB_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMB_9ActionPerformed(evt);
            }
        });

        buttonGroupPartsCategories.add(jRadioButtonMonitor_10);
        jRadioButtonMonitor_10.setText("Monitory");
        jRadioButtonMonitor_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMonitor_10ActionPerformed(evt);
            }
        });

        buttonGroupPartsCategories.add(jRadioButtonMouse_11);
        jRadioButtonMouse_11.setText("Myszki");
        jRadioButtonMouse_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMouse_11ActionPerformed(evt);
            }
        });

        jComboBoxPartsOrders.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTablePartsOrders.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPanePartsOrders.setViewportView(jTablePartsOrders);

        jButtonAddPartToOrder.setText("Dodaj");
        jButtonAddPartToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPartToOrderActionPerformed(evt);
            }
        });

        jTextFieldPartQuantity.setText("jTextField1");

        jButtonPartOrder.setText("Zamów");
        jButtonPartOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPartOrderActionPerformed(evt);
            }
        });

        jTextFieldPartsPrice.setText("jTextField1");

        jLabelImagePart.setText("jLabel12");
        jLabelImagePart.setPreferredSize(new java.awt.Dimension(432, 258));

        javax.swing.GroupLayout jPanelPartsOrdersLayout = new javax.swing.GroupLayout(jPanelPartsOrders);
        jPanelPartsOrders.setLayout(jPanelPartsOrdersLayout);
        jPanelPartsOrdersLayout.setHorizontalGroup(
            jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPartsOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelPartsOrdersLayout.createSequentialGroup()
                            .addComponent(jButtonAddPartToOrder)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldPartQuantity))
                        .addComponent(jComboBoxPartsOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButtonMouse_11)
                        .addComponent(jRadioButtonMonitor_10)
                        .addComponent(jRadioButtonMB_9)
                        .addComponent(jRadioButtonCPU_8)
                        .addComponent(jRadioButtonCooling_7)
                        .addComponent(jRadioButtonPowerSupply_6)
                        .addComponent(jRadioButtonKeyboard_5)
                        .addComponent(jRadioButtonRAM_3)
                        .addComponent(jLabelCategories)
                        .addComponent(jRadioButtonGPU_1)
                        .addComponent(jRadioHDD_2))
                    .addGroup(jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonPartOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPartsPrice)))
                .addGap(41, 41, 41)
                .addGroup(jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePartsOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelPartsOrdersLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelImagePart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPartsOrdersLayout.setVerticalGroup(
            jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPartsOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPanePartsOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addGroup(jPanelPartsOrdersLayout.createSequentialGroup()
                        .addComponent(jLabelCategories)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonGPU_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioHDD_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonRAM_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonKeyboard_5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonPowerSupply_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCooling_7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCPU_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMB_9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMonitor_10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMouse_11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPartsOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPartsOrdersLayout.createSequentialGroup()
                        .addGroup(jPanelPartsOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAddPartToOrder)
                            .addComponent(jTextFieldPartQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPartOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPartsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelImagePart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTableAdvancedBrowser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPaneAdvancedBrowser.setViewportView(jTableAdvancedBrowser);

        jLabel4.setText("Nazwa:");

        jTextFieldAdvBroName.setText("jTextField1");

        jLabel5.setText("Cena: ");

        jLabel6.setText("od:");

        jTextFieldAdvBroPrice_1.setText("jTextField1");

        jTextFieldAdvBroPrice_2.setText("jTextField1");

        jLabel7.setText("Kategoria:");

        jLabel8.setText("Ilość: ");

        jLabel9.setText("do:");

        jLabel10.setText("od:");

        jLabel11.setText("do:");

        jTextFieldAdvBroQuantity_1.setText("jTextField1");

        jTextFieldAdvBroQuantity_2.setText("jTextField1");

        jCheckBoxGPU.setText("Karty graficzne");

        jCheckBoxHDD.setText("Dyski twarde");

        jCheckBoxRAM.setText("Pamięć RAM");

        jCheckBoxKeyboard.setText("Klawiatury");

        jCheckBoxPowerSupply.setText("Zasilacze");

        jCheckBoxCooling.setText("Chłodzenie");

        jCheckBoxCPU.setText("Procesory");

        jCheckBoxMB.setText("Płyty główne");

        jCheckBoxMonitor.setText("Monitory");

        jCheckBoxMouse.setText("Myszki");

        jButtonAdvBroSearch.setText("Szukaj");
        jButtonAdvBroSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdvBroSearchActionPerformed(evt);
            }
        });

        jButtonAdvBrowserBack.setText("Cofnij");
        jButtonAdvBrowserBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdvBrowserBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdvancedBrowserLayout = new javax.swing.GroupLayout(jPanelAdvancedBrowser);
        jPanelAdvancedBrowser.setLayout(jPanelAdvancedBrowserLayout);
        jPanelAdvancedBrowserLayout.setHorizontalGroup(
            jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdvancedBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                            .addComponent(jTextFieldAdvBroName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldAdvBroPrice_2))
                                .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldAdvBroPrice_1))))
                        .addComponent(jLabel7)
                        .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldAdvBroQuantity_2))
                                .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldAdvBroQuantity_1))))
                        .addComponent(jCheckBoxGPU)
                        .addComponent(jCheckBoxHDD)
                        .addComponent(jCheckBoxRAM)
                        .addComponent(jCheckBoxKeyboard)
                        .addComponent(jCheckBoxPowerSupply)
                        .addComponent(jCheckBoxCooling)
                        .addComponent(jCheckBoxCPU)
                        .addComponent(jCheckBoxMB)
                        .addComponent(jCheckBoxMonitor)
                        .addComponent(jCheckBoxMouse)
                        .addComponent(jButtonAdvBroSearch))
                    .addComponent(jButtonAdvBrowserBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPaneAdvancedBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAdvancedBrowserLayout.setVerticalGroup(
            jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdvancedBrowserLayout.createSequentialGroup()
                        .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldAdvBroName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAdvBroPrice_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAdvBroPrice_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAdvBroQuantity_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAdvancedBrowserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldAdvBroQuantity_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxGPU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxHDD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxRAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxKeyboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxPowerSupply)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxCooling)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxCPU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxMB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxMonitor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxMouse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAdvBroSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdvBrowserBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPaneAdvancedBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTableOrders.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneOrders.setViewportView(jTableOrders);

        jButtonReceiveOrder.setText("Przyjmij");
        jButtonReceiveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceiveOrderActionPerformed(evt);
            }
        });

        jButtonLogs.setText("Logi");
        jButtonLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelReceivingOrdersLayout = new javax.swing.GroupLayout(jPanelReceivingOrders);
        jPanelReceivingOrders.setLayout(jPanelReceivingOrdersLayout);
        jPanelReceivingOrdersLayout.setHorizontalGroup(
            jPanelReceivingOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReceivingOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReceivingOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(jPanelReceivingOrdersLayout.createSequentialGroup()
                        .addComponent(jButtonReceiveOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLogs)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelReceivingOrdersLayout.setVerticalGroup(
            jPanelReceivingOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReceivingOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelReceivingOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReceiveOrder)
                    .addComponent(jButtonLogs))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jTableLogs.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneLogs.setViewportView(jTableLogs);

        jButtonLogsBack.setText("Powrót");
        jButtonLogsBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogsBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogsLayout = new javax.swing.GroupLayout(jPanelLogs);
        jPanelLogs.setLayout(jPanelLogsLayout);
        jPanelLogsLayout.setHorizontalGroup(
            jPanelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogsBack)
                .addGap(273, 273, 273))
        );
        jPanelLogsLayout.setVerticalGroup(
            jPanelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogsLayout.createSequentialGroup()
                .addComponent(jScrollPaneLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogsBack)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jLabel12.setText("Imie: ");

        jLabel13.setText("Nazwisko: ");

        jLabel14.setText("Adres mailowy:");

        jLabel15.setText("Hasło:");

        jLabel16.setText("Powtórz hasło:");

        jLabel17.setText("Stanowisko:");

        jTextFieldPassword2.setText("jTextField1");

        jTextFieldEmailAdress.setText("jTextField1");

        jTextFieldPassword1.setText("jTextField1");

        jTextFieldName.setText("jTextField1");

        jTextFieldFullName.setText("jTextField1");

        jComboBoxPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAddEmployee.setText("Dodaj Pracownika");
        jButtonAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddEmployeesLayout = new javax.swing.GroupLayout(jPanelAddEmployees);
        jPanelAddEmployees.setLayout(jPanelAddEmployeesLayout);
        jPanelAddEmployeesLayout.setHorizontalGroup(
            jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEmployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAddEmployeesLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPassword2))
                    .addGroup(jPanelAddEmployeesLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAddEmployeesLayout.createSequentialGroup()
                        .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTextFieldFullName)
                            .addComponent(jTextFieldEmailAdress)
                            .addComponent(jTextFieldPassword1)))
                    .addComponent(jButtonAddEmployee))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        jPanelAddEmployeesLayout.setVerticalGroup(
            jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEmployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldEmailAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddEmployee)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        jLabel18.setText("Imie: ");

        jLabel19.setText("Nazwisko:");

        jLabel20.setText("Adres Email:");

        jLabel21.setText("Stare Hasło(wymagane):");

        jLabel22.setText("Nowe Hasło:");

        jComboBoxEditPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextFieldEditName.setText("jTextField1");

        jTextFieldEditFullName.setText("jTextField1");

        jTextFieldEditEmailAdress.setText("jTextField1");

        jPasswordFieldEditPassword1.setText("jPasswordField1");

        jPasswordFieldEditPassword2.setText("jPasswordField1");

        jLabel23.setText("Stanowisko:");

        jButtonEditOK.setText("Zatwierdź");
        jButtonEditOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEditEmployeeLayout = new javax.swing.GroupLayout(jPanelEditEmployee);
        jPanelEditEmployee.setLayout(jPanelEditEmployeeLayout);
        jPanelEditEmployeeLayout.setHorizontalGroup(
            jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditEmployeeLayout.createSequentialGroup()
                        .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEditFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEditEmployeeLayout.createSequentialGroup()
                            .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPasswordFieldEditPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(jTextFieldEditEmailAdress)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelEditEmployeeLayout.createSequentialGroup()
                            .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordFieldEditPassword2)
                                .addComponent(jComboBoxEditPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jButtonEditOK))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanelEditEmployeeLayout.setVerticalGroup(
            jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldEditFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditEmailAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jPasswordFieldEditPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jPasswordFieldEditPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEditPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditOK)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        jLabelSellProductsImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSellProductsImageMousePressed(evt);
            }
        });

        jTableSellTableWarehouse.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTableSellTableWarehouse);

        jTableSellTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableSellTableCustomer);

        jTextFieldSellQuantity.setText("jTextField1");

        jButtonSellAdd.setText("Dodaj");
        jButtonSellAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSellAddActionPerformed(evt);
            }
        });

        jButtonSellFinish.setText("Zakończ");
        jButtonSellFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSellFinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSellProductsLayout = new javax.swing.GroupLayout(jPanelSellProducts);
        jPanelSellProducts.setLayout(jPanelSellProductsLayout);
        jPanelSellProductsLayout.setHorizontalGroup(
            jPanelSellProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSellProductsLayout.createSequentialGroup()
                .addGroup(jPanelSellProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSellProductsLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSellProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSellProductsLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldSellQuantity))
                            .addGroup(jPanelSellProductsLayout.createSequentialGroup()
                                .addGroup(jPanelSellProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSellAdd)
                                    .addComponent(jButtonSellFinish))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSellProductsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSellProductsImage, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelSellProductsLayout.setVerticalGroup(
            jPanelSellProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSellProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSellProductsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSellProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSellProductsLayout.createSequentialGroup()
                        .addComponent(jTextFieldSellQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSellAdd)
                        .addGap(63, 63, 63)
                        .addComponent(jButtonSellFinish))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setText("Nazwa: ");

        jTextFieldProductName.setText("jTextField1");

        jLabel25.setText("Cena detaliczna: ");

        jTextFieldProductRetailPrice.setText("jTextField1");

        jLabel26.setText("Podatek: ");

        jTextFieldProductVAT.setText("jTextField1");

        jLabel27.setText("Kategoria: ");

        jComboBoxProductCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAddNewProduct.setText("Dodaj nowy produkt");
        jButtonAddNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddProductLayout = new javax.swing.GroupLayout(jPanelAddProduct);
        jPanelAddProduct.setLayout(jPanelAddProductLayout);
        jPanelAddProductLayout.setHorizontalGroup(
            jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelAddProductLayout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelAddProductLayout.createSequentialGroup()
                            .addGroup(jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25)
                                .addComponent(jLabel26))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldProductRetailPrice)
                                .addComponent(jTextFieldProductVAT)))
                        .addGroup(jPanelAddProductLayout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxProductCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButtonAddNewProduct))
                .addContainerGap(470, Short.MAX_VALUE))
        );
        jPanelAddProductLayout.setVerticalGroup(
            jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextFieldProductRetailPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextFieldProductVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jComboBoxProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddNewProduct)
                .addContainerGap(442, Short.MAX_VALUE))
        );

        jMenuEmails.setText("Użytkownik");

        jMenuItemWriteEmail.setText("Napisz Wiadomość");
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

        jMenuItemEditEmployee.setText("Edytuj Dane");
        jMenuItemEditEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditEmployeeActionPerformed(evt);
            }
        });
        jMenuEmails.add(jMenuItemEditEmployee);

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
                    .addGap(0, 183, Short.MAX_VALUE)
                    .addComponent(jPanelWriteMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 183, Short.MAX_VALUE)
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 201, Short.MAX_VALUE)
                    .addComponent(jPanelRepairForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 235, Short.MAX_VALUE)
                    .addComponent(jPanelRepairsTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 242, Short.MAX_VALUE)
                    .addComponent(jPanelWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 229, Short.MAX_VALUE)
                    .addComponent(jPanelFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 201, Short.MAX_VALUE)
                    .addComponent(jPanelPartsOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 224, Short.MAX_VALUE)
                    .addComponent(jPanelAdvancedBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 186, Short.MAX_VALUE)
                    .addComponent(jPanelReceivingOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 199, Short.MAX_VALUE)
                    .addComponent(jPanelLogs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 198, Short.MAX_VALUE)
                    .addComponent(jPanelAddEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 190, Short.MAX_VALUE)
                    .addComponent(jPanelEditEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 192, Short.MAX_VALUE)
                    .addComponent(jPanelSellProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 205, Short.MAX_VALUE)
                    .addComponent(jPanelAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSideButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMailbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelWriteMail, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelRepairForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelRepairsTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelWarehouse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelPartsOrders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAdvancedBrowser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelReceivingOrders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelLogs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAddEmployees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelEditEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelSellProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAddProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMailboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMailboxActionPerformed
        //Otwieranie skrzynki z wiadomościami
        jPanelMailbox.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelRepairForm,jPanelEditEmployee);
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
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelSellProducts,jPanelRepairForm,jPanelMailbox,jPanelEditEmployee);
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
        this.setTitle("Witaj " + user.getName() + ' ' + user.getFull_name());
        
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
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        jTextFieldClientsName.setText("");
        jTextFieldClientsFullName.setText("");
        
    }//GEN-LAST:event_jButtonRepairActionPerformed

    private void jButtonRepairSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepairSendActionPerformed
        // Wysyłanie formularza do naprawy
        try{
            String client_name = jTextFieldClientsName.getText();
            String client_full_name = jTextFieldClientsFullName.getText();
            String desc = jTextAreaRepairInfo.getText();
            
            Repair temp = new Repair(user.getId(),client_name,client_full_name,desc,false);
            f.addRepair(temp);
            JOptionPane.showMessageDialog(null, "Dodano");
            jPanelRepairForm.setVisible(false);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error adding Repair Form");
        }
    }//GEN-LAST:event_jButtonRepairSendActionPerformed

    private void jButtonShowRepairsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowRepairsActionPerformed
        // Tabela z naprawami dla technika
        
        jPanelRepairsTable.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairForm, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        f.fillTableWithRepairs(jTableRepairs);
        
        //jButtonRepairDesc.setVisible(true);
        //jButtonRepairCheck.setVisible(true);
        
    }//GEN-LAST:event_jButtonShowRepairsActionPerformed

    private void jButtonRepairDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepairDescActionPerformed
        // Wyświetlanie opisu repaira
        
        Repair temp = new Repair();
        int row = jTableRepairs.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Wpis");				
                    return;
		}
        
        temp = (Repair) jTableRepairs.getValueAt(row, RepairTableModel.OBJECT_COL);
        
        JOptionPane.showMessageDialog(null, temp.getDescription());//tu jakoś poprawić
    }//GEN-LAST:event_jButtonRepairDescActionPerformed

    private void jButtonRepairCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepairCheckActionPerformed
        // Zatwierdzanie wykonania naprawy
        
        Repair temp = new Repair();
        int row = jTableRepairs.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Wpis");				
                    return;
		}
        
        temp = (Repair) jTableRepairs.getValueAt(row, RepairTableModel.OBJECT_COL);
        
        if(temp.isExecuted()){
            JOptionPane.showMessageDialog(null, "Już wykonano");
            return;
        }
        f.setRepairExecuted(temp);
        f.fillTableWithRepairs(jTableRepairs);
        
        
        
    }//GEN-LAST:event_jButtonRepairCheckActionPerformed

    private void jButtonRepairTableBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepairTableBackActionPerformed
        // Powrót z repairów
        
        jPanelRepairsTable.setVisible(false);
    }//GEN-LAST:event_jButtonRepairTableBackActionPerformed

    private void jButtonShowWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowWarehouseActionPerformed
        // Stan magazynowy
        
        jPanelWarehouse.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelRepairForm, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        jTextFieldBrowser.setText("");
        f.fillTableWithPartsProducts(jTableWarehouse);
    }//GEN-LAST:event_jButtonShowWarehouseActionPerformed

    private void jButtonBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowserActionPerformed
        // wyszuiwanie zwykłe
        String name = jTextFieldBrowser.getText();
        f.fillTableWithPartsProducts(jTableWarehouse, name);
    }//GEN-LAST:event_jButtonBrowserActionPerformed

    private void jButtonFoodOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodOrdersActionPerformed
        // ZAmawianie jedzenia
        jPanelFood.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelRepairForm, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        jTextFieldFoodQuantity.setText("");
        
        //wypełnienie tabel
        ordered_list = new ArrayList<>();
        List<Product> to_order_list = new ArrayList<>();
        to_order_list = f.getFoodProducts();
        
        ProductTableModel ordered_model = new ProductTableModel(ordered_list);
        ProductTableModel to_order_model = new ProductTableModel(to_order_list);
        
        jTableFoodOrdered.setModel(ordered_model);
        jTableFoodToOrder.setModel(to_order_model);
        
        f.selectColumns(jTableFoodOrdered,jTableFoodToOrder);
        price = 0.0;
        jTextFieldFoodPrice.setText("");
        
        
    }//GEN-LAST:event_jButtonFoodOrdersActionPerformed

    private void jButtonAddFoodProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFoodProductActionPerformed
        // przesuwanie produktów food między tabelami
        //jakoś to działa ale poprawić trzeba bo brzydko
        try{

        Product product_from_list = new Product();
        int row = jTableFoodToOrder.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Produkt");				
                    return;
		}
        
        product_from_list = (Product) jTableFoodToOrder.getValueAt(row, ProductTableModel.OBJECT_COL);
        Product temp = Product.copy(product_from_list);
        
        if(jTextFieldFoodQuantity.getText().equals("")) throw  new Exception();
        
        int quantity = Integer.parseInt(jTextFieldFoodQuantity.getText());
        
        temp.setQuantity(quantity); //pobranie ilości
       
        if(f.containsProductID(ordered_list, temp)){// tu poprawić bo sie dublowało
            f.addQuantityToProduct(ordered_list,temp);        
        }
        else{   
            ordered_list.add(temp);  
        }
        
        f.refreshOrderedFood(jTableFoodOrdered,ordered_list);
        price += temp.getRetail_price()  * quantity;
        jTextFieldFoodPrice.setText(Double.toString(price));
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
        finally{
            jTextFieldFoodQuantity.setText(""); 
        }
    }//GEN-LAST:event_jButtonAddFoodProductActionPerformed

    private void jButtonOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderFoodActionPerformed
        // Dodawanie zamówienia do bazy
        
        Order food_order = new Order(user.getId(),ordered_list);
        //JOptionPane.showMessageDialog(rootPane, food_order);
        f.addOrder(food_order);
        JOptionPane.showMessageDialog(null, "Zamówiono");
        ordered_list.clear();
        price = 0.0;
        jPanelFood.setVisible(false);
    }//GEN-LAST:event_jButtonOrderFoodActionPerformed

    private void jButtonFoodQuantityDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFoodQuantityDeleteActionPerformed
        // Odejmowanie ilości produktów
        
        try{
        Product temp = new Product();
        int row = jTableFoodOrdered.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Produkt");				
                    return;
		}
        
        temp = (Product) jTableFoodOrdered.getValueAt(row, ProductTableModel.OBJECT_COL);
        int quantity = Integer.parseInt(jTextFieldFoodQuantity.getText());
            
        if(quantity > ordered_list.get(ordered_list.indexOf(temp)).getQuantity()){
            //JOptionPane.showMessageDialog(null,ordered_list.get(ordered_list.indexOf(temp)).getQuantity());
            throw  new Exception();
        }
        else if(quantity == ordered_list.get(ordered_list.indexOf(temp)).getQuantity())
            ordered_list.remove(temp);
        else
        ordered_list.get(ordered_list.indexOf(temp)).substractQuantity(quantity);
            
 
            
        f.refreshOrderedFood(jTableFoodOrdered, ordered_list);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Niepoprawna ilość");
        }
        finally{
            jTextFieldFoodQuantity.setText("");       
        }
    }//GEN-LAST:event_jButtonFoodQuantityDeleteActionPerformed

    private void jButtonPartsOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPartsOrdersActionPerformed
        // Zamawianie części z hurtowni
        jPanelPartsOrders.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelRepairForm, jPanelReceivingOrders, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        jComboBoxPartsOrders.removeAllItems();
        jTextFieldPartQuantity.setText("");
        jTextFieldPartsPrice.setText("");
        ordered_list = new ArrayList<>();
        f.refreshProductTable(jTablePartsOrders, ordered_list);
        price = 0.0;
        jLabelImagePart.setText("");
        
        //wynullowanie radiobuttonów
        buttonGroupPartsCategories.clearSelection();
        jLabelImagePart.setIcon(null);
    }//GEN-LAST:event_jButtonPartsOrdersActionPerformed

    private void jRadioButtonGPU_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGPU_1ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_GPU);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/gpu.png");
    }//GEN-LAST:event_jRadioButtonGPU_1ActionPerformed

    private void jRadioHDD_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioHDD_2ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_HDD);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/hdd.jpg");
    }//GEN-LAST:event_jRadioHDD_2ActionPerformed

    private void jRadioButtonRAM_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRAM_3ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_RAM);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/ram.jpg");
    }//GEN-LAST:event_jRadioButtonRAM_3ActionPerformed

    private void jRadioButtonKeyboard_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKeyboard_5ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_KEYBOARD);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/keyboard.jpg");
    }//GEN-LAST:event_jRadioButtonKeyboard_5ActionPerformed

    private void jRadioButtonPowerSupply_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPowerSupply_6ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_POWER_SUPPLY);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/power_supply.jpg");
    }//GEN-LAST:event_jRadioButtonPowerSupply_6ActionPerformed

    private void jRadioButtonCooling_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCooling_7ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_COOLING);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/cooler.jpg");
    }//GEN-LAST:event_jRadioButtonCooling_7ActionPerformed

    private void jRadioButtonCPU_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCPU_8ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_CPU);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/cpu.gif");
    }//GEN-LAST:event_jRadioButtonCPU_8ActionPerformed

    private void jRadioButtonMB_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMB_9ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_MB);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/mb.png");
    }//GEN-LAST:event_jRadioButtonMB_9ActionPerformed

    private void jRadioButtonMonitor_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMonitor_10ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders, CAT_MONITOR);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/monitor.jpg");
    }//GEN-LAST:event_jRadioButtonMonitor_10ActionPerformed

    private void jRadioButtonMouse_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMouse_11ActionPerformed
        f.fillComboboxWithPartsCat(jComboBoxPartsOrders,  CAT_MOUSE);
        f.setImageForJLabel(jLabelImagePart,"src/images/categories_images/mouse.jpg");
    }//GEN-LAST:event_jRadioButtonMouse_11ActionPerformed

    private void jButtonAddPartToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPartToOrderActionPerformed
        // Dodawanie produktów do tabeli
        try{
        
        Product temp = new Product();
        
        temp = (Product) jComboBoxPartsOrders.getSelectedItem();
        int quantity = Integer.parseInt(jTextFieldPartQuantity.getText());
        temp.setQuantity(quantity);
        price += temp.getRetail_price() * (1 + temp.getVat()) * quantity;
        ordered_list.add(temp);
        
        f.refreshProductTable(jTablePartsOrders, ordered_list);
        jTextFieldPartsPrice.setText(Double.toString(price));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonAddPartToOrderActionPerformed

    private void jButtonPartOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPartOrderActionPerformed
        // Wysłąnie zamówienia na części
        Order temp = new Order(user.getId(), ordered_list);
        f.addOrder(temp);
        JOptionPane.showMessageDialog(null, "Zrobione");
        jPanelPartsOrders.setVisible(false);
        price = 0.0;
        
        ordered_list.clear();
    }//GEN-LAST:event_jButtonPartOrderActionPerformed

    private void jButtonAdvancedBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdvancedBrowserActionPerformed
        // Włączanie wyszukiwarki zaawansowanej
        jPanelWarehouse.setVisible(false);
        f.closeOthersJPanels(jPanelReceivingOrders,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelRepairForm, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        jPanelAdvancedBrowser.setVisible(true);
        jTextFieldAdvBroName.setText("");
        jTextFieldAdvBroPrice_1.setText("");
        jTextFieldAdvBroPrice_2.setText("");
        jTextFieldAdvBroQuantity_1.setText("");
        jTextFieldAdvBroQuantity_2.setText("");
        //buttonGroupCategoriesAdvBro.clearSelection();
        
        jCheckBoxGPU.setSelected(false);
        jCheckBoxHDD.setSelected(false);
        jCheckBoxRAM.setSelected(false);
        jCheckBoxKeyboard.setSelected(false);
        jCheckBoxPowerSupply.setSelected(false);
        jCheckBoxCooling.setSelected(false);
        jCheckBoxCPU.setSelected(false);
        jCheckBoxMB.setSelected(false);
        jCheckBoxMonitor.setSelected(false);
        jCheckBoxMouse.setSelected(false);
        
        
        f.fillTableWithPartsProducts(jTableAdvancedBrowser);
                
        
        
    }//GEN-LAST:event_jButtonAdvancedBrowserActionPerformed

    private void jButtonAdvBroSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdvBroSearchActionPerformed
        // Szukanie zaawasowane
        
        
        try{
        List<Product> list = new ArrayList<>();
        list = f.getPartsProducts();
        
        
        if(		!jCheckBoxGPU.isSelected() //jeśli nie zaznaczono kategorii
			&&
			!jCheckBoxHDD.isSelected()
			&&
			!jCheckBoxRAM.isSelected()
                        &&
			!jCheckBoxKeyboard.isSelected()
                        &&
			!jCheckBoxPowerSupply.isSelected()
                        &&
			!jCheckBoxCooling.isSelected()
                        &&
			!jCheckBoxCPU.isSelected()
                        &&
			!jCheckBoxMB.isSelected()
                        &&
			!jCheckBoxMonitor.isSelected()
                        &&
			!jCheckBoxMouse.isSelected()
                                                  ) throw new Exception();
        
        //Zbieranie danych
        String name = jTextFieldAdvBroName.getText();
                                Double price_1=null;
				if(!jTextFieldAdvBroPrice_1.getText().isEmpty())
					price_1 = Double.parseDouble(jTextFieldAdvBroPrice_1.getText());
				
				Double price_2=null;
				if(!jTextFieldAdvBroPrice_2.getText().isEmpty())
					price_2= Double.parseDouble(jTextFieldAdvBroPrice_2.getText());
				
				Double quantity_1=null;
				if(!jTextFieldAdvBroQuantity_1.getText().isEmpty())
					quantity_1= Double.parseDouble(jTextFieldAdvBroQuantity_1.getText());
				
				Double quantity_2=null;
				if(!jTextFieldAdvBroQuantity_2.getText().isEmpty())
					quantity_2= Double.parseDouble(jTextFieldAdvBroQuantity_2.getText());
        
        
        //lista indexów do usuwania
        List<Integer> indexes = new ArrayList<Integer>();
        
        //Sortowanie
        if (name != null && name.trim().length() > 0)
				{ 
					for(Product p : list)
					{	
						if(!p.getName().equals(name))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (price_1 != null ) 
				{ 
					for(Product p : list)
					{	
						if(p.getRetail_price()< price_1)
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (price_2 != null ) 
				{ 
					for(Product p : list)
					{	
						if(p.getRetail_price()> price_2)
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (quantity_1 != null ) 
				{ 
					for(Product p : list)
					{	
						if(p.getQuantity()< quantity_1)
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (quantity_2 != null ) 
				{ 
					for(Product p : list)
					{	
						if(p.getQuantity()> quantity_2)
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxGPU.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Karty graficzne"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxHDD.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Dyski twarde"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxRAM.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Pamięć RAM"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxKeyboard.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Klawiatury"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxPowerSupply.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Zasilacze"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxCooling.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Chłodzenie"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxCPU.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Procesory"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxMB.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Płyty główne"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxMonitor.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Monitory"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxMouse.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Myszki"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        if (!jCheckBoxRAM.isSelected()) 
				{ 
					for(Product p : list)
					{	
						if(p.getCategory().equals("Pamięć RAM"))
						{
							if(!indexes.contains(list.indexOf(p)))
							indexes.add(list.indexOf(p));
						}
					}
				}
        
        
        
        ////////////////////////////////////////////////////////Posortowanie indexów
				indexes.sort(null);
				
				
				////////////////////////////////////////////////////////Odwrócenie kolejnośći indexów
				Collections.reverse(indexes);
				
				///////////////////////////////////////////////////////Usunięcie niepasujących produktów
				for(Integer i : indexes)
				{
					list.remove(list.get(i));
				}
				
        ProductTableModel model = new ProductTableModel(list);
        jTableAdvancedBrowser.setModel(model);
        
        
        
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Podano złe dane");
        }
    }//GEN-LAST:event_jButtonAdvBroSearchActionPerformed

    private void jButtonReceiveOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceiveOrdersActionPerformed
        //Przyjmowanie zamówień
        jPanelReceivingOrders.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelRepairForm, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        f.fillTableWithOrders(jTableOrders);
    }//GEN-LAST:event_jButtonReceiveOrdersActionPerformed

    private void jButtonReceiveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceiveOrderActionPerformed
        // Przyjmij zamówienie
        Order temp = new Order();
        int row = jTableOrders.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Zamówienie");				
                    return;
		}
        
        temp = (Order) jTableOrders.getValueAt(row, OrderTableModel.OBJECT_COL);
        
        if(temp.isExecuted()){
            JOptionPane.showMessageDialog(null, "Już wykonano");
            return;
        }
        f.setOrderExecuted(temp);
        f.fillTableWithOrders(jTableOrders);
        
        List<Product> list = temp.getList();
        //JOptionPane.showMessageDialog(null, list);
        f.addQuantities(list);
    }//GEN-LAST:event_jButtonReceiveOrderActionPerformed

    private void jButtonDeleteEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteEmailActionPerformed
        // Usuwanie meili
        Email temp = new Email();
        int row = jTableMailbox.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Wiadomość");				
                    return;
		}
        
        temp = (Email) jTableMailbox.getValueAt(row, EmailTableModel.OBJECT_COL);
        
   
        f.deleteEmail(temp);
        f.fillTableWithEmailsForUser(jTableMailbox,user);
        
        if(f.thereIsNewMail(user)){
            jMenuEmails.setForeground(Color.red);
            //JOptionPane.showMessageDialog(null, "Jest mail");
        }
        else{
            jMenuEmails.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jButtonDeleteEmailActionPerformed

    private void jButtonLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogsActionPerformed
        // Wyswietlanie logów do zamówienia
        
        Order temp = new Order();
        int row = jTableOrders.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Zamówienie");				
                    return;
		}
        
        temp = (Order) jTableOrders.getValueAt(row, OrderTableModel.OBJECT_COL);
        
        jPanelLogs.setVisible(true);
        jPanelReceivingOrders.setVisible(false);
        //tu sie powinny wyświetlać logi
        
        List<Log> logs = new ArrayList<>();
        logs = f.getAllLogsForOrder(temp);
        
        LogTableModel model = new LogTableModel(logs);
        jTableLogs.setModel(model);
        
        
    }//GEN-LAST:event_jButtonLogsActionPerformed

    private void jButtonLogsBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogsBackActionPerformed
        // Zamykanie okna z logami
        jPanelLogs.setVisible(false);
        jPanelReceivingOrders.setVisible(true);
    }//GEN-LAST:event_jButtonLogsBackActionPerformed

    private void jButtonAddEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEmployeesActionPerformed
        //Dodawanie i zmiana danych pracownika
        jPanelAddEmployees.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelRepairForm, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        //f.fillComboboxWithEmployees(jComboBoxEmployees);
        jTextFieldName.setText("");
        jTextFieldFullName.setText("");
        jTextFieldEmailAdress.setText("");
        jTextFieldPassword1.setText("");
        jTextFieldPassword2.setText("");
        
        f.fillComboboxWithPositions(jComboBoxPosition);
        
        
    }//GEN-LAST:event_jButtonAddEmployeesActionPerformed

    private void jButtonAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEmployeeActionPerformed
        // Dodaj pracownika
        try{
        String name = jTextFieldName.getText();
        String full_name = jTextFieldFullName.getText();
        String email_adress = jTextFieldEmailAdress.getText();
        String password_1 = jTextFieldPassword1.getText();
        String password_2 = jTextFieldPassword2.getText();
        Position position = (Position) jComboBoxPosition.getSelectedItem();
        
        if(!password_1.equals(password_2)) throw new Exception();
        
        
        String encypted_password = f.encrypt(password_1);
        
        Employee temp = new Employee(name, full_name, email_adress, encypted_password, position.getName());
        f.addEmployee(temp,position);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButtonAddEmployeeActionPerformed

    private void jMenuItemEditEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditEmployeeActionPerformed
        // Edycja danych pracownika
        jPanelEditEmployee.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelSellProducts,jPanelWriteMail,jPanelMailbox,jPanelRepairForm);
        jTextFieldEditName.setText(user.getName());
        jTextFieldEditFullName.setText(user.getFull_name());
        jTextFieldEditEmailAdress.setText(user.getEmail());
        jPasswordFieldEditPassword1.setText("");//(f.decrypt(user.getPassword()));
        jPasswordFieldEditPassword2.setText("");//(f.decrypt(user.getPassword()));
        
        f.fillComboboxWithPositions(jComboBoxEditPosition);
        
        jComboBoxEditPosition.setSelectedItem(user.getPosition());
    }//GEN-LAST:event_jMenuItemEditEmployeeActionPerformed

    private void jButtonEditOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditOKActionPerformed
        // Zatwierdzanie zmian edycji użytkownika
        
        try{
            String name = jTextFieldEditName.getText();
            String full_name = jTextFieldEditFullName.getText();
            String email = jTextFieldEditEmailAdress.getText();
            String old_password = jPasswordFieldEditPassword1.getText();
            String new_password = jPasswordFieldEditPassword2.getText();
            Position position = (Position) jComboBoxEditPosition.getSelectedItem();
            
            if(!f.decrypt(user.getPassword()).equals(old_password)) throw new Exception();
            
            user.setName(name);
            user.setFull_name(full_name);
            user.setEmail(email);
            if(!new_password.trim().equals(""))
            user.setPassword(f.encrypt(new_password));
            
            //JOptionPane.showMessageDialog(null, user.showInfo());
            
            f.updateUser(user, position);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Złe dane lub błędne hasło");
        }
    }//GEN-LAST:event_jButtonEditOKActionPerformed

    private void jButtonSellProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSellProductsActionPerformed
        // Sprzedaż częśći
        jPanelSellProducts.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelAddProduct,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelRepairForm,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        f.setImageForJLabel(jLabelSellProductsImage, "src/images/sell_images/all.jpg");
        jTextFieldSellQuantity.setText("");
        selling_list = new ArrayList<>();
        warehouse_list = f.getPartsProducts();
        f.refreshProductTable(jTableSellTableWarehouse, warehouse_list);
        f.refreshProductTable(jTableSellTableCustomer, selling_list);
        //f.setImageForJLabel(jLabelSellProductsImage, null);
        
    }//GEN-LAST:event_jButtonSellProductsActionPerformed

    private void jButtonSellAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSellAddActionPerformed
        // Dodawanie produktu
        
        Product temp = new Product();
        Product new_product = new Product();
        int row = jTableSellTableWarehouse.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Produkt");				
                    return;
		}
        
        temp = (Product) jTableSellTableWarehouse.getValueAt(row, ProductTableModel.OBJECT_COL);
        try{
        int quantity = Integer.parseInt(jTextFieldSellQuantity.getText());
        if(quantity > temp.getQuantity()) throw new Exception();
        new_product = Product.copy(temp);
        new_product.setQuantity(quantity);
        temp.substractQuantity(quantity);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Zła ilość");
            return;
        }
        
        if(f.containsProductID(selling_list, new_product)){// tu poprawić bo sie dublowało
            f.addQuantityToProduct(selling_list,new_product);        
        }
        else{   
            selling_list.add(new_product);  
        }
        
        
        f.refreshProductTable(jTableSellTableCustomer, selling_list);
        //f.setQuantityForProduct(temp);//tu za szybko
        f.refreshProductTable(jTableSellTableWarehouse, warehouse_list);
        jTextFieldSellQuantity.setText("");
        
        
    }//GEN-LAST:event_jButtonSellAddActionPerformed

    private void jButtonSellFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSellFinishActionPerformed
        // Zakończenie sprzedaży produktów
        //Pewnie pdf będzie
        PdfFiles pdffiles = new PdfFiles();
        pdffiles.createPdf(selling_list);
        //odejmowanie ilości produktów z bazy
        f.substractQuantities(selling_list);
        
        //JOptionPane.showMessageDialog(null, "Wygenerowano fakturę");
        selling_list = null;
        warehouse_list = null;
        jPanelSellProducts.setVisible(false);
    }//GEN-LAST:event_jButtonSellFinishActionPerformed

    private void jButtonMailAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMailAnswerActionPerformed
        // Odpisywanie na meile
        
        Email email = new Email();
        int row = jTableMailbox.getSelectedRow();
        if (row < 0) {
                    JOptionPane.showMessageDialog(null,"Wybierz Email");				
                    return;
		}
        
        email = (Email) jTableMailbox.getValueAt(row, EmailTableModel.OBJECT_COL);
        
        
        int id_sender = email.getId_sender();JOptionPane.showMessageDialog(null, id_sender);
        Employee employee = f.getEmployeeByID(id_sender);JOptionPane.showMessageDialog(null, employee);
        jPanelMailbox.setVisible(false);
        jPanelWriteMail.setVisible(true);
        f.fillComboboxWithEmployees(jComboBoxEmployeeList);
        jComboBoxEmployeeList.setSelectedItem(employee);
    }//GEN-LAST:event_jButtonMailAnswerActionPerformed

    private void jLabelSellProductsImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSellProductsImageMousePressed
        // Obsługa klinięcia
        Point p = evt.getPoint();
        //JOptionPane.showMessageDialog(null, p);
        Point p_gpu = new Point(63,32);
        Point p_hdd = new Point(189,32);
        Point p_ram = new Point(315,32);
        Point p_keyboard = new Point(441,32);
        Point p_power_supply = new Point(567,32);
        Point p_cooler = new Point(63,97);
        Point p_cpu = new Point(189,97);
        Point p_mb = new Point(315,97);
        Point p_monitor = new Point(441,97);
        Point p_mouse = new Point(567,97);
        
        if(f.distancebetween2Points(p, p_gpu) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_1_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,1);
        }
        else if(f.distancebetween2Points(p, p_hdd) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_2_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,2);
        }
        else if(f.distancebetween2Points(p, p_ram) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_3_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,3);
        }
        else if(f.distancebetween2Points(p, p_keyboard) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_4_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,5);
        }
        else if(f.distancebetween2Points(p, p_power_supply) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_5_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,6);
        }
        else if(f.distancebetween2Points(p, p_cooler) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_6_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,7);
        }
        else if(f.distancebetween2Points(p, p_cpu) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_7_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,8);
        }
        else if(f.distancebetween2Points(p, p_mb) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_8_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,9);
        }
        else if(f.distancebetween2Points(p, p_monitor) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_9_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,10);
        }
        else if(f.distancebetween2Points(p, p_mouse) < 32){
            f.setImageForJLabel(jLabelSellProductsImage,"src/images/sell_images/all_10_red.jpg");
            f.fillTableWithPartsProductsByID(jTableSellTableWarehouse,11);
        }
    }//GEN-LAST:event_jLabelSellProductsImageMousePressed

    private void jButtonAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProductActionPerformed
        // Dodawanie produktu - okno
        jPanelAddProduct.setVisible(true);
        f.closeOthersJPanels(jPanelAdvancedBrowser,jPanelSellProducts,jPanelRepairsTable, jPanelFood, jPanelWarehouse, jPanelPartsOrders, jPanelReceivingOrders, jPanelAddEmployees, jPanelRepairForm,jPanelWriteMail,jPanelMailbox,jPanelEditEmployee);
        
        jTextFieldProductName.setText("");
        jTextFieldProductRetailPrice.setText("");
        jTextFieldProductVAT.setText("");
        f.fillComboboxWithPartsCategories(jComboBoxProductCategory);
        
    }//GEN-LAST:event_jButtonAddProductActionPerformed

    private void jButtonAddNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewProductActionPerformed
        // Dodanie nowego produktu do bazy
        try{
            String name = jTextFieldProductName.getText();
            Double retail_price = Double.parseDouble(jTextFieldProductRetailPrice.getText());
            Double vat = Double.parseDouble(jTextFieldProductVAT.getText());
            Category category = (Category) jComboBoxProductCategory.getSelectedItem();
            
            Product temp = new Product(name, retail_price, vat, category.getName(),0);
            
            f.addProduct(temp, category);
            
            JOptionPane.showMessageDialog(null, "Dodano nowy produkt");
            jPanelAddProduct.setVisible(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonAddNewProductActionPerformed

    private void jButtonAdvBrowserBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdvBrowserBackActionPerformed
        // powrót z wyszuiwarki zawansowanej
        jPanelAdvancedBrowser.setVisible(false);
        jPanelWarehouse.setVisible(true);
        jTextFieldBrowser.setText("");
        f.fillTableWithPartsProducts(jTableWarehouse);
    }//GEN-LAST:event_jButtonAdvBrowserBackActionPerformed

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
                
                
                /*
                 List<Order> list = new ArrayList<Order>();
                 list = f.getAllOrders();
                 JOptionPane.showMessageDialog(null, list);
                 */

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupPartsCategories;
    private javax.swing.JButton jButtonAddEmployee;
    private javax.swing.JButton jButtonAddEmployees;
    private javax.swing.JButton jButtonAddFoodProduct;
    private javax.swing.JButton jButtonAddNewProduct;
    private javax.swing.JButton jButtonAddPartToOrder;
    private javax.swing.JButton jButtonAddProduct;
    private javax.swing.JButton jButtonAdvBroSearch;
    private javax.swing.JButton jButtonAdvBrowserBack;
    private javax.swing.JButton jButtonAdvancedBrowser;
    private javax.swing.JButton jButtonBrowser;
    private javax.swing.JButton jButtonDeleteEmail;
    private javax.swing.JButton jButtonEditOK;
    private javax.swing.JButton jButtonFoodOrders;
    private javax.swing.JButton jButtonFoodQuantityDelete;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonLogs;
    private javax.swing.JButton jButtonLogsBack;
    private javax.swing.JButton jButtonMailAnswer;
    private javax.swing.JButton jButtonMailSend;
    private javax.swing.JButton jButtonOrderFood;
    private javax.swing.JButton jButtonPartOrder;
    private javax.swing.JButton jButtonPartsOrders;
    private javax.swing.JButton jButtonReceiveOrder;
    private javax.swing.JButton jButtonReceiveOrders;
    private javax.swing.JButton jButtonRepair;
    private javax.swing.JButton jButtonRepairCheck;
    private javax.swing.JButton jButtonRepairDesc;
    private javax.swing.JButton jButtonRepairSend;
    private javax.swing.JButton jButtonRepairTableBack;
    private javax.swing.JButton jButtonSellAdd;
    private javax.swing.JButton jButtonSellFinish;
    private javax.swing.JButton jButtonSellProducts;
    private javax.swing.JButton jButtonShowEmail;
    private javax.swing.JButton jButtonShowRepairs;
    private javax.swing.JButton jButtonShowWarehouse;
    private javax.swing.JCheckBox jCheckBoxCPU;
    private javax.swing.JCheckBox jCheckBoxCooling;
    private javax.swing.JCheckBox jCheckBoxGPU;
    private javax.swing.JCheckBox jCheckBoxHDD;
    private javax.swing.JCheckBox jCheckBoxKeyboard;
    private javax.swing.JCheckBox jCheckBoxMB;
    private javax.swing.JCheckBox jCheckBoxMonitor;
    private javax.swing.JCheckBox jCheckBoxMouse;
    private javax.swing.JCheckBox jCheckBoxPowerSupply;
    private javax.swing.JCheckBox jCheckBoxRAM;
    private javax.swing.JComboBox jComboBoxEditPosition;
    private javax.swing.JComboBox jComboBoxEmployeeList;
    private javax.swing.JComboBox jComboBoxLoginEmployees;
    private javax.swing.JComboBox jComboBoxPartsOrders;
    private javax.swing.JComboBox jComboBoxPosition;
    private javax.swing.JComboBox jComboBoxProductCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCategories;
    private javax.swing.JLabel jLabelImagePart;
    private javax.swing.JLabel jLabelSellProductsImage;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEmails;
    private javax.swing.JMenuItem jMenuItemEditEmployee;
    private javax.swing.JMenuItem jMenuItemMailbox;
    private javax.swing.JMenuItem jMenuItemWriteEmail;
    private javax.swing.JPanel jPanelAddEmployees;
    private javax.swing.JPanel jPanelAddProduct;
    private javax.swing.JPanel jPanelAdvancedBrowser;
    private javax.swing.JPanel jPanelEditEmployee;
    private javax.swing.JPanel jPanelFood;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelLogs;
    private javax.swing.JPanel jPanelMailbox;
    private javax.swing.JPanel jPanelPartsOrders;
    private javax.swing.JPanel jPanelReceivingOrders;
    private javax.swing.JPanel jPanelRepairForm;
    private javax.swing.JPanel jPanelRepairsTable;
    private javax.swing.JPanel jPanelSellProducts;
    private javax.swing.JPanel jPanelSideButtons;
    private javax.swing.JPanel jPanelWarehouse;
    private javax.swing.JPanel jPanelWriteMail;
    private javax.swing.JPasswordField jPasswordFieldEditPassword1;
    private javax.swing.JPasswordField jPasswordFieldEditPassword2;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JRadioButton jRadioButtonCPU_8;
    private javax.swing.JRadioButton jRadioButtonCooling_7;
    private javax.swing.JRadioButton jRadioButtonGPU_1;
    private javax.swing.JRadioButton jRadioButtonKeyboard_5;
    private javax.swing.JRadioButton jRadioButtonMB_9;
    private javax.swing.JRadioButton jRadioButtonMonitor_10;
    private javax.swing.JRadioButton jRadioButtonMouse_11;
    private javax.swing.JRadioButton jRadioButtonPowerSupply_6;
    private javax.swing.JRadioButton jRadioButtonRAM_3;
    private javax.swing.JRadioButton jRadioHDD_2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPaneAdvancedBrowser;
    private javax.swing.JScrollPane jScrollPaneFoodOrdered;
    private javax.swing.JScrollPane jScrollPaneFoodToOrder;
    private javax.swing.JScrollPane jScrollPaneForMailbox;
    private javax.swing.JScrollPane jScrollPaneLogs;
    private javax.swing.JScrollPane jScrollPaneOrders;
    private javax.swing.JScrollPane jScrollPanePartsOrders;
    private javax.swing.JScrollPane jScrollPaneWriteMail;
    private javax.swing.JTable jTableAdvancedBrowser;
    private javax.swing.JTable jTableFoodOrdered;
    private javax.swing.JTable jTableFoodToOrder;
    private javax.swing.JTable jTableLogs;
    private javax.swing.JTable jTableMailbox;
    private javax.swing.JTable jTableOrders;
    private javax.swing.JTable jTablePartsOrders;
    private javax.swing.JTable jTableRepairs;
    private javax.swing.JTable jTableSellTableCustomer;
    private javax.swing.JTable jTableSellTableWarehouse;
    private javax.swing.JTable jTableWarehouse;
    private javax.swing.JTextArea jTextAreaRepairInfo;
    private javax.swing.JTextArea jTextAreaWriteMail;
    private javax.swing.JTextField jTextFieldAdvBroName;
    private javax.swing.JTextField jTextFieldAdvBroPrice_1;
    private javax.swing.JTextField jTextFieldAdvBroPrice_2;
    private javax.swing.JTextField jTextFieldAdvBroQuantity_1;
    private javax.swing.JTextField jTextFieldAdvBroQuantity_2;
    private javax.swing.JTextField jTextFieldBrowser;
    private javax.swing.JTextField jTextFieldClientsFullName;
    private javax.swing.JTextField jTextFieldClientsName;
    private javax.swing.JTextField jTextFieldEditEmailAdress;
    private javax.swing.JTextField jTextFieldEditFullName;
    private javax.swing.JTextField jTextFieldEditName;
    private javax.swing.JTextField jTextFieldEmailAdress;
    private javax.swing.JTextField jTextFieldFoodPrice;
    private javax.swing.JTextField jTextFieldFoodQuantity;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPartQuantity;
    private javax.swing.JTextField jTextFieldPartsPrice;
    private javax.swing.JTextField jTextFieldPassword1;
    private javax.swing.JTextField jTextFieldPassword2;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldProductRetailPrice;
    private javax.swing.JTextField jTextFieldProductVAT;
    private javax.swing.JTextField jTextFieldSellQuantity;
    // End of variables declaration//GEN-END:variables
}
