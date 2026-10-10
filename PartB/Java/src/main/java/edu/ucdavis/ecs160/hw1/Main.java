package edu.ucdavis.ecs160.hw1;

public class Main {
    public static void main(String[] args) {
        User adminUser = new AdminUser("Alice", "alice@example.com");
        User user = new LoggingUserDecorator(adminUser); // Initialize user here!
        user.setEmail("alice@ucdavis.edu");
        user.getName();
        user.getEmail();

    }
}
