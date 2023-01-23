import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebPageServer {
    public void save(String url, String filePath) throws URISyntaxException, IOException, InterruptedException {
        String pageContent = requestWebPage(url);
        createHTMLFile(filePath, pageContent );
    }

    private String requestWebPage(String url) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build(); // klient

        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI(url))
                        .GET()
                        .build();                               //  tworzenie zapytanie

        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString()); // wysłanie zapytania

        return httpResponse.body(); // odpowiedz
    }

    private void createHTMLFile(String filePath, String fileContent) throws IOException {
        Files.write(Paths.get(filePath), fileContent.getBytes());
    }
}
