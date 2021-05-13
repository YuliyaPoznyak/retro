package by.a1qa.poznyak.readPropertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromConfProperties {
    public static FileInputStream fileInputStream;
    public static Properties prop;
    public static final String WHERE_IS_PROPERTIES = "src/main/resources/conf.properties";

    public static void prepareConfigData() {
        try {
            prop = new Properties();
            fileInputStream = new FileInputStream(WHERE_IS_PROPERTIES);
            prop.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("There is no such file with configuration data");
        }
    }
    public static String getURL() {
        return prop.getProperty("website");
    }

}
