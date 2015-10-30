package roughwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.innroad.Utilities.TestValidation;



public class TestValidationCsvFile{

	public static void main(String[] args) throws IOException {

		String testValidationPath = System.getProperty("user.dir")+"/src/main/resources/CsvFiles/Validation.csv";
		BufferedReader br = null;
		TestValidation testValidation = new TestValidation();
		String line = "";
            try {   
            	br = new BufferedReader(new FileReader(testValidationPath));
                br.readLine(); // skip the first row or line
                
                while ((line = br.readLine()) != null){
                    // split on comma(',')
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