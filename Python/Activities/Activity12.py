#Recursion function
""""def sum(n):
    if n <= 1:
        return n
    else:
        return n + sum(n-1)

num = int(input("Enter a number: "))
print("The sum is: ", sum(num)) """

#sum of numbers from 0 to 10

def calsum(num):
    if num:
        return num + calsum(num-1)
    else:
        return 0
res = calsum(10)
print(res)