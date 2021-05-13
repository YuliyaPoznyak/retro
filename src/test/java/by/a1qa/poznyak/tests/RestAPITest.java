package by.a1qa.poznyak.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import by.a1qa.poznyak.readPropertiesFiles.ReadFromConfProperties;
import by.a1qa.poznyak.readPropertiesFiles.ReadTestData;
import by.a1qa.poznyak.utils.APIUtils;

public class RestAPITest {
    static APIUtils apiUtils;
    static String urlToEnter;
    @BeforeMethod
    public void enterUrl() {
        ReadFromConfProperties.prepareConfigData();
        ReadTestData.prepareTestData();
        urlToEnter = ReadFromConfProperties.getURL();
    }

    @Test
    public void getRequestGetAllPosts()  throws Exception {
        String additionalRequirementToGETRequest = ReadTestData.getAdditionalRequerementForAllPosts();
        apiUtils.getRequest(urlToEnter, additionalRequirementToGETRequest);
    }
    @Test
    public void getRequestGetPost99()  throws Exception {
        String additionalRequirementToGETRequest = ReadTestData.getAdditionalRequerementForPosts99();
        apiUtils.getRequest(urlToEnter, additionalRequirementToGETRequest);
    }
    @Test
    public void getRequestGetPost150()  throws Exception {
        String additionalRequirementToGETRequest = ReadTestData.getAdditionalRequerementForPosts150();
        apiUtils.getRequest(urlToEnter, additionalRequirementToGETRequest);
    }
    @Test
    public void getRequestPost() throws Exception {
        String additionalTextInRequest = ReadTestData.getAdditionalRequerementForPostRequest();
        String userId = ReadTestData.getUserIdForPostRequest();
        apiUtils.postRequest(urlToEnter, additionalTextInRequest, userId);
    }

    @Test
    public void getRequestGetUsers()  throws Exception {
        String additionalRequirementToGETRequest = ReadTestData.getAdditionalRequerementForAllUsers();
        apiUtils.getRequest(urlToEnter, additionalRequirementToGETRequest);
    }
    @Test
    public void getRequestGetUser5()  throws Exception {
        String additionalRequirementToGETRequest = ReadTestData.getAdditionalRequerementForUser5();
        apiUtils.getRequest(urlToEnter, additionalRequirementToGETRequest);
    }
}
