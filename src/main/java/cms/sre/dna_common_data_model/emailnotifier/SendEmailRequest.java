package cms.sre.dna_common_data_model.emailnotifier;

public class SendEmailRequest {
    private String dn;
    private String subject;
    private String body;

    public String getDn() {
        return dn;
    }

    public SendEmailRequest setDn(String dn) {
        this.dn = dn;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public SendEmailRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getBody() {
        return body;
    }

    public SendEmailRequest setBody(String body) {
        this.body = body;
        return this;
    }
}
