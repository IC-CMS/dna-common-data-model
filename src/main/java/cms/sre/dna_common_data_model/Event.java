package cms.sre.dna_common_data_model;

import org.springframework.data.annotation.Id;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Event {
    @Id
    private UUID id = UUID.randomUUID();
    private List<Block<Event>> blockChain;
    protected String emitter;
    protected List<String> labels = new LinkedList<String>();
    protected String classification;
    protected String version;

    public Event(){

    }

    public Event(String classification, String emitter, List<Block<Event>> blockChain){
        this.classification = classification;
        this.emitter = emitter;
        this.blockChain = Block.addTransaction(this, blockChain);
    }

    public Event(String classification, String emitter){
        this.classification = classification;
        this.emitter = emitter;
        this.blockChain = Block.getInitialBlockChain(this);
    }

    public Event(Event other){
        this.blockChain = Block.addTransaction(this, other.blockChain);
        this.emitter = other.emitter;
        this.labels = other.labels;
        this.version = other.version;
    }

    public Event(String emitter, Event other){
        this(other);
        this.emitter = emitter;
    }

    public UUID getId() {
        return id;
    }

    public Event setId(UUID id) {
        this.id = id;
        return this;
    }

    public List<Block<Event>> getBlockChain() {
        return blockChain;
    }

    public Event setBlockChain(List<Block<Event>> blockChain) {
        this.blockChain = blockChain;
        return this;
    }

    public String getEmitter() {
        return emitter;
    }

    public Event setEmitter(String emitter) {
        this.emitter = emitter;
        return this;
    }

    public List<String> getLabels() {
        return labels;
    }

    public Event setLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public String getClassification() {
        return classification;
    }

    public Event setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Event setVersion(String version) {
        this.version = version;
        return this;
    }
}
