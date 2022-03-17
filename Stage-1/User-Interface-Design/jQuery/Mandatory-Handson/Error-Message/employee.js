$("#btn-id").click(function() {
    $.ajax({
        url: 'employee.json',
        error: function(jqXHR, textStatus, errorThrown) {
            $("#err-id").text("Error Message: Not found");
        }
    });
});