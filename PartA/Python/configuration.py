class Configuration:
    __instance = None
    __init = False

    def __init__(self):
        if self.__init:
            return
        
        self.appName = "ECS160-HW1"
        self.logLevel = "INFO"
        self.maxConnections = 32
        self.debugMode = True
        self.__init = True

    def __new__(cls):
        if cls.__instance is None:
            cls.__instance = super().__new__(cls)
        return cls.__instance
    
    @classmethod
    def get_instance(cls):
        if cls.__instance is None:
            cls.__instance = Configuration()
        return cls.__instance
    