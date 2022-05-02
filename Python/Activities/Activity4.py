#Names of user
userA = input("Name of userA: ")
userB = input("Name of userB: ")

while True:
 # Choice of users
    userA_ans = input(userA + " do you want to choose rock,paper or scissors?").lower()
    userB_ans = input(userB + " do you want to choose rock, paper or scissors").lower()

    if userA_ans==userB_ans:
        print("it is a tie!")
    elif userA_ans == "paper":
        if userB_ans == "rock":
            print("paper wins!")
        else:
            print("scissors wins!")
    elif userA_ans == "rock":
        if userB_ans == "scissors":
            print("rock wins!")
        else:
            print("paper wins!")
    elif userA_ans == "scissors":
        if userB_ans == "paper":
            print("scissors wins!")
        else:
            print("rock wins!")
    else:
        print("Invalid input! you have not entered rock,paper,scissors. Try again.")

    #If they want to play again?
    repeat = input("do you want to play another round?").lower()
    if(repeat=="yes"):
        pass
    elif(repeat=="no"):
        raise SystemExit
    else:
        print("You enetred an invalid option")
        raise SystemExit



