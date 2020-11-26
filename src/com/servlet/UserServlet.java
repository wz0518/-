package com.servlet;

import com.entity.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：wz
 * 日期: 2020/11/26 18:09
 * 描述:
 */
@WebServlet("/user.do")
public class UserServlet extends BaseServlet {
    UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    public void register(HttpServletRequest req,HttpServletResponse resp){

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String email=req.getParameter("email");
        int result =userService.register(new User(username,password,email));


    }

    public void login(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {

        String username =req.getParameter("username");
        String password=req.getParameter("password");
        String code=req.getParameter("code");
        String token=(String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        if (token!=null&&token.equalsIgnoreCase(code)){
            User user =userService.login(new User(username,password,null));
            if (user!=null){
                HttpSession session=req.getSession();
                session.setAttribute("user",user);
                req.getRequestDispatcher("/message.do?action=queryList").forward(req,resp);

                System.out.println(req.getRequestDispatcher("/message.do?action=queryList"));
            }else {
                resp.sendRedirect(req.getContextPath()+"/login.jsp");

            }
        }else {

        }

    }
}
