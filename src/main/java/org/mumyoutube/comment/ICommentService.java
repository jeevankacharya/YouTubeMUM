package org.mumyoutube.comment;

import org.mumyoutube.model.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> getAllComment();

    List<Comment> getAllComment(int videoId);

    Comment addComment(Comment comment);

    void deleteComment(int commentId);

}
