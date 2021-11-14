package Controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * CREATED BY mathias @ 14-11-2021 - 11:36
 **/
public class BaseServlet extends HttpServlet {

    protected void setUp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
    }


    protected void render(String title, String content, HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException { //TODO: ADD CUSTOM EXCEPTIONS
        req.setAttribute("title", title);
        req.setAttribute("content", content);
        req.getRequestDispatcher(content).forward(req, resp);


    }


}
