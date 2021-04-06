class User:
    def __init__(self, nameInput):
        self.name = nameInput
        self.accountBalance = 0
    

    def deposit(self, amount):
        self.accountBalance += amount




user1 = User("Shahnoor")
user2 = User("Tracie")

print(user1)

user1.deposittttt(5)
user2.deposit(20)


