package com.ram.convert.pdf;

import java.io.FileOutputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@SpringBootApplication
public class TextToPdfConverterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TextToPdfConverterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Document document=new Document(PageSize.A4);
		PdfWriter writer=null;
		try 
		{
		    writer=PdfWriter.getInstance(document,new FileOutputStream("C:/Exathought/Gen-pdf-files/first.pdf"));
			String text="this is ramachandiran i am writing my text into the pdf file this is first testing pdf generator file texting with multiple line testing and reading and writing text file at the end of file line by line i am writing at the part of session at all fjdsd dfnjdsfsdkj kfjdfjs jjbfdbkds jbjbjfds kbdjfbjfs jhfdfjksd kjbfdj kjdbdsjf  kjdbfsfs kjbfs";
			document.open();
			document.add(new Paragraph(text));
			document.close();
			writer.close();
			
		}
		catch(DocumentException e)
		{
			e.printStackTrace();
		}*/
		
		
	}

}
