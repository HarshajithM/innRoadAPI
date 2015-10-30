package com.innroad.Utilities;

import com.jayway.restassured.response.Response;

public class TestResponse {

    private Long id;
    private Response response;


    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Response getResponse(){
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

}
