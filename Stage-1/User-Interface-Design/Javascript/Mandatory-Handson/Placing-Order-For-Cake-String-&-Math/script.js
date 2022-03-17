function OrderCake(str) {
    const weigthInGram = str.slice(0, 4);
    const weigthInKiloGram = weigthInGram / 1000;
    const flavour = str.slice(4, -3);
    const orderId = str.slice(-3);
    const totalPrice = 450 * weigthInKiloGram;
    result = "Your order for " + Math.round(weigthInKiloGram) + " kg " + flavour + " cake has been taken. You are requested to pay Rs. " + Math.round(totalPrice) + " on the order no " + orderId;
    return result;
}