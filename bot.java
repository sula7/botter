import models.botParams;
import postgres.*;

public class bot extends postgres {
    String name;
    String sourceAPI;
    String runningProvider;
    int maxConcurrency;
    public String ownerName;
    public String ownerContacts;

    bot(botParams params) {
        super();
        this.name = params.name;
        this.sourceAPI = params.sourceAPI;
        this.runningProvider = params.runningProvider;
        this.maxConcurrency = params.maxConcurrency;
    }

    void store(botParams params) {
        if (params.maxConcurrency <= 0) {
            params.maxConcurrency = 1;
        }

        super.insertBot(params);
    }
}
