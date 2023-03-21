class Customers:
    def __init__(self, name, beverage, food, total):
        self.name = name
        self.beverage = beverage
        self.food = food
        self.total = total

    def __str__(self):
        return f"Name = {self.name} || Beverage = {self.beverage} || Food = {self.food} || Total = {self.total}"
    
    greeting = "Welcome to Coffee Palace!"

c_1 = Customers("Nate", "Espresso", "Pastrami on rye", 220) 
c_2 = Customers("Elaine", "Strawberry Frappucino", "Tuna Wrap", 270)
c_3 = Customers("Samirah", "Iced Caffe Latte", "Cinnamon Roll", 225)
c_4 = Customers("Jerry", "Caramel Macchiato", "Glazed Doughnut", 230)
c_5 = Customers("Paz", "Iced Tea", "Blueberry Pancakes", 315)

print(Customers.greeting)
print("=================================================================")
print()
print(c_1)
print(c_2)
print(c_3)
print(c_4)
print(c_5)