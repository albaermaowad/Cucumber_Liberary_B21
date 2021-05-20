package com.cybertek.utelities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {

    // in this class we will implement the repeated steps of reading
    // from configuration.properties file


    //1- create object of properties class
    //2- use FileInputStream to open the file
    //3- load the opened file into properties object
    //4- then we can use properties object to get the value of given key


    private static Properties properties = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}



