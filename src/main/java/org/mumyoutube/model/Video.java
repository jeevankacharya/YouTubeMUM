package org.mumyoutube.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Embeddable
@NoArgsConstructor
@Entity()
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long videoId;
   // @NotBlank
   /* @NotNull
    private int userId;*/

    //@NotBlank
    @NotNull
    @Column(name = "VideoPath")
    private String videoPath;

    //@NotBlank
    @Column(name = "Title")
    private String title;

    //@NotBlank
    @NotNull
    @Column(name = "Views")
    @JsonProperty(value = "views")
    private int noOfViews;

    //@NotBlank
    @NotNull
    @Column(name = "Dislikes")
    @JsonProperty(value = "dislikes")
    private int no_dislikes;

    //@NotBlank
    @NotNull
    @Column(name = "Likes")
    @JsonProperty(value = "likes")
    private int no_likes;

    @Embedded
    @ManyToOne
    @JoinColumn(name = "userId", nullable=false, updatable=false)
    private User user;

    @OneToMany(mappedBy = "video")
    private List<Comment> comments = new ArrayList<>();

   /* public Video(@NotBlank int userId, @NotBlank String videoPath, @NotBlank String title) {
        this.userId = userId;
        this.videoPath = videoPath;
        this.title = title;
    }
*/
   /* @NotBlank
    private String comment;*/

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setNoOfViews(int noOfViews) {
        this.noOfViews = noOfViews;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public String getTitle() {
        return title;
    }

    public int getNoOfViews() {
        return noOfViews;
    }
/*
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }*/

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public int getNo_dislikes() {
        return no_dislikes;
    }

    //i think we dont need to set likes and dislikes
    public void setNo_dislikes(int no_dislikes) {
        this.no_dislikes = no_dislikes;
    }

    public int getNo_likes() {
        return no_likes;
    }

    public void setNo_likes(int no_likes) {
        this.no_likes = no_likes;
    }

   /* public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }*/

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
}
