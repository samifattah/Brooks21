package com.samifattah.brooks21.util;

import android.os.Environment;
import android.util.Log;


public class Utility
{
	private static final String TAG = "Utility";
	
	public static boolean s_bIsLogEnabloed = true;
	

	public static void Assert()
	{
		throw new RuntimeException( "Assert" );
	}
	
	public static void Assert( String szMessage )
	{
		throw new RuntimeException( szMessage );
	}
	

	public static String getPathToSDCard()
	{
		return Environment.getExternalStorageDirectory().toString();
	}
	
	public static void logDebug( String szTage , String szMessage )
	{
		if( s_bIsLogEnabloed)
		{
			Log.d(szTage, szMessage);
		}
	}
}
