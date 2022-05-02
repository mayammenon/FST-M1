#example_list = list(input("What are the elements in the list?").split(","))
#l = len(example_list)
#sum=0
#for i in range(0,l):
#   sum=sum+int(example_list[i])
#print(sum)

numbers = list(input("Enter a sequence of comma separated values: ").split(","))
sum = 0

for number in numbers:
    sum = sum + int(number)

print(sum)