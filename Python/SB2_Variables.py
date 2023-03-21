##GDO_BCS21
name = input("Enter Name: ")
xgrade = float(input("Enter Math Grade: "))
ygrade = float(input("Enter Science Grade: "))
zgrade = float(input("Enter English Grade: "))
status = input("Input your Status: ")

grade = "average"
faverage = (xgrade + ygrade + zgrade) / 3
print("Average: " + str(faverage))
##GDO_BCS21
if status == "Passed":
    status = "You passed"
else:
    status = "You Failed"

print(status)
##GDO_BCS21