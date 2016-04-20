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
  private static String FILE = "C:/Users/Dominik/Computer-Service-ERP/Pliki PDF/Faktura.pdf";
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
      
      createTable(document,selling_list);
      
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

  
  
  
  private static void addEmptyLine(Paragraph paragraph, int number) {
    for (int i = 0; i < number; i++) {
      paragraph.add(new Paragraph(" "));
    }
  }

    private static void createTable(Document document,java.util.List<Product> selling_list) {
        PdfPTable table = new PdfPTable(4);
        Double price = 0.0;
        
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
    
    
    for(Product p : selling_list){
        table.addCell(p.getName());
        table.addCell(Double.toString(p.getRetail_price()));
        table.addCell(Double.toString(p.getVat()));
        table.addCell(Integer.toString(p.getQuantity()));
        //price += p.getRetail_price() * (1 + p.getVat()) * p.getQuantity();
        
    }
    Function f = new Function();
    price = f.getPriceFromProductList(selling_list);
      try {

          Paragraph p = new Paragraph();
          p.add(table);
          addEmptyLine(p, 2);
          Paragraph p2 = new  Paragraph(Double.toString(price) + " PLN");
          p2.setAlignment(Element.ALIGN_RIGHT);
          p.add(p2);
          document.add(p);
      } catch (DocumentException ex) {
          JOptionPane.showMessageDialog(null, "Error genrating Invoice");
          Logger.getLogger(PdfFiles.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
}
}
