package com.upgrad.ImageHoster.service;

import com.upgrad.ImageHoster.common.CommentManager;
import com.upgrad.ImageHoster.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CommentServiceImpl implements CommentService {
    private CommentManager commentManager;

    @Override
    public Comment register(Comment comment) {
        return commentManager.register(comment);
    }

    @Override
    public List<Comment> getALL(int id) {
        return commentManager.getAllComments(id);
    }
}