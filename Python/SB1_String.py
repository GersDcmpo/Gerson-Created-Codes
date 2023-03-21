noun1=input("Enter first Noun: ")
noun2=input("Enter second Noun: ")
noun3=input("Enter third Noun: ")
adj1=input("Enter first Adjective: ")
adj2=input("Enter second Adjective: ")
adj3=input("Enter third Adjective: ")

noun1x=noun1.upper()
noun2x=noun2.upper()
noun3x=noun3.upper()
adj1x=adj1.upper()
adj2x=adj2.upper()
adj3x=adj3.upper()

print("---------------Original---------------")
lyric='''
Lift your head, baby, don't be scared
Of the things that could go wrong along the way
You'll get by with a smile
You can't win at everything but you can try

Baby, you don't have to worry
'Cause there ain't no need to hurry
No one ever said that there's an easy way
When they're closing all their doors
And they don't want you anymore
It sounds funny but I'll say it anyway

Girl, I'll stay through the bad times
Even if I have to fetch you everyday
We'll get by with a smile
You can never be too happy in this life
'''
print(lyric)
print("---------------Result---------------")
print(lyric.replace("Baby", noun1x).replace("I'll", noun2x).replace("Girl", noun3x)
      .replace("head", adj1x).replace("easy", adj2x).replace("funny", adj3x))