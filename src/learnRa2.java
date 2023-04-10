import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class learnRa2 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request=RestAssured.given();
		JSONObject reqB=new JSONObject();
		reqB.put("name", "morpheus");
		reqB.put("job", "leader");
		request.body(reqB.toJSONString());
		Response response=request1.put("api/users/2");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		
		
		
		
		
		

	}

}
