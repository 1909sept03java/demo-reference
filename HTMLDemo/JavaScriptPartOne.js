window.onload = function() {
    // select element with id "fizzBuzzButton"
    // apply an event listener to it to make it clickable
    // define anonymous function to be invoked when it is clicked
    // this anonymous function is a CALLBACK FUNCTION - excecutes when another function 
        // has finished executing 
    document.getElementById("fizzBuzzButton").addEventListener("click", function() {
        let num1 = document.getElementById("num1").value;
        let word1 = document.getElementById("word1").value;
        let num2 = document.getElementById("num2").value;
        let word2 = document.getElementById("word2").value;
        fizzBuzzOrSimilar(num1,word1,num2,word2);
    });
}

// THE ARGUMENT NAMES ARE ARBITRARY AND NOT AT ALL RELATED TO IDENTIFIERS IN THE ABOVE FUNCTION!
function fizzBuzzOrSimilar(num1, word1, num2, word2) {
    // this is template string - introduced in ES6
    console.log(`num1 is ${num1}, replaced by ${word1}, and num2 is ${num2}, replaced by ${word2}`);
    // console.log to print from 1-100 with all multiples of num1 replaced by word1, same for word2
    // all multiples of both replaced with word1word2
}