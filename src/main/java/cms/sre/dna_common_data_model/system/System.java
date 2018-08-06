package cms.sre.dna_common_data_model.system;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class System {
    private String name;
    private String description;
    private String owner;
    private List<Toaster> toasters;
    @JsonDeserialize(keyUsing = CustomKeyDeserializer.class)
    private Map<Toaster, List<Toaster>> dependenciesMap;

    public String getName() {
        return name;
    }

    public System setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public System setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public System setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public List<Toaster> getToasters() {
        return toasters;
    }

    public System setToasters(List<Toaster> toasters) {
        this.toasters = toasters;
        return this;
    }

    public Map<Toaster, List<Toaster>> getDependenciesMap() {
        return dependenciesMap;
    }

    public System setDependenciesMap(Map<Toaster, List<Toaster>> dependenciesMap) {
        this.dependenciesMap = dependenciesMap;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof System)) return false;
        System system = (System) o;
        return Objects.equals(name, system.name) &&
                Objects.equals(description, system.description) &&
                Objects.equals(owner, system.owner) &&
                Objects.equals(toasters, system.toasters) &&
                Objects.equals(dependenciesMap, system.dependenciesMap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, description, owner, toasters, dependenciesMap);
    }
}
