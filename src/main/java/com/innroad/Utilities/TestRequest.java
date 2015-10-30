package com.innroad.Utilities;

public class TestRequest {
	
    private Long 	ID;
    private String 	method;
    private String 	endpoint;
    private String 	headers;
    private String 	headersFile;
    private String 	reqBody;
    private String 	input1;
    private String 	inputFile;
    private String 	param1;
    private String 	paramFile;
    private String 	description;
    private String 	reqContentType;
    private String 	respContentType;
 


    public Long getId(){
        return ID;
    }
    public void setId(Long ID){
        this.ID = ID;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method){
        this.method = method;
    }
    public String getEndpoint(){
        return endpoint;
    }
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
    }
    public String getHeaders(){
        return headers;
    }
    public void setHeaders(String headers){
        this.headers = headers;
    }
    public String getHeadersFile(){
        return headersFile;
    }
    public void setHeadersFile(String headersFile){
        this.headersFile = headersFile;
    }

    public String getReqBody(){
        return reqBody;
    }
    public void setReqBody(String reqBody){
        this.reqBody = reqBody;
    }
    public String getInput1(){
        return input1;
    }
    public void setInput1(String input1){
        this.input1 = input1;
    }

    public String getInputFile(){
        return inputFile;
    }
    public void setInputFile(String inputFile){
        this.inputFile = inputFile;
    }

    public String getParam1() {
        return param1;
    }
    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParamFile() {
        return paramFile;
    }

    public void setParamFile(String paramFile){
        this.paramFile = paramFile;
    }
  
    public String getDescription(){
          return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getReqContentType(){
        return reqContentType;
    }

    public void setReqContentType(String reqContentType){
        this.reqContentType = reqContentType;
    }

    public String getRespContentType(){
        return respContentType;
    }

    public void setRespContentType(String respContentType){
        this.respContentType = respContentType;
    }

   
}
