package edu.ucdavis.ecs160.hw1;

public class LoggingUserDecorator implements User {
    private final User decoratedUser;

    public LoggingUserDecorator(User user) {
        this.decoratedUser = user;
    }

    @Override
    public String getName() {
        System.out.println("[LOG] AdminUser.getName()");
        return decoratedUser.getName();
    }

    @Override
    public String getEmail() {
        System.out.println("[LOG] AdminUser.getEmail()");
        return decoratedUser.getEmail();
    }

    @Override
    public void setEmail(String email) {
        System.out.println("[LOG] AdminUser.setEmail(\"" + email + "\")");
        decoratedUser.setEmail(email);
    }
}