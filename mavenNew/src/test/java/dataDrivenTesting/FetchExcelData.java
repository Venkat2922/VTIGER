package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\INDIA\\eclipse-workspace\\SMav-9\\Practice.xlsx");
Workbook book=WorkbookFactory.create(fis);
org.apache.poi.ss.usermodel.Sheet sh=book.getSheet("venkat");
DataFormatter df=new DataFormatter();
String data=df.formatCellValue(sh.getRow(1).getCell(1));
System.out.println(data);

	}

}
