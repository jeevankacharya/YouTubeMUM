package org.mumyoutube.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mumyoutube.constants.AppConstant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@Entity()
@Table(name = AppConstant.Tb_Video)
public class Video {

    @Id
    @GeneratedValue
    private Long videoId;
    @NotBlank
    private int userId;
    @NotBlank
    private String videoPath;
    private int no_dislikes;
    private int no_likes;
    @NotBlank
    private String comment;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public int getNo_dislikes() {
        return no_dislikes;
    }

    public void setNo_dislikes(int no_dislikes) {
        this.no_dislikes = no_dislikes;
    }

    public int getNo_likes() {
        return no_likes;
    }

    public void setNo_likes(int no_likes) {
        this.no_likes = no_likes;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }
}
