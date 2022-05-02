user1 = input('Name of user1')
user2 = input('Name of user2')

user1_ans = input('User1 + ", Do you want to choose rock,paper or scissors?"').lower()
user2_ans = input('User2 + ", Do you want to choose rock,paper or scissors?"').lower()

if user1_ans == user2_ans:
    print('It is tie')
elif user1_ans == 'rock':
    if user2_ans == 'scissors':
        print('rock wins')
    else:
        print('paper wins')
elif user1_ans == 'scissors':
    if user2_ans == 'paper':
        print("scissors win!")
    else:
        print("rock wins!")
elif user1_ans == 'paper':
    if user2_ans == 'rock':
        print("Paper wins!")
    else:
        print("scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
