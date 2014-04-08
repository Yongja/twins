package com.dw.common;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StrUtil 
{
    /*
	*****************************************************************************************
	    Title       :   getCountFormat
	    Description :   �������� , �ִ� ���� String���� 
	*****************************************************************************************
	*/
	public	static  String      getCountFormat( long lngNmbr )
	{
	    DecimalFormat   defFrm = new DecimalFormat("####,####,####,###0"); 
	    return defFrm.format( lngNmbr );
	}
    /*
    *****************************************************************************************
        Title       :   getSysDateTimeMillisec
        Description :
    *****************************************************************************************
    */
    public	static	String      getSysDateTimeMillisec()
    {
        Calendar                caClnd                  = Calendar.getInstance();
        return( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format( caClnd.getTime() ) );
    }

}
