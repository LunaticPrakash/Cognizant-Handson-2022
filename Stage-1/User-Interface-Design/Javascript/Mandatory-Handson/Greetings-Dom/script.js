function display() {
    const displayDiv = document.getElementById("greet");
    const name = document.getElementById("sname").value
    const course = document.getElementById("course").value;

    if (name)
        displayDiv.innerHTML = "Hi, " + name + ". You have successfully registered for the " + course + " course.";
    else
        displayDiv.innerHTML = "Name cannot be empty";
}