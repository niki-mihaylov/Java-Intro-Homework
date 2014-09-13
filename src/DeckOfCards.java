import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCards {
	public static void main(String[] args) throws DocumentException, IOException {
		String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suits = {"\u2660", "\u2663", "\u2665", "\u2666", };
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("d:\\Deck-of-Cards.pdf"));
		document.open();
		BaseFont baseFont = BaseFont.createFont("C:/Windows/Fonts/Arial.ttf", BaseFont.IDENTITY_H, true);
        Font black = new Font(baseFont, 20f, 0, BaseColor.BLACK);
        Font red = new Font(baseFont, 20f, 0, BaseColor.RED);    
        Font color;
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(70); 
        table.getDefaultCell().setFixedHeight(140); 

		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
                if (j == 0 || j == 1) {
					color = black;
				}
                else {
					color = red;
				}
                table.addCell(new Paragraph(cards[i] + suits[j], color));
			}
		}
		document.add(table);
		document.close();
	}
}	
