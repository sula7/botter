public class Main {
    public static void main(String[] args) {
        String botName;
        try {
            botName = args[0];
        } catch (Exception e) {
            botName = "Undefined";
        }

        Bot sulafpvbot = new Bot(botName, "cloud Bot API", "heroku", 1000, "sula7", "github.com/sula7");
        sulafpvbot.start();
    }
}
