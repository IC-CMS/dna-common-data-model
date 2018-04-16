package cms.sre.dna_common_data_model.sourceControl;

import cms.sre.dna_common_data_model.Block;
import cms.sre.dna_common_data_model.Event;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class SourceControlCommitEvent extends Event {
    private String userEmail;
    private String userName;
    private String repositoryName;
    private String sshUrl;
    private String branchName;
    private List<SourceControlCommit> commits;
    private long numberOfChanges;
    private String revisionNumber;
    private String pullNumber;
    private Calendar timestamp;
    private String commitMessage;
    private String parentRevisionNumber;

    public SourceControlCommitEvent(){
        super();
    }

    public SourceControlCommitEvent(String classification, String emitter){
        super(classification, emitter);
    }

    public SourceControlCommitEvent(String classification, String emitter, List<Block<Event>> blockChain){
        super(classification,emitter, blockChain);
    }

    public SourceControlCommitEvent(SourceControlCommitEvent other){
        super(other);
    }

    public SourceControlCommitEvent(String emitter, SourceControlCommitEvent other){
        super(emitter,other);
    }

    public String getUserEmail() {
        return userEmail;
    }

    public SourceControlCommitEvent setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public SourceControlCommitEvent setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public SourceControlCommitEvent setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public SourceControlCommitEvent setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    public String getBranchName() {
        return branchName;
    }

    public SourceControlCommitEvent setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    public List<SourceControlCommit> getCommits() {
        return commits;
    }

    public SourceControlCommitEvent setCommits(List<SourceControlCommit> commits) {
        this.commits = commits;
        return this;
    }

    public long getNumberOfChanges() {
        return numberOfChanges;
    }

    public SourceControlCommitEvent setNumberOfChanges(long numberOfChanges) {
        this.numberOfChanges = numberOfChanges;
        return this;
    }

    public String getRevisionNumber() {
        return revisionNumber;
    }

    public SourceControlCommitEvent setRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
        return this;
    }

    public String getPullNumber() {
        return pullNumber;
    }

    public SourceControlCommitEvent setPullNumber(String pullNumber) {
        this.pullNumber = pullNumber;
        return this;
    }

    public Calendar getTimestamp() {
        return timestamp;
    }

    public SourceControlCommitEvent setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getCommitMessage() {
        return commitMessage;
    }

    public SourceControlCommitEvent setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    public String getParentRevisionNumber() {
        return parentRevisionNumber;
    }

    public SourceControlCommitEvent setParentRevisionNumber(String parentRevisionNumber) {
        this.parentRevisionNumber = parentRevisionNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SourceControlCommitEvent)) return false;
        SourceControlCommitEvent that = (SourceControlCommitEvent) o;
        return Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(repositoryName, that.repositoryName) &&
                Objects.equals(sshUrl, that.sshUrl) &&
                Objects.equals(branchName, that.branchName) &&
                Objects.equals(commits, that.commits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail, userName, repositoryName, sshUrl, branchName, commits);
    }
}
