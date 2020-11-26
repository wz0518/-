package com.servlet;

import com.entity.Message;
import com.entity.User;
import com.service.MessageService;
import com.service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 作者：wz
 * 日期: 2020/11/26 19:50
 * 描述:
 */
@WebServlet("/message.do")
public class MessageServlet extends BaseServlet{
    MessageService messageService =null;

    public MessageServlet() {
        messageService = new MessageServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    public void queryList(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        User user=(User)req.getSession().getAttribute("user");
        List<Message> messages=messageService.queryMessageByToUid(user.getId());
        req.setAttribute("messages",messages);
        System.out.println(messages);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);

    }

}
