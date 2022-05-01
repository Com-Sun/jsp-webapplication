package com.nhnacademy.board.command;

import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFormController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);
        if (Objects.isNull(session) || Objects.isNull(session.getAttribute("id"))) {
            return "/loginForm.jsp";
        } else if (session.getAttribute("id").equals("admin")) {
            return "/user.jsp";
        } else { //여기서 admin인경우
            return"/loginSuccess.jsp";
        }
    }

}
