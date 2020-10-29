package model;

public class friends {
    public int friendImage;
    public String friendName;
    public String friendPhrase;

    public friends(String friendName, int friendImage,  String friendPhrase) {
        this.friendImage = friendImage;
        this.friendName = friendName;
        this.friendPhrase = friendPhrase;
    }


    public String getFriendPhrase() {
        return friendPhrase;
    }

    public void setFriendPhrase(String friendPhrase) {
        this.friendPhrase = friendPhrase;
    }

    public int getFriendImage() {
        return friendImage;
    }

    public void setFriendImage(int friendImage) {
        this.friendImage = friendImage;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }
}