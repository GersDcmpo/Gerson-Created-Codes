class Car():
    Color = "Black"
    Model = "Corolla"
    Manufacturer = "Toyota"

print("Default Value")
print(Car.Color)
print(Car.Model)
print(Car.Manufacturer)

print()

modifiedCar1 = Car()
modifiedCar1.Color = "Blue"
modifiedCar1.Model = "Mirage"
modifiedCar1.Manufacturer = "Mitsubishi"

print("Modified Value")
print(modifiedCar1.Color)
print(modifiedCar1.Model)
print(modifiedCar1.Manufacturer)

print()

modifiedCar2 = Car()
modifiedCar2.Color = "Red"
modifiedCar2.Model = "Civic"
modifiedCar2.Manufacturer = "Honda"

print("Modified Value")
print(modifiedCar2.Color)
print(modifiedCar2.Model)
print(modifiedCar2.Manufacturer)

print()

modifiedCar3 = Car()
modifiedCar3.Color = "White"
modifiedCar3.Model = "Forte"
modifiedCar3.Manufacturer = "Kia"

print("Modified Value")
print(modifiedCar3.Color)
print(modifiedCar3.Model)
print(modifiedCar3.Manufacturer)