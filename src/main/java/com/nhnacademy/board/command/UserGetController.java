package com.nhnacademy.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserGetController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "userGet.jsp";
    }
}
