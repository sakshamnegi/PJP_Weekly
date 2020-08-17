var validKeyCodes = [48,49,50,51,52,53,54,55,56,57,96,97,98,99,100,101,102,103,104,105, 190, 110,106,107,111,191,109,189,8,13,27];

var input = document.getElementById("expression");
var expression = "";

var numberButtons = document.getElementsByClassName("btn btn-outline-secondary btn-block");

function numberClickFunction(){
    input.value = input.value + this.innerText;
}
for (i = 0; i<numberButtons.length; i++){
    numberButtons[i].addEventListener("click", numberClickFunction);
}

var expButtons = document.getElementsByClassName("btn btn-dark btn-block");
for(i=0; i<expButtons.length; i++){
    expButtons[i].addEventListener("click", numberClickFunction);
}

var resultButton = document.getElementById("equate").addEventListener("click",function(){
    expression = input.value;
    if(/![a-zA-Z]/.test(expression)){
        alert("Invalid expression");
    }
    input.value = eval(expression);
});

document.getElementById("clear").addEventListener("click", function(){
    input.value = "";
});
