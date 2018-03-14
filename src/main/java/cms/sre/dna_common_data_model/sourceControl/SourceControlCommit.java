package cms.sre.dna_common_data_model.sourceControl;

import java.util.List;
import java.util.Objects;

public class SourceControlCommit {
    private String message;
    private String timestamp;
    private String commitor;
    private List<String> added;
    private List<String> modified;
    private List<String> removed;

    public String getMessage() {
        return message;
    }

    public SourceControlCommit setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public SourceControlCommit setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getCommitor() {
        return commitor;
    }

    public SourceControlCommit setCommitor(String commitor) {
        this.commitor = commitor;
        return this;
    }

    public List<String> getAdded() {
        return added;
    }

    public SourceControlCommit setAdded(List<String> added) {
        this.added = added;
        return this;
    }

    public List<String> getModified() {
        return modified;
    }

    public SourceControlCommit setModified(List<String> modified) {
        this.modified = modified;
        return this;
    }

    public List<String> getRemoved() {
        return removed;
    }

    public SourceControlCommit setRemoved(List<String> removed) {
        this.removed = removed;
        return this;
    }
}
