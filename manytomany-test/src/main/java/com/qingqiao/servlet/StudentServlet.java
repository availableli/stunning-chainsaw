package com.qingqiao.servlet;

import com.qingqiao.entity.Student;
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

@WebServlet("/stu")
public class StudentServlet extends HttpServlet {
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

        String m=request.getParameter("m");
        if ("list".equals(m)){
            list(request,response);
        }else if ("queryById".equals(m)){
            queryStudentById(request,response);
        }else if ("changMis".equals(m)){
            changMis(request,response);
        }
    }

    private void changMis(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String sid=request.getParameter("sid");
        String mids=request.getParameter("mids");
        boolean falg=studentService.changMis(sid,mids);
        response.getWriter().print(falg);
    }

    private void queryStudentById(HttpServletRequest request, HttpServletResponse response) {
    }

    private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> list=studentService.queryAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
