package com.innroad.Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestRunnerUtilities {
	public static String env;
	public static String projectName;
	public static String eMailTo;
	public static String eMailHost;
	public static String eMailFrom;
	public static String baseURL;
	public static Integer port;

	static TestConfig testConfig = new TestConfig();
	public static String testConfigCsvPath = System.getProperty("user.dir")+"/src/main/resources/CsvFiles/TestConfig.csv";
	public static Logger APPLICATION_LOGS = Logger.getLogger("rootLogger");

	// DateFormat		 ---- done!!
	// testConfigReader  ---- done!!
	// testRequestReader  --- done!!
	// testValidationReader - done!!
	// testResponseReader 

	public static void suiteInit() throws IOException  {
		BasicConfigurator.configure();
		APPLICATION_LOGS.debug("Starting the test suite");
		APPLICATION_LOGS.debug("Loading testConfig CSV file");
		testConfig = loadTestConfigFile(testConfigCsvPath);
		env 		= testConfig.getEnvironment();
		projectName = testConfig.getProject();
		eMailTo 	= testConfig.getEmailTo();
		eMailFrom 	= testConfig.getEmailFrom();
		eMailHost 	= testConfig.getEmailHost();
		baseURL 	= testConfig.getBaseURL();
		port		= testConfig.getUrlPort();
	}

	public static String currentDateTime(String dateFormat) {
		// Format: ("MM/dd/yyyy hh:mm:ss a");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());
	}

	// Load Test Configuration File
	public static TestConfig loadTestConfigFile (String testConfigCsvPath) throws IOException{
		BufferedReader br = null;
		//TestConfig testConfig = new TestConfig();
		String line = "";
		try {   
			br = new BufferedReader(new FileReader(testConfigCsvPath));
			br.readLine(); // skip the first row or line

			while ((line = br.readLine()) != null){
				// split on comma(',')
				String[] testConfigArray = line.split(",(?=([^\"]*\"[^\"]*\")*(?![^\"]*\"))", -1);
				testConfig.setEnvironment(testConfigArray[0]);
				testConfig.setBaseURL(testConfigArray[1]);
				testConfig.setUrlPort(Integer.parseInt(testConfigArray[2]));
				testConfig.setProject(testConfigArray[3]);
				testConfig.setTestRequestFile(testConfigArray[4]);
				testConfig.setTestValidationFile(testConfigArray[5]);
				testConfig.setName(testConfigArray[6]);
				testConfig.setPassword(testConfigArray[7]);
				testConfig.setEmailTo(testConfigArray[8]);
				testConfig.setEmailFrom(testConfigArray[9]);
				testConfig.setEmailHost(testConfigArray[10]);
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}br.close();
		return testConfig;
	}

	// Load Test Request Configuration File 
	// Challenge: How to connect the requestCsvPath from TestConfig.csv file
	public void loadTestRequestFile (String testRequestCsvPath) throws IOException{
		testRequestCsvPath = System.getProperty("user.dir")+"/src/main/resources/CsvFiles/Request.csv";
		BufferedReader br = null;
		TestRequest testRequest = new TestRequest();
		String line = "";
		try {   
			br = new BufferedReader(new FileReader(testRequestCsvPath));
			br.readLine(); // skip the first row or line
			while ((line = br.readLine()) != null){
				String[] testRequestArray = line.split(",(?=([^\"]*\"[^\"]*\")*(?![^\"]*\"))", -1);

				testRequest.setId(Long.parseLong(testRequestArray[0]));
				testRequest.setMethod(testRequestArray[1]);
				testRequest.setEndpoint(testRequestArray[2]);
				testRequest.setHeaders(testRequestArray[3]);
				testRequest.setHeadersFile(testRequestArray[4]);
				testRequest.setReqBody(testRequestArray[5]);
				testRequest.setInput1(testRequestArray[6]);
				testRequest.setInputFile(testRequestArray[7]);
				testRequest.setParam1(testRequestArray[8]);
				testRequest.setParamFile(testRequestArray[9]);
				testRequest.setDescription(testRequestArray[10]);
				testRequest.setReqContentType(testRequestArray[11]);
				testRequest.setRespContentType(testRequestArray[12]);

			}
			System.out.println (testRequest.getReqContentType());
		}

		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		br.close();
	}

	// Load Test Validation Configuration File
	// Challenge: How to connect the validationCsvPath from TestConfig.csv file
	public void loadTestValidationFile (String testValidationCsvPath) throws IOException{
		testValidationCsvPath = System.getProperty("user.dir")+"/src/main/resources/CsvFiles/Validation.csv";
		BufferedReader br = null;
		TestValidation testValidation = new TestValidation();
		String line = "";
		try {   
			br = new BufferedReader(new FileReader(testValidationCsvPath));
			br.readLine(); // skip the first row or line
			while ((line = br.readLine()) != null){
				String[] testValidationArray = line.split(",(?=([^\"]*\"[^\"]*\")*(?![^\"]*\"))", -1);

				testValidation.setDataId(Long.parseLong(testValidationArray[0]));
				testValidation.setTextValidation(testValidationArray[1]);
				testValidation.setHeaderValidation(testValidationArray[2]);
				testValidation.setFieldValidation(testValidationArray[3]);
				testValidation.setFieldValidationText(testValidationArray[4]);
				testValidation.setRespCode(testValidationArray[5]);
				testValidation.setErrorMessage(testValidationArray[6]);
				testValidation.setJsonSchemaPath(testValidationArray[7]);
				testValidation.setXmlSchemaPath(testValidationArray[8]);
				testValidation.setValidationDescription(testValidationArray[9]);
				testValidation.setNegTest(testValidationArray[10]);
			}
			//System.out.println(testValidation.getNegTest());
		}

		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		br.close();
	}
}



