package com.nhnacademy.board.initializer;

import com.nhnacademy.board.domain.PostRepository;
import com.nhnacademy.board.domain.User;
import com.nhnacademy.board.domain.UserRepository;
import com.nhnacademy.board.domain.impl.PostRepositoryImpl;
import com.nhnacademy.board.domain.impl.UserImpl;
import com.nhnacademy.board.domain.impl.UserRepositoryImpl;
import java.util.Set;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

@HandlesTypes({
    javax.servlet.Servlet.class,
    javax.servlet.Filter.class,
    javax.servlet.ServletContextListener.class
})
public class WebAppInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext)
        throws ServletException {
        User admin = getAdmin();
        UserRepository repository = new UserRepositoryImpl();
        repository.add("admin", admin);
        servletContext.setAttribute("repository", repository);
        PostRepository postRepository = new PostRepositoryImpl();
        servletContext.setAttribute("postRepository", postRepository);
    }

    private User getAdmin() {
        User admin = new UserImpl();
        admin.setId("admin");
        admin.setPassword("12345");
        admin.setName("관리자");
        return admin;
    }
}
