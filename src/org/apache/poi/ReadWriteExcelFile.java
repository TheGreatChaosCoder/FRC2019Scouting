package org.apache.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/

public class ReadWriteExcelFile {

	//private static HSSFWorkbook wb;

	//This method is not important
	/*public static void readXLSFile() throws NoClassDefFoundError
	{
		InputStream ExcelFileToRead = new FileInputStream("C:/Scouting.xls");
		HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);

		HSSFSheet sheet=wb.getSheetAt(0);
		HSSFRow row; 
		HSSFCell cell;

		Iterator rows = sheet.rowIterator();

		while (rows.hasNext())
		{
			row=(HSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			
			while (cells.hasNext())
			{
				cell=(HSSFCell) cells.next();
		
				if (cell.getCellType() == CellType.STRING)
				{
					System.out.print(cell.getStringCellValue()+" ");
				}
				else if(cell.getCellType() == CellType.NUMERIC)
				{
					System.out.print(cell.getNumericCellValue()+" ");
				}
				else
				{
					//U Can Handel Boolean, Formula, Errors
				}
			}
			System.out.println();
		}
	
	}*/
	
	//This is the only important method
	//Requires ALL information
	public static void writeXLSFile(int roundNumber, int teamNumber, String whichSide, int hatchNumberSS, int hatchNumberPSS,
		                        	String hatchTypeSS, String hatchTypePSS, int ballNumberSS, int ballNumberPSS, String ballTypeSS, 
			                        String ballTypePSS, int autoRating, int defenseRating, String commonComments, String otherComments) 
			                        throws NoClassDefFoundError, IOException, FileNotFoundException
			                        {
		File file;
		FileInputStream fIPS;
		try{
		fIPS= new FileInputStream(System.getProperty("user.home")+"/Scouting2019.xls");
		file= new File(System.getProperty("user.home")+"/Scouting2019.xls");//Read the spreadsheet that needs to be updated
		}catch (Exception e){
		file = new File(System.getProperty("user.home")+"/Scouting2019.xls");
		//file.createNewFile();
		//fIPS= new FileInputStream(System.getProperty("user.home")+"/Scouting2019.xls");
		}
        Workbook wb;
        Sheet sheet;
        if(file.exists()) {
            //wb = new HSSFWorkbook(fIPS); //If there is already data in a workbook
        	wb = WorkbookFactory.create(file);
           sheet = wb.getSheetAt(0);
        }else{
        	file.createNewFile();
        	fIPS= new FileInputStream(System.getProperty("user.home")+"/Scouting2019.xls");
            wb = new HSSFWorkbook();    //if the workbook was just created
            sheet = wb.createSheet("Scouting Info");
        }
       // fIPS.close();
    
	        
		//String excelFileName = System.getProperty("user.home")+"/Poyo.xls";//name of excel file

	//	String sheetName = "Scouting Info";//name of sheet

		//wb = new HSSFWorkbook();
		//HSSFSheet sheet = wb.createSheet(sheetName) ;
		
		System.out.print("poyo poyo ");	
		
		Row row;
		
		//For headers of each column
		row = sheet.createRow(0);
		
		Cell roundNumberHeaderCell = row.createCell(0);
		Cell teamNumberHeaderCell = row.createCell(1);
		Cell sideHeaderCell = row.createCell(2);
		Cell hatchNumberSSHeaderCell = row.createCell(3);
		Cell hatchTypeSSHeaderCell = row.createCell(4);
		Cell ballNumberSSHeaderCell = row.createCell(5);
		Cell ballTypeSSHeaderCell = row.createCell(6);
		Cell hatchNumberPSSHeaderCell = row.createCell(7);
		Cell hatchTypePSSHeaderCell = row.createCell(8);
		Cell ballNumberPSSHeaderCell = row.createCell(9);
		Cell ballTypePSSHeaderCell = row.createCell(10);
		Cell hatchNumberTotalHeaderCell = row.createCell(11);
		Cell ballNumberTotalHeaderCell = row.createCell(12);
		Cell autoRatingHeaderCell = row.createCell(13);
		Cell defenseRatingHeaderCell = row.createCell(14);
		Cell commonCommentsHeaderCell = row.createCell(15);
		Cell otherCommentsHeaderCell = row.createCell(16);
		
		roundNumberHeaderCell.setCellValue("Round Number");
		teamNumberHeaderCell.setCellValue("Team Number");
		sideHeaderCell.setCellValue("Side On");
		hatchNumberSSHeaderCell.setCellValue("Number of Hatches (SS)");
		hatchTypeSSHeaderCell.setCellValue("Types of Hatches (SS)");
		ballNumberSSHeaderCell.setCellValue("Number of Balls (SS)");
		ballTypeSSHeaderCell.setCellValue("Types of Balls (SS)");
		hatchNumberPSSHeaderCell.setCellValue("Number of Hatches (PSS)");
		hatchTypePSSHeaderCell.setCellValue("Types of Hatches (PSS)");
		ballNumberPSSHeaderCell.setCellValue("Number of Balls (PSS)");
		ballTypePSSHeaderCell.setCellValue("Number of Balls (PSS)");
		hatchNumberTotalHeaderCell.setCellValue("Total Number of Hatches");
		ballNumberTotalHeaderCell.setCellValue("Total Number of Balls");
		autoRatingHeaderCell.setCellValue("Autonomous Rating");
		defenseRatingHeaderCell.setCellValue("Defensive Rating");
		commonCommentsHeaderCell.setCellValue("Common Comments");
		otherCommentsHeaderCell.setCellValue("Other Comments");
		
		//------------------------------------------------------
			
		//For giving excel the gathered information
			if(roundNumber==0){
			row = sheet.createRow(roundNumber + 1);
			}
			else{
				row = sheet.createRow(roundNumber);
			}
			
				Cell roundNumberCell = row.createCell(0);
				Cell teamNumberCell = row.createCell(1);
				Cell sideCell = row.createCell(2);
				Cell hatchNumberSSCell = row.createCell(3);
				Cell hatchTypeSSCell = row.createCell(4);
				Cell hatchNumberPSSCell = row.createCell(5);
				Cell hatchTypePSSCell = row.createCell(6);
				Cell ballNumberSSCell = row.createCell(7);
				Cell ballTypeSSCell = row.createCell(8);
				Cell ballNumberPSSCell = row.createCell(9);
				Cell ballTypePSSCell = row.createCell(10);
				Cell hatchNumberTotalCell = row.createCell(11);
				Cell ballNumberTotalCell = row.createCell(12);
				Cell autoRatingCell = row.createCell(13);
				Cell defenseRatingCell = row.createCell(14);
				Cell commonCommentsCell = row.createCell(15);
				Cell otherCommentsCell = row.createCell(16);
				
				
				roundNumberCell.setCellValue(roundNumber);
				teamNumberCell.setCellValue(teamNumber);
				sideCell.setCellValue(whichSide);
				hatchNumberSSCell.setCellValue(hatchNumberSS);
				hatchTypeSSCell.setCellValue(hatchTypeSS);
				hatchNumberPSSCell.setCellValue(hatchNumberPSS);
				hatchTypePSSCell.setCellValue(hatchTypePSS);
				ballNumberSSCell.setCellValue(ballNumberSS);
				ballTypeSSCell.setCellValue(ballTypeSS);
				ballNumberPSSCell.setCellValue(ballNumberPSS);
				ballTypePSSCell.setCellValue(ballTypePSS);
				hatchNumberTotalCell.setCellValue(hatchNumberPSS + hatchNumberSS);
				ballNumberTotalCell.setCellValue(ballNumberPSS + ballNumberSS);
				autoRatingCell.setCellValue(autoRating);
				defenseRatingCell.setCellValue(defenseRating);
				commonCommentsCell.setCellValue(commonComments);
				otherCommentsCell.setCellValue(otherComments);
	
		/*for (int r=0;r < 5; r++ )
		{
			HSSFRow row = sheet.createRow(r);
	
			//iterating c number of columns
			for (int c=0;c < 5; c++ )
			{
				HSSFCell cell = row.createCell(c);
				
				cell.setCellValue("Cell "+r+" "+c + "big poyo");
			}
		}*/
	
		
		FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.home")+"/Scouting2019.xls");
		
		//write this workbook to an Outputstream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
		wb.close();
		
		System.out.println("Export Completed");
	}
	
	
	
