function wordPlay(number) {
    if (number > 50)
        return "Range is High";
    else if (number < 1)
        return "Not Valid";
    else {
        result = " ";
        for (var i = 1; i <= number; i++) {
            if (i % 15 == 0)
                result += "Jump ";
            else if (i % 5 == 0)
                result += "Clap ";
            else if (i % 3 == 0)
                result += "Tap ";
            else {
                result += i + " ";
            }
        }
        return result.slice(0, -1);
    }
}

console.log(wordPlay(-1));
console.log(wordPlay(16));