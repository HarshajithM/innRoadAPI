package roughwork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.innroad.Utilities.TestRunnerUtilities;

public class HTMLReport {

	
	public static void main(String[] args) throws IOException {

		BufferedWriter out 		= null;
		String fileName 		= System.getProperty("user.dir")+"/src/main/resources/Reports/index.html";
		String ProjectName 		= "innRoad-API";
		String Environment		= "QA";
		String baseURL			= "qa.innroad.com";
		String portNum			= "8080";
		String RunDate			= TestRunnerUtilities.currentDateTime("MM/dd/yyyy");
		String runStartTime		= TestRunnerUtilities.currentDateTime("hh:mm:ss a");
		String runEndTime		= TestRunnerUtilities.currentDateTime("hh:mm:ss a");
		String runBy			= "Hassan Bhuiyan";
		
		try{
			// Create File
			out = new BufferedWriter(new FileWriter (fileName));
			out.write("<html>\n");
			out.write("<HEAD>\n");
			out.write(" <TITLE>innRoad API Test Results</TITLE>\n");
			out.write("</HEAD>\n");
			
			out.write("<body>\n");
            out.write("<h4 align=center><FONT COLOR=blue FACE=Times New Roman SIZE=5><b><u> API Automation Test Results</u></b></h4>\n");
            out.write("<table  border=1 cellspacing=1 cellpadding=1>\n");
            out.write("<tr>\n");
            
            out.write("<h4> <FONT COLOR=660000 FACE=Times New Roman SIZE=4> <u>Test Details:</u></h4>\n");
            
            out.write("<td width=150 align= left  bgcolor=black><FONT COLOR=white FACE= Times New Roman  SIZE=3><b>Project Name</b></td>\n");
            out.write("<td width=250 align= left ><FONT COLOR=black FACE= Times New Roman  SIZE=2.75><b>"
                              + ProjectName +"</b></td>\n");
            out.write("</tr>\n");
            
            out.write("<td width=150 align= left  bgcolor=black><FONT COLOR=#E0E0E0 FACE= Times New Roman  SIZE=3><b>Environment</b></td>\n");
            out.write("<td width=250 align= left ><FONT COLOR=black FACE= Times New Roman  SIZE=2.75><b>"
                              + Environment +"</b></td>\n");
            out.write("</tr>\n");
            
            out.write("<tr>\n");
            out.write("<td width=150 align= left  bgcolor=black><FONT COLOR=white FACE= Times New Roman  SIZE=3><b>Project URL</b></td>\n");
            out.write("<td width=250 align= left ><FONT COLOR=black FACE= Times New Roman  SIZE=2.75><b>"
                              + baseURL + ":" + portNum + "</b></td>\n");
            out.write("</tr>\n");
            out.write("<tr>\n");
            out.write("<td width=150 align=left bgcolor=black><FONT COLOR=white"
            		+ " FACE=Times New Roman SIZE=3><b>Run Date</b></td>\n");
            out.write("<td width=250 align=left><FONT COLOR=black FACE=Times New Roman SIZE=2.75><b>"
                              + RunDate + "</b></td>\n");
            out.write("</tr>\n");
            out.write("<tr>\n");
            out.write("<td width=150 align=left bgcolor=black><FONT COLOR=white FACE=Times New Roman SIZE=3><b>Run Start Time</b></td>\n");
            out.write("<td width=250 align=left><FONT COLOR=black FACE=Times New Roman SIZE=2.75><b>"
                              + runStartTime + "</b></td>\n");
            out.write("</tr>\n");
            
            out.write("<tr>\n");
            out.write("<td width=150 align= left  bgcolor=black><FONT COLOR=white FACE= Times New Roman  SIZE=3><b>Run End Time</b></td>\n");
            out.write("<td width=250 align= left ><FONT COLOR=black FACE= Times New Roman  SIZE=2.75><b>"+runEndTime+"</b></td>\n");
            out.write("</tr>\n");
           
            out.write("<td width=150 align= left  bgcolor=black><FONT COLOR=white FACE= Times New Roman  SIZE=3><b>Run By</b></td>\n");
            out.write("<td width=250 align= left ><FONT COLOR=black FACE= Times New Roman  SIZE=2.75><b>"+runBy+"</b></td>\n");
            out.write("</tr>\n");
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

