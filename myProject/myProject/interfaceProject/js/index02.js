function resultado(event){

    event.preventDefault(); // evita o comportamento padrão de enviar um formulário.

    let user = document.getElementById("inputUser").value;
    let password = document.getElementById("inputPassword").value;

    console.log('Log -> ' + user + ' : ' + password)

    document.getElementById("resultado").innerHTML  = "<p>Hi <b>" + user + 
    "</b>, do not forget your password: <i>" + password + "</i></p>";

    // construindo objeto
    // incluído cpf com o mesmo que foi digitado = só funcionava com e-mail
    let loginMsg= {
        email:user,
        cpf:user,
        password:password
    }

    // ?? console.log('Log ->' + loginMsg)

    // construindo 'msg' para enviar para o backend como input
    // method = GET, POST, DELETE
    // body = corpo mensagem a ser enviada
    // headers = informa o tipo de conteúdo da mensagem
    let msg = {
        method: "POST", 
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type':'application/json'
        }
    }

    // ?? consolelog.log('Log -> ' + msg)

    // variável com a URL
    let url = "http://localhost:8080/user/login"

    // ?? console.log('Log -> ' + url)

    // chamar url no servidor
    //era http://localhost:8080/user/loginemail = só funcionava com e-mail
    fetch(url, msg)
        .then(res => tratarRetorno(res)) // quando a resposta voltar...
}

function tratarRetorno(retorno){
    //console.log(retorno);
    if(retorno.status == 200){
        document.getElementById("resultado").innerHTML  = "<p><b> Login efetuado com sucesso.</b><p>";
        //acessoPermitido();

        // obter resultado cpf, email e nome
         retorno.json().then(res => acessoPermitido(res));
    } else {
        document.getElementById("resultado").innerHTML  = "<p><i> Falha no Login!</i></p>";
    }
}

// validação com token para evitar acesso indevido se souber a url
// alternativa... criar um cook quando logado e apaga
function acessoPermitido(user){
    localStorage.setItem("userLogged", JSON.stringify(user))
    //console.log(user)
    window.location  ="interna.html";
   
}