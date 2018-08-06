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
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

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

/**
*
* Deserialization Classes
*
**/
public class CustomKeyDeserializer extends KeyDeserializer {

    private Logger logger = LoggerFactory.getLogger(CustomKeyDeserializer.class);

    @Override
    public Toaster deserializeKey(String key, DeserializationContext ctxt) throws IOException{

        logger.info("Custom Key Deserialization has been accessed.");
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();

        module.addDeserializer(Toaster.class, new ToasterDeserializer());

        return mapper.readValue(key, Toaster.class);

    }
}
/**
*
*
*
**/
public class ToasterDeserializer extends StdDeserializer<Toaster> {

    public ToasterDeserializer(){
        this(null);
    }

    public ToasterDeserializer(Class<?> vc){

        super(vc);

    }

    @Override
    public Toaster deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {

        Toaster mmmToast = new Toaster();
        JsonNode rootNode = jp.getCodec().readTree(jp);

        List<PersistentVolume> volumes = new ArrayList<>();

        for(JsonNode node : rootNode.get("persistentVolumes")){

            volumes.add(
                    new PersistentVolume()
                            .setId(node.get("id").asText())
                            .setName(node.get("name").asText())
                            .setSpaceInGb(node.get("spaceInGb").asInt()));
        }

        mmmToast.setPackerScript(
                new PackerScript()
                        .setScriptFile(
                                new ScriptFile()
                                        .setFilename(
                                                rootNode
                                                        .get("packerScript")
                                                        .get("scriptFile")
                                                        .get("fileName")
                                                        .asText())
                                        .setBinaryFile(
                                                rootNode.get("packerScript")
                                                .get("scriptFile")
                                                .get("binaryFile")
                                                .binaryValue())
                                        .setContents(
                                                rootNode.get("packerScript")
                                                        .get("scriptFile")
                                                        .get("contents")
                                                        .asText())))
                .setTerraformScript(
                        new TerraformScript()
                                .setMainScript(
                                        new ScriptFile()
                                        .setFilename(
                                                rootNode
                                                        .get("terraformScript")
                                                        .get("scriptFile")
                                                        .get("fileName")
                                                        .asText()
                                        )
                                .setBinaryFile(
                                        rootNode.get("terraformScript")
                                                .get("scriptFile")
                                                .get("binaryFile")
                                                .binaryValue()
                                ).setContents(
                                                rootNode.get("terraformScript")
                                                        .get("scriptFile")
                                                        .get("contents")
                                                        .asText()))
                                .setVariableScript(
                                new ScriptFile()
                                        .setFilename(
                                                rootNode
                                                        .get("terraformScript")
                                                        .get("scriptFile")
                                                        .get("fileName")
                                                        .asText()
                                        )
                                        .setBinaryFile(
                                                rootNode.get("terraformScript")
                                                        .get("scriptFile")
                                                        .get("binaryFile")
                                                        .binaryValue()
                                        ).setContents(
                                        rootNode.get("terraformScript")
                                                .get("scriptFile")
                                                .get("contents")
                                                .asText()))
                                .setProviderScript(
                                new ScriptFile()
                                        .setFilename(
                                                rootNode
                                                        .get("terraformScript")
                                                        .get("scriptFile")
                                                        .get("fileName")
                                                        .asText()
                                        )
                                        .setBinaryFile(
                                                rootNode.get("terraformScript")
                                                        .get("scriptFile")
                                                        .get("binaryFile")
                                                        .binaryValue()
                                        ).setContents(
                                        rootNode.get("terraformScript")
                                                .get("scriptFile")
                                                .get("contents")
                                                .asText()))
                                .setDataSourcesScript(
                                new ScriptFile()
                                        .setFilename(
                                                rootNode
                                                        .get("terraformScript")
                                                        .get("scriptFile")
                                                        .get("fileName")
                                                        .asText()
                                        )
                                        .setBinaryFile(
                                                rootNode.get("terraformScript")
                                                        .get("scriptFile")
                                                        .get("binaryFile")
                                                        .binaryValue()
                                        ).setContents(
                                        rootNode.get("terraformScript")
                                                .get("scriptFile")
                                                .get("contents")
                                                .asText())))
                .setPersistentVolumes(volumes);

        return mmmToast;
    }
}
