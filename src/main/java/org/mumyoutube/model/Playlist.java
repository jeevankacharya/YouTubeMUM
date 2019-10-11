package org.mumyoutube.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.mumyoutube.constants.AppConstant;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = AppConstant.Tb_Playlist)
public class Playlist {

    @Id
    @GeneratedValue
    private Long playlistId;

    @NotBlank
    private String playlistName;

    @NonNull
    private int userId;

    @OneToMany
    private List<Video> video;

    public Playlist(@NotBlank String playlistName) {
        this.playlistName = playlistName;
    }

    public List<Video> getVideo() {
        return video;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Long playlistId) {
        this.playlistId = playlistId;
    }
}
