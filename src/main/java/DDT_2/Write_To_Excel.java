package DDT_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_To_Excel {
	
	
	public void Write_Me(String BankerID , String UserName , String Passsword , String Result ) throws EncryptedDocumentException, IOException
	{
		InputStream inp = new FileInputStream("/Users/girishg/eclipse-workspace/KidsBank_TestNG/Wrte_result.xlsx");
		Workbook wb = WorkbookFactory.create(inp);

		Sheet sh =  wb.getSheet("LogIn Test Results");
  
		int num = sh.getLastRowNum();
	    Row row = sh.createRow(++num);
	    
	    
        // This data needs to be written (Object[])
        Map<Integer, Object[]> data = new TreeMap<Integer, Object[]>();
        
        data.put(1, new Object[]{ "ID", "NAME", "LASTNAME"  });
        
	        data.put(2, new Object[]{ num, BankerID, UserName ,Passsword ,Result });
        
		
        // Iterate over data and write to sheet
        Set<Integer> keyset = data.keySet();
        int rownum = 0;
        for (Integer key : keyset)
        {
           
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
                // this line creates a cell in the next column of that row
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String)obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
      
        try 
        {
            // this Writes the workbook gfgcontribute
        	FileOutputStream fileOut = new FileOutputStream("/Users/girishg/eclipse-workspace/KidsBank_TestNG/Wrte_result.xlsx");
            wb.write(fileOut);
            fileOut.close();
            System.out.println("Wrte_result.xlsx written successfully on disk.");
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
	}

}
