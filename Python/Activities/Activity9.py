List1 = list(input("Items in List1").split(","))
List2 = list(input("Items in List2").split(","))

#List1 -odd numbers & List2 - even numbers
#l1 = len(List1)
#l2 = len(List2)
newlist = []
for n in List1:
    if int(n)%2 == 1:
        newlist.append(n)

for n in List2:
    if int(n)%2 == 0:
        newlist.append(n)

print("Result list is", newlist)

