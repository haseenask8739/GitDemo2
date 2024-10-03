package gitDevelop;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import static io.restassured.RestAssured.*;
	import static io.restassured.matcher.RestAssuredMatchers.*;
	import static org.hamcrest.Matchers.*;
	import io.restassured.response.Response;

	public class newBranch {
	@Test
		void Test_01() {
		//Response responce=RestAssured.get("https://reqres.in/api/users?page=2");
			Response responce=get("https://reqres.in/api/users?page=2");
			System.out.println("this is my first code with git");
			System.out.println("this is my first code with git2");
			System.out.println("this is my first code with git3");
			System.out.println("this is my first code with git4");
			System.out.println("this is my first code with git5");
			System.out.println("this is my first code with git6");
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getStatusLine());
	System.out.println(responce.asString());	
	System.out.println(responce.getHeader("content-type"));
	System.out.println(responce.getTime());
	System.out.println(responce.getBody().asString());
	System.out.println(responce.getCookie("name"));
	int statuscode=responce.getStatusCode();
	Assert.assertEquals(statuscode,200);
	System.out.println("this is my first code with git");
	System.out.println("this is my first code with git2");
	System.out.println("this is my first code with git3");
	System.out.println("this is my first code with git4");
	System.out.println("this is my first code with git5");
	System.out.println("this is my first code with git6");
	}
	@Test
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
	void Test_03() {
		System.out.println("this is my first code with git7");
		System.out.println("this is my first code with git8");
		System.out.println("this is my first code with git9");
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().
		statusCode(200)
		.body("date.id[0]",equalTo(7));
	}
	void Test_04() {
		//Response responce=RestAssured.get("https://reqres.in/api/users?page=2");
			Response responce=get("https://reqres.in/api/users?page=2");
			System.out.println("this is my first code with git");
			System.out.println("this is my first code with git2");
			System.out.println("this is my first code with git3");
			System.out.println("this is my first code with git4");
			System.out.println("this is my first code with git5");
			System.out.println("this is my first code with git6");
		System.out.println(responce.getStatusCode());
		System.out.println(responce.getStatusLine());
	System.out.println(responce.asString());	
	System.out.println(responce.getHeader("content-type"));
	System.out.println(responce.getTime());
	System.out.println(responce.getBody().asString());
	System.out.println(responce.getCookie("name"));
	int statuscode=responce.getStatusCode();
	Assert.assertEquals(statuscode,200);
	System.out.println("this is my first code with git");
	System.out.println("this is my first code with git2");
	System.out.println("this is my first code with git3");
	System.out.println("this is my first code with git4");
	System.out.println("this is my first code with git5");
	System.out.println("this is my first code with git6");
	}
	void Test_05() {
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

