package roughwork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.innroad.Utilities.TestConfig;



public class TestConfigCsvFile{

	public static void main(String[] args) throws IOException {

		String testConfigPath = System.getProperty("user.dir")+"/src/main/resources/CsvFiles/TestConfig.csv";
		BufferedReader br = null;
		TestConfig testConfig = new TestConfig();
		String line = "";
            try {   
            	br = new BufferedReader(new FileReader(testConfigPath));
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
                System.out.println(testConfig.getBaseURL());
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