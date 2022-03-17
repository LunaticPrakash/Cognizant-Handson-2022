function utility() {
    const priAmnt = parseInt(document.getElementById("principalAmount").value);
    const rateYear = parseInt(document.getElementById("interestRate").value);
    const rateMonth = rateYear / 1200;
    const tenMonth = parseInt(document.getElementById("tenure").value);

    const reducingEmi = (priAmnt * rateMonth * (Math.pow((1 + rateMonth), tenMonth) / (Math.pow((1 + rateMonth), tenMonth) - 1)));
    const reducingTotalPayment = tenMonth * reducingEmi;
    const reducingTotalInterest = reducingTotalPayment - priAmnt;

    const fixedTotalInterest = priAmnt * rateYear * tenMonth / 1200;
    const fixedTotalPayment = priAmnt + fixedTotalInterest;
    const fixedEmi = fixedTotalPayment / tenMonth;

    return {
        rEmi: reducingEmi,
        rTotalPayment: reducingTotalPayment,
        rTotalInterest: reducingTotalInterest,
        fEmi: fixedEmi,
        fTotalInterest: fixedTotalInterest,
        fTotalPayment: fixedTotalPayment
    };

}

function EstimateReducingInterestLoan() {
    calculateEMI();
    totalPayment();
    totalInterest();
    EstimateFixedInterestLoan();
}

function EstimateFixedInterestLoan() {
    const fixedTotalInterest = utility().fTotalInterest.toFixed(2).toString();
    document.getElementById("tInterestFixed").innerHTML = fixedTotalInterest;

    const fixedTotalPayment = utility().fTotalPayment.toFixed(2).toString();
    document.getElementById("tPaymentFixed").innerHTML = fixedTotalPayment;

    const fixedEmi = utility().fEmi.toFixed(2).toString();
    document.getElementById("EMIFixed").innerHTML = fixedEmi;


}

function calculateEMI() {
    const reducingEmi = utility().rEmi.toFixed(2).toString();
    document.getElementById("EMI").innerHTML = reducingEmi;
}

function totalPayment() {
    const reducingTotalPayment = utility().rTotalPayment.toFixed(2).toString();
    document.getElementById("tPayment").innerHTML = reducingTotalPayment;
}

function totalInterest() {
    const reducingTotalInterest = utility().rTotalInterest.toFixed(2).toString();
    document.getElementById("tInterest").innerHTML = reducingTotalInterest;
}