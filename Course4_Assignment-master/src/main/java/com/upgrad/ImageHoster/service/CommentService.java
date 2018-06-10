package com.upgrad.ImageHoster.service;

import com.upgrad.ImageHoster.model.Comment;
import java.util.List;

public interface CommentService {
    Comment register(Comment comment);
    List<Comment> getALL(int id);
}

