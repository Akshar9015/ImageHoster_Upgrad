package com.upgrad.ImageHoster.common;

import com.upgrad.ImageHoster.model.Comment;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CommentManager extends SessionManager{
    public Comment register( Comment comment){
        Session session = openSession();
        session.save(comment);
        commitSession(session);
        return comment;
    }
    public List<Comment> getAllComments(int id){
        Session session = openSession();
        List<Comment> comments= (List)session.createCriteria(Comment.class)
                .add(Restrictions.eq("image_id", id));
        return comments;

    }
}