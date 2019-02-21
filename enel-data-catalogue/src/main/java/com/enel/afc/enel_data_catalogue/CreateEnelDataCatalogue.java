package com.enel.afc.enel_data_catalogue;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class CreateEnelDataCatalogue 
{
    public static void main( String[] args )
    {
    	Gson gson = new Gson();
        System.out.println( gson.toJson( "Hello World!") );
    }
}
