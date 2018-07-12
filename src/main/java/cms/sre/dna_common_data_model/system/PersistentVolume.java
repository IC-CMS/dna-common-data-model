package cms.sre.dna_common_data_model.system;

public class PersistentVolume {
    private String name;
    private String id;
    private int spaceInGb;

    public String getName() {
        return name;
    }

    public PersistentVolume setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public PersistentVolume setId(String id) {
        this.id = id;
        return this;
    }

    public int getSpaceInGb() {
        return spaceInGb;
    }

    public PersistentVolume setSpaceInGb(int spaceInGb) {
        this.spaceInGb = spaceInGb;
        return this;
    }
}
