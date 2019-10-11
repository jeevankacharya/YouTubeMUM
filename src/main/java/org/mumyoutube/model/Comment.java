package org.mumyoutube.model;
import javax.persistence.*;

@Entity
public class Comment {

    @Id
    private int CommentId;

    @Column
    private String comment;

    @OneToOne
    private User user;

    @OneToOne
    private Video video;

    public int getCommentId() {
        return CommentId;
    }
}
