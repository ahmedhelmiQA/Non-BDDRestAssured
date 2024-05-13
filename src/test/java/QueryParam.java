import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParam {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification requet = RestAssured.given();
        requet.queryParam("page","2");
        Response response = requet.get();
        response.prettyPrint();

    }
}
