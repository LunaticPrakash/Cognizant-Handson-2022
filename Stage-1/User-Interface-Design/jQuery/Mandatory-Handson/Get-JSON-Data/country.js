$("#btn-id").click(function() {
    $.getJSON("https://reqres.in/api/users?page=2", function(data) {
        var list = $('<ul><ul/>').appendTo('#data-id');
        console.log(list);
        data.data.forEach(function(element) {
            list.append('<li>' + element.id + " -- " + element.email + '</li>');
        });
    });
});