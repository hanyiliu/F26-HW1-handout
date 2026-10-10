from functools import wraps

class User():
    def get_name(self):
        pass

    def get_email(self):
        pass

    def set_email(self, email):
        pass

def log(func):
    @wraps(func)
    def logging_wrapper(*args, **kwargs):
        if func.__name__ == "set_email":
            print(f"[LOG] AdminUser.{func.__name__}(\"{args[1]}\")")
        else:
            print(f"[LOG] AdminUser.{func.__name__}()")
        return func(*args, **kwargs)
    return logging_wrapper

class AdminUser(User):
    def __init__(self, name, email):
        self._name = name
        self._email = email
   
    @log
    def get_name(self):
        return self._name

    @log
    def get_email(self):
        return self._email

    @log
    def set_email(self, email):
        self._email = email
