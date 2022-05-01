package com.nhnacademy.board.command.user;

import com.nhnacademy.board.command.Command;
import com.nhnacademy.board.domain.User;
import com.nhnacademy.board.domain.UserRepository;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserFixUpdateController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        String name = request.getParameter("name");

        UserRepository userRepository =
            (UserRepository) request.getServletContext().getAttribute("repository");

        userRepository.getUser(user).setPassword(pwd);
        userRepository.getUser(user).setName(name);


        return "/";
    }
}
