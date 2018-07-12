package cms.sre.dna_common_data_model.system;

import cms.sre.dna_common_data_model.hashicorpFile.PackerScript;
import cms.sre.dna_common_data_model.hashicorpFile.TerraformScript;

import java.util.List;
import java.util.Objects;

public class Toaster {
    private PackerScript packerScript;
    private TerraformScript terraformScript;
    private List<PersistentVolume> persistentVolumes;

    public PackerScript getPackerScript() {
        return packerScript;
    }

    public Toaster setPackerScript(PackerScript packerScript) {
        this.packerScript = packerScript;
        return this;
    }

    public TerraformScript getTerraformScript() {
        return terraformScript;
    }

    public Toaster setTerraformScript(TerraformScript terraformScript) {
        this.terraformScript = terraformScript;
        return this;
    }

    public List<PersistentVolume> getPersistentVolumes() {
        return persistentVolumes;
    }

    public Toaster setPersistentVolumes(List<PersistentVolume> persistentVolumes) {
        this.persistentVolumes = persistentVolumes;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toaster)) return false;
        Toaster toaster = (Toaster) o;
        return Objects.equals(packerScript, toaster.packerScript) &&
                Objects.equals(terraformScript, toaster.terraformScript) &&
                Objects.equals(persistentVolumes, toaster.persistentVolumes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(packerScript, terraformScript, persistentVolumes);
    }
}
