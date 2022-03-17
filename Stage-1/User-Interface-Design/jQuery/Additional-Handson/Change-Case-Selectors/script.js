$("#btn").click(function() {
    const val = $("#txt1").val();
    if (val == val.toUpperCase())
        $("#txt1").val(val.toLowerCase());

    else if (val == val.toLowerCase())
        $("#txt1").val(val.toUpperCase());
});