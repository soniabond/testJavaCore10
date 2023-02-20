package module13;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class StandartHttpTest {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        String uri = "https://en.wikipedia.org/wiki/HTTP";
        //String uri = "https://api.monobank.ua/bank/currency";
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI(uri))
                .GET()
                .build();
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
//        HttpRequest httpRequest = HttpRequest.newBuilder(new URI(uri))
//                .POST(HttpRequest.BodyPublishers.ofString("{\n" +
//                        "    \"name\": \"Leanne Graham\",\n" +
//                        "    \"username\": \"Bret\",\n" +
//                        "    \"email\": \"Sincere@april.biz\",\n" +
//                        "    \"address\": {\n" +
//                        "      \"street\": \"Kulas Light\",\n" +
//                        "      \"suite\": \"Apt. 556\",\n" +
//                        "      \"city\": \"Gwenborough\",\n" +
//                        "      \"zipcode\": \"92998-3874\",\n" +
//                        "      \"geo\": {\n" +
//                        "        \"lat\": \"-37.3159\",\n" +
//                        "        \"lng\": \"81.1496\"\n" +
//                        "      }\n" +
//                        "    },\n" +
//                        "    \"phone\": \"1-770-736-8031 x56442\",\n" +
//                        "    \"website\": \"hildegard.org\",\n" +
//                        "    \"company\": {\n" +
//                        "      \"name\": \"Romaguera-Crona\",\n" +
//                        "      \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
//                        "      \"bs\": \"harness real-time e-markets\"\n" +
//                        "    }\n" +
//                        "  }"))
//                .build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("httpResponse.statusCode() = " + httpResponse.statusCode());
        System.out.println("httpResponse.body() = " + httpResponse.body());
    }
}
