/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PdfFiles {
  private static String FILE = "C:/Users/Dominik/Computer-Service-ERP/Pliki PDF/FirstPdf.pdf";
  private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
      Font.BOLD);
  private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
      Font.NORMAL, BaseColor.RED);
  private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
      Font.BOLD);
  private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
      Font.BOLD);


  
  
  public static void createPdf(java.util.List<Product> selling_list) {
    try {
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream(FILE));
      document.open();
      addTitlePage(document);
      //addContent(document);
      createTable2(document,selling_list);
      
      document.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }



  public static void addTitlePage(Document document)
      throws DocumentException {
      Paragraph title = new Paragraph("Paragon",catFont);
      title.setAlignment(Element.ALIGN_CENTER);
      document.add(title);
    Paragraph preface = new Paragraph();
    addEmptyLine(preface, 1);
    preface.add(new Paragraph("Wygenerowano: "   + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        smallBold));
    addEmptyLine(preface, 5);
    document.add(preface);
    
    
  }

  public static void addContent(Document document) throws DocumentException {
    Anchor anchor = new Anchor("First Chapter", catFont);
    anchor.setName("First Chapter");

    // Second parameter is the number of the chapter
    Chapter catPart = new Chapter(new Paragraph(anchor), 1);

    Paragraph subPara = new Paragraph("Subcategory 1", subFont);
    Section subCatPart = catPart.addSection(subPara);
    subCatPart.add(new Paragraph("Hello"));

    subPara = new Paragraph("Subcategory 2", subFont);
    subCatPart = catPart.addSection(subPara);
    subCatPart.add(new Paragraph("Paragraph 1"));
    subCatPart.add(new Paragraph("Paragraph 2"));
    subCatPart.add(new Paragraph("Paragraph 3"));

    // add a list
    createList(subCatPart);
    Paragraph paragraph = new Paragraph();
    addEmptyLine(paragraph, 5);
    subCatPart.add(paragraph);

    // add a table
    createTable(subCatPart);

    // now add all this to the document
    document.add(catPart);

    // Next section
    anchor = new Anchor("Second Chapter", catFont);
    anchor.setName("Second Chapter");

    // Second parameter is the number of the chapter
    catPart = new Chapter(new Paragraph(anchor), 1);

    subPara = new Paragraph("Subcategory", subFont);
    subCatPart = catPart.addSection(subPara);
    subCatPart.add(new Paragraph("This is a very important message"));

    // now add all this to the document
    document.add(catPart);

  }

  private static void createTable(Section subCatPart)
      throws BadElementException {
    PdfPTable table = new PdfPTable(3);

    // t.setBorderColor(BaseColor.GRAY);
    // t.setPadding(4);
    // t.setSpacing(4);
    // t.setBorderWidth(1);

    PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Table Header 2"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Table Header 3"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
    table.setHeaderRows(1);

    table.addCell("1.0");
    table.addCell("1.1");
    table.addCell("1.2");
    table.addCell("2.1");
    table.addCell("2.2");
    table.addCell("2.3");

    subCatPart.add(table);

  }

  private static void createList(Section subCatPart) {
    List list = new List(true, false, 10);
    list.add(new ListItem("First point"));
    list.add(new ListItem("Second point"));
    list.add(new ListItem("Third point"));
    subCatPart.add(list);
  }

  private static void addEmptyLine(Paragraph paragraph, int number) {
    for (int i = 0; i < number; i++) {
      paragraph.add(new Paragraph(" "));
    }
  }

    private static void createTable2(Document document,java.util.List<Product> selling_list) {
        PdfPTable table = new PdfPTable(4);
        
    PdfPCell c1 = new PdfPCell(new Phrase("Nazwa"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Cena"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("VAT"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Ilosc"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
    
    //table.setHeaderRows(1);

    /*table.addCell("1.0");
    table.addCell("1.1");
    table.addCell("1.2");
    table.addCell("2.1");
    table.addCell("2.2");
    table.addCell("2.3");*/
    
    for(Product p : selling_list){
        table.addCell(p.getName());
        table.addCell(Double.toString(p.getRetail_price()));
        table.addCell(Double.toString(p.getVat()));
        table.addCell(Integer.toString(p.getQuantity()));
        
    }
    
      try {
          document.add(table);
      } catch (DocumentException ex) {
          JOptionPane.showMessageDialog(null, "Error genrating Invoice");
          Logger.getLogger(PdfFiles.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

} 
