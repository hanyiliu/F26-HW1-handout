class Configuration:
    instance = None

    def __init__(self):
        appName = "ECS160-HW1"
        logLevel = "INFO"
        maxConnections = 32
        debugMode = True

    @classmethod
    def get_instance(cls):
        if cls.instance is None:
            cls.instance = Configuration()
        return cls.instance
    