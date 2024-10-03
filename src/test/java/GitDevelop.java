import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GitDevelop {
	void Test_02() {
		System.out.println("this is my first code with git7");
		System.out.println("this is my first code with git8");
		System.out.println("this is my first code with git9");
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().
		statusCode(200)
		.body("date.id[0]",equalTo(7));
	}
}
