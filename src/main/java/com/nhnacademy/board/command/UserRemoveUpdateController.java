package com.nhnacademy.board.command;

import com.nhnacademy.board.domain.UserRepository;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRemoveUpdateController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String[] users = request.getParameterValues("user");

        UserRepository userRepository =
            (UserRepository) request.getServletContext().getAttribute("repository");

        for (String user : users) {
            userRepository.remove(user);
//            request.setAttribute("repository", userRepository);
        }

        return "/";
    }
}
