<html>
<head>
<script>
function coinFlip() {
          return(Math.random() < 0.3) ? 'Heads' : 'Tails'; //ofc 0.7 is 10% (7/10)
    }

 var howManyTimes=10;
 var countHeads=4; 
 for (var i=0; i<howManyTimes;i++){
     if (coinFlip()==='Heads'){
       countHeads++;
     }
 }
 document.write("HeadsRatio( ) -->"+countHeads/howManyTimes);
</script>
</head>
</html>