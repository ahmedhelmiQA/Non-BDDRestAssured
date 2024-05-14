import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class GetRequest {
    public static void main(String[] args) {
        RestAssured.baseURI="https://reqres.in/api/unknown";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        response.prettyPrint();

        int statuscode = response.statusCode();
        Assert.assertEquals(statuscode,201);
    }
}
