package roughwork;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.innroad.Utilities.TestRunnerUtilities;

public class HTMLErrorReport {

	public static void main(String[] args) {
		
		BufferedWriter out 		= null;
		String fileName 		= System.getProperty("user.dir")+"/src/main/resources/Reports/failed.html";
		String ProjectName 		= "innRoad-API";
		String Environment		= "QA";
		String RunDate			= TestRunnerUtilities.currentDateTime("MM/dd/yyyy");

		
		try{
			// Create File
			out = new BufferedWriter(new FileWriter (fileName));
			out.write("<html>\n");
			out.write("<HEAD>\n");
			out.write(" <TITLE>innRoad API Test Results - FAILED Test Cases</TITLE>\n");
			out.write("</HEAD>\n");
			
			out.write("<body>\n");
            out.write("<h4 align=center><FONT COLOR=red FACE=Times New Roman SIZE=5><b><u> API Automation Test Results - Failed Test Cases</u></b></h4>\n");
            out.write("<table  border=1 cellspacing=1 cellpadding=1>\n");
            out.write("<tr>\n");
            
            out.write("<h4> <FONT COLOR=660000 FACE=Times New Roman SIZE=4> <u>Test Details:</u></h4>\n");
            
            out.write("<td width=150 align=left bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE=Times New Roman SIZE=2.75><b>Run Date</b></td>\n");
            out.write("<td width=150 align=left><FONT COLOR=#153E7E FACE=Times New Roman SIZE=2.75><b>"
                              + RunDate + "</b></td>\n");
            out.write("</tr>\n");
            out.write("<tr>\n");
            out.write("<td width=150 align= left  bgcolor=#153E7E><FONT COLOR=#E0E0E0 FACE= Times New Roman  SIZE=2.75><b>Environment</b></td>\n");
            out.write("<td width=150 align= left ><FONT COLOR=#153E7E FACE= Times New Roman  SIZE=2.75><b>"
                              + ProjectName + " - " + Environment + "</b></td>\n");
            out.write("</tr>\n");
            out.write("<tr>\n");
            out.write("</table>\n");
            
			out.newLine();
			
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Error: " + e.getMessage());
		}
		finally
		{
			out = null;
		}
	}

}
