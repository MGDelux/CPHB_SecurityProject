package Controllers;

import Service.ILoginService;
import Service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
This servlet is a general servlet. You should create a servles for each type of requests you have.
 */
@WebServlet(name = "SomeController")
public class SomeController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String servletPath = request.getServletPath();

        // example login
        if (servletPath.equals("/login")) {
            ILoginService ls = new LoginService();

            if(!ls.isLoggedin()) {
                // user is logged in
            }

            String user = "john"; // request.getParameter("username");
            String pass = "doe"; // request.getParameter("password");
            if(ls.verifyCredentials(user, pass)) {
                // user logged in
            } else{
                // user not logged in
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp").forward(request, response);


    }
}
