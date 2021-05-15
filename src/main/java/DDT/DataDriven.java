package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven
{
    String path="/Users/girishg/eclipse-workspace/KidsBank_TestNG/Excel_Data/Data.xlsx";
	
	public String getdata(String sname ,int rno ,int cno ) throws IOException 
	{
		FileInputStream fis=new FileInputStream(path);
	
		XSSFWorkbook w = new XSSFWorkbook(fis);
		
		XSSFSheet sht = w.getSheet(sname);
		
		String s1 = sht.getRow(rno).getCell(cno).getStringCellValue();
		
		return s1;
		
	}
	
	public String setdata(String sname,int rno,int cno, String n) throws IOException

	{
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook w=new XSSFWorkbook(fis);
		
		XSSFSheet s=w.getSheet(sname);
		
		s.getRow(rno).createCell(cno).setCellValue(n);
		
		FileOutputStream fos=new FileOutputStream(path);
		w.write(fos);
		
		return n;
		
	}
	


}
