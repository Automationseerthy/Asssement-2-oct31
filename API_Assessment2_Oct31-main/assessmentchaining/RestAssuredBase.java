package assessmentchaining;

import io.restassured.RestAssured;

public class RestAssuredBase {
	
public static String sys_id;	
	
public void setup() 
{
	RestAssured.baseURI="
https://dev58807.service-now.com/api/now/table";

}

}
