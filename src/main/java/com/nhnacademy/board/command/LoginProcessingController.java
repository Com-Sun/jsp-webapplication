package com.nhnacademy.board.command;

import com.nhnacademy.board.domain.User;
import com.nhnacademy.board.domain.UserRepository;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginProcessingController implements Command {
    private final String idInitParam;
    private final String pwdInitParam;
    private UserRepository userRepository;

    public LoginProcessingController(String idInitParam, String pwdInitParam) {
        this.idInitParam = idInitParam;
        this.pwdInitParam = pwdInitParam;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");

        userRepository = (UserRepository) request.getServletContext().getAttribute("repository");

        if (id != null && pwd != null && id.equals(idInitParam) && pwd.equals(pwdInitParam)) {
            HttpSession session = request.getSession();
            session.setAttribute("id", id);

            return "redirect:/login.do";
        } else if (id != null && pwd != null) {
            for (User user : userRepository.getUsers()) {
                if (user.getId().equals(id) && user.getPassword().equals(pwd)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("id", id);
                    break;
                }
            }
            return "redirect:/login.do";
        } else {
            return "/loginForm.jsp";
        }
    }

}
