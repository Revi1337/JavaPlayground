package _01_creational_patterns._05_prototype._03_java;


import _01_creational_patterns._05_prototype._02_after.GithubIssue;
import _01_creational_patterns._05_prototype._02_after.GithubRepository;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        // TODO ModelMapper;
//        ModelMapper modelMapper = new ModelMapper();
//        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
//        System.out.println(githubIssueData);
    }
}
