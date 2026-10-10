#ifndef CONFIGURATION_H
#define CONFIGURATION_H

#include <string>

class Configuration {
public:
    static Configuration& getInstance() {
        static Configuration instance;
        return instance;
    }

    Configuration(const Configuration&) = delete;
    Configuration& operator=(const Configuration&) = delete;

private:

    Configuration() {
        return;
    }

    std::string appName = "ECS160-HW1";
    std::string logLevel = "INFO";
    int maxConnections = 32;
    bool debugMode = true;
};

#endif
