package com.nhnacademy.board.command.user;

import com.nhnacademy.board.command.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserGetController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "userGet.jsp";
    }
}
