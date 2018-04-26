package cms.sre.dna_common_data_model.product_list;

import cms.sre.dna_common_data_model.Block;
import cms.sre.dna_common_data_model.Event;

import java.util.List;

public class NewProductDiscoveredEvent extends Event{
    private Product product;

    public NewProductDiscoveredEvent(){
        super();
    }

    public NewProductDiscoveredEvent(String classification, String emitter){
        super(classification, emitter);
    }

    public NewProductDiscoveredEvent(String classification, String emitter, List<Block<Event>> blockChain){
        super(classification, emitter, blockChain);
    }

    public NewProductDiscoveredEvent(NewProductDiscoveredEvent other){
        super(other);
    }

    public NewProductDiscoveredEvent(String emitter, NewProductDiscoveredEvent other){
        super(emitter, other);
    }

    public Product getProduct() {
        return product;
    }

    public NewProductDiscoveredEvent setProduct(Product product) {
        this.product = product;
        return this;
    }
}
