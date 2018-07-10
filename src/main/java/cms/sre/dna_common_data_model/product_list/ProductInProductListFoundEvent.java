package cms.sre.dna_common_data_model.product_list;

import cms.sre.dna_common_data_model.Block;
import cms.sre.dna_common_data_model.Event;

import java.util.List;

public class ProductInProductListFoundEvent extends Event{
    private Product product;
    public ProductInProductListFoundEvent(){
        super();
    }

    public ProductInProductListFoundEvent(String classification, String emitter){
        super(classification, emitter);
    }

    public ProductInProductListFoundEvent(String classification, String emitter, List<Block<Event>> blockChain){
        super(classification, emitter, blockChain);
    }

    public ProductInProductListFoundEvent(ProductInProductListFoundEvent other){
        super(other);
    }

    public ProductInProductListFoundEvent(String emitter, ProductInProductListFoundEvent other){
        super(emitter, other);
    }

    public Product getProduct() {
        return product;
    }

    public ProductInProductListFoundEvent setProduct(Product product) {
        this.product = product;
        return this;
    }
}
