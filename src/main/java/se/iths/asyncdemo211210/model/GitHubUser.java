package se.iths.asyncdemo211210.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class GitHubUser {

    @JsonIgnoreProperties(ignoreUnknown = true)
    private String name;
    private String blog;
    private String created_at;
    private String html_url;

    public String getName() {
        return name;
    }

    public String getBlog() {
        return blog;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getHtml_url() {
        return html_url;
    }

    @Override
    public String toString() {
        return "GitHubUser{" +
                "name='" + name + '\'' +
                ", blog='" + blog + '\'' +
                ", created_at='" + created_at + '\'' +
                ", html_url='" + html_url + '\'' +
                '}';
    }
}
