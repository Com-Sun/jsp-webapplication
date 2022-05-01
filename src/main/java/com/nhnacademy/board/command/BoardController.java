package com.nhnacademy.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "board.jsp";
    }
}
