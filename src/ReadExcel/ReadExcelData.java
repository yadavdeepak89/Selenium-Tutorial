	package ReadExcel;
	
	import java.io.FileNotFoundException;
	
	public class ReadExcelData {
		static Excelconfig excel;
		public static void main(String[] args) {
			
			try {
				excel = new Excelconfig("E:\\Search_Dashboard_Export_12083_06132018054745086.xlsx");
				excel.copyExcelSheet("F:\\Testexcel\\excel1.xlsx", "F:\\Testexcel\\excel2.xlsx", "ABC");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("Total Cell value:  "+excel.getData(0, 2, 1));
			//System.out.println("Total row count:  "+excel.rowCount(1));
			System.out.println("Total column in sheet: " +excel.getcolumncount("Master-1", 1));
			System.out.println("Get column value: " +excel.getcellData("Instance-1", 1, 3));
			System.out.println("All values of specific column: "+excel.GetspecificColumndata("Instance-1", 5));
		}
	
	}
