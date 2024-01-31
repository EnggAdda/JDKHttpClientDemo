package org.example.jdkhttpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {

private static final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";

    private HttpClient httpClient;
    public HttpClientDemo(){
        httpClient = HttpClient.newHttpClient();
    }

    public String getAllPosts() throws IOException, InterruptedException {
        HttpRequest  request =  HttpRequest.newBuilder()
                        .uri(URI.create(BASE_URL))
                         .GET().build();

        HttpResponse<String> response  =httpClient.send(request, HttpResponse.BodyHandlers.ofString());
     return response.body();
    }

}
