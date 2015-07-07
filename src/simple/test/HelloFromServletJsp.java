package simple.test;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class HelloFromServletJsp extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
	  String name= request.getParameter("name");
	  String color= request.getParameter("color");
	  System.out.println("myFirstJspApp Servlet Saying Hello from simple package to " + name + " from JSP");
    // reading the user input
//    String color= request.getParameter("color");    
    PrintWriter out = response.getWriter();
    out.println (
      "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN/"
        +  "http://www.w3.org/TR/html4/loose.dtd\">\n" +
      "<html> \n" +
        "<head> \n" +
          "<meta http-equiv=\"Content-Type\" content=\"text/html;" 
           + "charset=ISO-8859-1\"> \n" +
          "<title> My first jsp  </title> \n" +
        "</head> \n" +
        "<body> \n" +
          "<font size=\"12px\" color=\"" + color + "\">" +
            "Hello " + name +
          "</font> \n" +
        "</body> \n" +
      "</html>" 
    );  
  }  
}