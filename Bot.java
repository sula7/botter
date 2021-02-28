public class Bot extends Owner {
    String name;
    String sourceAPI;
    String runningProvider;
    int maxConcurrency;

    Bot() {
        super("Undefined", "Undefined");
    }

    Bot(String name, String sourceAPI, String runningProvider, int maxConcurrency, String owner, String ownerContacts) {
        super(owner, ownerContacts);
        this.name = name;
        this.sourceAPI = sourceAPI;
        this.runningProvider = runningProvider;
        this.maxConcurrency = maxConcurrency;
    }

    void start() {
        System.out.printf(
                "starting bot %s with settings: \nsource api: %s\nrunning provider: %s\nmax concurrency level: %d\n",
                this.name, sourceAPI, runningProvider, maxConcurrency);
        super.showOwnerInfo();
    }
}
