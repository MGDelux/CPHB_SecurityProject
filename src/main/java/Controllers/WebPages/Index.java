package Controllers.WebPages;


import Controllers.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * CREATED BY mathias @ 14-11-2021 - 11:39
 **/

@WebServlet("")
public class Index extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)

            throws ServletException, IOException {
        render("index+", "/WEB-INF/pages/index.jsp", req, resp);
    }

}
