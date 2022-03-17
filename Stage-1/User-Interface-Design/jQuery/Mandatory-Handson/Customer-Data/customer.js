$("input[type='button']").click(function() {
    const name = $("#name").val();
    console.log(name);
    $('table tr:last').after('<tr> <td> <input type = "checkbox" name = "record" > </td> <td>' + name + '</td> </tr>');

});

$("button").click(function() {
    $("table input:checkbox").each(function() {
        if (this.checked) {
            $(this).closest('tr').remove();
        }
    });
});