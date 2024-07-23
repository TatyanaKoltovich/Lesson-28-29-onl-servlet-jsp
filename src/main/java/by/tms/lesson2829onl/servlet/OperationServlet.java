package by.tms.lesson2829onl.servlet;

import by.tms.lesson2829onl.model.Operation;
import by.tms.lesson2829onl.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class OperationServlet extends HttpServlet {
    private final OperationService operationService = new OperationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String type = req.getParameter("type");

        Operation operation = new Operation(num1, num2, type);
        Operation execute = operationService.execute(operation);
        double result = operation.getResult();

        req.getSession().setAttribute("num1", num1);
        req.getSession().setAttribute("num2", num2);
        req.getSession().setAttribute("type", type);
        req.getSession().setAttribute("result", result);
        resp.sendRedirect("/calculator");
    }
}
