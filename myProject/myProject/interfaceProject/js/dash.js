function logout(){
    // apaga cook
    localStorage.removeItem("userLogged")
    // retorna para pagina login
    window.location  = "index.html";
}

function detail(){
    window.location  ="detail.html";
}

function validaX(){
    let opcoes  = " ";
    for(let i=1 ; i < 10 ; i++) {
        opcoes = opcoes + `<option value = ${i}> Parceiro ${i} </option> `
    }
    document.getElementById("selParceiro").innerHTML = opcoes;

    // 
    let tabela = '<table> <tr> <th>Parceiro</th> <th>Volume</th>'
        for(let i = 1; i < 10 ; i ++) {
            tabela = tabela + `<tr>  <td>${i}</td> <td>${i * 10000}</td>` ; 
        }
        table = tabela + '</table>'
        document.getElementById("retornoTop10").innerHTML = table;

}

