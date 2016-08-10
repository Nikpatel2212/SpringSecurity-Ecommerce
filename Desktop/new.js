function fun1(){
    var a1= document.getElementById("text1");
    var a2= document.getElementById("text2");
   for( var w in a2){
       alert(w);
    var seta = setInterval(w,1000);
        document.getElementById("text1").innerHTML=seta;
    }
}

function fun2(){
    var b1= document.getElementById("text1");
    var b2= document.getElementById("text2");
    
}

function fun3(){
    alert("fsf");
    var c1= document.getElementById("text1");
    var c2= document.getElementById("text2");
    for( var w in c1){
        alert(w);
    var seta = setInterval(w,1000);
        document.getElementById("text2").innerHTML=seta;
    }
}