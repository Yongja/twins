package com.dw.makeExcel;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.dw.common.StrUtil;

public class MakeExcel 
{
	static 			Logger 				logg 					= org.apache.log4j.Logger.getRootLogger();

	public	static 	void				main(String[] args) 
	{
		MakeExcel 					cnvStart				= new MakeExcel();
		try 
		{
			cnvStart.runMain();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	public			void				runMain() throws InterruptedException
	{
    	String 					strStrtTime				= "";
    	String 					strEnddTime				= "";
        try 
        {
        	URL 					strFileURL = this.getClass().getResource("/config/log4j.xml");
	    	DOMConfigurator.configure( strFileURL );
        	// logg.debug("runMain strFileURL : " + strFileURL );
	        // ssBsnsTypeDtme = new SimpleDateFormat("yyyyMMddHHmmssSSS").format( caClnd.getTime() );
	    	strStrtTime	= StrUtil.getSysDateTimeMillisec();
	        logg.debug("MakeExcel Start------ ");

	        XlsMake001 			xlsMake001 		= new XlsMake001();
	    	xlsMake001.start();
	    	xlsMake001.join();
    	    Thread.sleep( 1000 );
	    	
        	logg.debug("-------------------------------------------------------------------------------------------------");
        } 
        finally
        {
	    	strEnddTime	= StrUtil.getSysDateTimeMillisec();
        	logg.debug("StartConvert End------ Start Time : " + strStrtTime );
        	logg.debug("StartConvert End------ Ended Time : " + strEnddTime );
        	logg.debug("-------------------------------------------------------------------------------------------------");
        }
	}
}
