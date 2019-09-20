window.onload = function() {
    document.getElementById("weather").onclick = function() {
        let url = 'http://api.openweathermap.org/data/2.5/weather?q=Tampa,us&units=imperial&APPID=859d47520ac736ebe8bbce1fef74269c';
        sendAjaxGet(url, showWeather);
    }
}

// perform Ajax call 
// url represents the resource being requested
// func is the callback function to be invoked when request is complete
function sendAjaxGet(url, func) {
    // step 1: obtain xhr object (IE 5,6 do not have this)
    let xhr = new XMLHttpRequest(); // || new ActiveXObject("Microsoft.HTTPRequest");
    // step 2: define onreadystatechange
    xhr.onreadystatechange = function() {
        // readyState of 4 means response is ready
        // status code of 200 means ok
        if (this.readyState === 4 && this.status === 200) {
            func(this);
        }
    }
    // step 3: prepare request with open()
    xhr.open("GET", url, true);
    // step 4: send the request
    xhr.send();
    // note: if we were sending a POST or any other req. which used the body,
    // we should include that content as a param to send()
}

function showWeather(xhr) {
    let weatherObj = JSON.parse(xhr.responseText);
    console.log(weatherObj);
    document.getElementById("temperature").innerText = `Current temperature: ${weatherObj.main.temp}`;
    document.getElementById("humidity").innerText = `Current humidity: ${weatherObj.main.humidity}`;
    document.getElementById("description").innerText = `Current description: ${weatherObj.weather[0].description}`;
}