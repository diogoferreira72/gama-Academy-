// semelhante método java
//executa no browse no cliente!
function validar(){
    //alert("Hi, you pressed the button");

    // variável local, mais usual e novo
    let nome;
    nome = document.getElementById("nome").value;
    alert(nome);
    console.log('Hi ' + nome + ', you pressed the button...')

}

function validar2(){
    // forma antiga, vale em todo o documento
    var senha;
    senha = document.getElementById("senha").value;
    console.log('Hi, you pressed the 2o button...' + senha)

}

function resultado(){
    let nome;
    nome = document.getElementById("nome").value;
    let senha;
    senha  = document.getElementById("senha").value;
    document.getElementById("resultado").innerHTML  = "<p>Hi <b>" + nome + 
    "</b>, do not forget your password: <i>" + senha + "</i></p>";
}