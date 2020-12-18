function logout(){
    // apaga cook
    localStorage.removeItem("userLogged")
    // retorna para pagina login
    window.location  = "index.html";
}

function dash(){
    // retorna para pagina dash
    window.location  = "dash.html";
}

function validaY(){
    let parceiro = '<br>Parceiro<b> Parceiro 1 - Fulano de Tal</b> Volume: <b> 1.000.000</b></br>'
    document.getElementById("parceiro").innerHTML = parceiro;

    let sucesso = " ";
    sucesso = sucesso + '<p><b>Sucesso ...........: 1.209</b></p>'
    document.getElementById("sucessos").innerHTML = sucesso;

    let falhas = " ";
    falhas = falhas + '<p><b>Falhas ...........: 1.009</b></p>'
    document.getElementById("falhas").innerHTML = falhas;

    let fraude = " ";
    fraude = fraude + '<p><b>Fraude ...........: 09</b></p>'
    document.getElementById("fraudes").innerHTML = fraude;
;

}