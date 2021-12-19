package Behavioral.Mediator;

public class Program {
    public static void main(String[] args) {
        Mediator chat = new Mediator();

        User admin = new Admin(chat, "Admin");
        User user1 = new UserImpl(chat, "User 1");
        User user2 = new UserImpl(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I'm user One");
        admin.sendMessage("Hi. I'm admin");
    }
}
