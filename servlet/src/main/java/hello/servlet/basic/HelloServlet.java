package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + req);
        System.out.println("response = " + resp);

        // url query parameter 가지고 오기
        String username = req.getParameter("username");
        System.out.println(username);

        // response header 세팅
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        // response body 설정
        resp.getWriter().write("hello" + username);

    }
}
