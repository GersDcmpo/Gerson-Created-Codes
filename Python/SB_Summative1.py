from typing import get_args


print("============================================================")
print("                     Salary Loan System                     ")
print("============================================================")
print()

'''
test
'''

"""
test
"""
name = input("Enter Name: ")
fName = name.title()
salary = float(input("Enter Basic Monthly Salary: "))
loan = salary * 2.5
print("Loan amount is: " + str(loan))


payMonth = float(input("Number of Months to pay: "))

if payMonth == 0:
    print("Number of Months is not applicable!")

elif payMonth <= 5 and payMonth > 0:
    intRate = float(0.1)
    interest = loan * intRate
    print("Interest: " + str(interest))
    service = loan * 0.02
    print("Service Charge: " + str(service))
    takeHome = loan - service - interest
    print("Take Home Loan: " + str(takeHome))
    moAmort = takeHome / payMonth
    print("Monthly Amortization: " + str(moAmort))
    print()
    print("Good day " + fName + "! Your TAKE HOME LOAN is PHP " + str(takeHome) + " and you will pay PHP " + str(moAmort) + " for " + str(payMonth) + " month/s.")

elif payMonth <= 10 and payMonth > 5:
    intRate = float(0.2)
    interest = loan * intRate
    print("Interest: " + str(interest))
    service = loan * 0.02
    print("Service Charge: " + str(service))
    takeHome = loan - service - interest
    print("Take Home Loan: " + str(takeHome))
    moAmort = takeHome / payMonth
    print("Monthly Amortization: " + str(moAmort))
    print()
    print("Good day " + fName + "! Your TAKE HOME LOAN is PHP " + str(takeHome) + " and you will pay PHP " + str(moAmort) + " for " + str(payMonth) + " month/s.")

elif payMonth <= 15 and payMonth > 10:
    intRate = float(0.3)
    interest = loan * intRate
    print("Interest: " + str(interest))
    service = loan * 0.02
    print("Service Charge: " + str(service))
    takeHome = loan - service - interest
    print("Take Home Loan: " + str(takeHome))
    moAmort = takeHome / payMonth
    print("Monthly Amortization: " + str(moAmort))
    print()
    print("Good day " + fName + "! Your TAKE HOME LOAN is PHP " + str(takeHome) + " and you will pay PHP " + str(moAmort) + " for " + str(payMonth) + " month/s.")

elif payMonth <= 20 and payMonth > 15:
    intRate = float(0.4)
    interest = loan * intRate
    print("Interest: " + str(interest))
    service = loan * 0.02
    print("Service Charge: " + str(service))
    takeHome = loan - service - interest
    print("Take Home Loan: " + str(takeHome))
    moAmort = takeHome / payMonth
    print("Monthly Amortization: " + str(moAmort))
    print()
    print("Good day " + fName + "! Your TAKE HOME LOAN is PHP " + str(takeHome) + " and you will pay PHP " + str(moAmort) + " for " + str(payMonth) + " month/s.")

elif payMonth <= 25 and payMonth > 20:
    intRate = float(0.5)
    interest = loan * intRate
    print("Interest: " + str(interest))
    service = loan * 0.02
    print("Service Charge: " + str(service))
    takeHome = loan - service - interest
    print("Take Home Loan: " + str(takeHome))
    moAmort = takeHome / payMonth
    print("Monthly Amortization: " + str(moAmort))
    print()
    print("Good day " + fName + "! Your TAKE HOME LOAN is PHP " + str(takeHome) + " and you will pay PHP " + str(moAmort) + " for " + str(payMonth) + " month/s.")

elif payMonth >= 26:
    print("Number of Months is not applicable!")

print()
print("============================================================")
print("                         Thank You!                         ")
print("============================================================")