import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        
            HttpClient client = HttpClient.newHttpClient();
            
            HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("https://imdb-api.com/en/API/Top250Movies/k_12345678"))
            .GET()
            .build();

            HttpResponse<String> response = client
                     .send(request, BodyHandlers.ofString()); 
       
            System.out.println(response.body());

        
    }
}