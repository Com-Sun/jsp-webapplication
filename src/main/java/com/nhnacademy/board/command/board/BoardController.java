package com.nhnacademy.board.command.board;

import com.nhnacademy.board.command.Command;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "board.jsp";
    }
}
