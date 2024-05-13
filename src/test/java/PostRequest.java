import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
    public static void main(String[] args) {
        RestAssured.baseURI= "https://reqres.in/api/users";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","Application/json");
        request.body("{\"name\": \"morpheus\",\"job\": \"leader\"}");
        Response response = request.post();
        response.prettyPrint();

    }
}
