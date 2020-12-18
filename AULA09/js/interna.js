function validaLogin(){
    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location="index.html"
    }

    let user = JSON.parse(userTxt);

   // document.getElementById("dadosUser").innerHTML = user.name + " : " + user.email;
    document.getElementById("dadosUser").innerHTML = `${user.nome} :  ${user.email}`;
    buscarUsuarios();
}

function logout(){
    localStorage.removeItem("userLogged");
    window.location="index.html"
}

function buscarAnuncios(){
   // let id = document.getElementById("userId").value;
   let user = document.getElementById("selUser");
   let id = user[user.selectedIndex].value;

    fetch("http://localhost:8080/user/id/" + id)
        .then(res => tratarRetorno(res));
}


function tratarRetorno(res){
    if(res.status == 200){
        res.json().then(res => exibirDados(res));
        
    }else{
        document.getElementById("dadosAnuncio").innerHTML = "Usuário não encontrado";
    }
}

function exibirDados(dados){
    
    let anuncios = dados.anuncios;
    let tabela = "<table> <tr> <th>Id</th> <th>Descrição</th> <th>Valor</th> </tr>"

    if(anuncios.length == 0){
        document.getElementById("dadosAnuncio").innerHTML = "Usuários nao possui anuncios";
    } else{
        for(let i = 0; i < anuncios.length; i++){
        tabela = tabela + `<tr> <td>${anuncios[i].id}</td> <td>${anuncios[i].descricao} </td>
        <td>${anuncios[i].valor}</td> </tr>`;
        }
        tabela = tabela + "</table>"
        document.getElementById("dadosAnuncio").innerHTML = tabela;
    }
    
}

function buscarUsuarios(){
    
fetch("http://localhost:8080/user/all")
    .then(res => res.json())
    .then(res => exibirUsers(res))
}

//exibi usuários no comboBox
function exibirUsers(lista){
    let opcoes='';
    for(let i =0; i <lista.length; i++){
        opcoes = opcoes + `<option value = ${lista[i].id}> ${lista[i].name}</option>`
    }

document.getElementById("selUser").innerHTML = opcoes;

}


