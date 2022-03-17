function modifyString(str) {
    str = str.replace(/\s/g, "");
    str = str.toLowerCase();
    console.log(str);
    return str;
}

function uniqueCharacters(str) {
    str = modifyString(str);
    var unique = '';
    for (var i = 0; i < str.length; i++) {
        if (unique.includes(str[i]) === false)
            unique += str[i];
    }
    return unique;
}