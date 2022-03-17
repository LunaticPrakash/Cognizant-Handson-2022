function validateEmail(email) {
    var emailRegex = /^[a-zA-Z0-9_.-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]{2,3}$/;
    if (emailRegex.test(email))
        return "Valid email address!";
    return "Invalid email address!";
}

console.log(validateEmail('info123@example.com'));