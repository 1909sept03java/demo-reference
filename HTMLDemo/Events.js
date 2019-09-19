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
    // select parent element for new list items
    let ul = document.getElementById("peopleList");
    peopleObj.people.forEach(element => {
        // create a list item element to hold the information about the person
        let li = document.createElement("li");
        // set the inner html of li
        li.innerHTML = `<strong>${element.name}</strong>`;
        // append it to the parent
        ul.appendChild(li);
    });
}

/*
    create a large div on the page
    use JS to add an event listener that will display the coordinates of the cursor position
    in a dynamically created box 
    bonus: 
    create box when mouse enters the div
    remove box when mouse leaves the div
*/