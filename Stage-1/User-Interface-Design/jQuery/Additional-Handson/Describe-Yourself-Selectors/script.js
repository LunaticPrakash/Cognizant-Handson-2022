$("button").click(function() {
    const text = $("textarea").val();
    console.log("TEXT = ", text);
    if (text.length <= 50)
        $("#msg").text("The length of the entered text is:" + text.length);
    else
        $("#msg").text("Sorry!! Text length exceeds the limit");

});