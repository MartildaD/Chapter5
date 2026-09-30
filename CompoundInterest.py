principal = 1000.0

for rate in range(5, 11):
    print("\nInterest Rate:", str(rate) + "%")
    print("Year\tAmount on deposit")

    for year in range(1, 11):
        amount = principal * (1 + rate / 100) ** year
        print(str(year) + "\t" + format(amount, ".2f"))
