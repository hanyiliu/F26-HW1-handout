package edu.ucdavis.ecs160.hw1;

public class Configuration {

    private String appName = "ECS160-HW1";
    private String logLevel = "INFO";
    private int maxConnections = 32;
    private boolean debugMode = true;

    private static Configuration instance;

    public static Configuration getInstance() {
        return instance;
    }

}
