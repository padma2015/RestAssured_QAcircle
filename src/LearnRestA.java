import io.restassured.RestAssured; 
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class LearnRestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification request1=RestAssured.given();
		request1.header("contentType","application/json");
		System.out.println(request1.request(Method.GET,"").getBody().asString());
		

	}

}
