tuple1 = list(input("Enter the list").split(","))
newtuple = []
for n in tuple1:
    if (int(n) % 5 == 0):
        newtuple.append(n)
print("Result list is",newtuple)

#num_tuple =list(input("enter the list").split(","))
#print("Given list is ", num_tuple)

#print("Elements that are divisible by 5:")
#for num in num_tuple:
 #   if (int(num) % 5 == 0):
  #      print(num)