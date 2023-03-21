mail = []


class Email:
    company = "google"

    def __init__(self, fname, lname):
        self.fname = fname.lower().replace(" ", "")
        self.lname = lname.lower().replace(" ", "")

    def __str__(self):
        return f"{self.fname}{self.lname}@{self.company}.com"


def create():
    fname = input("Enter First Name: ")
    lname = input("Enter Last Name: ")
    return Email(fname, lname)


def show(mail):
    print("Generated Email")
    for i in range(len(mail)):
        print(f"{i+1}. {mail[i]}")
    print()


running = True

print("               Welcome to the Email Generated App!              ")
print("================================================================")
print()
while running:
    option = input("Add name?: ")
    if option.lower() == "yes":
        mail.append(create())
    elif option.lower() == "no":
        show(mail)
        running = False
    else:
        print("Invalid Input")
        running = False