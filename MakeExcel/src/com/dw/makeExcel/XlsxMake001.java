package com.dw.makeExcel;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class XlsxMake001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet();
        Vector<String> newContent = new Vector<String>();
        
        for(int rNum = 0; rNum < 200000; rNum++){
		        newContent.add(rNum,"캬캬 타타 하하 랄라라");
		        if (rNum % 100000 == 0){
		        	System.out.println("지금 작업은"+rNum+"번째입니다.");
		        }
        }
        
        String FullPath = "d:/test/a.xlsx";
        // 해당 시트의 행별로 결과값 입력
        for(int rownum = 0; rownum < newContent.size(); rownum++) 
        {
     	  Row r = sheet.createRow(rownum);     	  


     	  // 열별로 나눔 구분자 '\t'
     	  String[] str = newContent.get(rownum).split("	");
     	  for(int cellnum = 0; cellnum < str.length; cellnum++) 
     	  {
     		  Cell c = r.createCell(cellnum);
     		  c.setCellValue(str[cellnum]);
     	  }
        }
        
        // 해당 워크시트를 저장함.
        FileOutputStream stream = null;
		try {
			stream = new FileOutputStream(FullPath);
			wb.write(stream);
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
