import models.botParams;
import java.util.Scanner;

public class input {
    public botParams get() {
        botParams params = new botParams();

        Scanner input = new Scanner(System.in);
        System.out.print("enter a bot name: ");
        params.name = input.nextLine();

        System.out.print("\nenter a bot's source API name: ");
        params.sourceAPI = input.nextLine();

        System.out.print("\nenter a bot's provider name: ");
        params.runningProvider = input.nextLine();

        System.out.print("\nenter a bot's concurrency level number: ");
        String concurrency = input.nextLine();
        try {
            params.maxConcurrency = Integer.parseInt(concurrency);
        } catch (Exception e) {
            System.out.println("enter a number!");
            input.close();
            System.exit(1);
        }

        System.out.print("\nenter a bot's owner name: ");
        params.ownerName = input.nextLine();

        System.out.print("\nenter a bot's owner contacts: ");
        params.ownerContacts = input.nextLine();

        input.close();

        return params;
    }
}
