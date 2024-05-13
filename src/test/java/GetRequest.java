import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
    public static void main(String[] args) {
        RestAssured.baseURI="https://reqres.in/api/users/2";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        response.prettyPrint();

        int statuscode = response.statusCode();
        Assert.assertEquals(statuscode,201);
    }
}
