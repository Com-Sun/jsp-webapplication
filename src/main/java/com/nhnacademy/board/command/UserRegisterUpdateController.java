package com.nhnacademy.board.command;

import com.nhnacademy.board.domain.User;
import com.nhnacademy.board.domain.UserRepository;
import com.nhnacademy.board.domain.impl.UserImpl;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegisterUpdateController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        String name = request.getParameter("name");

        User user = new UserImpl();
        user.setId(id);
        user.setPassword(pwd);
        user.setName(name);

        UserRepository userRepository =
            (UserRepository) request.getServletContext().getAttribute("repository");
        userRepository.add("id", user);

        return "/";
    }
}
