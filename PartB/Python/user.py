from functools import wraps

class User():
    def get_name(self):
        pass

    def get_email(self):
        pass

    def set_email(self, email):
        pass


class AdminUser(User):
    def __init__(self, name, email):
        self._name = name
        self._email = email

    def logging_decorator(func):
        @wraps(func)
        def logging_wrapper(*args, **kwargs):
            print(f"AdminUser.{func.__name__}")
            return func(*args, **kwargs)
        return logging_wrapper
   
    @logging_decorator
    def get_name(self):
        return self._name

    @logging_decorator
    def get_email(self):
        return self._email

    @logging_decorator
    def set_email(self, email):
        self._email = email
