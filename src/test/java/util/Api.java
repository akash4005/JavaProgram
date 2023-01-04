package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.Employees;
import org.json.simple.JSONObject;

public class Api {
    public static void main(String[] args) throws JsonProcessingException {



        RestAssured.baseURI = "http://localhost:3000";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);

        Employees emp = new Employees();
        emp.setFname("Sanuja");
        emp.setLname("Shah");
        emp.setMobileNo("ffffffffffff");
        emp.setAddress("Punvvvvvvve");
        emp.setEmailId("sanuja@lnt.com");

        ObjectMapper mapper = new ObjectMapper();
        String reqBody = mapper.writeValueAsString(emp);

        httpRequest.body(reqBody);

        Response resp = httpRequest.delete("/employees/1");

        int a = resp.statusCode();
        System.out.println(a);

        String b = resp.statusLine();
        System.out.println(b);

        String c = resp.body().asString();
        System.out.println(c);


        RestAssured.baseURI="http://localhost:3000";
        RequestSpecification http = RestAssured.given();

        http.contentType(ContentType.JSON);

        Employees emp1=new Employees();
        emp.setFname("Sanuja");
        emp.setLname("Shah");
        emp.setMobileNo("ffffffffffff");
        emp.setAddress("Punvvvvvvve");
        emp.setEmailId("sanuja@lnt.com");

        ObjectMapper t=new ObjectMapper();
        String s = t.writeValueAsString(emp);

        http.body(s);
        Response post = http.post("/employees");
        System.out.println(post.getBody());

        System.out.println(post.statusCode());
        System.out.println(post.getStatusLine());
        System.out.println(post.body().asString());


    }
}
