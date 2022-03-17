function ebBill(unitsConsumed) {
    if (unitsConsumed <= 100)
        return 0;
    else if (unitsConsumed > 100 && unitsConsumed <= 300)
        return 1.5 * (unitsConsumed - 100);
    else if (unitsConsumed > 300 && unitsConsumed <= 600)
        return 3.5 * (unitsConsumed - 100);

    else if (unitsConsumed > 600 && unitsConsumed <= 1000)
        return 5.5 * (unitsConsumed - 100);

    else if (unitsConsumed > 1000)
        return 7.5 * (unitsConsumed - 100);
}