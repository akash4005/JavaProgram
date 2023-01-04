package controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.Employees;
import org.json.simple.JSONObject;
import util.Utility;

public class RequestController<T> {

    public static String address="employees";


    public static <T> T hitGetAllRequest(RequestSpecification request){

           return (T) request.get(address);
    }

    public static <T> T hitGetByIdRequest(RequestSpecification request, String id){

        return (T)request.get(address+"/"+"id");
    }



    public static Response hitPostRequest(RequestSpecification request, Object o) throws JsonProcessingException {
        String s = String.valueOf(Utility.mapToJson(o));
        request.body(s);
       return request.post(address);

    }


    public static Response hitDeleteRequest(RequestSpecification request,int id){

        return request.delete(address+"/"+id);


    }


    public static Response hitPutRequest(RequestSpecification request1,Object o,int id) throws JsonProcessingException {
        JSONObject jsonObject = Utility.mapToJson(o);
        request1.body(jsonObject);
        Response put = request1.put(address + "/" + id);
        return put;
    }
    public static Response patch(RequestSpecification request,Object o, int id) throws JsonProcessingException {
        JSONObject jsonObject = Utility.mapToJson(o);
        request.body(o);
        return request.patch(address+"/"+id);



    }
}
