package cms.sre.dna_common_data_model.jenkins;

import java.util.Date;
import java.util.Objects;

/**
 * Used for sending Build Events from the Gitlab Webhook
 */
public class JenkinsBuildEvent {

    private String object_kind;

    private String project_name;

    private String ssl_url;

    private String classification;

    private String branch_name;

    private String user_email;

    private String user_name;

    private String revision_number;

    private String pull_number;

    private Date timestamp;

    public String getObject_kind() {
        return object_kind;
    }

    public void setObject_kind(String object_kind) {
        this.object_kind = object_kind;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getSsl_url() {
        return ssl_url;
    }

    public void setSsl_url(String ssl_url) {
        this.ssl_url = ssl_url;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRevision_number() {
        return revision_number;
    }

    public void setRevision_number(String revision_number) {
        this.revision_number = revision_number;
    }

    public String getPull_number() {
        return pull_number;
    }

    public void setPull_number(String pull_number) {
        this.pull_number = pull_number;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JenkinsBuildEvent that = (JenkinsBuildEvent) o;
        return  Objects.equals(object_kind, that.object_kind) &&
                Objects.equals(project_name, that.project_name) &&
                Objects.equals(ssl_url, that.ssl_url) &&
                Objects.equals(classification, that.classification) &&
                Objects.equals(branch_name, that.branch_name) &&
                Objects.equals(user_email, that.user_email) &&
                Objects.equals(user_name, that.user_name) &&
                Objects.equals(revision_number, that.revision_number) &&
                Objects.equals(pull_number, that.pull_number) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(project_name, ssl_url, branch_name, revision_number, pull_number, timestamp);
    }

    @Override
    public String toString() {
        return "JenkinsBuildEvent{" +
                "object_kind='" + object_kind + '\'' +
                "project_name='" + project_name + '\'' +
                ", ssl_url='" + ssl_url + '\'' +
                ", classification='" + classification + '\'' +
                ", branch_name='" + branch_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_name='" + user_name + '\'' +
                ", revision_number='" + revision_number + '\'' +
                ", pull_number='" + pull_number + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}