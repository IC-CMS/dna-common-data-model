package cms.sre.dna_common_data_model.product_list;

import cms.sre.dna_common_data_model.Block;
import cms.sre.dna_common_data_model.Event;

import java.util.List;

public class ProductEliminatedEvent extends Event {

    private Product product;

    public ProductEliminatedEvent(){
        super();
    }

    public ProductEliminatedEvent(String classification, String emitter){
        super(classification, emitter);
    }

    public ProductEliminatedEvent(String classification, String emitter, List<Block<Event>> blockChain){
        super(classification, emitter, blockChain);
    }

    public ProductEliminatedEvent(ProductEliminatedEvent other){
        super(other);
    }

    public ProductEliminatedEvent(String emitter, ProductEliminatedEvent other){
        super(emitter, other);
    }

    public Product getProduct() {
        return product;
    }

    public ProductEliminatedEvent setProduct(Product product) {
        this.product = product;
        return this;
    }
}
