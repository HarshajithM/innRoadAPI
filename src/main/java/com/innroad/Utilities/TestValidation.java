package com.innroad.Utilities;

public class TestValidation {
//
	private Long 	dataId;
	private String 	textValidation;
	private String 	headerValidation;
	private String 	fieldValidation;
	private String 	fieldValidationText;
	private String 	respCode;
	private String 	errorMessage;
	private String 	jsonSchemaPath;
	private String 	xmlSchemaPath;
	private String 	validationDescription;
	private String 	negTest;

	public Long getDataId(){
		return dataId;
	}
	public void setDataId(Long dataId){
		this.dataId = dataId;
	}

	public String getTextValidation() {
		return textValidation;
	}

	public void setTextValidation(String textValidation){
		this.textValidation = textValidation;
	}

	public String getHeaderValidation(){
		return headerValidation;
	}

	public void setHeaderValidation(String headerValidation){
		this.headerValidation = headerValidation;
	}

	public String getFieldValidation(){
		return fieldValidation;
	}

	public void setFieldValidation(String fieldValidation)
	{
		this.fieldValidation = fieldValidation;
	}

	public String getFieldValidationText(){
		return fieldValidationText;
	}

	public void setFieldValidationText(String fieldValidationText){
		this.fieldValidationText = fieldValidationText;
	}

	public String getRespCode(){
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getJsonSchemaPath(){
		return jsonSchemaPath;
	}

	public void setJsonSchemaPath(String jsonSchemaPath){
		this.jsonSchemaPath = jsonSchemaPath;
	}

	public String getXmlSchemaPath(){
		return xmlSchemaPath;
	}

	public void setXmlSchemaPath(String xmlSchemaPath){
		this.xmlSchemaPath = xmlSchemaPath;
	}

	public String getValidationDescription(){
		return validationDescription;
	}

	public void setValidationDescription(String validationDescription){
		this.validationDescription = validationDescription;
	}

	public String getNegTest(){
		return negTest;
	}

	public void setNegTest(String negTest){
		this.negTest = negTest;
	}


}
