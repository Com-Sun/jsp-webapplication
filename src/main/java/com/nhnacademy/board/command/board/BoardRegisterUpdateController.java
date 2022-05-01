package com.nhnacademy.board.command.board;

import com.nhnacademy.board.command.Command;
import com.nhnacademy.board.domain.Post;
import com.nhnacademy.board.domain.PostRepository;
import com.nhnacademy.board.domain.impl.PostImpl;
import com.nhnacademy.board.domain.impl.PostRepositoryImpl;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardRegisterUpdateController implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        PostRepository postRepository =
            (PostRepository) request.getServletContext().getAttribute("postRepository");

        Post post = new PostImpl();
        post.setWriteTime(LocalDateTime.now());
        post.setContent(content);
        post.setTitle(title);
        post.setId(Long.parseLong(id));
        postRepository.register(post);


        return "board.jsp";
    }
}
