package org.mumyoutube.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Channel {

    @Id
    private int channelId;

    @Column
    private int channelName;

    @OneToOne
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> subscribers=new ArrayList<>();

    public Channel(int channelId, int channelName) {
        this.channelId = channelId;
        this.channelName = channelName;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public int getChannelName() {
        return channelName;
    }

    public void setChannelName(int channelName) {
        this.channelName = channelName;
    }

    public void subscribe(User subscriber){
        this.subscribers.add(subscriber);
    }

}
