document.getElementById("prodotti").addEventListener('click', function () {
    window.location.href = 'prodotti.html'
});

//document.getElementById("carrello").addEventListener('click', function () {
//    window.location.href = 'carrello.html'
//});

//document.getElementById("home").addEventListener('click', function () {
//   window.location.href = 'home.html'
//});

//const myCarouselElement = document.querySelector('#myCarousel')

//const carousel = new bootstrap.Carousel(myCarouselElement, {
//    interval: 2000,
//    touch: false
//});

let totale = 0;

function aggiungi(name) {
    var toastElList = [].slice.call(document.querySelectorAll('.toast'))
    var toastList = toastElList.map(function(toastEl) {
      return new bootstrap.Toast(toastEl)
    })
    toastList.forEach(toast => toast.show()) 
    const elemtToAdd = document.getElementById('table');
    //const prodotto = document.getElementById()
    const righe = document.createElement('tr');
    righe.setAttribute('id', name);
    let prezzo = (Number) (document.getElementById("prezzo"+name).innerText);
    righe.innerHTML = `
        <td id='nomeProdotto${name}'>${document.getElementById("nomeProdotto"+name).innerText}</td>
        <td id='prezzo${name}'>${document.getElementById("prezzo"+name).innerText}</td>
        <td><div class="row-md-auto" id="selection">
        <label class="visually-hidden" for="inlineFormSelectPref">Qty</label>
        <select class="form-select" id="inlineFormSelectPref">
            <option selected value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
        </select>
        </div>
         </td>
         <td><button onclick = rimuovi(${name}) class="btn btn-outline-secondary">Rimuovi</button></td>
                        </tr>
        `;
    elemtToAdd.appendChild(righe);
    let tot = document.getElementById('totale');
    if(totale == 0){
        totale = prezzo;
    }else{
        totale += prezzo;
    }
    let number1 = totale.toFixed(2);
    tot.innerHTML = number1+" €";
    //alert("Prodotto aggiunto al carrello");
};



function rimuovi(name){
    let elem = document.getElementById(name);
    let prezzo1 = (Number) (document.getElementById("prezzo"+name).innerText);
    elem.parentNode.removeChild(elem);
    let tot1 = document.getElementById('totale');
    totale -= prezzo1;
    let number = totale.toFixed(2);
    tot1.innerHTML = number+" €";
}

let quantita = document.getElementById('selection');
let selectElement = document.querySelector('#inlineFormSelectPref');
//let output = selectElement.options[selectElement.selectedIndex].value;
//quantita.addEventListener('click', aggiorna(output))


function aggiorna(name){
    debugger;
    let prezzo2 = (Number) (document.getElementById("prezzo"+name).innerText);
    let tot2 = document.getElementById('totale');
    totale += prezzo2 * (nome-1);
    tot2.innerHTML = totale+" €";
}








