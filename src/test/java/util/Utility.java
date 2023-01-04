package util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import model.Employees;
import org.json.simple.JSONObject;

import java.util.Objects;

public class Utility {


    public static String BASE_URL="http://localhost:3000/";


    public static RequestSpecification GetHttpRequest(String url){
        RestAssured.baseURI=url;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(ContentType.JSON);
        return httpRequest;
    }

    public static JSONObject mapToJson(Object o) throws JsonProcessingException {
        JSONObject j=new JSONObject();

        Employees o1 = (Employees) o;

        if(Objects.nonNull(o1.getAddress())){
            j.put("address",o1.getAddress());
        }
        if(Objects.nonNull(o1.getFname())){
            j.put("fname",o1.getFname());
        }
        if(Objects.nonNull(o1.getLname())){
            j.put("lname",o1.getLname());
        }
        if(Objects.nonNull(o1.getEmailId())){
            j.put("emailId",o1.getEmailId());
        }
        if(Objects.nonNull(o1.getMobileNo())){
            j.put("mobileNo",o1.getMobileNo());
        }

        return j;
    }
}
