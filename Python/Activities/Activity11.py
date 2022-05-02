example_dict = {"apple" : 50, "banana" : 40, "cherry" : 45}
Check_frutis = input("What are you looking for").lower()

if Check_frutis in example_dict:
    print("Yes, it is available")
else:
    print("No, it is not available")
