package cms.sre.dna_common_data_model.product_list;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Product {
    private List<String> developers;
    private String program;
    private String section;
    @Id
    private String title;
    private String classification;
    private String sspName;
    private String lifecycleStatus;
    private String productStatus;
    private String lane;
    private String org;
    private String division;
    private Boolean needsSCM;
    private String scmLocation;

    public List<String> getDevelopers() {
        return developers;
    }

    public Product setDevelopers(List<String> developers) {
        this.developers = developers;
        return this;
    }

    public String getProgram() {
        return program;
    }

    public Product setProgram(String program) {
        this.program = program;
        return this;
    }

    public String getSection() {
        return section;
    }

    public Product setSection(String section) {
        this.section = section;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Product setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getClassification() {
        return classification;
    }

    public Product setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    public String getSspName() {
        return sspName;
    }

    public Product setSspName(String sspName) {
        this.sspName = sspName;
        return this;
    }

    public String getLifecycleStatus() {
        return lifecycleStatus;
    }

    public Product setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
        return this;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public Product setProductStatus(String productStatus) {
        this.productStatus = productStatus;
        return this;
    }

    public String getLane() {
        return lane;
    }

    public Product setLane(String lane) {
        this.lane = lane;
        return this;
    }

    public String getOrg() {
        return org;
    }

    public Product setOrg(String org) {
        this.org = org;
        return this;
    }

    public String getDivision() {
        return division;
    }

    public Product setDivision(String division) {
        this.division = division;
        return this;
    }

    public Boolean getNeedsSCM() {
        return needsSCM;
    }

    public Product setNeedsSCM(Boolean needsSCM) {
        this.needsSCM = needsSCM;
        return this;
    }

    public String getScmLocation() {
        return scmLocation;
    }

    public Product setScmLocation(String scmLocation) {
        this.scmLocation = scmLocation;
        return this;
    }
}
