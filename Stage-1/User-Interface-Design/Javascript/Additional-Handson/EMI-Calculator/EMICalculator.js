function calculateEMI() {
    const resultDiv = document.getElementById("result");
    const P = document.getElementById("principalAmount").value;
    console.log(P);
    const R = (document.getElementById("interestRate").value) / 1200;
    const N = document.getElementById("tenure").value;

    const EMI = P * R * ((1 + R) ** N / ((1 + R) ** N - 1));
    resultDiv.innerHTML = "EMI is Rs. " + EMI.toFixed(2).toString();
    return false;
}