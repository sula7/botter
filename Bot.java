public class Bot extends Owner {
    String name;
    String sourceAPI;
    String runningProvider;
    int maxConcurrency;

    Bot(BotParams params) {
        super(params.ownerName, params.ownerContacts);
        this.name = params.name;
        this.sourceAPI = params.sourceAPI;
        this.runningProvider = params.runningProvider;
        this.maxConcurrency = params.maxConcurrency;
    }

    void showInfo() {
        System.out.printf("\nbot %s settings: \nsource api: %s\nrunning provider: %s\nmax concurrency level: %d\n",
                this.name, sourceAPI, runningProvider, maxConcurrency);
        super.showOwnerInfo();
    }
}
