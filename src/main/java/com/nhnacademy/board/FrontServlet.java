package com.nhnacademy.board;

import com.nhnacademy.board.command.BoardController;
import com.nhnacademy.board.command.Command;
import com.nhnacademy.board.command.LoginFormController;
import com.nhnacademy.board.command.LoginProcessingController;
import com.nhnacademy.board.command.user.LogoutController;
import com.nhnacademy.board.command.user.UserController;
import com.nhnacademy.board.command.user.UserFixController;
import com.nhnacademy.board.command.user.UserFixUpdateController;
import com.nhnacademy.board.command.user.UserGetController;
import com.nhnacademy.board.command.user.UserRegisterController;
import com.nhnacademy.board.command.user.UserRegisterUpdateController;
import com.nhnacademy.board.command.user.UserRemoveController;
import com.nhnacademy.board.command.user.UserRemoveUpdateController;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebServlet(name = "frontServlet", urlPatterns = "*.do")
public class FrontServlet extends HttpServlet {
    private static final String REDIRECT_PREFIX = "redirect:";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        try {
            Command command = resolveCommand(req.getServletPath(), req.getMethod());
            String view = command.execute(req, resp);

            if (view.startsWith(REDIRECT_PREFIX)) {
                resp.sendRedirect(view.substring(REDIRECT_PREFIX.length()));
            } else {
                RequestDispatcher rd = req.getRequestDispatcher(view);
                rd.include(req, resp);
            }
        } catch (Exception ex) {
            log.error("", ex);

            req.setAttribute("exception", ex);

            RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
            rd.forward(req, resp);
        }
    }

    private Command resolveCommand(String servletPath, String method) {
        Command command = null;


        if ("/login.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new LoginFormController();
        } else if ("/login.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new LoginProcessingController("admin", "12345");
        } else if ("/logout.do".equals(servletPath)) {
            command = new LogoutController();
        } else if ("/board.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new BoardController();
        } else if ("/user.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new UserController();
        } else if ("/userRegister.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new UserRegisterUpdateController();
        } else if ("/userRegister.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new UserRegisterController();
        } else if ("/userGet.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new UserGetController();
        } else if ("/userRemove.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new UserRemoveController();
        } else if ("/userRemove.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new UserRemoveUpdateController();
        } else if ("/userFix.do".equals(servletPath) && "GET".equalsIgnoreCase(method)) {
            command = new UserFixController();
        } else if ("/userFix.do".equals(servletPath) && "POST".equalsIgnoreCase(method)) {
            command = new UserFixUpdateController();
        }


        return command;
    }


}
