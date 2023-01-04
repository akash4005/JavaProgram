package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import controller.RequestController;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.Employees;
import org.json.simple.JSONObject;
import util.Utility;

import javax.naming.ldap.Control;

public class main {




    public static void main(String[] args) throws JsonProcessingException {

        RequestSpecification httpRequest = Utility.GetHttpRequest(Utility.BASE_URL);


     //   Response response = RequestController.hitGetAllRequest(httpRequest);

        //put..........

        Employees employees = new Employees("1", "3", "4", "Akas kwadde 1233", "ttttttt");

       Response response = RequestController.hitPostRequest(httpRequest,employees);

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());




    }
}
