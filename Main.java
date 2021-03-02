import models.botParams;

class Main {
    public static void main(String[] args) {
        input input = new input();
        botParams params = input.get();

        bot bot = new bot(params);
        bot.store(params);
    }
}
