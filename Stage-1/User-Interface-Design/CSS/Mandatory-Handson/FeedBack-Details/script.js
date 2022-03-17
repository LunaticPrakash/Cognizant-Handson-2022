const feedbackInputTextArea = document.getElementById("feedback");
const viewFeedbackButton = document.getElementById("view");
const result = document.getElementById("result");
var feedbacksArray = [];

function addFeedback() {
    var feedback = feedbackInputTextArea.value;
    feedbacksArray.push(feedback);
    result.innerHTML = "<h2>Feedback Details</h2><p><strong>Sussessfully Added Feedback Details!</strong></p>";
    feedbackInputTextArea.value = "";
}

function displayFeedback() {
    var feedbackText = "";
    for (var i = 0; i < feedbacksArray.length; i++) {
        feedbackText += "Feedback " + (i + 1) + "<br>" + feedbacksArray[i] + "<br>";
    }
    result.innerHTML = "<h2>Feedback Details</h2>" + "<p>" + feedbackText + "</p>";
    feedbacksArray = [];
}