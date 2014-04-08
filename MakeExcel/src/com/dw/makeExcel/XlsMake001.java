package com.dw.makeExcel;

import java.io.File;
import java.io.IOException;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;

import org.apache.log4j.Logger;

import com.dw.common.JDBSrcEmis1_Promtest;
import com.dw.common.JDBUtil;
import com.dw.common.StrUtil;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class XlsMake001 extends Thread 
{
	static 			Logger 				logg 					= org.apache.log4j.Logger.getRootLogger();

	public XlsMake001()
	{}
	
    @SuppressWarnings("rawtypes")
	public void run()
    {
    	JDBSrcEmis1_Promtest	jdbSrc					= JDBSrcEmis1_Promtest.getInstance();
    	Connection        		jdbConnSrc				= jdbSrc.getConnection();

    	PreparedStatement   	pstSrc             		= null;
    	ResultSet           	resQury             	= null;

    	JDBUtil             	jdbUtil             	= new JDBUtil();
    	HashMap					mapPar1					= new HashMap();
    	int						intCnt1					= 10000;
    	int						intK1					= 2460;
    	int						intK2					= 0;
    	String					strSQL1					= jdbUtil.getSQL("/sql/excel/", "selectDA");
        int						intParaIndx				= 0;
		int 					i						= 0;

		WritableWorkbook  wkbWorkBook  = null;

        try
        {
            File  dirFile = new File("C:");
            File  filFile = new File( dirFile, "jExcel.xls");
//            File  filFile = new File("jexcel.xls");
            wkbWorkBook = Workbook.createWorkbook( filFile );
            WritableSheet    shtShet   = wkbWorkBook.createSheet("sheet1", 0); 

            WritableCellFormat   titleFormat  = new WritableCellFormat();
            WritableCellFormat   dataFormat   = new WritableCellFormat(); // 데이터 셀 포멧 생성

            titleFormat.setAlignment( Alignment.CENTRE ); // 셀 가운데 정렬
            titleFormat.setVerticalAlignment( VerticalAlignment.CENTRE ); // 셀 수직 가운데 정렬
            dataFormat.setAlignment( Alignment.CENTRE ); // 셀 가운데 정렬
            dataFormat.setVerticalAlignment( VerticalAlignment.CENTRE ); // 셀 수직 가운데 정렬
     
        	pstSrc = jdbConnSrc.prepareStatement( strSQL1 );
    		resQury	= pstSrc.executeQuery();
    		
            ResultSetMetaData   metaData        = resQury.getMetaData();
            int                 sizeOfColumn    = metaData.getColumnCount();
            String[]            columnName      = new String[metaData.getColumnCount()];

            Label 				lblLavl 		= null;
            // Title
            for(int indexOfColumn = 0 ; indexOfColumn < sizeOfColumn ; indexOfColumn++)
            {
                columnName[indexOfColumn] = metaData.getColumnName(indexOfColumn + 1);
                lblLavl = new Label(indexOfColumn, 0, ""+metaData.getColumnName(indexOfColumn + 1), titleFormat);
    	        shtShet.addCell( lblLavl );
            }
        	logg.debug("make title");

      		for(i=0; resQury.next(); i++)
    		{
		        intParaIndx	= 0;
	            for(int indexOfColumn = 0 ; indexOfColumn < sizeOfColumn ; indexOfColumn++)
	            {
	                lblLavl = new Label(indexOfColumn, i+1, ""+resQury.getObject( columnName[indexOfColumn] ), dataFormat);
	    	        shtShet.addCell( lblLavl );
	            }

    			if ( ( ( (i+1) % 10000 ) == 0 ) && ( i > 0 ) )
    			{
        			logg.debug("XlsMake001 : " + StrUtil.getCountFormat( i+1 ) );
              		wkbWorkBook.write();
//              		break;
    			}
    		}

      		wkbWorkBook.write();
        }
        catch( Exception e )
        {
        	e.printStackTrace();
        }
        finally
        {
        	try 
        	{
        		if ( wkbWorkBook != null ) wkbWorkBook.close();
        	} catch (WriteException e) {
        		e.printStackTrace();
        	} catch (IOException e) {
        		e.printStackTrace();
        	} // 처리 후 메모리에서 해제 처리
			try 
			{
				jdbConnSrc.close();
			} 
			catch( SQLException e1 ) 
			{
				e1.printStackTrace();
			} // 처리 후 메모리에서 해제 처리
        }
    }
}
