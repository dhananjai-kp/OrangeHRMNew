package com.orangehrm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile {

    private ReadPropertyFile(){}

    private static Properties property = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();

    static {
        try{
            FileInputStream file = new FileInputStream("./src/test/resources/Config/config.properties");
            property.load(file);

            for (Object key : property.keySet()){
                CONFIGMAP.put(String.valueOf(key), String.valueOf(property.get(key)));

            }
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }



    public static String get(String key) throws Exception {

        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))){
            throw new Exception("Property name "+key+" is not found. Please check config.properties");
        }
        return CONFIGMAP.get(key);


    }

}
