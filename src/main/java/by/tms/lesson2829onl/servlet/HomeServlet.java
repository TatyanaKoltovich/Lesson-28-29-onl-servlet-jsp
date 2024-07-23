package by.tms.lesson2829onl.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/") //localhost:8080
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        //resp.getWriter().println("Test");
        String name = req.getParameter("name");

        boolean flag = Boolean.parseBoolean( req.getParameter("flag"));

//        List<String> list = new ArrayList<>();
//        list.add("Hello 1");
//        list.add("Hello 2");
//        list.add("Hello 3");
//        list.add("Hello 4");
//        list.add("Hello 5");
//
//        req.setAttribute("list", list);
        req.setAttribute("myName", name);
        req.setAttribute("flag", flag);

        getServletContext().getRequestDispatcher("/pages/home.jsp").forward(req, resp);


    }
}