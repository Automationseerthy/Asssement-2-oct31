package assessmentputschemavalidation;
import org.testng.annotations.BeforeMethod;
import io.restassured.RestAssured;

public class RestAssuredBase {
	
public static String sys_id;	
@BeforeMethod		
public void setup() 
{
	RestAssured.baseURI="
https://dev58807.service-now.com/api/now/table";

}

}
