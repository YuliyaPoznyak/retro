package by.a1qa.poznyak.readPropertiesFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadTestData {
    public static FileInputStream fileInputStream;
    public static Properties propTest;
    public static final String WHERE_IS_TEST_PROPERTIES = "src/main/resources/testData.properties";

    public static void prepareTestData() {
        try {
            propTest = new Properties();
            fileInputStream = new FileInputStream(WHERE_IS_TEST_PROPERTIES);
            propTest.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("There is no such file with configuration data");
        }
    }
    public static String getAdditionalRequerementForAllPosts() {
        return propTest.getProperty("allPosts");
    }
    public static String getAdditionalRequerementForPosts99() {
        return propTest.getProperty("post99");
    }
    public static String getAdditionalRequerementForPosts150() {
        return propTest.getProperty("post150");
    }
    public static String getAdditionalRequerementForPostRequest() {
        return propTest.getProperty("postRequest");
    }
    public static String getAdditionalRequerementForAllUsers() {
        return propTest.getProperty("allUsers");
    }
    public static String getAdditionalRequerementForUser5() {
        return propTest.getProperty("user5");
    }
    public static String getUserIdForPostRequest() {
        String idNumber = propTest.getProperty("userIdForPost");
        return idNumber;
    }
}
