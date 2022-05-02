listnumber = list(input("List of numbers").split(","))
l = len(listnumber)

firstElement = (listnumber[0])
lastElement = listnumber[-1]

if (firstElement == lastElement):
    print("True")
else:
    print("False")

#if listnumber[0] == listnumber[l-1]:
    #print("first and last numbers are equal")
#else:
    #print("Invalid")