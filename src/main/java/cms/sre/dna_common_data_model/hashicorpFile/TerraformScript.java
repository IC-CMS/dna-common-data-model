package cms.sre.dna_common_data_model.hashicorpFile;

import java.util.Objects;

public class TerraformScript {
    private ScriptFile mainScript;
    private ScriptFile variableScript;
    private ScriptFile providerScript;
    private ScriptFile dataSourcesScript;

    public ScriptFile getMainScript() {
        return mainScript;
    }

    public TerraformScript setMainScript(ScriptFile mainScript) {
        this.mainScript = mainScript;
        return this;
    }

    public ScriptFile getVariableScript() {
        return variableScript;
    }

    public TerraformScript setVariableScript(ScriptFile variableScript) {
        this.variableScript = variableScript;
        return this;
    }

    public ScriptFile getProviderScript() {
        return providerScript;
    }

    public TerraformScript setProviderScript(ScriptFile providerScript) {
        this.providerScript = providerScript;
        return this;
    }

    public ScriptFile getDataSourcesScript() {
        return dataSourcesScript;
    }

    public TerraformScript setDataSourcesScript(ScriptFile dataSourcesScript) {
        this.dataSourcesScript = dataSourcesScript;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TerraformScript)) return false;
        TerraformScript that = (TerraformScript) o;
        return Objects.equals(mainScript, that.mainScript) &&
                Objects.equals(variableScript, that.variableScript) &&
                Objects.equals(providerScript, that.providerScript) &&
                Objects.equals(dataSourcesScript, that.dataSourcesScript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainScript, variableScript, providerScript, dataSourcesScript);
    }
}
