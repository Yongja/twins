package com.dw.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDriver;
import org.apache.commons.pool.impl.GenericObjectPool;

public class JDBSrcEmis1_Promtest 
{
    private static      JDBSrcEmis1_Promtest        		    _INSTANCE               = null;

    static
    {
        _INSTANCE = new JDBSrcEmis1_Promtest();
    }
    protected               JDBSrcEmis1_Promtest()
    {
    }
    public  static          JDBSrcEmis1_Promtest           getInstance()
    {
        if ( _INSTANCE == null ) 
        {
        	synchronized( JDBSrcEmis1_Promtest.class )
        	{
        		_INSTANCE = new JDBSrcEmis1_Promtest();
        	}
        }
    	return( _INSTANCE );
    }
    /*
    *****************************************************************************************
        Title       :   getConnection
        Description :   db Connection ��� ( dbms �̿� )
    *****************************************************************************************
    */
    public          Connection      getConnection()
    {
        String                  	strDrvr             = "oracle.jdbc.driver.OracleDriver";
        String                  	strUrll             = "jdbc:oracle:thin:@localhost:1521:IROSDB";
        String                  	strIdnt             = "soa";
        String                  	strPswd             = "soa";
//        String                  	strUrll             = "jdbc:oracle:thin:@133.1.7.194:1953:EMIS1";        
//        String                  	strIdnt             = "promtest";
//        String                  	strPswd             = "37rioljfa";
        String                 		strDbcp        		= "JDBSrcEmis1_Promtest";	// "zzDbcp"

        boolean                 	bbAutoCommit        = false;

        Connection                  cnConn              = null;
        GenericObjectPool           cpPool              = new GenericObjectPool(null, 5);
        ConnectionFactory           cfFcty              = new DriverManagerConnectionFactory( strUrll, strIdnt, strPswd);
        PoolableConnectionFactory   pfCfct              = new PoolableConnectionFactory( cfFcty,cpPool, null, null, false, true );
        PoolingDriver               drDrvr              = new PoolingDriver();
        try 
        {
            Class.forName( strDrvr );
            Class.forName("org.apache.commons.dbcp.PoolingDriver");
            drDrvr.registerPool( strDbcp, cpPool );
//            Properties ptProp = new Properties();
//            ptProp.put("SetBigStringTryClob", "true");
            cnConn = DriverManager.getConnection("jdbc:apache:commons:dbcp:" + strDbcp );
            cnConn.setAutoCommit( bbAutoCommit );
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }

        return cnConn;
    }
}
