import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class learnRA3 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request1=RestAssured.given();
		Response response=request1.delete("/api/users/2");
		System.out.println(response.body().asString());
		System.out.println(response.getStatusCode());
		
		
		

	}

}
