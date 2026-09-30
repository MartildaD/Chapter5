how_many = int(input("How many numbers will you enter: "))

number = int(input("Enter a number 1: "))

maximum = number
minimum = number

for count in range(2, how_many + 1):
    number = int(input("Enter number " + str(count) + ": "))

    if number < minimum:
        minimum = number
    if number > maximum:
        maximum = number

print("Minimum:", minimum)
print("Maximum:", maximum)
print("Sum of two extremes:", minimum + maximum)
