package cms.sre.dna_common_data_model.product_list;

import cms.sre.dna_common_data_model.Block;
import cms.sre.dna_common_data_model.Event;

import java.util.List;

public class ProductFoundEvent extends Event {

    private Product product;

    public ProductFoundEvent(){
        super();
    }

    public ProductFoundEvent(String classification, String emitter){
        super(classification, emitter);
    }

    public ProductFoundEvent(String classification, String emitter, List<Block<Event>> blockChain){
        super(classification, emitter, blockChain);
    }

    public ProductFoundEvent(ProductFoundEvent other){
        super(other);
    }

    public ProductFoundEvent(String emitter, ProductFoundEvent other){
        super(emitter, other);
    }

    public Product getProduct() {
        return product;
    }

    public ProductFoundEvent setProduct(Product product) {
        this.product = product;
        return this;
    }
}
