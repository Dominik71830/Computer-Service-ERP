/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Point;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dominik
 */
public class FunctionTest {
    
    public FunctionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of encrypt method, of class Function.
     */
    @Test
    public void testEncrypt() throws Exception {
        System.out.println("encrypt");
        String valueToEnc = "";
        Function instance = new Function();
        String expResult = "";
        String result = instance.encrypt(valueToEnc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class Function.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String encryptedValue = "";
        Function instance = new Function();
        String expResult = "";
        String result = instance.decrypt(encryptedValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class Function.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        int index = 0;
        Function instance = new Function();
        String expResult = "";
        String result = instance.getPosition(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployees method, of class Function.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        Function instance = new Function();
        List<Employee> expResult = null;
        List<Employee> result = instance.getAllEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmails method, of class Function.
     */
    @Test
    public void testGetAllEmails() {
        System.out.println("getAllEmails");
        Function instance = new Function();
        List<Email> expResult = null;
        List<Email> result = instance.getAllEmails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllRepairs method, of class Function.
     */
    @Test
    public void testGetAllRepairs() {
        System.out.println("getAllRepairs");
        Function instance = new Function();
        List<Repair> expResult = null;
        List<Repair> result = instance.getAllRepairs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Function.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        int index = 0;
        Function instance = new Function();
        String expResult = "";
        String result = instance.getCategory(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllProducts method, of class Function.
     */
    @Test
    public void testGetAllProducts() {
        System.out.println("getAllProducts");
        Function instance = new Function();
        List<Product> expResult = null;
        List<Product> result = instance.getAllProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertStringCodeToProductsList method, of class Function.
     */
    @Test
    public void testConvertStringCodeToProductsList() {
        System.out.println("convertStringCodeToProductsList");
        String string = "";
        Function instance = new Function();
        List<Product> expResult = null;
        List<Product> result = instance.convertStringCodeToProductsList(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllOrders method, of class Function.
     */
    @Test
    public void testGetAllOrders() {
        System.out.println("getAllOrders");
        Function instance = new Function();
        List<Order> expResult = null;
        List<Order> result = instance.getAllOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeByID method, of class Function.
     */
    @Test
    public void testGetEmployeeByID() {
        System.out.println("getEmployeeByID");
        int id = 0;
        Function instance = new Function();
        Employee expResult = null;
        Employee result = instance.getEmployeeByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillComboboxWithEmployees method, of class Function.
     */
    @Test
    public void testFillComboboxWithEmployees() {
        System.out.println("fillComboboxWithEmployees");
        JComboBox<Employee> combobox = null;
        Function instance = new Function();
        instance.fillComboboxWithEmployees(combobox);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmail method, of class Function.
     */
    @Test
    public void testAddEmail() {
        System.out.println("addEmail");
        Email temp = null;
        Function instance = new Function();
        instance.addEmail(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillComboboxWithEmployeesWithoutUser method, of class Function.
     */
    @Test
    public void testFillComboboxWithEmployeesWithoutUser() {
        System.out.println("fillComboboxWithEmployeesWithoutUser");
        JComboBox combobox = null;
        Employee user = null;
        Function instance = new Function();
        instance.fillComboboxWithEmployeesWithoutUser(combobox, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmailsForUser method, of class Function.
     */
    @Test
    public void testGetAllEmailsForUser() {
        System.out.println("getAllEmailsForUser");
        Employee user = null;
        Function instance = new Function();
        List<Email> expResult = null;
        List<Email> result = instance.getAllEmailsForUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRepair method, of class Function.
     */
    @Test
    public void testAddRepair() {
        System.out.println("addRepair");
        Repair temp = null;
        Function instance = new Function();
        instance.addRepair(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailChecked method, of class Function.
     */
    @Test
    public void testSetEmailChecked() {
        System.out.println("setEmailChecked");
        Email email = null;
        Function instance = new Function();
        instance.setEmailChecked(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillTableWithEmailsForUser method, of class Function.
     */
    @Test
    public void testFillTableWithEmailsForUser() {
        System.out.println("fillTableWithEmailsForUser");
        JTable jTableMailbox = null;
        Employee user = null;
        Function instance = new Function();
        instance.fillTableWithEmailsForUser(jTableMailbox, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of thereIsNewMail method, of class Function.
     */
    @Test
    public void testThereIsNewMail() {
        System.out.println("thereIsNewMail");
        Employee user = null;
        Function instance = new Function();
        boolean expResult = false;
        boolean result = instance.thereIsNewMail(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillTableWithRepairs method, of class Function.
     */
    @Test
    public void testFillTableWithRepairs() {
        System.out.println("fillTableWithRepairs");
        JTable jTableRepairs = null;
        Function instance = new Function();
        instance.fillTableWithRepairs(jTableRepairs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRepairExecuted method, of class Function.
     */
    @Test
    public void testSetRepairExecuted() {
        System.out.println("setRepairExecuted");
        Repair temp = null;
        Function instance = new Function();
        instance.setRepairExecuted(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillTableWithAllProducts method, of class Function.
     */
    @Test
    public void testFillTableWithAllProducts() {
        System.out.println("fillTableWithAllProducts");
        JTable jTableProducts = null;
        Function instance = new Function();
        instance.fillTableWithAllProducts(jTableProducts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoodProducts method, of class Function.
     */
    @Test
    public void testGetFoodProducts() {
        System.out.println("getFoodProducts");
        Function instance = new Function();
        List<Product> expResult = null;
        List<Product> result = instance.getFoodProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillTableWithFoodProducts method, of class Function.
     */
    @Test
    public void testFillTableWithFoodProducts() {
        System.out.println("fillTableWithFoodProducts");
        JTable jTableProducts = null;
        Function instance = new Function();
        instance.fillTableWithFoodProducts(jTableProducts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartsProducts method, of class Function.
     */
    @Test
    public void testGetPartsProducts() {
        System.out.println("getPartsProducts");
        Function instance = new Function();
        List<Product> expResult = null;
        List<Product> result = instance.getPartsProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillTableWithPartsProducts method, of class Function.
     */
    @Test
    public void testFillTableWithPartsProducts_JTable() {
        System.out.println("fillTableWithPartsProducts");
        JTable jTableProducts = null;
        Function instance = new Function();
        instance.fillTableWithPartsProducts(jTableProducts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchPartsProducts method, of class Function.
     */
    @Test
    public void testSearchPartsProducts() {
        System.out.println("searchPartsProducts");
        String name = "";
        Function instance = new Function();
        List<Product> expResult = null;
        List<Product> result = instance.searchPartsProducts(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillTableWithPartsProducts method, of class Function.
     */
    @Test
    public void testFillTableWithPartsProducts_JTable_String() {
        System.out.println("fillTableWithPartsProducts");
        JTable jTableProducts = null;
        String name = "";
        Function instance = new Function();
        instance.fillTableWithPartsProducts(jTableProducts, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeColumn method, of class Function.
     */
    @Test
    public void testRemoveColumn() {
        System.out.println("removeColumn");
        JTable table = null;
        int x = 0;
        Function instance = new Function();
        instance.removeColumn(table, x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectColumns method, of class Function.
     */
    @Test
    public void testSelectColumns() {
        System.out.println("selectColumns");
        JTable jTableFoodOrdered = null;
        JTable jTableFoodToOrder = null;
        Function instance = new Function();
        instance.selectColumns(jTableFoodOrdered, jTableFoodToOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refreshOrderedFood method, of class Function.
     */
    @Test
    public void testRefreshOrderedFood() {
        System.out.println("refreshOrderedFood");
        JTable jTableFoodOrdered = null;
        List<Product> ordered_list = null;
        Function instance = new Function();
        instance.refreshOrderedFood(jTableFoodOrdered, ordered_list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsProductID method, of class Function.
     */
    @Test
    public void testContainsProductID() {
        System.out.println("containsProductID");
        List<Product> ordered_list = null;
        Product temp = null;
        Function instance = new Function();
        boolean expResult = false;
        boolean result = instance.containsProductID(ordered_list, temp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrder method, of class Function.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Order temp = null;
        Function instance = new Function();
        instance.addOrder(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertProductListToStringCode method, of class Function.
     */
    @Test
    public void testConvertProductListToStringCode() {
        System.out.println("convertProductListToStringCode");
        List<Product> list = null;
        Function instance = new Function();
        String expResult = "";
        String result = instance.convertProductListToStringCode(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategorisedProducts method, of class Function.
     */
    @Test
    public void testGetCategorisedProducts() {
        System.out.println("getCategorisedProducts");
        int category = 0;
        Function instance = new Function();
        List<Product> expResult = null;
        List<Product> result = instance.getCategorisedProducts(category);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillComboboxWithPartsCat method, of class Function.
     */
    @Test
    public void testFillComboboxWithPartsCat() {
        System.out.println("fillComboboxWithPartsCat");
        JComboBox<Product> combobox = null;
        int category = 0;
        Function instance = new Function();
        instance.fillComboboxWithPartsCat(combobox, category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refreshProductTable method, of class Function.
     */
    @Test
    public void testRefreshProductTable() {
        System.out.println("refreshProductTable");
        JTable jTablePartsOrders = null;
        List<Product> ordered_list = null;
        Function instance = new Function();
        instance.refreshProductTable(jTablePartsOrders, ordered_list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceFromProductList method, of class Function.
     */
    @Test
    public void testGetPriceFromProductList() {
        System.out.println("getPriceFromProductList");
        List<Product> list = null;
        Function instance = new Function();
        Double expResult = null;
        Double result = instance.getPriceFromProductList(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderExecuted method, of class Function.
     */
    @Test
    public void testSetOrderExecuted() {
        System.out.println("setOrderExecuted");
        Order temp = null;
        Function instance = new Function();
        instance.setOrderExecuted(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillTableWithOrders method, of class Function.
     */
    @Test
    public void testFillTableWithOrders() {
        System.out.println("fillTableWithOrders");
        JTable jTableOrders = null;
        Function instance = new Function();
        instance.fillTableWithOrders(jTableOrders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmail method, of class Function.
     */
    @Test
    public void testDeleteEmail() {
        System.out.println("deleteEmail");
        Email temp = null;
        Function instance = new Function();
        instance.deleteEmail(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQuantityToProduct method, of class Function.
     */
    @Test
    public void testAddQuantityToProduct() {
        System.out.println("addQuantityToProduct");
        List<Product> ordered_list = null;
        Product temp = null;
        Function instance = new Function();
        instance.addQuantityToProduct(ordered_list, temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllLogs method, of class Function.
     */
    @Test
    public void testGetAllLogs() {
        System.out.println("getAllLogs");
        Function instance = new Function();
        List<Log> expResult = null;
        List<Log> result = instance.getAllLogs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllLogsForOrder method, of class Function.
     */
    @Test
    public void testGetAllLogsForOrder() {
        System.out.println("getAllLogsForOrder");
        Order temp = null;
        Function instance = new Function();
        List<Log> expResult = null;
        List<Log> result = instance.getAllLogsForOrder(temp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImageForJLabel method, of class Function.
     */
    @Test
    public void testSetImageForJLabel() {
        System.out.println("setImageForJLabel");
        JLabel jLabelImagePart = null;
        String srcimagesgpupng = "";
        Function instance = new Function();
        instance.setImageForJLabel(jLabelImagePart, srcimagesgpupng);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmployee method, of class Function.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        Employee temp = null;
        Position p = null;
        Function instance = new Function();
        instance.addEmployee(temp, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPositions method, of class Function.
     */
    @Test
    public void testGetAllPositions() {
        System.out.println("getAllPositions");
        Function instance = new Function();
        List<Position> expResult = null;
        List<Position> result = instance.getAllPositions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillComboboxWithPositions method, of class Function.
     */
    @Test
    public void testFillComboboxWithPositions() {
        System.out.println("fillComboboxWithPositions");
        JComboBox jComboBoxPosition = null;
        Function instance = new Function();
        instance.fillComboboxWithPositions(jComboBoxPosition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class Function.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        Employee user = null;
        Position p = null;
        Function instance = new Function();
        instance.updateUser(user, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantityForProduct method, of class Function.
     */
    @Test
    public void testSetQuantityForProduct() {
        System.out.println("setQuantityForProduct");
        Product temp = null;
        Function instance = new Function();
        instance.setQuantityForProduct(temp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQuantities method, of class Function.
     */
    @Test
    public void testAddQuantities() {
        System.out.println("addQuantities");
        List<Product> list = null;
        Function instance = new Function();
        instance.addQuantities(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of distancebetween2Points method, of class Function.
     */
    @Test
    public void testDistancebetween2Points() {
        System.out.println("distancebetween2Points");
        Point p1 = null;
        Point p2 = null;
        Function instance = new Function();
        double expResult = 0.0;
        double result = instance.distancebetween2Points(p1, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillTableWithPartsProductsByID method, of class Function.
     */
    @Test
    public void testFillTableWithPartsProductsByID() {
        System.out.println("fillTableWithPartsProductsByID");
        JTable jTableProducts = null;
        int id = 0;
        Function instance = new Function();
        instance.fillTableWithPartsProductsByID(jTableProducts, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeOthersJPanels method, of class Function.
     */
    @Test
    public void testCloseOthersJPanels() {
        System.out.println("closeOthersJPanels");
        JPanel p1 = null;
        JPanel p2 = null;
        JPanel p3 = null;
        JPanel p4 = null;
        JPanel p5 = null;
        JPanel p6 = null;
        JPanel p7 = null;
        JPanel p8 = null;
        JPanel p9 = null;
        JPanel p10 = null;
        JPanel p11 = null;
        JPanel p12 = null;
        Function instance = new Function();
        instance.closeOthersJPanels(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillComboboxWithPartsCategories method, of class Function.
     */
    @Test
    public void testFillComboboxWithPartsCategories() {
        System.out.println("fillComboboxWithPartsCategories");
        JComboBox<Category> combobox = null;
        Function instance = new Function();
        instance.fillComboboxWithPartsCategories(combobox);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCategories method, of class Function.
     */
    @Test
    public void testGetAllCategories() {
        System.out.println("getAllCategories");
        Function instance = new Function();
        List<Category> expResult = null;
        List<Category> result = instance.getAllCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Function.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        Product temp = null;
        Category c = null;
        Function instance = new Function();
        instance.addProduct(temp, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substractQuantities method, of class Function.
     */
    @Test
    public void testSubstractQuantities() {
        System.out.println("substractQuantities");
        List<Product> list = null;
        Function instance = new Function();
        instance.substractQuantities(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
