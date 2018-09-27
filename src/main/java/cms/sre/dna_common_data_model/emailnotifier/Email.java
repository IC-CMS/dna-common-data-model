package cms.sre.dna_common_data_model.emailnotifier;

import java.util.Date;
import java.util.UUID;

/**
 * Common Email class used between micro services
 */
public class Email {

    private Date createdDate;
    private String uuid;
    private String emailAddress;
    private String subject;
    private String body;

    public Email () {

        this.uuid = UUID.randomUUID().toString();

    }

    public Email(String emailAddress, String subject, String body) {

        this.uuid = UUID.randomUUID().toString();
        this.emailAddress = emailAddress;
        this.subject = subject;
        this.body = body;
    }

    public Email(String uuid, String emailAddress, String subject, String body) {

        this.uuid = uuid;
        this.emailAddress = emailAddress;
        this.subject = subject;
        this. body = body;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Email setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Email setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Email setBody(String body) {
        this.body = body;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        // If already set, don't allow changing it
        if (this.uuid == null ) {
            this.uuid = uuid;
        }
    }

    @Override
    public String toString() {
        return "Email{" +
                "createdDate=" + createdDate +
                ", uuid='" + uuid + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}