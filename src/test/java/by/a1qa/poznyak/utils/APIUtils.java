package by.a1qa.poznyak.utils;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

public class APIUtils {
    static CloseableHttpClient httpclient = HttpClients.createDefault();
    public static void getRequest(String urlToEnter, String additionalRequirementToGETRequest) throws Exception {
        HttpUriRequest httpGet = new HttpGet(urlToEnter + additionalRequirementToGETRequest);
        try (
                CloseableHttpResponse response1 = httpclient.execute(httpGet)
        ) {
            final HttpEntity entity1 = response1.getEntity();
            System.out.println(EntityUtils.toString(entity1));
        }
    }
    public static void postRequest(String urlToEnter, String additionalTextInRequest, String userId) throws Exception {
        final HttpPost httpPost = new HttpPost(urlToEnter + additionalTextInRequest);
        final List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("title", RandomText.getRandomText()));
        params.add(new BasicNameValuePair("body", RandomText.getRandomText2()));
        params.add(new BasicNameValuePair("userId", userId));
        params.add(new BasicNameValuePair("id", "101"));
        httpPost.setEntity(new UrlEncodedFormEntity(params));

        try (
                CloseableHttpResponse response2 = httpclient.execute(httpPost)
        ){
            final HttpEntity entity2 = response2.getEntity();
            System.out.println(EntityUtils.toString(entity2));
        }
        httpclient.close();
    }
}
