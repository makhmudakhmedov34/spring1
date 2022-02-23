package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        CommentService commentService = container.getBean(CommentService.class);
//        CommentService commentService1 = container.getBean(CommentService.class);
//        System.out.println("commentService = " + commentService);
//        System.out.println("commentService1 = " + commentService1);
//
//        System.out.println(commentService==commentService1);

    }
}
