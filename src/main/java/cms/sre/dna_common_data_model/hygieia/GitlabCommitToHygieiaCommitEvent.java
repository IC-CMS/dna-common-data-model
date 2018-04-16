package cms.sre.dna_common_data_model.hygieia;

import cms.sre.dna_common_data_model.Block;
import cms.sre.dna_common_data_model.Event;
import com.capitalone.dashboard.model.Commit;

import java.util.List;

public class GitlabCommitToHygieiaCommitEvent extends Event {

    private Commit commit;

    public GitlabCommitToHygieiaCommitEvent(){
        super();
    }

    public GitlabCommitToHygieiaCommitEvent(String classification, String emitter){
        super(classification, emitter);
    }

    public GitlabCommitToHygieiaCommitEvent(String classification, String emitter, List<Block<Event>> blockChain){
        super(classification, emitter, blockChain);
    }

    public GitlabCommitToHygieiaCommitEvent(GitlabCommitToHygieiaCommitEvent other){
        super(other);
    }

    public GitlabCommitToHygieiaCommitEvent(String emitter, GitlabCommitToHygieiaCommitEvent other){
        super(emitter, other);
    }
}
