import org.json.simple.JSONObject;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class learnRA1 {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification request2=RestAssured.given();
		JSONObject reqB=new JSONObject();
		reqB.put("name", "morpheus");
		reqB.put("job", "leader");
		request2.body(reqB.toJSONString());
		Response response=request2.post("api/users");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		
		
		

	}
}
