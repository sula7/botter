public class Owner {
    public String name;
    public String contacts;

    Owner(String name, String contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public void showOwnerInfo() {
        System.out.printf("Owner: %s%nContacts: %s%n", this.name, this.contacts);
    }
}
