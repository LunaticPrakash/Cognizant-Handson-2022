function findPrimeNumber(number) {
    if (number > 0) {
        if (number == 1)
            return "1 is neither a prime number nor a composite number";
        if (number == 2)
            return "2 is a prime number";
        for (var i = 2; i < parseInt(number / 2); i++) {
            if (number % i === 0)
                return number + " is not a prime number";
        }
        return number + " is a prime number";
    }
}