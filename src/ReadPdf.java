import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPdf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "document/doc.pdf"; 
		File myFile = new File(path);

        try (PDDocument doc = PDDocument.load(myFile)) {

            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(doc);

            System.out.println("Text size: " + text.length() + " characters:");
            System.out.println(text);
        }
	}

}
