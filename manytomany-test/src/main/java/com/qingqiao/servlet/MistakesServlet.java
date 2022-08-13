package com.qingqiao.servlet;

import com.alibaba.fastjson.JSON;
import com.qingqiao.entity.Mistakes;
import com.qingqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/mis")
public class MistakesServlet extends HttpServlet {
    @Autowired
    StudentService studentService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,config.getServletContext());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String m = request.getParameter("m");

        if ("list".equals(m)){
            list(request,response);
        }
    }

    private void list(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Mistakes> list=studentService.queryAllMis();
        String s= JSON.toJSONString(list);
        response.getWriter().print(s);
    }
}
