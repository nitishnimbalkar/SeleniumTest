package com.scp.scoopen.Selenium_Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        //System.out.println( "Hello Stint!" );
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());		
    }
}
