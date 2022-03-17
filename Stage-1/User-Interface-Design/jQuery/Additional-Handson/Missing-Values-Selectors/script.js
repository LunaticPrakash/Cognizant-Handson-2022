$('table td').each(function() {
    var cellText = $(this).html();
    console.log(cellText == "")
    if (cellText == "") {
        $(this).html("Missing Value");
        $(this).css('background-color', 'yellow');
    }
});