package com.ram.convert.pdf;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@RestController
@CrossOrigin
@RequestMapping(path="/text-pdf")
public class TextToPdfController {
	
	private int sl_no=1;
	
	@PostMapping
	public String generateTextToPdf(@RequestBody Text text) throws Exception
	{
		System.out.println(text.getText());
		Document document=new Document(PageSize.A4);
		PdfWriter writer=null;
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat();
		String path="C:/Exathought/Gen_pdf_files/gen_file"+sl_no+".pdf";
		//System.out.println("C:/Exathought/Gen-pdf-files/gen-file"+sl_no+".pdf");
		try 
		{
			writer=PdfWriter.getInstance(document,new FileOutputStream(path));
			document.open();
			String currentdate=sdf.format(date);
			document.add(new Paragraph("created date "+currentdate));
			document.add(new Paragraph(text.getText()));
			sl_no++;
			//System.out.println("the sl_no is "+sl_no);
			return "success";
		}
		catch(DocumentException e1)
		{
			throw new DocumentException("document exception");
		}
		finally 
		{
			if(document!=null)
			{
				try {
					document.close();
					
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
			if(writer!=null)
			{
				try {
					writer.close();
				}
				catch(Exception e4)
				{
					e4.printStackTrace();
				}
			}
		}
	}

}
