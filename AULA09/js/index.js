function fazerLogin(event) {
    event.preventDefault();

    let user = document.getElementById("inputUser").value;
    let password = document.getElementById("inputPassword").value;

    console.log('Você digitou ' + user + " : " + password);


    //document.getElementById("resultado").innerHTML = "Olá " + nome;

    let loginMsg = {
        email: user,
        cpf: user,
        password: password
    }

    //cosntruindo a mensagem que será enviada ao Backend
    //method - indica o metodo que será utilizado (GET, POST, DELETE, ...)
    //body - corpo da mensagem, o que deve ser enviado
    //headers: informando o tipo de conteúdo da mensagem
    let msg = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }

    //fetch envia a 'mensagem' para o servidor o 'then' espera o retorno para executar
    fetch("http://localhost:8080/user/login", msg)
        .then(res => tratarRetorno(res))

}

function tratarRetorno(retorno){
    if(retorno.status == 200){
        document.getElementById("resultado").innerHTML = "Login com sucesso";
        retorno.json().then(res => acessoPermitido(res));
        
    }else{
        document.getElementById("resultado").innerHTML = "Falha no Login";
    }
}

function acessoPermitido(user) {
    localStorage.setItem("userLogged", JSON.stringify(user));
    window.location = "interna.html"
    
}