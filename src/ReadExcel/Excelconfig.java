package ReadExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconfig {
	
	XSSFSheet sheet;
	XSSFWorkbook wb;
	XSSFRow  row;
	XSSFCell cell;
	public  Excelconfig(String excelpath) throws FileNotFoundException{
		try{
		File file =new File(excelpath);
		FileInputStream fis=new FileInputStream(file);
		 wb=new XSSFWorkbook(fis);
		// sheet=wb.getSheetAt(0);
		}
		catch(Exception e){
			
			System.out.println("issue"+  e); 
		}
	}
	
	public void copyExcelSheet(String inputSheet, String outputSheet, String sheetname)  {
		try{	
			//Locate path and file of input excel.
			File inputFile=new File(inputSheet);
			XSSFWorkbook inputWorkbook=new XSSFWorkbook(inputFile);
			
			int inputSheetCount=inputWorkbook.getNumberOfSheets();
			System.out.println("Input sheetCount: "+inputSheetCount);
			
			// Locate path and file of output excel.
				File outputFile=new File(outputSheet);
				FileOutputStream fos=new FileOutputStream(outputFile);
				
				//XSSFWorkbook  outputWorkbook=inputWorkbook;
				XSSFWorkbook  outputWorkbook=inputWorkbook;
				outputWorkbook.createSheet(sheetname);
				outputWorkbook.write(fos);
				
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	public String getData(int sheetnumber,int row, int col){
		sheet=wb.getSheetAt(sheetnumber);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int rowCount(int sheetnumber){
		sheet=wb.getSheetAt(sheetnumber);
		int totalRows=sheet.getPhysicalNumberOfRows();
		return totalRows;
		}
	
	public int getcolumncount(String sheetName, int rownum){
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int totalcolumns=row.getLastCellNum();
		System.out.println("total column in excel  :"+totalcolumns);
		return totalcolumns;
	}
	public String getcellData(String sheetname,  int rowNum,  int colNum){
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(rowNum);
		String cellvalue=null;
		for(int i=0;i<sheet.getLastRowNum();i++){
			
			 cellvalue=row.getCell(colNum).getStringCellValue();
		}
		return cellvalue;
		}
	public String GetspecificColumndata(String Sheetname, int colnum){
		String cellvalue=null;
		sheet=wb.getSheet(Sheetname);
		//row=sheet.getRow(rownum);
		int rowN=sheet.getLastRowNum()+1;
		int col=row.getLastCellNum();
		int count=0;
		for(int i=1;i<rowN;i++){
			row=sheet.getRow(i);
			cell=row.getCell(colnum);
			cellvalue=cell.getStringCellValue();
			System.out.println("Cell Values:=> "+ cellvalue);
			if(cellvalue.contains("remiere")){
				
				System.out.println("Test case has been passed");
				count=count+1;
			}
		}
		System.out.println("total count: " +count);
		return cellvalue;
		
	}
	
	
}
	
	
