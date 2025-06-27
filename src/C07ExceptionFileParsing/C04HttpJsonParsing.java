package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C04HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 외부데이터(api) 요청 : 서버간의 통신
        // RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 라이브러리
        // HttpClient는 자바의 내장클래스로서 별도의 역직렬화, 직렿화 작업이 필요
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String postString = response.body();
        ObjectMapper o1 = new ObjectMapper();
        JsonNode jsonnodes = o1.readTree(postString);
        List<Post> postList = new ArrayList<>();
        for (JsonNode j : jsonnodes) {
            Post p1 = o1.readValue(j.toString(), Post.class);
            postList.add(p1);
        }
        String postl = o1.writeValueAsString(postList);
        System.out.println(postl);
    }
}

class Post {
    public Long userId;
    public Long id = 0L;
    public String title;
    public String body;

    public Post(Long userId, Long id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Post () {

    }

    public Long getUserId() {
        return userId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
