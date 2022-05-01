package com.nhnacademy.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "user.jsp";
    }
}
