import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.Employees;

public class Add {

    public static void main(String[] args) throws JsonProcessingException {
        RestAssured.baseURI="http://localhost:3000";

        RequestSpecification http = RestAssured.given();
        http.contentType(ContentType.JSON);

        Employees r=new Employees();
        r.setFname("akash");
        r.setLname("kawade");
        r.setAddress("washi");
        r.setEmailId("akawshkaws");
        r.setMobileNo("99989999999");


        ObjectMapper mapper=new ObjectMapper();
        String s = mapper.writeValueAsString(r);

        http.body(s);


        Response resp = http.post("/posts");
        System.out.println(resp.statusCode());
        System.out.println(resp.statusLine());
        System.out.println(resp.body().asString());

    }}
