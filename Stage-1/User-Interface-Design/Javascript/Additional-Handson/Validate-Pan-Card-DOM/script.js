function ValidatePAN() {
    const resultDiv = document.getElementById("result");
    const panNumber = document.getElementById("txt").value;
    const panRegex = /^[a-zA-Z]{5}[0-9]{4}[a-zA-Z]$/;

    if (panRegex.test(panNumber))
        resultDiv.innerHTML = panNumber + " is Valid";
    else
        resultDiv.innerHTML = panNumber + " is Invalid";
    return false;

}