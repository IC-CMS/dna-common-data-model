package cms.sre.dna_common_data_model.system;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Objects;
import cms.sre.dna_common_data_model.system.Toaster;
import cms.sre.dna_common_data_model.hashicorpFile.PackerScript;
import cms.sre.dna_common_data_model.hashicorpFile.ScriptFile;
import cms.sre.dna_common_data_model.hashicorpFile.TerraformScript;
import cms.sre.dna_common_data_model.system.PersistentVolume;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class System {
    
    protected class ToasterKeyDeserializer extends KeyDeserializer {

        private Logger logger = LoggerFactory.getLogger(ToasterKeyDeserializer.class);

        @Override
        public Toaster deserializeKey(String key, DeserializationContext ctxt) throws IOException{

            logger.info("Custom Key Deserialization has been accessed.");

            ObjectMapper mapper = new ObjectMapper();

            return mapper.readValue(key, Toaster.class);

        }
    }

    private String name;
    private String description;
    private String owner;
    private List<Toaster> toasters;
    
    @JsonDeserialize(keyUsing = ToasterKeyDeserializer.class)
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


