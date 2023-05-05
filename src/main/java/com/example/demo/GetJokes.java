package com.example.demo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.io.IOException;

@Service
public class GetJokes {

public String makeCall() throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.chucknorris.io/jokes/random"))
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> response = null;

    response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    JsonObject jsonObject = new JsonParser().parse(response.body()).getAsJsonObject();
    String joke = jsonObject.get("value").getAsString();
    return joke;
}
}
