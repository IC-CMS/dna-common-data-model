package cms.sre.dna_common_data_model.product_list;

import cms.sre.dna_common_data_model.Block;
import cms.sre.dna_common_data_model.Event;

import java.util.List;

public class ProductAlteredEvent extends Event {

    private Product oldVersion;
    private Product newVersion;

    public ProductAlteredEvent(){
        super();
    }

    public ProductAlteredEvent(String classification, String emitter){
        super(classification, emitter);
    }

    public ProductAlteredEvent(String classification, String emitter, List<Block<Event>> blockChain){
        super(classification, emitter, blockChain);
    }

    public ProductAlteredEvent(ProductAlteredEvent other){
        super(other);
    }

    public ProductAlteredEvent(String emitter, ProductAlteredEvent other){
        super(emitter, other);
    }

    public Product getOldVersion() {
        return oldVersion;
    }

    public ProductAlteredEvent setOldVersion(Product oldVersion) {
        this.oldVersion = oldVersion;
        return this;
    }

    public Product getNewVersion() {
        return newVersion;
    }

    public ProductAlteredEvent setNewVersion(Product newVersion) {
        this.newVersion = newVersion;
        return this;
    }
}
