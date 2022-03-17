$('#each_ex').click(function() {
    $('#msg_ex').append('<br>');
    $('ul[id="list"] li').clone().appendTo('#msg_ex');
    $('#msg_ex li ').css('list-style-type', 'none');
    $('#msg_ex li a').css({ 'text-decoration': 'none', 'color': 'black' });
    $('ul[id="list"] li a').css('background-color', 'red');
});