function validaLogin(){
    // procurar por cook para saber se alguém está logado
    let userTxt = localStorage.getItem("userLogged")

    // se não logou
    if (! userTxt){
        // manda para fazer login
        window.location  = "index.html";
    } else {
        // logou, encontra nome e mostra informações recebidas
        // transforma em objeto
        var obj = JSON.parse(userTxt)
        document.getElementById("usuario").innerHTML  = "<p><b>" + obj.nomeUsuario +  "</b></p><p>Seja bem-vindo!</p>" + userTxt;
        // Para texto pode ser:
        // ""
        // ''
        // ``
        document.getElementById("fullUser").innerHTML = `<p></p>CPF: <b><u>${obj.cadastroPessoaFisica} </u></b><p> E-mail: <i> ( ${obj.enderecoEletronico} )</i></p>`;

        // xxxx
        buscarUsuarios();
        // xxxx
    }
}

function logout(){
    // apaga cook
    localStorage.removeItem("userLogged")
    // retorna para pagina login
    window.location  = "index.html";
}

function buscarAnuncios(event){
    event.preventDefault(); // evita o comportamento padrão de enviar um formulário.

    // obtendo usuário do ComboBox
    let id = document.getElementById("userId").value;

    console.log('Log -> ' + id )
 
     // chamar url no servidor
     fetch("http://localhost:8080/user/id/" + id)
         .then(res => tratarRespota(res)) // quando a resposta voltar...
}

function tratarRespota(res){
    // se encontro 200
    if(res.status == 200){
         res.json().then(res => exibirDados(res));
    } else {
        // se não encontrou 404
        //alert("Usuário não cadastrado.");
        document.getElementById("retornoUsuario").innerHTML = `Usuário não cadastrado.`;
        document.getElementById("retornoAnuncio").innerHTML = " ";

    }
}

function exibirDados(dados){
    // só para acompanhar o que está chegando ...
    console.log(dados);

    // informações do usuário
    let usuario  = `Usuário: ${dados.id} - ${dados.name} ; E-mail: ${dados.email} ; CPF: ${dados.cpf}`
    document.getElementById("retornoUsuario").innerHTML = usuario;

    
    // informações anúncios do usuário
    let anuncios = dados.anuncios;
    let tabela = '<table> <tr> <th>Id</th> <th>Descrição</th> <th>Valor</th> </tr>'

    // se não tem, avisa
    if (anuncios.length == 0){
        document.getElementById("retornoAnuncio").innerHTML = `Usuário sem anúncios!`;
    } else {
        // se tem, mostra cada um
        for(let i = 0; i < anuncios.length ; i ++) {
            tabela = tabela + `<tr>  <td>${anuncios[i].id}</td> <td>${anuncios[i].descricao}</td> <td>${anuncios[i].valor}</td>  </tr>` ; 
        }
        table = tabela + '</table>'
        document.getElementById("retornoAnuncio").innerHTML = table;

        // como era na 1a versão
        //document.getElementById("retornoAnuncio").innerHTML = dados.anuncios;
   }
}

function buscarUsuarios(){
    // chamar url no servidor
    fetch("http://localhost:8080/user/all")
         .then(res => res.json()) 
            .then(res => exibirUsers(res))
}

function exibirUsers(lista){
    console.log(lista);

   
}

