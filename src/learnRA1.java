import org.json.simple.JSONObject;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class learnRA1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request1=RestAssured.given();
		JSONObject reqB=new JSONObject();
		reqB.put("name", "morpheus");
		reqB.put("job", "leader");
		request1.body(reqB.toJSONString());
		Response response=request1.post("api/users");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		
		
		

	}
}
