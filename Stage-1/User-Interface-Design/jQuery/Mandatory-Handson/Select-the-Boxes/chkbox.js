//WRITE YOUR jQUERY CODE HERE
var count=0;

$('#red').change(function(){
    var isChecked=$(this).is(":checked");
  if (isChecked) {
      count++;
      if(count==1){
          $('#result').html(count+" box is checked");
      }else{
          $('#result').html(count+" boxes are checked");
      }
  } else {
      count--;
      if(count==1){
          $('#result').html(count+" box is checked");
      }else{
          $('#result').html(count+" boxes are checked");
      }
  }
})

$('#green').change(function(){
    var isChecked=$(this).is(":checked");
  if (isChecked) {
      count++;
     if(count==1){
          $('#result').html(count+" box is checked");
      }else{
          $('#result').html(count+" boxes are checked");
      }
  } else {
      count--;
      if(count==1){
          $('#result').html(count+" box is checked");
      }else{
          $('#result').html(count+" boxes are checked");
      }
  }
})

$('#blue').change(function(){
    var isChecked=$(this).is(":checked");
  if (isChecked) {
      count++;
     if(count==1){
          $('#result').html(count+" box is checked");
      }else{
          $('#result').html(count+" boxes are checked");
      }
  } else {
      count--;
      if(count==1){
          $('#result').html(count+" box is checked");
      }else{
          $('#result').html(count+" boxes are checked");
      }
  }
})

$('#black').change(function(){
    var isChecked=$(this).is(":checked");
  if (isChecked) {
      count++;
      if(count==1){
          $('#result').html(count+" box is checked");
      }else{
          $('#result').html(count+" boxes are checked");
      }
  } else {
      count--;
      if(count==1){
          $('#result').html(count+" box is checked");
      }else{
          $('#result').html(count+" boxes are checked");
      }
  }
})