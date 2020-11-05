package Peticiones;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Http {

    private HttpClient httpClient;
    private HttpGet get;
    private String resourse;
    private HttpResponse response;


    public Http() {
        this.httpClient = HttpClients.createDefault();
        this.get = null;
        this.resourse = null;

    }

    public String GET(String url) {

        this.get = new HttpGet(url);
        try {
            HttpResponse response = this.httpClient.execute(this.get);
            this.resourse = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }


        return this.resourse;

    }

}

