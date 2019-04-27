package httpcall;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestHTTPServer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doPost(request, response);

        response.setCharacterEncoding("gbk");

        PrintWriter out = response.getWriter();
        String param1 = request.getParameter("param1");
        out.println("param1=" + param1);
        String param2 = request.getParameter("param2");
        out.println("param2=" + param2);
        if (param1 == null || "".equals("param1") || param1.length() <= 0) {
            out.println("http call failed,参数param1不能为空,程序退出");
        } else if (param2 == null || "".equals("param2")
                || param2.length() <= 0) {
            out.println("http call failed,参数param2不能为空,程序退出");
        } else {
            out.println("---http call success---");
        }
        out.close();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doGet(req, resp);
    }
}
