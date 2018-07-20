package cms.sre.dna_common_data_model.hashicorpFile;

import java.util.Objects;

public class PackerScript {
    private ScriptFile scriptFile;

    public ScriptFile getScriptFile() {
        return scriptFile;
    }

    public PackerScript setScriptFile(ScriptFile scriptFile) {
        this.scriptFile = scriptFile;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackerScript)) return false;
        PackerScript that = (PackerScript) o;
        return Objects.equals(scriptFile, that.scriptFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptFile);
    }
}
