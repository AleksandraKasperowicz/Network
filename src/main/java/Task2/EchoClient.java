package Task2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EchoClient {

    public String echo(String text) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI("http://localhost:8080/echo?text=" + text))
                        .GET()
                        .build();

        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return httpResponse.body();
    }
}
