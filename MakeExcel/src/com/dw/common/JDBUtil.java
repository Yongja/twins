package com.dw.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

public class JDBUtil 
{
    public          String     getSQL( String strPath, String strFileName )
    {
        String                  strRetn                  = "";
        String                  strBuff                  = "";
        FileReader              inFile                  = null;
        BufferedReader          inBuff                  = null;
        StringBuffer            sbBuff                  = new StringBuffer();
        URL                     strFileUrl               = ClassLoader.getSystemClassLoader().getResource("");
        String                  strFile                  = "";

        try
        {
            if ( File.separator.equals("/"))
            {
                strFile = strFileUrl.toString().substring(5);
//                strFile = strFile.substring(0, strFile.length()-5 );
            }
            else
            {
                strFile = strFileUrl.toString().substring(6);
//                strFile = strFile.substring(0, strFile.length()-5 );
            }
            strFile = strFile + strPath + strFileName + ".sql";
            inFile = new FileReader( strFile );
            inBuff = new BufferedReader( inFile );
            while( ( strBuff = inBuff.readLine()) != null )
            {
                sbBuff.append("\n");
                sbBuff.append( strBuff );
            }
            strRetn = sbBuff.toString();
        }
        catch( Exception e )
        {
//            clsLogg.debug( e.toString() );
            e.printStackTrace();
        }
        finally
        {
            try
            {
                inBuff.close();
                inFile.close();
            }
            catch( Exception e1 )
            {
//                clsLogg.debug( e1.toString() );
                e1.printStackTrace();
            }
        }
        return strRetn;
    }
}
