package se.iths.asyncdemo211210.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import se.iths.asyncdemo211210.model.GitHubUser;

import java.util.concurrent.CompletableFuture;

@Service
public class GitHubService {

    private static final String URL = "https://api.github.com/users/";
    private final RestTemplate restTemplate;

    public GitHubService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public CompletableFuture<GitHubUser> findUser(String user) throws InterruptedException {

        System.out.println("Recieving info about user " + user + " from Github API...");
        GitHubUser result = restTemplate.getForObject(URL + user, GitHubUser.class);

        Thread.sleep(2000);
        return CompletableFuture.completedFuture(result);
    }
}
