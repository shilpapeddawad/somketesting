package Assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
	public static void main(String[] args) {
		//Specific base url
		
				RestAssured.baseURI="https://reqres.in/api/users/2";
				
				//get Request Specifiction Object
				
				RequestSpecification httpRequest =RestAssured.given();
				
				//hit the Request
				
				Response resp =httpRequest.get();
				Response resp1=httpRequest.delete();
				
				System.out.println(resp.getStatusCode());
				
				System.out.println(resp.getStatusLine());
				
                System.out.println(resp1.getStatusCode());
				
				System.out.println(resp1.getStatusLine());
				
				
		
	}

}
