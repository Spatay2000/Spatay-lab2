package dl.iitu.kz;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register",name = "registerPage")

public class Register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String username = request.getParameter("name");
        String password = request.getParameter("pass");
        String password1 = request.getParameter("password1");


            out.println("<center>\n<h1>You registered in " + login + " !</h1>");
            out.println("<h2><a href='home.jsp'>Home page</a></h2>\n</center>");
        }

    }






