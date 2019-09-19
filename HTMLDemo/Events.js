window.onload = function() {
    let myDivs = document.getElementsByTagName("div");
    for (let i=0; i<myDivs.length; i++) {
        myDivs[i].addEventListener("click", () => {
            console.log(`target: ${event.target.id} and the current element is :${event.currentTarget.id}`);
        }, true);
    }
    document.getElementById("button1").onclick = showPeople;
}

const jsonSource = '{"people":[{"name":"Fred", "age": 87},{"name":"Francis", "age": 27},'+
    '{"name":"Bob", "age": 40}]}';

function showPeople() {
    let peopleObj = JSON.parse(jsonSource);
    console.log(peopleObj);
    /*for (person in people) {
        console.log(person);
    }*/
}