	//You can't do the commented methods
	/*public static void readXLSXFile() throws IOException
	{
		InputStream ExcelFileToRead = new FileInputStream("C:/Test.xlsx");
		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
		
		XSSFWorkbook test = new XSSFWorkbook(); 
		
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row; 
		XSSFCell cell;

		Iterator rows = sheet.rowIterator();

		while (rows.hasNext())
		{
			row=(XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			while (cells.hasNext())
			{
				cell=(XSSFCell) cells.next();
		
				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
				{
					System.out.print(cell.getStringCellValue()+" ");
				}
				else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
				{
					System.out.print(cell.getNumericCellValue()+" ");
				}
				else
				{
					//U Can Handel Boolean, Formula, Errors
				}
			}
			System.out.println();
		}
	
	}
	
	public static void writeXLSXFile() throws IOException {
		
		String excelFileName = "C:/Test.xlsx";//name of excel file

		String sheetName = "Sheet1";//name of sheet

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(sheetName) ;

		//iterating r number of rows
		for (int r=0;r < 5; r++ )
		{
			XSSFRow row = sheet.createRow(r);

			//iterating c number of columns
			for (int c=0;c < 5; c++ )
			{
				XSSFCell cell = row.createCell(c);
	
				cell.setCellValue("Cell "+r+" "+c);
			}
		}

		FileOutputStream fileOut = new FileOutputStream(excelFileName);

		//write this workbook to an Outputstream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}*/

	public static void main(String[] args) throws IOException {
	
		//writeXLSFile(RoundNumber.getRoundNumber(), TeamNumber.getTeamNumber(), Results.whichSide(), Results.countHatches(),
       //         Results.whichHatches(), Results.countBalls(), Results.whichBalls(), Comments.getCommonComments(), Comments.getOtherComments());
		//readXLSFile();
		
		//writeXLSXFile();
		//readXLSXFile();

	}

}
