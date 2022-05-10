package it.unipi.dii.lsmsdb.myPodcastDB.model;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Author {
    private String id;
    private String name;
    private String password;
    private String email;
    private List<ReducedPodcast> ownPodcasts;

    public Author() {
    }

    public Author(String id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.ownPodcasts = new ArrayList<>();
    }

    public Author(Author other) {
        this.id = other.getId();
        this.name = other.getName();
        this.password = other.getPassword();
        this.email = other.getEmail();
        this.ownPodcasts = new ArrayList<>(other.getOwnPodcasts());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ReducedPodcast> getOwnPodcasts() {
        return ownPodcasts;
    }

    public void setOwnPodcasts(List<ReducedPodcast> ownPodcasts) {
        this.ownPodcasts = ownPodcasts;
    }

    public void addPodcast(String id, String name, Date releaseDate) {
        ReducedPodcast podcast = new ReducedPodcast(id, name, releaseDate);
        this.ownPodcasts.add(podcast);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", ownPodcasts=" + ownPodcasts +
                '}';
    }
}

class ReducedPodcast {
    private String id;
    private String name;
    private Date releaseDate;

    public ReducedPodcast() {
    }

    public ReducedPodcast(String id, String name, Date releaseDate) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getReleaseDateAsString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(this.releaseDate).replace(" ", "T") + "Z";
        return date;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "ReducedPodcast{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
