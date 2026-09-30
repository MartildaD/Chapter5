numbers = []

for count in range(6):
    number = int(input("Enter number " + str(count) + " (1-30): "))
    while number < 1 or number > 30:
        number = int(input("Must be 1-30. Enter number " + str(count) + ": "))
    numbers.append(number)

for number in numbers:
    bar = ""
    for star in range(number):
        bar = bar + "*"
    print(bar)
