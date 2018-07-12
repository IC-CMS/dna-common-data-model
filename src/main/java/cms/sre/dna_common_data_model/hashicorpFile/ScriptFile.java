package cms.sre.dna_common_data_model.hashicorpFile;

import java.util.Arrays;
import java.util.Objects;

public class ScriptFile {
    private String filename;
    private byte[] binaryFile;
    private String contents;

    public String getFilename() {
        return filename;
    }

    public ScriptFile setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public byte[] getBinaryFile() {
        return binaryFile;
    }

    public ScriptFile setBinaryFile(byte[] binaryFile) {
        this.binaryFile = binaryFile;
        return this;
    }

    public String getContents() {
        return contents;
    }

    public ScriptFile setContents(String contents) {
        this.contents = contents;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScriptFile)) return false;
        ScriptFile that = (ScriptFile) o;
        return Objects.equals(filename, that.filename) &&
                Arrays.equals(binaryFile, that.binaryFile) &&
                Objects.equals(contents, that.contents);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(filename, contents);
        result = 31 * result + Arrays.hashCode(binaryFile);
        return result;
    }
}
