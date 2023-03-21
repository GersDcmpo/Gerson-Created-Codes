pet = []

class Animal:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f"Animal [Name = {self.name}   Age = {self.age}]"

def create():
    name = input("Enter Name: ")
    age = int(input("Enter Age: "))
    print()
    return Animal(name, age)

def show(pet):
    print("Display Pet")
    for ani in pet:
        print(ani)
    print()

running = True

print("1 - Input Value  2 - Show Value  3 - Exit")
print()
while running:
    option = int(input("Input your option: "))
    if option == 1:
        pet.append(create())
    elif option == 2:
        show(pet)
    else:
        running = False