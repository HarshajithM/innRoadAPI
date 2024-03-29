package roughwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.innroad.Utilities.TestRequest;

public class TestRequestCsvFile {

	public static void main(String[] args) throws IOException {
		String testRequestPath = System.getProperty("user.dir")+"/src/main/resources/CsvFiles/Request.csv";
		BufferedReader br = null;
		TestRequest testRequest = new TestRequest();
		String line = "";
            try {   
            	br = new BufferedReader(new FileReader(testRequestPath));
                br.readLine(); // skip the first row or line
                
                while ((line = br.readLine()) != null){
                    // split on comma(',')
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
}