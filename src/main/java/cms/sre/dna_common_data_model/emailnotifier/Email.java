package cms.sre.dna_common_data_model.emailnotifier;

/**
 * Common Email class used between micro services
 */
public class Email {

    private String emailAddress;
    private String subject;
    private String body;

    public Email(String emailAddress, String subject, String body) {

        this.emailAddress = emailAddress;
        this.subject = subject;
        this. body = body;
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

    @Override
    public String toString() {
        return "Email{" +
                "emailAddress='" + emailAddress + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
